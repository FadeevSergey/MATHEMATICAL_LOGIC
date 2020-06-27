package gen;// Generated from /Users/Fadeev/IdeaProjects/AntrlExample/src/Expression.g4 by ANTLR 4.8

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPL_TOKEN=1, AND_TOKEN=2, NOT_TOKEN=3, OR_TOKEN=4, LB_TOKEN=5, RB_TOKEN=6, 
		VAR_TOKEN=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPL_TOKEN", "AND_TOKEN", "NOT_TOKEN", "OR_TOKEN", "LB_TOKEN", "RB_TOKEN", 
			"VAR_TOKEN"
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


	public ExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t%\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\b!\n\b\f\b\16\b$\13\b\2\2\t\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\3\2\4\3\2C\\\5\2))\62;C\\\2%\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\3\21\3\2\2\2\5\24\3\2\2\2\7\26\3\2\2\2\t\30\3\2\2\2\13\32\3\2\2\2\r"+
		"\34\3\2\2\2\17\36\3\2\2\2\21\22\7/\2\2\22\23\7@\2\2\23\4\3\2\2\2\24\25"+
		"\7(\2\2\25\6\3\2\2\2\26\27\7#\2\2\27\b\3\2\2\2\30\31\7~\2\2\31\n\3\2\2"+
		"\2\32\33\7*\2\2\33\f\3\2\2\2\34\35\7+\2\2\35\16\3\2\2\2\36\"\t\2\2\2\37"+
		"!\t\3\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\20\3\2\2\2$\"\3"+
		"\2\2\2\5\2 \"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}