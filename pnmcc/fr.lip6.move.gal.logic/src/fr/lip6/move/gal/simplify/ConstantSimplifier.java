package fr.lip6.move.gal.simplify;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.lip6.move.gal.logic.*;


public class ConstantSimplifier {
	
	public static BooleanExpression simplify (BooleanExpression be) {
		LogicFactory gf = LogicFactory.eINSTANCE;
		if (be instanceof And) {
			And and = (And) be;
			BooleanExpression left = simplify(and.getLeft());
			BooleanExpression right = simplify(and.getRight());
			if (left instanceof True) {
				return right;
			} else if (right instanceof True) {
				return left;
			} else if (left instanceof False || right instanceof False) {
				return  gf.createFalse();
			} else {
				And and2 = LogicFactory.eINSTANCE.createAnd();
				and2.setOp("&&");
				and2.setLeft(left);
				and2.setRight(right);
				return and2;
			}
		} else if (be instanceof Or) {
			Or or = (Or) be;
			BooleanExpression left = simplify(or.getLeft());
			BooleanExpression right = simplify(or.getRight());
			if (left instanceof False) {
				return right;
			} else if (right instanceof False) {
				return left;
			} else if (left instanceof True || right instanceof True) {
				return gf.createTrue();
			} else {
				Or or2 = LogicFactory.eINSTANCE.createOr();
				or2.setOp("||");
				or2.setLeft(left);
				or2.setRight(right);
				return or2;
			}
		} else if (be instanceof Not) {
			Not not = (Not) be;
			BooleanExpression left = simplify(not.getValue());
			if (left instanceof Not) {
				return ((Not)left).getValue();
			} else if (left instanceof False) {
				True tru = gf.createTrue();
				return tru;
			} else if (left instanceof True) {
				False fals = gf.createFalse();
				return fals;
			} else {
				Not nott = gf.createNot();
				nott.setValue(left);
				return nott;
			}
		} else if (be instanceof Comparison) {
			Comparison comp = (Comparison) be;
			IntExpression left = simplify(comp.getLeft());
			IntExpression right = simplify(comp.getRight());
			if (left instanceof Constant && right instanceof Constant) {
				boolean res = false;
				int l = ((Constant) left).getValue();
				int r = ((Constant) right).getValue();
				switch (comp.getOperator()) {
				case EQ : res = (l==r); break;
				case NE : res = (l!=r); break;
				case GE : res = (l>=r); break;
				case GT : res = (l>r); break;
				case LT : res = (l<r); break;
				case LE : res = (l<=r); break;
				}
				if (res) {
					True tru = gf.createTrue();
					return tru;
				} else {
					False tru = gf.createFalse();
					return tru;
				}
			}
			if (EcoreUtil.equals(left, right)) {
				boolean res = false;
				switch (comp.getOperator()) {
				case EQ : res = true; break;
				case NE : res = false; break;
				case GE : res = true; break;
				case GT : res = false; break;
				case LT : res = false; break;
				case LE : res = true; break;
				}
				if (res) {
					True tru = gf.createTrue();
					return tru;
				} else {
					False tru = gf.createFalse();
					return tru;
				}
			}
			comp.setLeft(left);
			comp.setRight(right);
			return comp;
		}
		simplifyAllBools(be);
		return be;
	}

	public static IntExpression simplify(IntExpression expr) {
		LogicFactory gf = LogicFactory.eINSTANCE;
		if (expr instanceof BinaryIntExpression) {
			BinaryIntExpression bin = (BinaryIntExpression) expr;
			IntExpression left = simplify(bin.getLeft());
			IntExpression right = simplify(bin.getRight());

			if (left instanceof Constant && right instanceof Constant) {
				int l = ((Constant) left).getValue();
				int r = ((Constant) right).getValue();
				int res=0;
				if ("+".equals(bin.getOp())) {
					res = l + r;
				} else if ("-".equals(bin.getOp())) {
					res = l - r;
				} else if ("/".equals(bin.getOp())) {
					res = l / r;
				} else if ("*".equals(bin.getOp())) {
					res = l * r;
				} else if ("**".equals(bin.getOp())) {
					res = (int) Math.pow(l , r);
				} else if ("%".equals(bin.getOp())) {
					res = l % r;
				} else {
					java.lang.System.err.println("Unexpected operator in simplify procedure:" + bin.getOp());
				}
				Constant cst = gf.createConstant();
				cst.setValue(res);
				return cst;
			} else if (left instanceof Constant) {
				int l = ((Constant) left).getValue();
				if (l==0 && "+".equals(bin.getOp())) {
					return right;
				} else if (l==1 && "*".equals(bin.getOp())) {
					return right;
				}
			} else if (right instanceof Constant) {
				int r = ((Constant) right).getValue();
				if (r==0 && "+".equals(bin.getOp())) {
					return left;
				} else if (r==1 && "*".equals(bin.getOp())) {
					return left;
				}
			}
			bin.setLeft(left);
			bin.setRight(right);
			return bin;

		} else if (expr instanceof ArrayVarAccess) {
			ArrayVarAccess acc = (ArrayVarAccess) expr;
			acc.setIndex(simplify(acc.getIndex()));
			return acc;
		}		
		return expr;
	}

	public static void simplifyAllBools(EObject props) {
		// grab top level bool expr
		List<BooleanExpression> tosimpl = new ArrayList<BooleanExpression>();
		for (TreeIterator<EObject> it = props.eAllContents(); it.hasNext() ; ) {
			EObject obj = it.next();
			if (obj instanceof BooleanExpression) {
				BooleanExpression be = (BooleanExpression) obj;
				tosimpl.add(be);
				it.prune();
			}
		}
		for (BooleanExpression be :tosimpl) {
			EcoreUtil.replace(be, ConstantSimplifier.simplify(be));
		}		
	} 
}
