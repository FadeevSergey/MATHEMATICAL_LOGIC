package gen;// Generated from /Users/Fadeev/IdeaProjects/AntrlExample/src/Expression.g4 by ANTLR 4.8

    import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(ExpressionParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(ExpressionParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(ExpressionParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ExpressionParser.VariableContext ctx);
}