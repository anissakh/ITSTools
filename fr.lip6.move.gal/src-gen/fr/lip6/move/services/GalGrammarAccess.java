/*
* generated by Xtext
*/

package fr.lip6.move.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class GalGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "System");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSystemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVariablesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVariablesVariableDeclarationParserRuleCall_3_0 = (RuleCall)cVariablesAssignment_3.eContents().get(0);
		private final Assignment cTransitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTransitionsTransitionParserRuleCall_4_0 = (RuleCall)cTransitionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//System:
		//	("system" name=ID "{" variables+=VariableDeclaration* transitions+=Transition+ "}")?;
		public ParserRule getRule() { return rule; }

		//("system" name=ID "{" variables+=VariableDeclaration* transitions+=Transition+ "}")?
		public Group getGroup() { return cGroup; }

		//"system"
		public Keyword getSystemKeyword_0() { return cSystemKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//variables+=VariableDeclaration*
		public Assignment getVariablesAssignment_3() { return cVariablesAssignment_3; }

		//VariableDeclaration
		public RuleCall getVariablesVariableDeclarationParserRuleCall_3_0() { return cVariablesVariableDeclarationParserRuleCall_3_0; }

		//transitions+=Transition+
		public Assignment getTransitionsAssignment_4() { return cTransitionsAssignment_4; }

		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_4_0() { return cTransitionsTransitionParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class VariableDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VariableDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInitValAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cInitValINTTerminalRuleCall_2_0 = (RuleCall)cInitValAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//VariableDeclaration returns Variable:
		//	name=ID "=" initVal=INT ";";
		public ParserRule getRule() { return rule; }

		//name=ID "=" initVal=INT ";"
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//initVal=INT
		public Assignment getInitValAssignment_2() { return cInitValAssignment_2; }

		//INT
		public RuleCall getInitValINTTerminalRuleCall_2_0() { return cInitValINTTerminalRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTRUEKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLabelKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cLabelAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cLabelSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cLabelAssignment_5_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cAssignmentsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cAssignmentsAssignmentParserRuleCall_7_0 = (RuleCall)cAssignmentsAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Transition:
		//	"transition" name=ID "[" "TRUE" "]" ("label" label=STRING)? "{" assignments+=Assignment+ "}";
		public ParserRule getRule() { return rule; }

		//"transition" name=ID "[" "TRUE" "]" ("label" label=STRING)? "{" assignments+=Assignment+ "}"
		public Group getGroup() { return cGroup; }

		//"transition"
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }

		//"TRUE"
		public Keyword getTRUEKeyword_3() { return cTRUEKeyword_3; }

		//"]"
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }

		//("label" label=STRING)?
		public Group getGroup_5() { return cGroup_5; }

		//"label"
		public Keyword getLabelKeyword_5_0() { return cLabelKeyword_5_0; }

		//label=STRING
		public Assignment getLabelAssignment_5_1() { return cLabelAssignment_5_1; }

		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_5_1_0() { return cLabelSTRINGTerminalRuleCall_5_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }

		//assignments+=Assignment+
		public Assignment getAssignmentsAssignment_7() { return cAssignmentsAssignment_7; }

		//Assignment
		public RuleCall getAssignmentsAssignmentParserRuleCall_7_0() { return cAssignmentsAssignmentParserRuleCall_7_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class AssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Assignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVarAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVarVariableRefParserRuleCall_0_0 = (RuleCall)cVarAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExprAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExprAdditionParserRuleCall_2_0 = (RuleCall)cExprAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Assignment:
		//	var=VariableRef "=" expr=Addition ";";
		public ParserRule getRule() { return rule; }

		//var=VariableRef "=" expr=Addition ";"
		public Group getGroup() { return cGroup; }

		//var=VariableRef
		public Assignment getVarAssignment_0() { return cVarAssignment_0; }

		//VariableRef
		public RuleCall getVarVariableRefParserRuleCall_0_0() { return cVarVariableRefParserRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//expr=Addition
		public Assignment getExprAssignment_2() { return cExprAssignment_2; }

		//Addition
		public RuleCall getExprAdditionParserRuleCall_2_0() { return cExprAdditionParserRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class AdditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Addition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultiplicationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cAdditionLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cSubtractionLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightMultiplicationParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Addition returns IntExpression:
		//	Multiplication (({Addition.left=current} "+" | {Subtraction.left=current} "-") right=Multiplication)*;
		public ParserRule getRule() { return rule; }

		//Multiplication (({Addition.left=current} "+" | {Subtraction.left=current} "-") right=Multiplication)*
		public Group getGroup() { return cGroup; }

		//Multiplication
		public RuleCall getMultiplicationParserRuleCall_0() { return cMultiplicationParserRuleCall_0; }

		//(({Addition.left=current} "+" | {Subtraction.left=current} "-") right=Multiplication)*
		public Group getGroup_1() { return cGroup_1; }

		//{Addition.left=current} "+" | {Subtraction.left=current} "-"
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }

		//{Addition.left=current} "+"
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }

		//{Addition.left=current}
		public Action getAdditionLeftAction_1_0_0_0() { return cAdditionLeftAction_1_0_0_0; }

		//"+"
		public Keyword getPlusSignKeyword_1_0_0_1() { return cPlusSignKeyword_1_0_0_1; }

		//{Subtraction.left=current} "-"
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }

		//{Subtraction.left=current}
		public Action getSubtractionLeftAction_1_0_1_0() { return cSubtractionLeftAction_1_0_1_0; }

		//"-"
		public Keyword getHyphenMinusKeyword_1_0_1_1() { return cHyphenMinusKeyword_1_0_1_1; }

		//right=Multiplication
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }

		//Multiplication
		public RuleCall getRightMultiplicationParserRuleCall_1_1_0() { return cRightMultiplicationParserRuleCall_1_1_0; }
	}

	public class MultiplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Multiplication");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cUnitaryMinusParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cMultiplicationLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cDivisionLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Group cGroup_1_0_2 = (Group)cAlternatives_1_0.eContents().get(2);
		private final Action cModuloLeftAction_1_0_2_0 = (Action)cGroup_1_0_2.eContents().get(0);
		private final Keyword cPercentSignKeyword_1_0_2_1 = (Keyword)cGroup_1_0_2.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightUnitaryMinusParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Multiplication returns IntExpression:
		//	UnitaryMinus (({Multiplication.left=current} "*" | {Division.left=current} "/" | {Modulo.left=current} "%")
		//	right=UnitaryMinus)*;
		public ParserRule getRule() { return rule; }

		//UnitaryMinus (({Multiplication.left=current} "*" | {Division.left=current} "/" | {Modulo.left=current} "%")
		//right=UnitaryMinus)*
		public Group getGroup() { return cGroup; }

		//UnitaryMinus
		public RuleCall getUnitaryMinusParserRuleCall_0() { return cUnitaryMinusParserRuleCall_0; }

		//(({Multiplication.left=current} "*" | {Division.left=current} "/" | {Modulo.left=current} "%") right=UnitaryMinus)*
		public Group getGroup_1() { return cGroup_1; }

		//{Multiplication.left=current} "*" | {Division.left=current} "/" | {Modulo.left=current} "%"
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }

		//{Multiplication.left=current} "*"
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }

		//{Multiplication.left=current}
		public Action getMultiplicationLeftAction_1_0_0_0() { return cMultiplicationLeftAction_1_0_0_0; }

		//"*"
		public Keyword getAsteriskKeyword_1_0_0_1() { return cAsteriskKeyword_1_0_0_1; }

		//{Division.left=current} "/"
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }

		//{Division.left=current}
		public Action getDivisionLeftAction_1_0_1_0() { return cDivisionLeftAction_1_0_1_0; }

		//"/"
		public Keyword getSolidusKeyword_1_0_1_1() { return cSolidusKeyword_1_0_1_1; }

		//{Modulo.left=current} "%"
		public Group getGroup_1_0_2() { return cGroup_1_0_2; }

		//{Modulo.left=current}
		public Action getModuloLeftAction_1_0_2_0() { return cModuloLeftAction_1_0_2_0; }

		//"%"
		public Keyword getPercentSignKeyword_1_0_2_1() { return cPercentSignKeyword_1_0_2_1; }

		//right=UnitaryMinus
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }

		//UnitaryMinus
		public RuleCall getRightUnitaryMinusParserRuleCall_1_1_0() { return cRightUnitaryMinusParserRuleCall_1_1_0; }
	}

	public class UnitaryMinusElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UnitaryMinus");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cPowerParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Action cUnitaryMinusValAction_2 = (Action)cGroup.eContents().get(2);
		
		//UnitaryMinus returns IntExpression:
		//	"-"? Power {UnitaryMinus.val=current};
		public ParserRule getRule() { return rule; }

		//"-"? Power {UnitaryMinus.val=current}
		public Group getGroup() { return cGroup; }

		//"-"?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }

		//Power
		public RuleCall getPowerParserRuleCall_1() { return cPowerParserRuleCall_1; }

		//{UnitaryMinus.val=current}
		public Action getUnitaryMinusValAction_2() { return cUnitaryMinusValAction_2; }
	}

	public class PowerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Power");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cPowerLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAsteriskAsteriskKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPrimaryParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Power returns IntExpression:
		//	Primary ({Power.left=current} "**" right=Primary)*;
		public ParserRule getRule() { return rule; }

		//Primary ({Power.left=current} "**" right=Primary)*
		public Group getGroup() { return cGroup; }

		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }

		//({Power.left=current} "**" right=Primary)*
		public Group getGroup_1() { return cGroup_1; }

		//{Power.left=current}
		public Action getPowerLeftAction_1_0() { return cPowerLeftAction_1_0; }

		//"**"
		public Keyword getAsteriskAsteriskKeyword_1_1() { return cAsteriskAsteriskKeyword_1_1; }

		//right=Primary
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_2_0() { return cRightPrimaryParserRuleCall_1_2_0; }
	}

	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVariableRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cConstanteParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cAdditionParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		
		//Primary returns IntExpression:
		//	VariableRef | Constante | "(" Addition ")";
		public ParserRule getRule() { return rule; }

		//VariableRef | Constante | "(" Addition ")"
		public Alternatives getAlternatives() { return cAlternatives; }

		//VariableRef
		public RuleCall getVariableRefParserRuleCall_0() { return cVariableRefParserRuleCall_0; }

		//Constante
		public RuleCall getConstanteParserRuleCall_1() { return cConstanteParserRuleCall_1; }

		//"(" Addition ")"
		public Group getGroup_2() { return cGroup_2; }

		//"("
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//Addition
		public RuleCall getAdditionParserRuleCall_2_1() { return cAdditionParserRuleCall_2_1; }

		//")"
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }
	}

	public class ConstanteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Constante");
		private final Assignment cValAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_0 = (RuleCall)cValAssignment.eContents().get(0);
		
		//Constante:
		//	val=INT;
		public ParserRule getRule() { return rule; }

		//val=INT
		public Assignment getValAssignment() { return cValAssignment; }

		//INT
		public RuleCall getValINTTerminalRuleCall_0() { return cValINTTerminalRuleCall_0; }
	}

	public class VariableRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VariableRef");
		private final Assignment cVarAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cVarVariableCrossReference_0 = (CrossReference)cVarAssignment.eContents().get(0);
		private final RuleCall cVarVariableIDTerminalRuleCall_0_1 = (RuleCall)cVarVariableCrossReference_0.eContents().get(1);
		
		//VariableRef:
		//	var=[Variable];
		public ParserRule getRule() { return rule; }

		//var=[Variable]
		public Assignment getVarAssignment() { return cVarAssignment; }

		//[Variable]
		public CrossReference getVarVariableCrossReference_0() { return cVarVariableCrossReference_0; }

		//ID
		public RuleCall getVarVariableIDTerminalRuleCall_0_1() { return cVarVariableIDTerminalRuleCall_0_1; }
	}

	public class NotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Not");
		private final Assignment cEmptyAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cEmptyIDTerminalRuleCall_0 = (RuleCall)cEmptyAssignment.eContents().get(0);
		
		///////////////////////////////////////////////////////////////////////
		//Not returns BooleanExpression:
		//	empty=ID;
		public ParserRule getRule() { return rule; }

		//empty=ID
		public Assignment getEmptyAssignment() { return cEmptyAssignment; }

		//ID
		public RuleCall getEmptyIDTerminalRuleCall_0() { return cEmptyIDTerminalRuleCall_0; }
	}
	
	
	private SystemElements pSystem;
	private VariableDeclarationElements pVariableDeclaration;
	private TransitionElements pTransition;
	private AssignmentElements pAssignment;
	private AdditionElements pAddition;
	private MultiplicationElements pMultiplication;
	private UnitaryMinusElements pUnitaryMinus;
	private PowerElements pPower;
	private PrimaryElements pPrimary;
	private ConstanteElements pConstante;
	private VariableRefElements pVariableRef;
	private NotElements pNot;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public GalGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//System:
	//	("system" name=ID "{" variables+=VariableDeclaration* transitions+=Transition+ "}")?;
	public SystemElements getSystemAccess() {
		return (pSystem != null) ? pSystem : (pSystem = new SystemElements());
	}
	
	public ParserRule getSystemRule() {
		return getSystemAccess().getRule();
	}

	//VariableDeclaration returns Variable:
	//	name=ID "=" initVal=INT ";";
	public VariableDeclarationElements getVariableDeclarationAccess() {
		return (pVariableDeclaration != null) ? pVariableDeclaration : (pVariableDeclaration = new VariableDeclarationElements());
	}
	
	public ParserRule getVariableDeclarationRule() {
		return getVariableDeclarationAccess().getRule();
	}

	//Transition:
	//	"transition" name=ID "[" "TRUE" "]" ("label" label=STRING)? "{" assignments+=Assignment+ "}";
	public TransitionElements getTransitionAccess() {
		return (pTransition != null) ? pTransition : (pTransition = new TransitionElements());
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}

	//Assignment:
	//	var=VariableRef "=" expr=Addition ";";
	public AssignmentElements getAssignmentAccess() {
		return (pAssignment != null) ? pAssignment : (pAssignment = new AssignmentElements());
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}

	//Addition returns IntExpression:
	//	Multiplication (({Addition.left=current} "+" | {Subtraction.left=current} "-") right=Multiplication)*;
	public AdditionElements getAdditionAccess() {
		return (pAddition != null) ? pAddition : (pAddition = new AdditionElements());
	}
	
	public ParserRule getAdditionRule() {
		return getAdditionAccess().getRule();
	}

	//Multiplication returns IntExpression:
	//	UnitaryMinus (({Multiplication.left=current} "*" | {Division.left=current} "/" | {Modulo.left=current} "%")
	//	right=UnitaryMinus)*;
	public MultiplicationElements getMultiplicationAccess() {
		return (pMultiplication != null) ? pMultiplication : (pMultiplication = new MultiplicationElements());
	}
	
	public ParserRule getMultiplicationRule() {
		return getMultiplicationAccess().getRule();
	}

	//UnitaryMinus returns IntExpression:
	//	"-"? Power {UnitaryMinus.val=current};
	public UnitaryMinusElements getUnitaryMinusAccess() {
		return (pUnitaryMinus != null) ? pUnitaryMinus : (pUnitaryMinus = new UnitaryMinusElements());
	}
	
	public ParserRule getUnitaryMinusRule() {
		return getUnitaryMinusAccess().getRule();
	}

	//Power returns IntExpression:
	//	Primary ({Power.left=current} "**" right=Primary)*;
	public PowerElements getPowerAccess() {
		return (pPower != null) ? pPower : (pPower = new PowerElements());
	}
	
	public ParserRule getPowerRule() {
		return getPowerAccess().getRule();
	}

	//Primary returns IntExpression:
	//	VariableRef | Constante | "(" Addition ")";
	public PrimaryElements getPrimaryAccess() {
		return (pPrimary != null) ? pPrimary : (pPrimary = new PrimaryElements());
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}

	//Constante:
	//	val=INT;
	public ConstanteElements getConstanteAccess() {
		return (pConstante != null) ? pConstante : (pConstante = new ConstanteElements());
	}
	
	public ParserRule getConstanteRule() {
		return getConstanteAccess().getRule();
	}

	//VariableRef:
	//	var=[Variable];
	public VariableRefElements getVariableRefAccess() {
		return (pVariableRef != null) ? pVariableRef : (pVariableRef = new VariableRefElements());
	}
	
	public ParserRule getVariableRefRule() {
		return getVariableRefAccess().getRule();
	}

	///////////////////////////////////////////////////////////////////////
	//Not returns BooleanExpression:
	//	empty=ID;
	public NotElements getNotAccess() {
		return (pNot != null) ? pNot : (pNot = new NotElements());
	}
	
	public ParserRule getNotRule() {
		return getNotAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
