package gen;// Generated from /Users/Fadeev/IdeaProjects/AntrlExample/src/Expression.g4 by ANTLR 4.8

import Nodes.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPL_TOKEN=1, AND_TOKEN=2, NOT_TOKEN=3, OR_TOKEN=4, LB_TOKEN=5, RB_TOKEN=6, 
		VAR_TOKEN=7;
	public static final int
		RULE_expression = 0, RULE_orExpression = 1, RULE_andExpression = 2, RULE_notExpression = 3, 
		RULE_variable = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "orExpression", "andExpression", "notExpression", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'&'", "'!'", "'|'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPL_TOKEN", "AND_TOKEN", "NOT_TOKEN", "OR_TOKEN", "LB_TOKEN", 
			"RB_TOKEN", "VAR_TOKEN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Node node;
		public VariableContext var;
		public OrExpressionContext or;
		public ExpressionContext exp;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode IMPL_TOKEN() { return getToken(ExpressionParser.IMPL_TOKEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				((ExpressionContext)_localctx).var = variable();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).var.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				((ExpressionContext)_localctx).or = orExpression(0);
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).or.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				((ExpressionContext)_localctx).or = orExpression(0);
				setState(17);
				match(IMPL_TOKEN);
				setState(18);
				((ExpressionContext)_localctx).exp = expression();
				((ExpressionContext)_localctx).node =  new Implication(((ExpressionContext)_localctx).or.node, ((ExpressionContext)_localctx).exp.node);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExpressionContext extends ParserRuleContext {
		public Node node;
		public OrExpressionContext or;
		public VariableContext var;
		public AndExpressionContext and;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode OR_TOKEN() { return getToken(ExpressionParser.OR_TOKEN, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		return orExpression(0);
	}

	private OrExpressionContext orExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, _parentState);
		OrExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(24);
				((OrExpressionContext)_localctx).var = variable();
				((OrExpressionContext)_localctx).node =  ((OrExpressionContext)_localctx).var.node;
				}
				break;
			case 2:
				{
				setState(27);
				((OrExpressionContext)_localctx).and = andExpression(0);
				((OrExpressionContext)_localctx).node =  ((OrExpressionContext)_localctx).and.node;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpressionContext(_parentctx, _parentState);
					_localctx.or = _prevctx;
					_localctx.or = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(32);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(33);
					match(OR_TOKEN);
					setState(34);
					((OrExpressionContext)_localctx).and = andExpression(0);
					((OrExpressionContext)_localctx).node =  new Or(((OrExpressionContext)_localctx).or.node, ((OrExpressionContext)_localctx).and.node);
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public Node node;
		public AndExpressionContext and;
		public VariableContext var;
		public NotExpressionContext not;
		public ExpressionContext exp;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode NOT_TOKEN() { return getToken(ExpressionParser.NOT_TOKEN, 0); }
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public TerminalNode LB_TOKEN() { return getToken(ExpressionParser.LB_TOKEN, 0); }
		public TerminalNode RB_TOKEN() { return getToken(ExpressionParser.RB_TOKEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AND_TOKEN() { return getToken(ExpressionParser.AND_TOKEN, 0); }
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(43);
				((AndExpressionContext)_localctx).var = variable();
				((AndExpressionContext)_localctx).node =  ((AndExpressionContext)_localctx).var.node;
				}
				break;
			case 2:
				{
				setState(46);
				match(NOT_TOKEN);
				setState(47);
				((AndExpressionContext)_localctx).not = notExpression();
				((AndExpressionContext)_localctx).node =  new Not(((AndExpressionContext)_localctx).not.node);
				}
				break;
			case 3:
				{
				setState(50);
				((AndExpressionContext)_localctx).var = variable();
				((AndExpressionContext)_localctx).node =  ((AndExpressionContext)_localctx).var.node;
				}
				break;
			case 4:
				{
				setState(53);
				match(LB_TOKEN);
				setState(54);
				((AndExpressionContext)_localctx).exp = expression();
				setState(55);
				match(RB_TOKEN);
				((AndExpressionContext)_localctx).node =  ((AndExpressionContext)_localctx).exp.node;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					_localctx.and = _prevctx;
					_localctx.and = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(60);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(61);
					match(AND_TOKEN);
					setState(62);
					((AndExpressionContext)_localctx).not = notExpression();
					((AndExpressionContext)_localctx).node =  new And(((AndExpressionContext)_localctx).and.node, ((AndExpressionContext)_localctx).not.node);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NotExpressionContext extends ParserRuleContext {
		public Node node;
		public NotExpressionContext not;
		public VariableContext var;
		public ExpressionContext exp;
		public TerminalNode NOT_TOKEN() { return getToken(ExpressionParser.NOT_TOKEN, 0); }
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LB_TOKEN() { return getToken(ExpressionParser.LB_TOKEN, 0); }
		public TerminalNode RB_TOKEN() { return getToken(ExpressionParser.RB_TOKEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_notExpression);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(NOT_TOKEN);
				setState(71);
				((NotExpressionContext)_localctx).not = notExpression();
				((NotExpressionContext)_localctx).node =  new Not(((NotExpressionContext)_localctx).not.node);
				}
				break;
			case VAR_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				((NotExpressionContext)_localctx).var = variable();
				((NotExpressionContext)_localctx).node =  ((NotExpressionContext)_localctx).var.node;
				}
				break;
			case LB_TOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(LB_TOKEN);
				setState(78);
				((NotExpressionContext)_localctx).exp = expression();
				setState(79);
				match(RB_TOKEN);
				((NotExpressionContext)_localctx).node =  ((NotExpressionContext)_localctx).exp.node;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Node node;
		public Token VAR_TOKEN;
		public TerminalNode VAR_TOKEN() { return getToken(ExpressionParser.VAR_TOKEN, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener) ((ExpressionListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor) return ((ExpressionVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((VariableContext)_localctx).VAR_TOKEN = match(VAR_TOKEN);
			((VariableContext)_localctx).node =  new Var((((VariableContext)_localctx).VAR_TOKEN!=null?((VariableContext)_localctx).VAR_TOKEN.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 2:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean orExpression_sempred(OrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\tZ\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2\30\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\4\3\4\3\4\7\4D\n\4\f\4\16\4G\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5U\n\5\3\6\3\6\3\6"+
		"\3\6\2\4\4\6\7\2\4\6\b\n\2\2\2^\2\27\3\2\2\2\4 \3\2\2\2\6<\3\2\2\2\bT"+
		"\3\2\2\2\nV\3\2\2\2\f\r\5\n\6\2\r\16\b\2\1\2\16\30\3\2\2\2\17\20\5\4\3"+
		"\2\20\21\b\2\1\2\21\30\3\2\2\2\22\23\5\4\3\2\23\24\7\3\2\2\24\25\5\2\2"+
		"\2\25\26\b\2\1\2\26\30\3\2\2\2\27\f\3\2\2\2\27\17\3\2\2\2\27\22\3\2\2"+
		"\2\30\3\3\2\2\2\31\32\b\3\1\2\32\33\5\n\6\2\33\34\b\3\1\2\34!\3\2\2\2"+
		"\35\36\5\6\4\2\36\37\b\3\1\2\37!\3\2\2\2 \31\3\2\2\2 \35\3\2\2\2!)\3\2"+
		"\2\2\"#\f\3\2\2#$\7\6\2\2$%\5\6\4\2%&\b\3\1\2&(\3\2\2\2\'\"\3\2\2\2(+"+
		"\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5\3\2\2\2+)\3\2\2\2,-\b\4\1\2-.\5\n\6\2"+
		"./\b\4\1\2/=\3\2\2\2\60\61\7\5\2\2\61\62\5\b\5\2\62\63\b\4\1\2\63=\3\2"+
		"\2\2\64\65\5\n\6\2\65\66\b\4\1\2\66=\3\2\2\2\678\7\7\2\289\5\2\2\29:\7"+
		"\b\2\2:;\b\4\1\2;=\3\2\2\2<,\3\2\2\2<\60\3\2\2\2<\64\3\2\2\2<\67\3\2\2"+
		"\2=E\3\2\2\2>?\f\3\2\2?@\7\4\2\2@A\5\b\5\2AB\b\4\1\2BD\3\2\2\2C>\3\2\2"+
		"\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\7\3\2\2\2GE\3\2\2\2HI\7\5\2\2IJ\5\b"+
		"\5\2JK\b\5\1\2KU\3\2\2\2LM\5\n\6\2MN\b\5\1\2NU\3\2\2\2OP\7\7\2\2PQ\5\2"+
		"\2\2QR\7\b\2\2RS\b\5\1\2SU\3\2\2\2TH\3\2\2\2TL\3\2\2\2TO\3\2\2\2U\t\3"+
		"\2\2\2VW\7\t\2\2WX\b\6\1\2X\13\3\2\2\2\b\27 )<ET";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}