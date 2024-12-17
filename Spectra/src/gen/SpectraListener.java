package gen;

// Generated from src/Spectra.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SpectraParser}.
 */
public interface SpectraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SpectraParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SpectraParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SpectraParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SpectraParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SpectraParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SpectraParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SpectraParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SpectraParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SpectraParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(SpectraParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(SpectraParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#ternary}.
	 * @param ctx the parse tree
	 */
	void enterTernary(SpectraParser.TernaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#ternary}.
	 * @param ctx the parse tree
	 */
	void exitTernary(SpectraParser.TernaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SpectraParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SpectraParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(SpectraParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(SpectraParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(SpectraParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(SpectraParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(SpectraParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(SpectraParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(SpectraParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(SpectraParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(SpectraParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(SpectraParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SpectraParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SpectraParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(SpectraParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(SpectraParser.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpression(SpectraParser.MultiplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpression(SpectraParser.MultiplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(SpectraParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(SpectraParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SpectraParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SpectraParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SpectraParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SpectraParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpectraParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SpectraParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpectraParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SpectraParser.TypeContext ctx);
}