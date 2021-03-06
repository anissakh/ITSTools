package fr.lip6.move.gal.semantics;

import java.util.ArrayList;
import java.util.List;

import fr.lip6.move.gal.False;

/**
 * A semantic composition of behaviors.
 * @author ythierry
 *
 */
public class Sequence implements INext {

	private List<INext> acts;

	private Sequence(List<INext> acts) {
		this.acts = acts;
	}

	public static INext seq(List<INext> acts) {
		List<INext> flat = new ArrayList<INext>(acts.size());
		for (INext n : acts) {
			if (n instanceof Sequence) {
				Sequence seq = (Sequence) n;
				flat.addAll(seq.getActions());
			} else if (n instanceof Predicate && ((Predicate) n).getGuard() instanceof False) {
				return n;
			} else {
				flat.add(n);
			}
		}
		if (flat.size() == 1) {
			return acts.get(0);
		} else {
			return new Sequence(flat);
		}
	}

	@Override
	public String toString() {
		boolean first = true;
		StringBuilder sb = new StringBuilder();
		if (acts.isEmpty()) {
			sb.append("/*NOP*/");
		}
		for (INext act : acts) {
			if (first)
				first = false;
			else
				sb.append(", ");
			sb.append(act.toString() + ";\n");
		}
		return sb.toString();
	}

	public List<INext> getActions() {
		return acts;
	}

	@Override
	public <T> T accept(NextVisitor<T> vis) {
		return vis.visit(this);
	}

}
