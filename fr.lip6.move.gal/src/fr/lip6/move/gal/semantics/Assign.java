package fr.lip6.move.gal.semantics;


import fr.lip6.move.gal.Assignment;

public class Assign implements INext {

	private Assignment ass;
	private VariableIndexer indexer;

	public Assign (Assignment ass, VariableIndexer index) {
		this.ass = ass;
		this.indexer = index;
	}

	public VariableIndexer getIndexer() {
		return indexer;
	}
	
	@Override
	public String toString() {
		return ExpressionPrinter.print(ass,"s",indexer).replaceAll("[\\s\\n;]*", "");
	}

	public Assignment getAssignment() {
		return ass;
	}
	

	
	@Override
	public <T> T accept(NextVisitor<T> vis) {
		return vis.visit(this);
	}

}
