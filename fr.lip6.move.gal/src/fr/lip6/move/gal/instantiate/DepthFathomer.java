package fr.lip6.move.gal.instantiate;

import java.util.HashMap;
import java.util.Map;

import fr.lip6.move.gal.InstanceDecl;
import fr.lip6.move.gal.CompositeTypeDeclaration;
import fr.lip6.move.gal.TypeDeclaration;

public class DepthFathomer {

	private Map<TypeDeclaration,Integer> depths = new HashMap<TypeDeclaration, Integer>();
	
	public int getDepth (TypeDeclaration td) {
		if (! (td instanceof CompositeTypeDeclaration)) {
			return 0;
		}
		CompositeTypeDeclaration ctd = (CompositeTypeDeclaration) td;
		Integer depth = depths.get(td);
		if (depth == null) {
			depth = 0;
			for (InstanceDecl ai : ctd.getInstances()) {
				if (ai.getType() instanceof CompositeTypeDeclaration) {
					depth = Math.max(depth, getDepth(ai.getType())+1);					
				} else {
					depth = Math.max(depth, 1);
				}
			}
			depths.put(td,depth);
		}
		return depth;
	}
}
