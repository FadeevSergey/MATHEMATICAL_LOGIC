package gen;// Generated from /Users/Fadeev/IdeaProjects/AntrlExample/src/Expression.g4 by ANTLR 4.8

    import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(ExpressionParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(ExpressionParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(ExpressionParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(ExpressionParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(ExpressionParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(ExpressionParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ExpressionParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ExpressionParser.VariableContext ctx);
}