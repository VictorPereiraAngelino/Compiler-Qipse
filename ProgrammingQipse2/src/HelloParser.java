// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static DFA[] _decisionToDFA;
	protected static PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static int
		T__0=1, ID=2, WS=3;
	public static String[] tokenNames = {
		"<INVALID>", "'hello'", "ID", "WS"
	};
	public static int
		RULE_r = 0;
	public static String[] ruleNames = {
		"r"
	};

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2); match(T__0);
			setState(3); match(ID);
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

	public static String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\5\b\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\2\2\3\2\2\2\6\2\4\3\2\2\2\4\5\7\3\2\2\5\6\7\4\2\2\6\3\3\2\2"+
		"\2\2";
	public static ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
	public static DFA[] getDecisiontodfa() {
		return _decisionToDFA;
	}

	public static void setDecisiontodfa(DFA[] decisiontodfa) {
		_decisionToDFA = decisiontodfa;
	}

	public static PredictionContextCache getSharedcontextcache() {
		return _sharedContextCache;
	}

	public static void setSharedcontextcache(PredictionContextCache sharedcontextcache) {
		_sharedContextCache = sharedcontextcache;
	}

	public static int getT0() {
		return T__0;
	}

	public static void setT0(int t0) {
		T__0 = t0;
	}

	public static int getId() {
		return ID;
	}

	public static void setId(int id) {
		ID = id;
	}

	public static int getWs() {
		return WS;
	}

	public static void setWs(int ws) {
		WS = ws;
	}

	public static String[] getTokennames() {
		return tokenNames;
	}

	public static void setTokennames(String[] tokennames) {
		tokenNames = tokennames;
	}

	public static int getRuleR() {
		return RULE_r;
	}

	public static void setRuleR(int ruleR) {
		RULE_r = ruleR;
	}

	public static String[] getRulenames() {
		return ruleNames;
	}

	public static void setRulenames(String[] rulenames) {
		ruleNames = rulenames;
	}

	public static String getSerializedatn() {
		return _serializedATN;
	}

	public static void setSerializedatn(String serializedatn) {
		_serializedATN = serializedatn;
	}

	public static ATN getAtn() {
		return _ATN;
	}

	public static void setAtn(ATN atn) {
		_ATN = atn;
	}
}