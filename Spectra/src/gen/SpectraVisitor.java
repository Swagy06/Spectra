package gen;

// Generated from src/Spectra.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpectraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpectraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SpectraParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SpectraParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SpectraParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SpectraParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SpectraParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SpectraParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#ternary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary(SpectraParser.TernaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SpectraParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(SpectraParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(SpectraParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(SpectraParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(SpectraParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(SpectraParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SpectraParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#additionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(SpectraParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(SpectraParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(SpectraParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(SpectraParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SpectraParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpectraParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SpectraParser.TypeContext ctx);
}