// Generated from /home/ninja/jaseci_bible/assets/code/jac.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jacParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TYP_STRING=9, 
		TYP_INT=10, TYP_FLOAT=11, TYP_LIST=12, TYP_DICT=13, TYP_BOOL=14, KW_TYPE=15, 
		KW_GRAPH=16, KW_STRICT=17, KW_DIGRAPH=18, KW_SUBGRAPH=19, KW_NODE=20, 
		KW_IGNORE=21, KW_TAKE=22, KW_SPAWN=23, KW_WITH=24, KW_ENTRY=25, KW_EXIT=26, 
		KW_LENGTH=27, KW_KEYS=28, KW_CONTEXT=29, KW_INFO=30, KW_DETAILS=31, KW_ACTIVITY=32, 
		COLON=33, DBL_COLON=34, COLON_OUT=35, LBRACE=36, RBRACE=37, KW_EDGE=38, 
		KW_WALKER=39, SEMI=40, EQ=41, PEQ=42, MEQ=43, TEQ=44, DEQ=45, CPY_EQ=46, 
		KW_AND=47, KW_OR=48, KW_IF=49, KW_ELIF=50, KW_ELSE=51, KW_FOR=52, KW_TO=53, 
		KW_BY=54, KW_WHILE=55, KW_CONTINUE=56, KW_BREAK=57, KW_DISENGAGE=58, KW_SKIP=59, 
		KW_REPORT=60, KW_DESTROY=61, DOT=62, NOT=63, EE=64, LT=65, GT=66, LTE=67, 
		GTE=68, NE=69, KW_IN=70, KW_ANCHOR=71, KW_HAS=72, KW_PRIVATE=73, COMMA=74, 
		KW_CAN=75, PLUS=76, MINUS=77, MUL=78, DIV=79, MOD=80, POW=81, LPAREN=82, 
		RPAREN=83, LSQUARE=84, RSQUARE=85, FLOAT=86, STRING=87, BOOL=88, INT=89, 
		NULL=90, NAME=91, COMMENT=92, LINE_COMMENT=93, PY_COMMENT=94, WS=95, ErrorChar=96;
	public static final int
		RULE_start = 0, RULE_element = 1, RULE_architype = 2, RULE_walker = 3, 
		RULE_ver_label = 4, RULE_namespaces = 5, RULE_walk_entry_block = 6, RULE_walk_exit_block = 7, 
		RULE_walk_activity_block = 8, RULE_attr_block = 9, RULE_attr_stmt = 10, 
		RULE_graph_block = 11, RULE_graph_block_spawn = 12, RULE_graph_block_dot = 13, 
		RULE_has_root = 14, RULE_has_stmt = 15, RULE_has_assign = 16, RULE_can_stmt = 17, 
		RULE_event_clause = 18, RULE_preset_in_out = 19, RULE_dotted_name = 20, 
		RULE_name_list = 21, RULE_expr_list = 22, RULE_code_block = 23, RULE_node_ctx_block = 24, 
		RULE_statement = 25, RULE_if_stmt = 26, RULE_elif_stmt = 27, RULE_else_stmt = 28, 
		RULE_for_stmt = 29, RULE_while_stmt = 30, RULE_ctrl_stmt = 31, RULE_destroy_action = 32, 
		RULE_report_action = 33, RULE_walker_action = 34, RULE_ignore_action = 35, 
		RULE_take_action = 36, RULE_expression = 37, RULE_assignment = 38, RULE_copy_assign = 39, 
		RULE_inc_assign = 40, RULE_connect = 41, RULE_logical = 42, RULE_compare = 43, 
		RULE_cmp_op = 44, RULE_nin = 45, RULE_arithmetic = 46, RULE_term = 47, 
		RULE_factor = 48, RULE_power = 49, RULE_func_call = 50, RULE_atom = 51, 
		RULE_ref = 52, RULE_deref = 53, RULE_built_in = 54, RULE_cast_built_in = 55, 
		RULE_obj_built_in = 56, RULE_dict_built_in = 57, RULE_list_built_in = 58, 
		RULE_string_built_in = 59, RULE_node_edge_ref = 60, RULE_node_ref = 61, 
		RULE_walker_ref = 62, RULE_graph_ref = 63, RULE_edge_ref = 64, RULE_edge_to = 65, 
		RULE_edge_from = 66, RULE_edge_any = 67, RULE_list_val = 68, RULE_index_slice = 69, 
		RULE_dict_val = 70, RULE_kv_pair = 71, RULE_spawn = 72, RULE_spawn_object = 73, 
		RULE_node_spawn = 74, RULE_graph_spawn = 75, RULE_walker_spawn = 76, RULE_spawn_ctx = 77, 
		RULE_filter_ctx = 78, RULE_spawn_assign = 79, RULE_filter_compare = 80, 
		RULE_any_type = 81, RULE_dot_graph = 82, RULE_dot_stmt_list = 83, RULE_dot_stmt = 84, 
		RULE_dot_attr_stmt = 85, RULE_dot_attr_list = 86, RULE_dot_a_list = 87, 
		RULE_dot_edge_stmt = 88, RULE_dot_edgeRHS = 89, RULE_dot_edgeop = 90, 
		RULE_dot_node_stmt = 91, RULE_dot_node_id = 92, RULE_dot_port = 93, RULE_dot_subgraph = 94, 
		RULE_dot_id = 95;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "element", "architype", "walker", "ver_label", "namespaces", 
			"walk_entry_block", "walk_exit_block", "walk_activity_block", "attr_block", 
			"attr_stmt", "graph_block", "graph_block_spawn", "graph_block_dot", "has_root", 
			"has_stmt", "has_assign", "can_stmt", "event_clause", "preset_in_out", 
			"dotted_name", "name_list", "expr_list", "code_block", "node_ctx_block", 
			"statement", "if_stmt", "elif_stmt", "else_stmt", "for_stmt", "while_stmt", 
			"ctrl_stmt", "destroy_action", "report_action", "walker_action", "ignore_action", 
			"take_action", "expression", "assignment", "copy_assign", "inc_assign", 
			"connect", "logical", "compare", "cmp_op", "nin", "arithmetic", "term", 
			"factor", "power", "func_call", "atom", "ref", "deref", "built_in", "cast_built_in", 
			"obj_built_in", "dict_built_in", "list_built_in", "string_built_in", 
			"node_edge_ref", "node_ref", "walker_ref", "graph_ref", "edge_ref", "edge_to", 
			"edge_from", "edge_any", "list_val", "index_slice", "dict_val", "kv_pair", 
			"spawn", "spawn_object", "node_spawn", "graph_spawn", "walker_spawn", 
			"spawn_ctx", "filter_ctx", "spawn_assign", "filter_compare", "any_type", 
			"dot_graph", "dot_stmt_list", "dot_stmt", "dot_attr_stmt", "dot_attr_list", 
			"dot_a_list", "dot_edge_stmt", "dot_edgeRHS", "dot_edgeop", "dot_node_stmt", 
			"dot_node_id", "dot_port", "dot_subgraph", "dot_id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'version'", "'&'", "'-->'", "'->'", "'<--'", "'<-'", "'<-->'", 
			"'--'", "'str'", "'int'", "'float'", "'list'", "'dict'", "'bool'", "'type'", 
			"'graph'", "'strict'", "'digraph'", "'subgraph'", "'node'", "'ignore'", 
			"'take'", "'spawn'", "'with'", "'entry'", "'exit'", "'length'", "'keys'", 
			"'context'", "'info'", "'details'", "'activity'", "':'", "'::'", "'::>'", 
			"'{'", "'}'", "'edge'", "'walker'", "';'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "':='", null, null, "'if'", "'elif'", "'else'", "'for'", "'to'", 
			"'by'", "'while'", "'continue'", "'break'", "'disengage'", "'skip'", 
			"'report'", "'destroy'", "'.'", null, "'=='", "'<'", "'>'", "'<='", "'>='", 
			"'!='", "'in'", "'anchor'", "'has'", "'private'", "','", "'can'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'^'", "'('", "')'", "'['", "']'", null, 
			null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "TYP_STRING", "TYP_INT", 
			"TYP_FLOAT", "TYP_LIST", "TYP_DICT", "TYP_BOOL", "KW_TYPE", "KW_GRAPH", 
			"KW_STRICT", "KW_DIGRAPH", "KW_SUBGRAPH", "KW_NODE", "KW_IGNORE", "KW_TAKE", 
			"KW_SPAWN", "KW_WITH", "KW_ENTRY", "KW_EXIT", "KW_LENGTH", "KW_KEYS", 
			"KW_CONTEXT", "KW_INFO", "KW_DETAILS", "KW_ACTIVITY", "COLON", "DBL_COLON", 
			"COLON_OUT", "LBRACE", "RBRACE", "KW_EDGE", "KW_WALKER", "SEMI", "EQ", 
			"PEQ", "MEQ", "TEQ", "DEQ", "CPY_EQ", "KW_AND", "KW_OR", "KW_IF", "KW_ELIF", 
			"KW_ELSE", "KW_FOR", "KW_TO", "KW_BY", "KW_WHILE", "KW_CONTINUE", "KW_BREAK", 
			"KW_DISENGAGE", "KW_SKIP", "KW_REPORT", "KW_DESTROY", "DOT", "NOT", "EE", 
			"LT", "GT", "LTE", "GTE", "NE", "KW_IN", "KW_ANCHOR", "KW_HAS", "KW_PRIVATE", 
			"COMMA", "KW_CAN", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "LPAREN", 
			"RPAREN", "LSQUARE", "RSQUARE", "FLOAT", "STRING", "BOOL", "INT", "NULL", 
			"NAME", "COMMENT", "LINE_COMMENT", "PY_COMMENT", "WS", "ErrorChar"
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
	public String getGrammarFileName() { return "jac.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jacParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(jacParser.EOF, 0); }
		public Ver_labelContext ver_label() {
			return getRuleContext(Ver_labelContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(192);
				ver_label();
				}
			}

			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				element();
				}
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_GRAPH) | (1L << KW_NODE) | (1L << KW_EDGE) | (1L << KW_WALKER))) != 0) );
			setState(200);
			match(EOF);
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

	public static class ElementContext extends ParserRuleContext {
		public ArchitypeContext architype() {
			return getRuleContext(ArchitypeContext.class,0);
		}
		public WalkerContext walker() {
			return getRuleContext(WalkerContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_GRAPH:
			case KW_NODE:
			case KW_EDGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				architype();
				}
				break;
			case KW_WALKER:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				walker();
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

	public static class ArchitypeContext extends ParserRuleContext {
		public TerminalNode KW_NODE() { return getToken(jacParser.KW_NODE, 0); }
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public Attr_blockContext attr_block() {
			return getRuleContext(Attr_blockContext.class,0);
		}
		public TerminalNode COLON() { return getToken(jacParser.COLON, 0); }
		public TerminalNode INT() { return getToken(jacParser.INT, 0); }
		public TerminalNode KW_EDGE() { return getToken(jacParser.KW_EDGE, 0); }
		public TerminalNode KW_GRAPH() { return getToken(jacParser.KW_GRAPH, 0); }
		public Graph_blockContext graph_block() {
			return getRuleContext(Graph_blockContext.class,0);
		}
		public ArchitypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architype; }
	}

	public final ArchitypeContext architype() throws RecognitionException {
		ArchitypeContext _localctx = new ArchitypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_architype);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(KW_NODE);
				setState(207);
				match(NAME);
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(208);
					match(COLON);
					setState(209);
					match(INT);
					}
					break;
				}
				setState(212);
				attr_block();
				}
				break;
			case KW_EDGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(KW_EDGE);
				setState(214);
				match(NAME);
				setState(215);
				attr_block();
				}
				break;
			case KW_GRAPH:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(KW_GRAPH);
				setState(217);
				match(NAME);
				setState(218);
				graph_block();
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

	public static class WalkerContext extends ParserRuleContext {
		public TerminalNode KW_WALKER() { return getToken(jacParser.KW_WALKER, 0); }
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public TerminalNode LBRACE() { return getToken(jacParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(jacParser.RBRACE, 0); }
		public NamespacesContext namespaces() {
			return getRuleContext(NamespacesContext.class,0);
		}
		public List<Attr_stmtContext> attr_stmt() {
			return getRuleContexts(Attr_stmtContext.class);
		}
		public Attr_stmtContext attr_stmt(int i) {
			return getRuleContext(Attr_stmtContext.class,i);
		}
		public Walk_entry_blockContext walk_entry_block() {
			return getRuleContext(Walk_entry_blockContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Walk_activity_blockContext> walk_activity_block() {
			return getRuleContexts(Walk_activity_blockContext.class);
		}
		public Walk_activity_blockContext walk_activity_block(int i) {
			return getRuleContext(Walk_activity_blockContext.class,i);
		}
		public Walk_exit_blockContext walk_exit_block() {
			return getRuleContext(Walk_exit_blockContext.class,0);
		}
		public WalkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_walker; }
	}

	public final WalkerContext walker() throws RecognitionException {
		WalkerContext _localctx = new WalkerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_walker);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(KW_WALKER);
			setState(222);
			match(NAME);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(223);
				namespaces();
				}
			}

			setState(226);
			match(LBRACE);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_HAS || _la==KW_CAN) {
				{
				{
				setState(227);
				attr_stmt();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(233);
				walk_entry_block();
				}
				break;
			}
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(238);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__1:
					case T__2:
					case T__4:
					case T__5:
					case T__6:
					case TYP_STRING:
					case TYP_INT:
					case TYP_FLOAT:
					case TYP_LIST:
					case TYP_DICT:
					case TYP_BOOL:
					case KW_TYPE:
					case KW_NODE:
					case KW_IGNORE:
					case KW_TAKE:
					case KW_SPAWN:
					case COLON:
					case DBL_COLON:
					case LBRACE:
					case KW_EDGE:
					case KW_IF:
					case KW_FOR:
					case KW_WHILE:
					case KW_CONTINUE:
					case KW_BREAK:
					case KW_DISENGAGE:
					case KW_SKIP:
					case KW_REPORT:
					case KW_DESTROY:
					case NOT:
					case PLUS:
					case MINUS:
					case MUL:
					case LPAREN:
					case LSQUARE:
					case FLOAT:
					case STRING:
					case BOOL:
					case INT:
					case NULL:
					case NAME:
						{
						setState(236);
						statement();
						}
						break;
					case KW_WITH:
						{
						setState(237);
						walk_activity_block();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WITH) {
				{
				setState(243);
				walk_exit_block();
				}
			}

			setState(246);
			match(RBRACE);
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

	public static class Ver_labelContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(jacParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(jacParser.STRING, 0); }
		public TerminalNode SEMI() { return getToken(jacParser.SEMI, 0); }
		public Ver_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ver_label; }
	}

	public final Ver_labelContext ver_label() throws RecognitionException {
		Ver_labelContext _localctx = new Ver_labelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ver_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__0);
			setState(249);
			match(COLON);
			setState(250);
			match(STRING);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(251);
				match(SEMI);
				}
			}

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

	public static class NamespacesContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(jacParser.COLON, 0); }
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public NamespacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaces; }
	}

	public final NamespacesContext namespaces() throws RecognitionException {
		NamespacesContext _localctx = new NamespacesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_namespaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(COLON);
			setState(255);
			name_list();
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

	public static class Walk_entry_blockContext extends ParserRuleContext {
		public TerminalNode KW_WITH() { return getToken(jacParser.KW_WITH, 0); }
		public TerminalNode KW_ENTRY() { return getToken(jacParser.KW_ENTRY, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Walk_entry_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_walk_entry_block; }
	}

	public final Walk_entry_blockContext walk_entry_block() throws RecognitionException {
		Walk_entry_blockContext _localctx = new Walk_entry_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_walk_entry_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(KW_WITH);
			setState(258);
			match(KW_ENTRY);
			setState(259);
			code_block();
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

	public static class Walk_exit_blockContext extends ParserRuleContext {
		public TerminalNode KW_WITH() { return getToken(jacParser.KW_WITH, 0); }
		public TerminalNode KW_EXIT() { return getToken(jacParser.KW_EXIT, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Walk_exit_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_walk_exit_block; }
	}

	public final Walk_exit_blockContext walk_exit_block() throws RecognitionException {
		Walk_exit_blockContext _localctx = new Walk_exit_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_walk_exit_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(KW_WITH);
			setState(262);
			match(KW_EXIT);
			setState(263);
			code_block();
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

	public static class Walk_activity_blockContext extends ParserRuleContext {
		public TerminalNode KW_WITH() { return getToken(jacParser.KW_WITH, 0); }
		public TerminalNode KW_ACTIVITY() { return getToken(jacParser.KW_ACTIVITY, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Walk_activity_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_walk_activity_block; }
	}

	public final Walk_activity_blockContext walk_activity_block() throws RecognitionException {
		Walk_activity_blockContext _localctx = new Walk_activity_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_walk_activity_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(KW_WITH);
			setState(266);
			match(KW_ACTIVITY);
			setState(267);
			code_block();
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

	public static class Attr_blockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(jacParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(jacParser.RBRACE, 0); }
		public List<Attr_stmtContext> attr_stmt() {
			return getRuleContexts(Attr_stmtContext.class);
		}
		public Attr_stmtContext attr_stmt(int i) {
			return getRuleContext(Attr_stmtContext.class,i);
		}
		public TerminalNode COLON() { return getToken(jacParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(jacParser.SEMI, 0); }
		public Attr_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_block; }
	}

	public final Attr_blockContext attr_block() throws RecognitionException {
		Attr_blockContext _localctx = new Attr_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attr_block);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(LBRACE);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KW_HAS || _la==KW_CAN) {
					{
					{
					setState(270);
					attr_stmt();
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				match(RBRACE);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(COLON);
				setState(278);
				attr_stmt();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(SEMI);
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

	public static class Attr_stmtContext extends ParserRuleContext {
		public Has_stmtContext has_stmt() {
			return getRuleContext(Has_stmtContext.class,0);
		}
		public Can_stmtContext can_stmt() {
			return getRuleContext(Can_stmtContext.class,0);
		}
		public Attr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_stmt; }
	}

	public final Attr_stmtContext attr_stmt() throws RecognitionException {
		Attr_stmtContext _localctx = new Attr_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attr_stmt);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_HAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				has_stmt();
				}
				break;
			case KW_CAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				can_stmt();
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

	public static class Graph_blockContext extends ParserRuleContext {
		public Graph_block_spawnContext graph_block_spawn() {
			return getRuleContext(Graph_block_spawnContext.class,0);
		}
		public Graph_block_dotContext graph_block_dot() {
			return getRuleContext(Graph_block_dotContext.class,0);
		}
		public Graph_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_block; }
	}

	public final Graph_blockContext graph_block() throws RecognitionException {
		Graph_blockContext _localctx = new Graph_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_graph_block);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				graph_block_spawn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				graph_block_dot();
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

	public static class Graph_block_spawnContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(jacParser.LBRACE, 0); }
		public Has_rootContext has_root() {
			return getRuleContext(Has_rootContext.class,0);
		}
		public TerminalNode KW_SPAWN() { return getToken(jacParser.KW_SPAWN, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(jacParser.RBRACE, 0); }
		public TerminalNode COLON() { return getToken(jacParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(jacParser.SEMI, 0); }
		public Graph_block_spawnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_block_spawn; }
	}

	public final Graph_block_spawnContext graph_block_spawn() throws RecognitionException {
		Graph_block_spawnContext _localctx = new Graph_block_spawnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_graph_block_spawn);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(LBRACE);
				setState(291);
				has_root();
				setState(292);
				match(KW_SPAWN);
				setState(293);
				code_block();
				setState(294);
				match(RBRACE);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(COLON);
				setState(297);
				has_root();
				setState(298);
				match(KW_SPAWN);
				setState(299);
				code_block();
				setState(300);
				match(SEMI);
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

	public static class Graph_block_dotContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(jacParser.LBRACE, 0); }
		public Has_rootContext has_root() {
			return getRuleContext(Has_rootContext.class,0);
		}
		public Dot_graphContext dot_graph() {
			return getRuleContext(Dot_graphContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(jacParser.RBRACE, 0); }
		public TerminalNode COLON() { return getToken(jacParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(jacParser.SEMI, 0); }
		public Graph_block_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_block_dot; }
	}

	public final Graph_block_dotContext graph_block_dot() throws RecognitionException {
		Graph_block_dotContext _localctx = new Graph_block_dotContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_graph_block_dot);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(LBRACE);
				setState(305);
				has_root();
				setState(306);
				dot_graph();
				setState(307);
				match(RBRACE);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(COLON);
				setState(310);
				has_root();
				setState(311);
				dot_graph();
				setState(312);
				match(SEMI);
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

	public static class Has_rootContext extends ParserRuleContext {
		public TerminalNode KW_HAS() { return getToken(jacParser.KW_HAS, 0); }
		public TerminalNode KW_ANCHOR() { return getToken(jacParser.KW_ANCHOR, 0); }
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public TerminalNode SEMI() { return getToken(jacParser.SEMI, 0); }
		public Has_rootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_has_root; }
	}

	public final Has_rootContext has_root() throws RecognitionException {
		Has_rootContext _localctx = new Has_rootContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_has_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(KW_HAS);
			setState(317);
			match(KW_ANCHOR);
			setState(318);
			match(NAME);
			setState(319);
			match(SEMI);
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

	public static class Has_stmtContext extends ParserRuleContext {
		public TerminalNode KW_HAS() { return getToken(jacParser.KW_HAS, 0); }
		public List<Has_assignContext> has_assign() {
			return getRuleContexts(Has_assignContext.class);
		}
		public Has_assignContext has_assign(int i) {
			return getRuleContext(Has_assignContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(jacParser.SEMI, 0); }
		public TerminalNode KW_PRIVATE() { return getToken(jacParser.KW_PRIVATE, 0); }
		public TerminalNode KW_ANCHOR() { return getToken(jacParser.KW_ANCHOR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(jacParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jacParser.COMMA, i);
		}
		public Has_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_has_stmt; }
	}

	public final Has_stmtContext has_stmt() throws RecognitionException {
		Has_stmtContext _localctx = new Has_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_has_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(KW_HAS);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PRIVATE) {
				{
				setState(322);
				match(KW_PRIVATE);
				}
			}

			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ANCHOR) {
				{
				setState(325);
				match(KW_ANCHOR);
				}
			}

			setState(328);
			has_assign();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(329);
				match(COMMA);
				setState(330);
				has_assign();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(SEMI);
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

	public static class Has_assignContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public TerminalNode EQ() { return getToken(jacParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Has_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_has_assign; }
	}

	public final Has_assignContext has_assign() throws RecognitionException {
		Has_assignContext _localctx = new Has_assignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_has_assign);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(NAME);
				setState(340);
				match(EQ);
				setState(341);
				expression();
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

	public static class Can_stmtContext extends ParserRuleContext {
		public TerminalNode KW_CAN() { return getToken(jacParser.KW_CAN, 0); }
		public List<Dotted_nameContext> dotted_name() {
			return getRuleContexts(Dotted_nameContext.class);
		}
		public Dotted_nameContext dotted_name(int i) {
			return getRuleContext(Dotted_nameContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(jacParser.SEMI, 0); }
		public List<Preset_in_outContext> preset_in_out() {
			return getRuleContexts(Preset_in_outContext.class);
		}
		public Preset_in_outContext preset_in_out(int i) {
			return getRuleContext(Preset_in_outContext.class,i);
		}
		public List<Event_clauseContext> event_clause() {
			return getRuleContexts(Event_clauseContext.class);
		}
		public Event_clauseContext event_clause(int i) {
			return getRuleContext(Event_clauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jacParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jacParser.COMMA, i);
		}
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Can_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_can_stmt; }
	}

	public final Can_stmtContext can_stmt() throws RecognitionException {
		Can_stmtContext _localctx = new Can_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_can_stmt);
		int _la;
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(KW_CAN);
				setState(345);
				dotted_name();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DBL_COLON) {
					{
					setState(346);
					preset_in_out();
					setState(347);
					event_clause();
					}
				}

				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(351);
					match(COMMA);
					setState(352);
					dotted_name();
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DBL_COLON) {
						{
						setState(353);
						preset_in_out();
						setState(354);
						event_clause();
						}
					}

					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(KW_CAN);
				setState(366);
				match(NAME);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WITH) {
					{
					setState(367);
					event_clause();
					}
				}

				setState(370);
				code_block();
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

	public static class Event_clauseContext extends ParserRuleContext {
		public TerminalNode KW_WITH() { return getToken(jacParser.KW_WITH, 0); }
		public TerminalNode KW_ENTRY() { return getToken(jacParser.KW_ENTRY, 0); }
		public TerminalNode KW_EXIT() { return getToken(jacParser.KW_EXIT, 0); }
		public TerminalNode KW_ACTIVITY() { return getToken(jacParser.KW_ACTIVITY, 0); }
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public Event_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_clause; }
	}

	public final Event_clauseContext event_clause() throws RecognitionException {
		Event_clauseContext _localctx = new Event_clauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_event_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(KW_WITH);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(374);
				name_list();
				}
			}

			setState(377);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ENTRY) | (1L << KW_EXIT) | (1L << KW_ACTIVITY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Preset_in_outContext extends ParserRuleContext {
		public List<TerminalNode> DBL_COLON() { return getTokens(jacParser.DBL_COLON); }
		public TerminalNode DBL_COLON(int i) {
			return getToken(jacParser.DBL_COLON, i);
		}
		public TerminalNode COLON_OUT() { return getToken(jacParser.COLON_OUT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Preset_in_outContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preset_in_out; }
	}

	public final Preset_in_outContext preset_in_out() throws RecognitionException {
		Preset_in_outContext _localctx = new Preset_in_outContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_preset_in_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(DBL_COLON);
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(380);
				expr_list();
				}
				break;
			}
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DBL_COLON:
				{
				setState(383);
				match(DBL_COLON);
				}
				break;
			case COLON_OUT:
				{
				setState(384);
				match(COLON_OUT);
				setState(385);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class Dotted_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(jacParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(jacParser.NAME, i);
		}
		public TerminalNode DOT() { return getToken(jacParser.DOT, 0); }
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dotted_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(NAME);
			setState(389);
			match(DOT);
			setState(390);
			match(NAME);
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

	public static class Name_listContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(jacParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(jacParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jacParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jacParser.COMMA, i);
		}
		public Name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_list; }
	}

	public final Name_listContext name_list() throws RecognitionException {
		Name_listContext _localctx = new Name_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(NAME);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(393);
				match(COMMA);
				setState(394);
				match(NAME);
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jacParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jacParser.COMMA, i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			expression();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(401);
				match(COMMA);
				setState(402);
				expression();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(jacParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(jacParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode COLON() { return getToken(jacParser.COLON, 0); }
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_code_block);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(LBRACE);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << TYP_STRING) | (1L << TYP_INT) | (1L << TYP_FLOAT) | (1L << TYP_LIST) | (1L << TYP_DICT) | (1L << TYP_BOOL) | (1L << KW_TYPE) | (1L << KW_NODE) | (1L << KW_IGNORE) | (1L << KW_TAKE) | (1L << KW_SPAWN) | (1L << COLON) | (1L << DBL_COLON) | (1L << LBRACE) | (1L << KW_EDGE) | (1L << KW_IF) | (1L << KW_FOR) | (1L << KW_WHILE) | (1L << KW_CONTINUE) | (1L << KW_BREAK) | (1L << KW_DISENGAGE) | (1L << KW_SKIP) | (1L << KW_REPORT) | (1L << KW_DESTROY) | (1L << NOT))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PLUS - 76)) | (1L << (MINUS - 76)) | (1L << (MUL - 76)) | (1L << (LPAREN - 76)) | (1L << (LSQUARE - 76)) | (1L << (FLOAT - 76)) | (1L << (STRING - 76)) | (1L << (BOOL - 76)) | (1L << (INT - 76)) | (1L << (NULL - 76)) | (1L << (NAME - 76)))) != 0)) {
					{
					{
					setState(409);
					statement();
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
				match(RBRACE);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(COLON);
				setState(417);
				statement();
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

	public static class Node_ctx_blockContext extends ParserRuleContext {
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Node_ctx_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_ctx_block; }
	}

	public final Node_ctx_blockContext node_ctx_block() throws RecognitionException {
		Node_ctx_blockContext _localctx = new Node_ctx_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_node_ctx_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			name_list();
			setState(421);
			code_block();
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

	public static class StatementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Node_ctx_blockContext node_ctx_block() {
			return getRuleContext(Node_ctx_blockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(jacParser.SEMI, 0); }
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Ctrl_stmtContext ctrl_stmt() {
			return getRuleContext(Ctrl_stmtContext.class,0);
		}
		public Destroy_actionContext destroy_action() {
			return getRuleContext(Destroy_actionContext.class,0);
		}
		public Report_actionContext report_action() {
			return getRuleContext(Report_actionContext.class,0);
		}
		public Walker_actionContext walker_action() {
			return getRuleContext(Walker_actionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				node_ctx_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				expression();
				setState(426);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				if_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(430);
				while_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(431);
				ctrl_stmt();
				setState(432);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(434);
				destroy_action();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(435);
				report_action();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(436);
				walker_action();
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(jacParser.KW_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public List<Elif_stmtContext> elif_stmt() {
			return getRuleContexts(Elif_stmtContext.class);
		}
		public Elif_stmtContext elif_stmt(int i) {
			return getRuleContext(Elif_stmtContext.class,i);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(KW_IF);
			setState(440);
			expression();
			setState(441);
			code_block();
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(442);
					elif_stmt();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(448);
				else_stmt();
				}
				break;
			}
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

	public static class Elif_stmtContext extends ParserRuleContext {
		public TerminalNode KW_ELIF() { return getToken(jacParser.KW_ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Elif_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_stmt; }
	}

	public final Elif_stmtContext elif_stmt() throws RecognitionException {
		Elif_stmtContext _localctx = new Elif_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elif_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(KW_ELIF);
			setState(452);
			expression();
			setState(453);
			code_block();
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

	public static class Else_stmtContext extends ParserRuleContext {
		public TerminalNode KW_ELSE() { return getToken(jacParser.KW_ELSE, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(KW_ELSE);
			setState(456);
			code_block();
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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(jacParser.KW_FOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KW_TO() { return getToken(jacParser.KW_TO, 0); }
		public TerminalNode KW_BY() { return getToken(jacParser.KW_BY, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public TerminalNode KW_IN() { return getToken(jacParser.KW_IN, 0); }
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_for_stmt);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(KW_FOR);
				setState(459);
				expression();
				setState(460);
				match(KW_TO);
				setState(461);
				expression();
				setState(462);
				match(KW_BY);
				setState(463);
				expression();
				setState(464);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(KW_FOR);
				setState(467);
				match(NAME);
				setState(468);
				match(KW_IN);
				setState(469);
				expression();
				setState(470);
				code_block();
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(jacParser.KW_WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(KW_WHILE);
			setState(475);
			expression();
			setState(476);
			code_block();
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

	public static class Ctrl_stmtContext extends ParserRuleContext {
		public TerminalNode KW_CONTINUE() { return getToken(jacParser.KW_CONTINUE, 0); }
		public TerminalNode KW_BREAK() { return getToken(jacParser.KW_BREAK, 0); }
		public TerminalNode KW_SKIP() { return getToken(jacParser.KW_SKIP, 0); }
		public Ctrl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctrl_stmt; }
	}

	public final Ctrl_stmtContext ctrl_stmt() throws RecognitionException {
		Ctrl_stmtContext _localctx = new Ctrl_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ctrl_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONTINUE) | (1L << KW_BREAK) | (1L << KW_SKIP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Destroy_actionContext extends ParserRuleContext {
		public TerminalNode KW_DESTROY() { return getToken(jacParser.KW_DESTROY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(jacParser.SEMI, 0); }
		public Destroy_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destroy_action; }
	}

	public final Destroy_actionContext destroy_action() throws RecognitionException {
		Destroy_actionContext _localctx = new Destroy_actionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_destroy_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(KW_DESTROY);
			setState(481);
			expression();
			setState(482);
			match(SEMI);
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

	public static class Report_actionContext extends ParserRuleContext {
		public TerminalNode KW_REPORT() { return getToken(jacParser.KW_REPORT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(jacParser.SEMI, 0); }
		public Report_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report_action; }
	}

	public final Report_actionContext report_action() throws RecognitionException {
		Report_actionContext _localctx = new Report_actionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_report_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(KW_REPORT);
			setState(485);
			expression();
			setState(486);
			match(SEMI);
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

	public static class Walker_actionContext extends ParserRuleContext {
		public Ignore_actionContext ignore_action() {
			return getRuleContext(Ignore_actionContext.class,0);
		}
		public Take_actionContext take_action() {
			return getRuleContext(Take_actionContext.class,0);
		}
		public TerminalNode KW_DISENGAGE() { return getToken(jacParser.KW_DISENGAGE, 0); }
		public TerminalNode SEMI() { return getToken(jacParser.SEMI, 0); }
		public Walker_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_walker_action; }
	}

	public final Walker_actionContext walker_action() throws RecognitionException {
		Walker_actionContext _localctx = new Walker_actionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_walker_action);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_IGNORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				ignore_action();
				}
				break;
			case KW_TAKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				take_action();
				}
				break;
			case KW_DISENGAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				match(KW_DISENGAGE);
				setState(491);
				match(SEMI);
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

	public static class Ignore_actionContext extends ParserRuleContext {
		public TerminalNode KW_IGNORE() { return getToken(jacParser.KW_IGNORE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(jacParser.SEMI, 0); }
		public Ignore_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore_action; }
	}

	public final Ignore_actionContext ignore_action() throws RecognitionException {
		Ignore_actionContext _localctx = new Ignore_actionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ignore_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(KW_IGNORE);
			setState(495);
			expression();
			setState(496);
			match(SEMI);
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

	public static class Take_actionContext extends ParserRuleContext {
		public TerminalNode KW_TAKE() { return getToken(jacParser.KW_TAKE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(jacParser.SEMI, 0); }
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public Take_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_take_action; }
	}

	public final Take_actionContext take_action() throws RecognitionException {
		Take_actionContext _localctx = new Take_actionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_take_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(KW_TAKE);
			setState(499);
			expression();
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(500);
				match(SEMI);
				}
				break;
			case KW_ELSE:
				{
				setState(501);
				else_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ExpressionContext extends ParserRuleContext {
		public ConnectContext connect() {
			return getRuleContext(ConnectContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Copy_assignContext copy_assign() {
			return getRuleContext(Copy_assignContext.class,0);
		}
		public Inc_assignContext inc_assign() {
			return getRuleContext(Inc_assignContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			connect();
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(505);
				assignment();
				}
				break;
			case 2:
				{
				setState(506);
				copy_assign();
				}
				break;
			case 3:
				{
				setState(507);
				inc_assign();
				}
				break;
			}
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(jacParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(EQ);
			setState(511);
			expression();
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

	public static class Copy_assignContext extends ParserRuleContext {
		public TerminalNode CPY_EQ() { return getToken(jacParser.CPY_EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Copy_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_assign; }
	}

	public final Copy_assignContext copy_assign() throws RecognitionException {
		Copy_assignContext _localctx = new Copy_assignContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_copy_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(CPY_EQ);
			setState(514);
			expression();
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

	public static class Inc_assignContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PEQ() { return getToken(jacParser.PEQ, 0); }
		public TerminalNode MEQ() { return getToken(jacParser.MEQ, 0); }
		public TerminalNode TEQ() { return getToken(jacParser.TEQ, 0); }
		public TerminalNode DEQ() { return getToken(jacParser.DEQ, 0); }
		public Inc_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_assign; }
	}

	public final Inc_assignContext inc_assign() throws RecognitionException {
		Inc_assignContext _localctx = new Inc_assignContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_inc_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEQ) | (1L << MEQ) | (1L << TEQ) | (1L << DEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(517);
			expression();
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

	public static class ConnectContext extends ParserRuleContext {
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public Edge_refContext edge_ref() {
			return getRuleContext(Edge_refContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(jacParser.NOT, 0); }
		public ConnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connect; }
	}

	public final ConnectContext connect() throws RecognitionException {
		ConnectContext _localctx = new ConnectContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_connect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			logical();
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(520);
					match(NOT);
					}
				}

				setState(523);
				edge_ref();
				setState(524);
				expression();
				}
				break;
			}
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

	public static class LogicalContext extends ParserRuleContext {
		public List<CompareContext> compare() {
			return getRuleContexts(CompareContext.class);
		}
		public CompareContext compare(int i) {
			return getRuleContext(CompareContext.class,i);
		}
		public List<TerminalNode> KW_AND() { return getTokens(jacParser.KW_AND); }
		public TerminalNode KW_AND(int i) {
			return getToken(jacParser.KW_AND, i);
		}
		public List<TerminalNode> KW_OR() { return getTokens(jacParser.KW_OR); }
		public TerminalNode KW_OR(int i) {
			return getToken(jacParser.KW_OR, i);
		}
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_logical);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			compare();
			setState(533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(529);
					_la = _input.LA(1);
					if ( !(_la==KW_AND || _la==KW_OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(530);
					compare();
					}
					} 
				}
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
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

	public static class CompareContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(jacParser.NOT, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public List<Cmp_opContext> cmp_op() {
			return getRuleContexts(Cmp_opContext.class);
		}
		public Cmp_opContext cmp_op(int i) {
			return getRuleContext(Cmp_opContext.class,i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_compare);
		try {
			int _alt;
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				match(NOT);
				setState(537);
				compare();
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case TYP_STRING:
			case TYP_INT:
			case TYP_FLOAT:
			case TYP_LIST:
			case TYP_DICT:
			case TYP_BOOL:
			case KW_TYPE:
			case KW_NODE:
			case KW_SPAWN:
			case DBL_COLON:
			case LBRACE:
			case KW_EDGE:
			case PLUS:
			case MINUS:
			case MUL:
			case LPAREN:
			case LSQUARE:
			case FLOAT:
			case STRING:
			case BOOL:
			case INT:
			case NULL:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				arithmetic();
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(539);
						cmp_op();
						setState(540);
						arithmetic();
						}
						} 
					}
					setState(546);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
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

	public static class Cmp_opContext extends ParserRuleContext {
		public TerminalNode EE() { return getToken(jacParser.EE, 0); }
		public TerminalNode LT() { return getToken(jacParser.LT, 0); }
		public TerminalNode GT() { return getToken(jacParser.GT, 0); }
		public TerminalNode LTE() { return getToken(jacParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(jacParser.GTE, 0); }
		public TerminalNode NE() { return getToken(jacParser.NE, 0); }
		public TerminalNode KW_IN() { return getToken(jacParser.KW_IN, 0); }
		public NinContext nin() {
			return getRuleContext(NinContext.class,0);
		}
		public Cmp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_op; }
	}

	public final Cmp_opContext cmp_op() throws RecognitionException {
		Cmp_opContext _localctx = new Cmp_opContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_cmp_op);
		try {
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EE:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(EE);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				match(GT);
				}
				break;
			case LTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(552);
				match(LTE);
				}
				break;
			case GTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(553);
				match(GTE);
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 6);
				{
				setState(554);
				match(NE);
				}
				break;
			case KW_IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(555);
				match(KW_IN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(556);
				nin();
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

	public static class NinContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(jacParser.NOT, 0); }
		public TerminalNode KW_IN() { return getToken(jacParser.KW_IN, 0); }
		public NinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nin; }
	}

	public final NinContext nin() throws RecognitionException {
		NinContext _localctx = new NinContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_nin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(NOT);
			setState(560);
			match(KW_IN);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(jacParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(jacParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(jacParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(jacParser.MINUS, i);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arithmetic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			term();
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(564);
					term();
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(jacParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(jacParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(jacParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(jacParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(jacParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(jacParser.MOD, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			factor();
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(571);
					_la = _input.LA(1);
					if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (MUL - 78)) | (1L << (DIV - 78)) | (1L << (MOD - 78)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(572);
					factor();
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(jacParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(jacParser.MINUS, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_factor);
		int _la;
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(579);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				power();
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

	public static class PowerContext extends ParserRuleContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public List<TerminalNode> POW() { return getTokens(jacParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(jacParser.POW, i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_power);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			func_call();
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(584);
					match(POW);
					setState(585);
					factor();
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
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

	public static class Func_callContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(jacParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(jacParser.RPAREN, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode DBL_COLON() { return getToken(jacParser.DBL_COLON, 0); }
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public Spawn_ctxContext spawn_ctx() {
			return getRuleContext(Spawn_ctxContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_func_call);
		int _la;
		try {
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				atom(0);
				setState(597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(592);
					match(LPAREN);
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << TYP_STRING) | (1L << TYP_INT) | (1L << TYP_FLOAT) | (1L << TYP_LIST) | (1L << TYP_DICT) | (1L << TYP_BOOL) | (1L << KW_TYPE) | (1L << KW_NODE) | (1L << KW_SPAWN) | (1L << DBL_COLON) | (1L << LBRACE) | (1L << KW_EDGE) | (1L << NOT))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PLUS - 76)) | (1L << (MINUS - 76)) | (1L << (MUL - 76)) | (1L << (LPAREN - 76)) | (1L << (LSQUARE - 76)) | (1L << (FLOAT - 76)) | (1L << (STRING - 76)) | (1L << (BOOL - 76)) | (1L << (INT - 76)) | (1L << (NULL - 76)) | (1L << (NAME - 76)))) != 0)) {
						{
						setState(593);
						expr_list();
						}
					}

					setState(596);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << TYP_STRING) | (1L << TYP_INT) | (1L << TYP_FLOAT) | (1L << TYP_LIST) | (1L << TYP_DICT) | (1L << TYP_BOOL) | (1L << KW_TYPE) | (1L << KW_NODE) | (1L << KW_SPAWN) | (1L << LBRACE) | (1L << KW_EDGE))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (MINUS - 77)) | (1L << (MUL - 77)) | (1L << (LPAREN - 77)) | (1L << (LSQUARE - 77)) | (1L << (FLOAT - 77)) | (1L << (STRING - 77)) | (1L << (BOOL - 77)) | (1L << (INT - 77)) | (1L << (NULL - 77)) | (1L << (NAME - 77)))) != 0)) {
					{
					setState(599);
					atom(0);
					}
				}

				setState(602);
				match(DBL_COLON);
				setState(603);
				match(NAME);
				setState(605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(604);
					spawn_ctx();
					}
					break;
				}
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(jacParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(jacParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(jacParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(jacParser.BOOL, 0); }
		public TerminalNode NULL() { return getToken(jacParser.NULL, 0); }
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public Node_edge_refContext node_edge_ref() {
			return getRuleContext(Node_edge_refContext.class,0);
		}
		public List_valContext list_val() {
			return getRuleContext(List_valContext.class,0);
		}
		public Dict_valContext dict_val() {
			return getRuleContext(Dict_valContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(jacParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(jacParser.RPAREN, 0); }
		public SpawnContext spawn() {
			return getRuleContext(SpawnContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public DerefContext deref() {
			return getRuleContext(DerefContext.class,0);
		}
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode DOT() { return getToken(jacParser.DOT, 0); }
		public Built_inContext built_in() {
			return getRuleContext(Built_inContext.class,0);
		}
		public Index_sliceContext index_slice() {
			return getRuleContext(Index_sliceContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		return atom(0);
	}

	private AtomContext atom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AtomContext _localctx = new AtomContext(_ctx, _parentState);
		AtomContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_atom, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(610);
				match(INT);
				}
				break;
			case 2:
				{
				setState(611);
				match(FLOAT);
				}
				break;
			case 3:
				{
				setState(612);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(613);
				match(BOOL);
				}
				break;
			case 5:
				{
				setState(614);
				match(NULL);
				}
				break;
			case 6:
				{
				setState(615);
				match(NAME);
				}
				break;
			case 7:
				{
				setState(616);
				node_edge_ref();
				}
				break;
			case 8:
				{
				setState(617);
				list_val();
				}
				break;
			case 9:
				{
				setState(618);
				dict_val();
				}
				break;
			case 10:
				{
				setState(619);
				match(LPAREN);
				setState(620);
				expression();
				setState(621);
				match(RPAREN);
				}
				break;
			case 11:
				{
				setState(623);
				spawn();
				}
				break;
			case 12:
				{
				setState(624);
				ref();
				}
				break;
			case 13:
				{
				setState(625);
				deref();
				}
				break;
			case 14:
				{
				setState(626);
				any_type();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(639);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(637);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new AtomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_atom);
						setState(629);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(630);
						match(DOT);
						setState(631);
						built_in();
						}
						break;
					case 2:
						{
						_localctx = new AtomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_atom);
						setState(632);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(633);
						match(DOT);
						setState(634);
						match(NAME);
						}
						break;
					case 3:
						{
						_localctx = new AtomContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_atom);
						setState(635);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(636);
						index_slice();
						}
						break;
					}
					} 
				}
				setState(641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class RefContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(T__1);
			setState(643);
			expression();
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

	public static class DerefContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(jacParser.MUL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DerefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deref; }
	}

	public final DerefContext deref() throws RecognitionException {
		DerefContext _localctx = new DerefContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_deref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(MUL);
			setState(646);
			expression();
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

	public static class Built_inContext extends ParserRuleContext {
		public Cast_built_inContext cast_built_in() {
			return getRuleContext(Cast_built_inContext.class,0);
		}
		public Obj_built_inContext obj_built_in() {
			return getRuleContext(Obj_built_inContext.class,0);
		}
		public Dict_built_inContext dict_built_in() {
			return getRuleContext(Dict_built_inContext.class,0);
		}
		public List_built_inContext list_built_in() {
			return getRuleContext(List_built_inContext.class,0);
		}
		public String_built_inContext string_built_in() {
			return getRuleContext(String_built_inContext.class,0);
		}
		public Built_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in; }
	}

	public final Built_inContext built_in() throws RecognitionException {
		Built_inContext _localctx = new Built_inContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_built_in);
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				cast_built_in();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				obj_built_in();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				dict_built_in();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(651);
				list_built_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(652);
				string_built_in();
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

	public static class Cast_built_inContext extends ParserRuleContext {
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public Cast_built_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_built_in; }
	}

	public final Cast_built_inContext cast_built_in() throws RecognitionException {
		Cast_built_inContext _localctx = new Cast_built_inContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_cast_built_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			any_type();
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

	public static class Obj_built_inContext extends ParserRuleContext {
		public TerminalNode KW_CONTEXT() { return getToken(jacParser.KW_CONTEXT, 0); }
		public TerminalNode KW_INFO() { return getToken(jacParser.KW_INFO, 0); }
		public TerminalNode KW_DETAILS() { return getToken(jacParser.KW_DETAILS, 0); }
		public Obj_built_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_built_in; }
	}

	public final Obj_built_inContext obj_built_in() throws RecognitionException {
		Obj_built_inContext _localctx = new Obj_built_inContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_obj_built_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONTEXT) | (1L << KW_INFO) | (1L << KW_DETAILS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Dict_built_inContext extends ParserRuleContext {
		public TerminalNode KW_KEYS() { return getToken(jacParser.KW_KEYS, 0); }
		public TerminalNode LBRACE() { return getToken(jacParser.LBRACE, 0); }
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(jacParser.RBRACE, 0); }
		public Dict_built_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_built_in; }
	}

	public final Dict_built_inContext dict_built_in() throws RecognitionException {
		Dict_built_inContext _localctx = new Dict_built_inContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_dict_built_in);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_KEYS:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(KW_KEYS);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				match(LBRACE);
				setState(661);
				name_list();
				setState(662);
				match(RBRACE);
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

	public static class List_built_inContext extends ParserRuleContext {
		public TerminalNode KW_LENGTH() { return getToken(jacParser.KW_LENGTH, 0); }
		public TerminalNode KW_DESTROY() { return getToken(jacParser.KW_DESTROY, 0); }
		public List<TerminalNode> COLON() { return getTokens(jacParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(jacParser.COLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List_built_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_built_in; }
	}

	public final List_built_inContext list_built_in() throws RecognitionException {
		List_built_inContext _localctx = new List_built_inContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_list_built_in);
		try {
			setState(672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_LENGTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				match(KW_LENGTH);
				}
				break;
			case KW_DESTROY:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				match(KW_DESTROY);
				setState(668);
				match(COLON);
				setState(669);
				expression();
				setState(670);
				match(COLON);
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

	public static class String_built_inContext extends ParserRuleContext {
		public TerminalNode TYP_STRING() { return getToken(jacParser.TYP_STRING, 0); }
		public TerminalNode DBL_COLON() { return getToken(jacParser.DBL_COLON, 0); }
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public TerminalNode LPAREN() { return getToken(jacParser.LPAREN, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(jacParser.RPAREN, 0); }
		public String_built_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_built_in; }
	}

	public final String_built_inContext string_built_in() throws RecognitionException {
		String_built_inContext _localctx = new String_built_inContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_string_built_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(TYP_STRING);
			setState(675);
			match(DBL_COLON);
			setState(676);
			match(NAME);
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(677);
				match(LPAREN);
				setState(678);
				expr_list();
				setState(679);
				match(RPAREN);
				}
				break;
			}
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

	public static class Node_edge_refContext extends ParserRuleContext {
		public Node_refContext node_ref() {
			return getRuleContext(Node_refContext.class,0);
		}
		public Filter_ctxContext filter_ctx() {
			return getRuleContext(Filter_ctxContext.class,0);
		}
		public Edge_refContext edge_ref() {
			return getRuleContext(Edge_refContext.class,0);
		}
		public Node_edge_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_edge_ref; }
	}

	public final Node_edge_refContext node_edge_ref() throws RecognitionException {
		Node_edge_refContext _localctx = new Node_edge_refContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_node_edge_ref);
		try {
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				node_ref();
				setState(685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(684);
					filter_ctx();
					}
					break;
				}
				}
				break;
			case T__2:
			case T__4:
			case T__5:
			case T__6:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				edge_ref();
				setState(692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(688);
					node_ref();
					setState(690);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(689);
						filter_ctx();
						}
						break;
					}
					}
					break;
				}
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

	public static class Node_refContext extends ParserRuleContext {
		public TerminalNode KW_NODE() { return getToken(jacParser.KW_NODE, 0); }
		public TerminalNode DBL_COLON() { return getToken(jacParser.DBL_COLON, 0); }
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public Node_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_ref; }
	}

	public final Node_refContext node_ref() throws RecognitionException {
		Node_refContext _localctx = new Node_refContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_node_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(KW_NODE);
			setState(697);
			match(DBL_COLON);
			setState(698);
			match(NAME);
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

	public static class Walker_refContext extends ParserRuleContext {
		public TerminalNode KW_WALKER() { return getToken(jacParser.KW_WALKER, 0); }
		public TerminalNode DBL_COLON() { return getToken(jacParser.DBL_COLON, 0); }
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public Walker_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_walker_ref; }
	}

	public final Walker_refContext walker_ref() throws RecognitionException {
		Walker_refContext _localctx = new Walker_refContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_walker_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(KW_WALKER);
			setState(701);
			match(DBL_COLON);
			setState(702);
			match(NAME);
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

	public static class Graph_refContext extends ParserRuleContext {
		public TerminalNode KW_GRAPH() { return getToken(jacParser.KW_GRAPH, 0); }
		public TerminalNode DBL_COLON() { return getToken(jacParser.DBL_COLON, 0); }
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public Graph_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_ref; }
	}

	public final Graph_refContext graph_ref() throws RecognitionException {
		Graph_refContext _localctx = new Graph_refContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_graph_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(KW_GRAPH);
			setState(705);
			match(DBL_COLON);
			setState(706);
			match(NAME);
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

	public static class Edge_refContext extends ParserRuleContext {
		public Edge_toContext edge_to() {
			return getRuleContext(Edge_toContext.class,0);
		}
		public Edge_fromContext edge_from() {
			return getRuleContext(Edge_fromContext.class,0);
		}
		public Edge_anyContext edge_any() {
			return getRuleContext(Edge_anyContext.class,0);
		}
		public Edge_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_ref; }
	}

	public final Edge_refContext edge_ref() throws RecognitionException {
		Edge_refContext _localctx = new Edge_refContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_edge_ref);
		try {
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				edge_to();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				edge_from();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(710);
				edge_any();
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

	public static class Edge_toContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(jacParser.MINUS, 0); }
		public TerminalNode LSQUARE() { return getToken(jacParser.LSQUARE, 0); }
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public TerminalNode RSQUARE() { return getToken(jacParser.RSQUARE, 0); }
		public Spawn_ctxContext spawn_ctx() {
			return getRuleContext(Spawn_ctxContext.class,0);
		}
		public Filter_ctxContext filter_ctx() {
			return getRuleContext(Filter_ctxContext.class,0);
		}
		public Edge_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_to; }
	}

	public final Edge_toContext edge_to() throws RecognitionException {
		Edge_toContext _localctx = new Edge_toContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_edge_to);
		int _la;
		try {
			setState(725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(T__2);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				match(MINUS);
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(715);
					match(LSQUARE);
					setState(716);
					match(NAME);
					setState(719);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(717);
						spawn_ctx();
						}
						break;
					case 2:
						{
						setState(718);
						filter_ctx();
						}
						break;
					}
					setState(721);
					match(RSQUARE);
					}
				}

				setState(724);
				match(T__3);
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

	public static class Edge_fromContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(jacParser.MINUS, 0); }
		public TerminalNode LSQUARE() { return getToken(jacParser.LSQUARE, 0); }
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public TerminalNode RSQUARE() { return getToken(jacParser.RSQUARE, 0); }
		public Spawn_ctxContext spawn_ctx() {
			return getRuleContext(Spawn_ctxContext.class,0);
		}
		public Filter_ctxContext filter_ctx() {
			return getRuleContext(Filter_ctxContext.class,0);
		}
		public Edge_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_from; }
	}

	public final Edge_fromContext edge_from() throws RecognitionException {
		Edge_fromContext _localctx = new Edge_fromContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_edge_from);
		int _la;
		try {
			setState(739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				match(T__5);
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(729);
					match(LSQUARE);
					setState(730);
					match(NAME);
					setState(733);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						setState(731);
						spawn_ctx();
						}
						break;
					case 2:
						{
						setState(732);
						filter_ctx();
						}
						break;
					}
					setState(735);
					match(RSQUARE);
					}
				}

				setState(738);
				match(MINUS);
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

	public static class Edge_anyContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(jacParser.LSQUARE, 0); }
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public TerminalNode RSQUARE() { return getToken(jacParser.RSQUARE, 0); }
		public Spawn_ctxContext spawn_ctx() {
			return getRuleContext(Spawn_ctxContext.class,0);
		}
		public Filter_ctxContext filter_ctx() {
			return getRuleContext(Filter_ctxContext.class,0);
		}
		public Edge_anyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_any; }
	}

	public final Edge_anyContext edge_any() throws RecognitionException {
		Edge_anyContext _localctx = new Edge_anyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_edge_any);
		int _la;
		try {
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				match(T__6);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				match(T__5);
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(743);
					match(LSQUARE);
					setState(744);
					match(NAME);
					setState(747);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(745);
						spawn_ctx();
						}
						break;
					case 2:
						{
						setState(746);
						filter_ctx();
						}
						break;
					}
					setState(749);
					match(RSQUARE);
					}
				}

				setState(752);
				match(T__3);
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

	public static class List_valContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(jacParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(jacParser.RSQUARE, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public List_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_val; }
	}

	public final List_valContext list_val() throws RecognitionException {
		List_valContext _localctx = new List_valContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_list_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(LSQUARE);
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << TYP_STRING) | (1L << TYP_INT) | (1L << TYP_FLOAT) | (1L << TYP_LIST) | (1L << TYP_DICT) | (1L << TYP_BOOL) | (1L << KW_TYPE) | (1L << KW_NODE) | (1L << KW_SPAWN) | (1L << DBL_COLON) | (1L << LBRACE) | (1L << KW_EDGE) | (1L << NOT))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (PLUS - 76)) | (1L << (MINUS - 76)) | (1L << (MUL - 76)) | (1L << (LPAREN - 76)) | (1L << (LSQUARE - 76)) | (1L << (FLOAT - 76)) | (1L << (STRING - 76)) | (1L << (BOOL - 76)) | (1L << (INT - 76)) | (1L << (NULL - 76)) | (1L << (NAME - 76)))) != 0)) {
				{
				setState(756);
				expr_list();
				}
			}

			setState(759);
			match(RSQUARE);
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

	public static class Index_sliceContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(jacParser.LSQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSQUARE() { return getToken(jacParser.RSQUARE, 0); }
		public TerminalNode COLON() { return getToken(jacParser.COLON, 0); }
		public Index_sliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_slice; }
	}

	public final Index_sliceContext index_slice() throws RecognitionException {
		Index_sliceContext _localctx = new Index_sliceContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_index_slice);
		try {
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				match(LSQUARE);
				setState(762);
				expression();
				setState(763);
				match(RSQUARE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				match(LSQUARE);
				setState(766);
				expression();
				setState(767);
				match(COLON);
				setState(768);
				expression();
				setState(769);
				match(RSQUARE);
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

	public static class Dict_valContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(jacParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(jacParser.RBRACE, 0); }
		public List<Kv_pairContext> kv_pair() {
			return getRuleContexts(Kv_pairContext.class);
		}
		public Kv_pairContext kv_pair(int i) {
			return getRuleContext(Kv_pairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jacParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jacParser.COMMA, i);
		}
		public Dict_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_val; }
	}

	public final Dict_valContext dict_val() throws RecognitionException {
		Dict_valContext _localctx = new Dict_valContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_dict_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(LBRACE);
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(774);
				kv_pair();
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(775);
					match(COMMA);
					setState(776);
					kv_pair();
					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(784);
			match(RBRACE);
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

	public static class Kv_pairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(jacParser.STRING, 0); }
		public TerminalNode COLON() { return getToken(jacParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Kv_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kv_pair; }
	}

	public final Kv_pairContext kv_pair() throws RecognitionException {
		Kv_pairContext _localctx = new Kv_pairContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_kv_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(STRING);
			setState(787);
			match(COLON);
			setState(788);
			expression();
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

	public static class SpawnContext extends ParserRuleContext {
		public TerminalNode KW_SPAWN() { return getToken(jacParser.KW_SPAWN, 0); }
		public Spawn_objectContext spawn_object() {
			return getRuleContext(Spawn_objectContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SpawnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spawn; }
	}

	public final SpawnContext spawn() throws RecognitionException {
		SpawnContext _localctx = new SpawnContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_spawn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(KW_SPAWN);
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(791);
				expression();
				}
				break;
			}
			setState(794);
			spawn_object();
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

	public static class Spawn_objectContext extends ParserRuleContext {
		public Node_spawnContext node_spawn() {
			return getRuleContext(Node_spawnContext.class,0);
		}
		public Walker_spawnContext walker_spawn() {
			return getRuleContext(Walker_spawnContext.class,0);
		}
		public Graph_spawnContext graph_spawn() {
			return getRuleContext(Graph_spawnContext.class,0);
		}
		public Spawn_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spawn_object; }
	}

	public final Spawn_objectContext spawn_object() throws RecognitionException {
		Spawn_objectContext _localctx = new Spawn_objectContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_spawn_object);
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				node_spawn();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				walker_spawn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(798);
				graph_spawn();
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

	public static class Node_spawnContext extends ParserRuleContext {
		public Node_refContext node_ref() {
			return getRuleContext(Node_refContext.class,0);
		}
		public Edge_refContext edge_ref() {
			return getRuleContext(Edge_refContext.class,0);
		}
		public Spawn_ctxContext spawn_ctx() {
			return getRuleContext(Spawn_ctxContext.class,0);
		}
		public Node_spawnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_spawn; }
	}

	public final Node_spawnContext node_spawn() throws RecognitionException {
		Node_spawnContext _localctx = new Node_spawnContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_node_spawn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0) || _la==MINUS) {
				{
				setState(801);
				edge_ref();
				}
			}

			setState(804);
			node_ref();
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(805);
				spawn_ctx();
				}
				break;
			}
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

	public static class Graph_spawnContext extends ParserRuleContext {
		public Edge_refContext edge_ref() {
			return getRuleContext(Edge_refContext.class,0);
		}
		public Graph_refContext graph_ref() {
			return getRuleContext(Graph_refContext.class,0);
		}
		public Graph_spawnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_spawn; }
	}

	public final Graph_spawnContext graph_spawn() throws RecognitionException {
		Graph_spawnContext _localctx = new Graph_spawnContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_graph_spawn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			edge_ref();
			setState(809);
			graph_ref();
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

	public static class Walker_spawnContext extends ParserRuleContext {
		public Walker_refContext walker_ref() {
			return getRuleContext(Walker_refContext.class,0);
		}
		public Spawn_ctxContext spawn_ctx() {
			return getRuleContext(Spawn_ctxContext.class,0);
		}
		public Walker_spawnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_walker_spawn; }
	}

	public final Walker_spawnContext walker_spawn() throws RecognitionException {
		Walker_spawnContext _localctx = new Walker_spawnContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_walker_spawn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			walker_ref();
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(812);
				spawn_ctx();
				}
				break;
			}
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

	public static class Spawn_ctxContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(jacParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(jacParser.RPAREN, 0); }
		public List<Spawn_assignContext> spawn_assign() {
			return getRuleContexts(Spawn_assignContext.class);
		}
		public Spawn_assignContext spawn_assign(int i) {
			return getRuleContext(Spawn_assignContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jacParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jacParser.COMMA, i);
		}
		public Spawn_ctxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spawn_ctx; }
	}

	public final Spawn_ctxContext spawn_ctx() throws RecognitionException {
		Spawn_ctxContext _localctx = new Spawn_ctxContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_spawn_ctx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(LPAREN);
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(816);
				spawn_assign();
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(817);
					match(COMMA);
					setState(818);
					spawn_assign();
					}
					}
					setState(823);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(826);
			match(RPAREN);
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

	public static class Filter_ctxContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(jacParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(jacParser.RPAREN, 0); }
		public List<Filter_compareContext> filter_compare() {
			return getRuleContexts(Filter_compareContext.class);
		}
		public Filter_compareContext filter_compare(int i) {
			return getRuleContext(Filter_compareContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jacParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jacParser.COMMA, i);
		}
		public Filter_ctxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_ctx; }
	}

	public final Filter_ctxContext filter_ctx() throws RecognitionException {
		Filter_ctxContext _localctx = new Filter_ctxContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_filter_ctx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(LPAREN);
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(829);
				filter_compare();
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(830);
					match(COMMA);
					setState(831);
					filter_compare();
					}
					}
					setState(836);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(839);
			match(RPAREN);
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

	public static class Spawn_assignContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public TerminalNode EQ() { return getToken(jacParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Spawn_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spawn_assign; }
	}

	public final Spawn_assignContext spawn_assign() throws RecognitionException {
		Spawn_assignContext _localctx = new Spawn_assignContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_spawn_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(NAME);
			setState(842);
			match(EQ);
			setState(843);
			expression();
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

	public static class Filter_compareContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public Cmp_opContext cmp_op() {
			return getRuleContext(Cmp_opContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Filter_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_compare; }
	}

	public final Filter_compareContext filter_compare() throws RecognitionException {
		Filter_compareContext _localctx = new Filter_compareContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_filter_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(NAME);
			setState(846);
			cmp_op();
			setState(847);
			expression();
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

	public static class Any_typeContext extends ParserRuleContext {
		public TerminalNode TYP_STRING() { return getToken(jacParser.TYP_STRING, 0); }
		public TerminalNode TYP_INT() { return getToken(jacParser.TYP_INT, 0); }
		public TerminalNode TYP_FLOAT() { return getToken(jacParser.TYP_FLOAT, 0); }
		public TerminalNode TYP_LIST() { return getToken(jacParser.TYP_LIST, 0); }
		public TerminalNode TYP_DICT() { return getToken(jacParser.TYP_DICT, 0); }
		public TerminalNode TYP_BOOL() { return getToken(jacParser.TYP_BOOL, 0); }
		public TerminalNode KW_NODE() { return getToken(jacParser.KW_NODE, 0); }
		public TerminalNode KW_EDGE() { return getToken(jacParser.KW_EDGE, 0); }
		public TerminalNode KW_TYPE() { return getToken(jacParser.KW_TYPE, 0); }
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_any_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYP_STRING) | (1L << TYP_INT) | (1L << TYP_FLOAT) | (1L << TYP_LIST) | (1L << TYP_DICT) | (1L << TYP_BOOL) | (1L << KW_TYPE) | (1L << KW_NODE) | (1L << KW_EDGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Dot_graphContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(jacParser.LBRACE, 0); }
		public Dot_stmt_listContext dot_stmt_list() {
			return getRuleContext(Dot_stmt_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(jacParser.RBRACE, 0); }
		public TerminalNode KW_GRAPH() { return getToken(jacParser.KW_GRAPH, 0); }
		public TerminalNode KW_DIGRAPH() { return getToken(jacParser.KW_DIGRAPH, 0); }
		public TerminalNode KW_STRICT() { return getToken(jacParser.KW_STRICT, 0); }
		public Dot_idContext dot_id() {
			return getRuleContext(Dot_idContext.class,0);
		}
		public Dot_graphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_graph; }
	}

	public final Dot_graphContext dot_graph() throws RecognitionException {
		Dot_graphContext _localctx = new Dot_graphContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_dot_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_STRICT) {
				{
				setState(851);
				match(KW_STRICT);
				}
			}

			setState(854);
			_la = _input.LA(1);
			if ( !(_la==KW_GRAPH || _la==KW_DIGRAPH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_GRAPH) | (1L << KW_NODE) | (1L << KW_EDGE))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (FLOAT - 86)) | (1L << (STRING - 86)) | (1L << (INT - 86)) | (1L << (NAME - 86)))) != 0)) {
				{
				setState(855);
				dot_id();
				}
			}

			setState(858);
			match(LBRACE);
			setState(859);
			dot_stmt_list();
			setState(860);
			match(RBRACE);
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

	public static class Dot_stmt_listContext extends ParserRuleContext {
		public List<Dot_stmtContext> dot_stmt() {
			return getRuleContexts(Dot_stmtContext.class);
		}
		public Dot_stmtContext dot_stmt(int i) {
			return getRuleContext(Dot_stmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(jacParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(jacParser.SEMI, i);
		}
		public Dot_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_stmt_list; }
	}

	public final Dot_stmt_listContext dot_stmt_list() throws RecognitionException {
		Dot_stmt_listContext _localctx = new Dot_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_dot_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_GRAPH) | (1L << KW_SUBGRAPH) | (1L << KW_NODE) | (1L << LBRACE) | (1L << KW_EDGE))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (FLOAT - 86)) | (1L << (STRING - 86)) | (1L << (INT - 86)) | (1L << (NAME - 86)))) != 0)) {
				{
				{
				setState(862);
				dot_stmt();
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(863);
					match(SEMI);
					}
				}

				}
				}
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Dot_stmtContext extends ParserRuleContext {
		public Dot_node_stmtContext dot_node_stmt() {
			return getRuleContext(Dot_node_stmtContext.class,0);
		}
		public Dot_edge_stmtContext dot_edge_stmt() {
			return getRuleContext(Dot_edge_stmtContext.class,0);
		}
		public Dot_attr_stmtContext dot_attr_stmt() {
			return getRuleContext(Dot_attr_stmtContext.class,0);
		}
		public List<Dot_idContext> dot_id() {
			return getRuleContexts(Dot_idContext.class);
		}
		public Dot_idContext dot_id(int i) {
			return getRuleContext(Dot_idContext.class,i);
		}
		public TerminalNode EQ() { return getToken(jacParser.EQ, 0); }
		public Dot_subgraphContext dot_subgraph() {
			return getRuleContext(Dot_subgraphContext.class,0);
		}
		public Dot_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_stmt; }
	}

	public final Dot_stmtContext dot_stmt() throws RecognitionException {
		Dot_stmtContext _localctx = new Dot_stmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_dot_stmt);
		try {
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				dot_node_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				dot_edge_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(873);
				dot_attr_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(874);
				dot_id();
				setState(875);
				match(EQ);
				setState(876);
				dot_id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(878);
				dot_subgraph();
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

	public static class Dot_attr_stmtContext extends ParserRuleContext {
		public Dot_attr_listContext dot_attr_list() {
			return getRuleContext(Dot_attr_listContext.class,0);
		}
		public TerminalNode KW_GRAPH() { return getToken(jacParser.KW_GRAPH, 0); }
		public TerminalNode KW_NODE() { return getToken(jacParser.KW_NODE, 0); }
		public TerminalNode KW_EDGE() { return getToken(jacParser.KW_EDGE, 0); }
		public Dot_attr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_attr_stmt; }
	}

	public final Dot_attr_stmtContext dot_attr_stmt() throws RecognitionException {
		Dot_attr_stmtContext _localctx = new Dot_attr_stmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_dot_attr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_GRAPH) | (1L << KW_NODE) | (1L << KW_EDGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(882);
			dot_attr_list();
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

	public static class Dot_attr_listContext extends ParserRuleContext {
		public List<TerminalNode> LSQUARE() { return getTokens(jacParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(jacParser.LSQUARE, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(jacParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(jacParser.RSQUARE, i);
		}
		public List<Dot_a_listContext> dot_a_list() {
			return getRuleContexts(Dot_a_listContext.class);
		}
		public Dot_a_listContext dot_a_list(int i) {
			return getRuleContext(Dot_a_listContext.class,i);
		}
		public Dot_attr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_attr_list; }
	}

	public final Dot_attr_listContext dot_attr_list() throws RecognitionException {
		Dot_attr_listContext _localctx = new Dot_attr_listContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_dot_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(884);
				match(LSQUARE);
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_GRAPH) | (1L << KW_NODE) | (1L << KW_EDGE))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (FLOAT - 86)) | (1L << (STRING - 86)) | (1L << (INT - 86)) | (1L << (NAME - 86)))) != 0)) {
					{
					setState(885);
					dot_a_list();
					}
				}

				setState(888);
				match(RSQUARE);
				}
				}
				setState(891); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LSQUARE );
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

	public static class Dot_a_listContext extends ParserRuleContext {
		public List<Dot_idContext> dot_id() {
			return getRuleContexts(Dot_idContext.class);
		}
		public Dot_idContext dot_id(int i) {
			return getRuleContext(Dot_idContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(jacParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(jacParser.EQ, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(jacParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(jacParser.COMMA, i);
		}
		public Dot_a_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_a_list; }
	}

	public final Dot_a_listContext dot_a_list() throws RecognitionException {
		Dot_a_listContext _localctx = new Dot_a_listContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_dot_a_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(893);
				dot_id();
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(894);
					match(EQ);
					setState(895);
					dot_id();
					}
				}

				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(898);
					match(COMMA);
					}
				}

				}
				}
				setState(903); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_GRAPH) | (1L << KW_NODE) | (1L << KW_EDGE))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (FLOAT - 86)) | (1L << (STRING - 86)) | (1L << (INT - 86)) | (1L << (NAME - 86)))) != 0) );
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

	public static class Dot_edge_stmtContext extends ParserRuleContext {
		public Dot_edgeRHSContext dot_edgeRHS() {
			return getRuleContext(Dot_edgeRHSContext.class,0);
		}
		public Dot_node_idContext dot_node_id() {
			return getRuleContext(Dot_node_idContext.class,0);
		}
		public Dot_subgraphContext dot_subgraph() {
			return getRuleContext(Dot_subgraphContext.class,0);
		}
		public Dot_attr_listContext dot_attr_list() {
			return getRuleContext(Dot_attr_listContext.class,0);
		}
		public Dot_edge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_edge_stmt; }
	}

	public final Dot_edge_stmtContext dot_edge_stmt() throws RecognitionException {
		Dot_edge_stmtContext _localctx = new Dot_edge_stmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_dot_edge_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_GRAPH:
			case KW_NODE:
			case KW_EDGE:
			case FLOAT:
			case STRING:
			case INT:
			case NAME:
				{
				setState(905);
				dot_node_id();
				}
				break;
			case KW_SUBGRAPH:
			case LBRACE:
				{
				setState(906);
				dot_subgraph();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(909);
			dot_edgeRHS();
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(910);
				dot_attr_list();
				}
			}

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

	public static class Dot_edgeRHSContext extends ParserRuleContext {
		public List<Dot_edgeopContext> dot_edgeop() {
			return getRuleContexts(Dot_edgeopContext.class);
		}
		public Dot_edgeopContext dot_edgeop(int i) {
			return getRuleContext(Dot_edgeopContext.class,i);
		}
		public List<Dot_node_idContext> dot_node_id() {
			return getRuleContexts(Dot_node_idContext.class);
		}
		public Dot_node_idContext dot_node_id(int i) {
			return getRuleContext(Dot_node_idContext.class,i);
		}
		public List<Dot_subgraphContext> dot_subgraph() {
			return getRuleContexts(Dot_subgraphContext.class);
		}
		public Dot_subgraphContext dot_subgraph(int i) {
			return getRuleContext(Dot_subgraphContext.class,i);
		}
		public Dot_edgeRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_edgeRHS; }
	}

	public final Dot_edgeRHSContext dot_edgeRHS() throws RecognitionException {
		Dot_edgeRHSContext _localctx = new Dot_edgeRHSContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_dot_edgeRHS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(913);
				dot_edgeop();
				setState(916);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_GRAPH:
				case KW_NODE:
				case KW_EDGE:
				case FLOAT:
				case STRING:
				case INT:
				case NAME:
					{
					setState(914);
					dot_node_id();
					}
					break;
				case KW_SUBGRAPH:
				case LBRACE:
					{
					setState(915);
					dot_subgraph();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(920); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 || _la==T__7 );
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

	public static class Dot_edgeopContext extends ParserRuleContext {
		public Dot_edgeopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_edgeop; }
	}

	public final Dot_edgeopContext dot_edgeop() throws RecognitionException {
		Dot_edgeopContext _localctx = new Dot_edgeopContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_dot_edgeop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Dot_node_stmtContext extends ParserRuleContext {
		public Dot_node_idContext dot_node_id() {
			return getRuleContext(Dot_node_idContext.class,0);
		}
		public Dot_attr_listContext dot_attr_list() {
			return getRuleContext(Dot_attr_listContext.class,0);
		}
		public Dot_node_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_node_stmt; }
	}

	public final Dot_node_stmtContext dot_node_stmt() throws RecognitionException {
		Dot_node_stmtContext _localctx = new Dot_node_stmtContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_dot_node_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			dot_node_id();
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(925);
				dot_attr_list();
				}
			}

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

	public static class Dot_node_idContext extends ParserRuleContext {
		public Dot_idContext dot_id() {
			return getRuleContext(Dot_idContext.class,0);
		}
		public Dot_portContext dot_port() {
			return getRuleContext(Dot_portContext.class,0);
		}
		public Dot_node_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_node_id; }
	}

	public final Dot_node_idContext dot_node_id() throws RecognitionException {
		Dot_node_idContext _localctx = new Dot_node_idContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_dot_node_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			dot_id();
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(929);
				dot_port();
				}
			}

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

	public static class Dot_portContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(jacParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(jacParser.COLON, i);
		}
		public List<Dot_idContext> dot_id() {
			return getRuleContexts(Dot_idContext.class);
		}
		public Dot_idContext dot_id(int i) {
			return getRuleContext(Dot_idContext.class,i);
		}
		public Dot_portContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_port; }
	}

	public final Dot_portContext dot_port() throws RecognitionException {
		Dot_portContext _localctx = new Dot_portContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_dot_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(COLON);
			setState(933);
			dot_id();
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(934);
				match(COLON);
				setState(935);
				dot_id();
				}
			}

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

	public static class Dot_subgraphContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(jacParser.LBRACE, 0); }
		public Dot_stmt_listContext dot_stmt_list() {
			return getRuleContext(Dot_stmt_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(jacParser.RBRACE, 0); }
		public TerminalNode KW_SUBGRAPH() { return getToken(jacParser.KW_SUBGRAPH, 0); }
		public Dot_idContext dot_id() {
			return getRuleContext(Dot_idContext.class,0);
		}
		public Dot_subgraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_subgraph; }
	}

	public final Dot_subgraphContext dot_subgraph() throws RecognitionException {
		Dot_subgraphContext _localctx = new Dot_subgraphContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_dot_subgraph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SUBGRAPH) {
				{
				setState(938);
				match(KW_SUBGRAPH);
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_GRAPH) | (1L << KW_NODE) | (1L << KW_EDGE))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (FLOAT - 86)) | (1L << (STRING - 86)) | (1L << (INT - 86)) | (1L << (NAME - 86)))) != 0)) {
					{
					setState(939);
					dot_id();
					}
				}

				}
			}

			setState(944);
			match(LBRACE);
			setState(945);
			dot_stmt_list();
			setState(946);
			match(RBRACE);
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

	public static class Dot_idContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(jacParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(jacParser.STRING, 0); }
		public TerminalNode INT() { return getToken(jacParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(jacParser.FLOAT, 0); }
		public TerminalNode KW_GRAPH() { return getToken(jacParser.KW_GRAPH, 0); }
		public TerminalNode KW_NODE() { return getToken(jacParser.KW_NODE, 0); }
		public TerminalNode KW_EDGE() { return getToken(jacParser.KW_EDGE, 0); }
		public Dot_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_id; }
	}

	public final Dot_idContext dot_id() throws RecognitionException {
		Dot_idContext _localctx = new Dot_idContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_dot_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_GRAPH) | (1L << KW_NODE) | (1L << KW_EDGE))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (FLOAT - 86)) | (1L << (STRING - 86)) | (1L << (INT - 86)) | (1L << (NAME - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		case 51:
			return atom_sempred((AtomContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean atom_sempred(AtomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3b\u03b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\3\2\5\2\u00c4\n\2\3\2\6\2\u00c7\n\2\r\2\16\2\u00c8\3\2\3\2"+
		"\3\3\3\3\5\3\u00cf\n\3\3\4\3\4\3\4\3\4\5\4\u00d5\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4\u00de\n\4\3\5\3\5\3\5\5\5\u00e3\n\5\3\5\3\5\7\5\u00e7\n"+
		"\5\f\5\16\5\u00ea\13\5\3\5\5\5\u00ed\n\5\3\5\3\5\7\5\u00f1\n\5\f\5\16"+
		"\5\u00f4\13\5\3\5\5\5\u00f7\n\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u00ff\n\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\7\13\u0112\n\13\f\13\16\13\u0115\13\13\3\13\3\13\3\13\3\13\5\13\u011b"+
		"\n\13\3\f\3\f\5\f\u011f\n\f\3\r\3\r\5\r\u0123\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0131\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u013d\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\5\21\u0146\n\21\3\21\5\21\u0149\n\21\3\21\3\21\3\21\7"+
		"\21\u014e\n\21\f\21\16\21\u0151\13\21\3\21\3\21\3\22\3\22\3\22\3\22\5"+
		"\22\u0159\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0160\n\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0167\n\23\7\23\u0169\n\23\f\23\16\23\u016c\13\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0173\n\23\3\23\5\23\u0176\n\23\3\24\3\24\5"+
		"\24\u017a\n\24\3\24\3\24\3\25\3\25\5\25\u0180\n\25\3\25\3\25\3\25\5\25"+
		"\u0185\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u018e\n\27\f\27\16"+
		"\27\u0191\13\27\3\30\3\30\3\30\7\30\u0196\n\30\f\30\16\30\u0199\13\30"+
		"\3\31\3\31\7\31\u019d\n\31\f\31\16\31\u01a0\13\31\3\31\3\31\3\31\5\31"+
		"\u01a5\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u01b8\n\33\3\34\3\34\3\34\3\34\7\34\u01be"+
		"\n\34\f\34\16\34\u01c1\13\34\3\34\5\34\u01c4\n\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u01db\n\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\5$\u01ef\n$\3%\3%\3%\3%\3&\3&\3&\3&\5&\u01f9\n&\3"+
		"\'\3\'\3\'\3\'\5\'\u01ff\n\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\5+\u020c"+
		"\n+\3+\3+\3+\5+\u0211\n+\3,\3,\3,\7,\u0216\n,\f,\16,\u0219\13,\3-\3-\3"+
		"-\3-\3-\3-\7-\u0221\n-\f-\16-\u0224\13-\5-\u0226\n-\3.\3.\3.\3.\3.\3."+
		"\3.\3.\5.\u0230\n.\3/\3/\3/\3\60\3\60\3\60\7\60\u0238\n\60\f\60\16\60"+
		"\u023b\13\60\3\61\3\61\3\61\7\61\u0240\n\61\f\61\16\61\u0243\13\61\3\62"+
		"\3\62\3\62\5\62\u0248\n\62\3\63\3\63\3\63\7\63\u024d\n\63\f\63\16\63\u0250"+
		"\13\63\3\64\3\64\3\64\5\64\u0255\n\64\3\64\5\64\u0258\n\64\3\64\5\64\u025b"+
		"\n\64\3\64\3\64\3\64\5\64\u0260\n\64\5\64\u0262\n\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\5\65\u0276\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0280"+
		"\n\65\f\65\16\65\u0283\13\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\3"+
		"8\38\58\u0290\n8\39\39\3:\3:\3;\3;\3;\3;\3;\5;\u029b\n;\3<\3<\3<\3<\3"+
		"<\3<\5<\u02a3\n<\3=\3=\3=\3=\3=\3=\3=\5=\u02ac\n=\3>\3>\5>\u02b0\n>\3"+
		">\3>\3>\5>\u02b5\n>\5>\u02b7\n>\5>\u02b9\n>\3?\3?\3?\3?\3@\3@\3@\3@\3"+
		"A\3A\3A\3A\3B\3B\3B\5B\u02ca\nB\3C\3C\3C\3C\3C\3C\5C\u02d2\nC\3C\5C\u02d5"+
		"\nC\3C\5C\u02d8\nC\3D\3D\3D\3D\3D\3D\5D\u02e0\nD\3D\5D\u02e3\nD\3D\5D"+
		"\u02e6\nD\3E\3E\3E\3E\3E\3E\5E\u02ee\nE\3E\5E\u02f1\nE\3E\5E\u02f4\nE"+
		"\3F\3F\5F\u02f8\nF\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0306\nG\3H"+
		"\3H\3H\3H\7H\u030c\nH\fH\16H\u030f\13H\5H\u0311\nH\3H\3H\3I\3I\3I\3I\3"+
		"J\3J\5J\u031b\nJ\3J\3J\3K\3K\3K\5K\u0322\nK\3L\5L\u0325\nL\3L\3L\5L\u0329"+
		"\nL\3M\3M\3M\3N\3N\5N\u0330\nN\3O\3O\3O\3O\7O\u0336\nO\fO\16O\u0339\13"+
		"O\5O\u033b\nO\3O\3O\3P\3P\3P\3P\7P\u0343\nP\fP\16P\u0346\13P\5P\u0348"+
		"\nP\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3T\5T\u0357\nT\3T\3T\5T\u035b"+
		"\nT\3T\3T\3T\3T\3U\3U\5U\u0363\nU\7U\u0365\nU\fU\16U\u0368\13U\3V\3V\3"+
		"V\3V\3V\3V\3V\3V\5V\u0372\nV\3W\3W\3W\3X\3X\5X\u0379\nX\3X\6X\u037c\n"+
		"X\rX\16X\u037d\3Y\3Y\3Y\5Y\u0383\nY\3Y\5Y\u0386\nY\6Y\u0388\nY\rY\16Y"+
		"\u0389\3Z\3Z\5Z\u038e\nZ\3Z\3Z\5Z\u0392\nZ\3[\3[\3[\5[\u0397\n[\6[\u0399"+
		"\n[\r[\16[\u039a\3\\\3\\\3]\3]\5]\u03a1\n]\3^\3^\5^\u03a5\n^\3_\3_\3_"+
		"\3_\5_\u03ab\n_\3`\3`\5`\u03af\n`\5`\u03b1\n`\3`\3`\3`\3`\3a\3a\3a\2\3"+
		"hb\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD"+
		"FHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\2\16\4\2\33\34\"\"\4\2:;==\3\2,/\3\2\61\62\3\2NO\3\2PR\3"+
		"\2\37!\5\2\13\21\26\26((\4\2\22\22\24\24\5\2\22\22\26\26((\4\2\6\6\n\n"+
		"\b\2\22\22\26\26((XY[[]]\2\u03f0\2\u00c3\3\2\2\2\4\u00ce\3\2\2\2\6\u00dd"+
		"\3\2\2\2\b\u00df\3\2\2\2\n\u00fa\3\2\2\2\f\u0100\3\2\2\2\16\u0103\3\2"+
		"\2\2\20\u0107\3\2\2\2\22\u010b\3\2\2\2\24\u011a\3\2\2\2\26\u011e\3\2\2"+
		"\2\30\u0122\3\2\2\2\32\u0130\3\2\2\2\34\u013c\3\2\2\2\36\u013e\3\2\2\2"+
		" \u0143\3\2\2\2\"\u0158\3\2\2\2$\u0175\3\2\2\2&\u0177\3\2\2\2(\u017d\3"+
		"\2\2\2*\u0186\3\2\2\2,\u018a\3\2\2\2.\u0192\3\2\2\2\60\u01a4\3\2\2\2\62"+
		"\u01a6\3\2\2\2\64\u01b7\3\2\2\2\66\u01b9\3\2\2\28\u01c5\3\2\2\2:\u01c9"+
		"\3\2\2\2<\u01da\3\2\2\2>\u01dc\3\2\2\2@\u01e0\3\2\2\2B\u01e2\3\2\2\2D"+
		"\u01e6\3\2\2\2F\u01ee\3\2\2\2H\u01f0\3\2\2\2J\u01f4\3\2\2\2L\u01fa\3\2"+
		"\2\2N\u0200\3\2\2\2P\u0203\3\2\2\2R\u0206\3\2\2\2T\u0209\3\2\2\2V\u0212"+
		"\3\2\2\2X\u0225\3\2\2\2Z\u022f\3\2\2\2\\\u0231\3\2\2\2^\u0234\3\2\2\2"+
		"`\u023c\3\2\2\2b\u0247\3\2\2\2d\u0249\3\2\2\2f\u0261\3\2\2\2h\u0275\3"+
		"\2\2\2j\u0284\3\2\2\2l\u0287\3\2\2\2n\u028f\3\2\2\2p\u0291\3\2\2\2r\u0293"+
		"\3\2\2\2t\u029a\3\2\2\2v\u02a2\3\2\2\2x\u02a4\3\2\2\2z\u02b8\3\2\2\2|"+
		"\u02ba\3\2\2\2~\u02be\3\2\2\2\u0080\u02c2\3\2\2\2\u0082\u02c9\3\2\2\2"+
		"\u0084\u02d7\3\2\2\2\u0086\u02e5\3\2\2\2\u0088\u02f3\3\2\2\2\u008a\u02f5"+
		"\3\2\2\2\u008c\u0305\3\2\2\2\u008e\u0307\3\2\2\2\u0090\u0314\3\2\2\2\u0092"+
		"\u0318\3\2\2\2\u0094\u0321\3\2\2\2\u0096\u0324\3\2\2\2\u0098\u032a\3\2"+
		"\2\2\u009a\u032d\3\2\2\2\u009c\u0331\3\2\2\2\u009e\u033e\3\2\2\2\u00a0"+
		"\u034b\3\2\2\2\u00a2\u034f\3\2\2\2\u00a4\u0353\3\2\2\2\u00a6\u0356\3\2"+
		"\2\2\u00a8\u0366\3\2\2\2\u00aa\u0371\3\2\2\2\u00ac\u0373\3\2\2\2\u00ae"+
		"\u037b\3\2\2\2\u00b0\u0387\3\2\2\2\u00b2\u038d\3\2\2\2\u00b4\u0398\3\2"+
		"\2\2\u00b6\u039c\3\2\2\2\u00b8\u039e\3\2\2\2\u00ba\u03a2\3\2\2\2\u00bc"+
		"\u03a6\3\2\2\2\u00be\u03b0\3\2\2\2\u00c0\u03b6\3\2\2\2\u00c2\u00c4\5\n"+
		"\6\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c7\5\4\3\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\2\2\3\u00cb"+
		"\3\3\2\2\2\u00cc\u00cf\5\6\4\2\u00cd\u00cf\5\b\5\2\u00ce\u00cc\3\2\2\2"+
		"\u00ce\u00cd\3\2\2\2\u00cf\5\3\2\2\2\u00d0\u00d1\7\26\2\2\u00d1\u00d4"+
		"\7]\2\2\u00d2\u00d3\7#\2\2\u00d3\u00d5\7[\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00de\5\24\13\2\u00d7\u00d8\7"+
		"(\2\2\u00d8\u00d9\7]\2\2\u00d9\u00de\5\24\13\2\u00da\u00db\7\22\2\2\u00db"+
		"\u00dc\7]\2\2\u00dc\u00de\5\30\r\2\u00dd\u00d0\3\2\2\2\u00dd\u00d7\3\2"+
		"\2\2\u00dd\u00da\3\2\2\2\u00de\7\3\2\2\2\u00df\u00e0\7)\2\2\u00e0\u00e2"+
		"\7]\2\2\u00e1\u00e3\5\f\7\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e8\7&\2\2\u00e5\u00e7\5\26\f\2\u00e6\u00e5\3\2"+
		"\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\5\16\b\2\u00ec\u00eb\3"+
		"\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f2\3\2\2\2\u00ee\u00f1\5\64\33\2\u00ef"+
		"\u00f1\5\22\n\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f7\5\20\t\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\'\2\2\u00f9\t\3\2\2\2\u00fa\u00fb"+
		"\7\3\2\2\u00fb\u00fc\7#\2\2\u00fc\u00fe\7Y\2\2\u00fd\u00ff\7*\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\13\3\2\2\2\u0100\u0101\7#\2\2"+
		"\u0101\u0102\5,\27\2\u0102\r\3\2\2\2\u0103\u0104\7\32\2\2\u0104\u0105"+
		"\7\33\2\2\u0105\u0106\5\60\31\2\u0106\17\3\2\2\2\u0107\u0108\7\32\2\2"+
		"\u0108\u0109\7\34\2\2\u0109\u010a\5\60\31\2\u010a\21\3\2\2\2\u010b\u010c"+
		"\7\32\2\2\u010c\u010d\7\"\2\2\u010d\u010e\5\60\31\2\u010e\23\3\2\2\2\u010f"+
		"\u0113\7&\2\2\u0110\u0112\5\26\f\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u011b\7\'\2\2\u0117\u0118\7#\2\2\u0118\u011b\5\26"+
		"\f\2\u0119\u011b\7*\2\2\u011a\u010f\3\2\2\2\u011a\u0117\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\25\3\2\2\2\u011c\u011f\5 \21\2\u011d\u011f\5$\23"+
		"\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\27\3\2\2\2\u0120\u0123"+
		"\5\32\16\2\u0121\u0123\5\34\17\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2"+
		"\2\u0123\31\3\2\2\2\u0124\u0125\7&\2\2\u0125\u0126\5\36\20\2\u0126\u0127"+
		"\7\31\2\2\u0127\u0128\5\60\31\2\u0128\u0129\7\'\2\2\u0129\u0131\3\2\2"+
		"\2\u012a\u012b\7#\2\2\u012b\u012c\5\36\20\2\u012c\u012d\7\31\2\2\u012d"+
		"\u012e\5\60\31\2\u012e\u012f\7*\2\2\u012f\u0131\3\2\2\2\u0130\u0124\3"+
		"\2\2\2\u0130\u012a\3\2\2\2\u0131\33\3\2\2\2\u0132\u0133\7&\2\2\u0133\u0134"+
		"\5\36\20\2\u0134\u0135\5\u00a6T\2\u0135\u0136\7\'\2\2\u0136\u013d\3\2"+
		"\2\2\u0137\u0138\7#\2\2\u0138\u0139\5\36\20\2\u0139\u013a\5\u00a6T\2\u013a"+
		"\u013b\7*\2\2\u013b\u013d\3\2\2\2\u013c\u0132\3\2\2\2\u013c\u0137\3\2"+
		"\2\2\u013d\35\3\2\2\2\u013e\u013f\7J\2\2\u013f\u0140\7I\2\2\u0140\u0141"+
		"\7]\2\2\u0141\u0142\7*\2\2\u0142\37\3\2\2\2\u0143\u0145\7J\2\2\u0144\u0146"+
		"\7K\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147"+
		"\u0149\7I\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014f\5\"\22\2\u014b\u014c\7L\2\2\u014c\u014e\5\"\22\2\u014d"+
		"\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7*\2\2\u0153"+
		"!\3\2\2\2\u0154\u0159\7]\2\2\u0155\u0156\7]\2\2\u0156\u0157\7+\2\2\u0157"+
		"\u0159\5L\'\2\u0158\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0159#\3\2\2\2\u015a"+
		"\u015b\7M\2\2\u015b\u015f\5*\26\2\u015c\u015d\5(\25\2\u015d\u015e\5&\24"+
		"\2\u015e\u0160\3\2\2\2\u015f\u015c\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u016a"+
		"\3\2\2\2\u0161\u0162\7L\2\2\u0162\u0166\5*\26\2\u0163\u0164\5(\25\2\u0164"+
		"\u0165\5&\24\2\u0165\u0167\3\2\2\2\u0166\u0163\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u0169\3\2\2\2\u0168\u0161\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016d\u016e\7*\2\2\u016e\u0176\3\2\2\2\u016f\u0170\7M\2\2\u0170\u0172"+
		"\7]\2\2\u0171\u0173\5&\24\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0176\5\60\31\2\u0175\u015a\3\2\2\2\u0175\u016f\3"+
		"\2\2\2\u0176%\3\2\2\2\u0177\u0179\7\32\2\2\u0178\u017a\5,\27\2\u0179\u0178"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\t\2\2\2\u017c"+
		"\'\3\2\2\2\u017d\u017f\7$\2\2\u017e\u0180\5.\30\2\u017f\u017e\3\2\2\2"+
		"\u017f\u0180\3\2\2\2\u0180\u0184\3\2\2\2\u0181\u0185\7$\2\2\u0182\u0183"+
		"\7%\2\2\u0183\u0185\5L\'\2\u0184\u0181\3\2\2\2\u0184\u0182\3\2\2\2\u0185"+
		")\3\2\2\2\u0186\u0187\7]\2\2\u0187\u0188\7@\2\2\u0188\u0189\7]\2\2\u0189"+
		"+\3\2\2\2\u018a\u018f\7]\2\2\u018b\u018c\7L\2\2\u018c\u018e\7]\2\2\u018d"+
		"\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190-\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0197\5L\'\2\u0193\u0194"+
		"\7L\2\2\u0194\u0196\5L\'\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198/\3\2\2\2\u0199\u0197\3\2\2\2"+
		"\u019a\u019e\7&\2\2\u019b\u019d\5\64\33\2\u019c\u019b\3\2\2\2\u019d\u01a0"+
		"\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u01a5\7\'\2\2\u01a2\u01a3\7#\2\2\u01a3\u01a5\5\64"+
		"\33\2\u01a4\u019a\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\61\3\2\2\2\u01a6\u01a7"+
		"\5,\27\2\u01a7\u01a8\5\60\31\2\u01a8\63\3\2\2\2\u01a9\u01b8\5\60\31\2"+
		"\u01aa\u01b8\5\62\32\2\u01ab\u01ac\5L\'\2\u01ac\u01ad\7*\2\2\u01ad\u01b8"+
		"\3\2\2\2\u01ae\u01b8\5\66\34\2\u01af\u01b8\5<\37\2\u01b0\u01b8\5> \2\u01b1"+
		"\u01b2\5@!\2\u01b2\u01b3\7*\2\2\u01b3\u01b8\3\2\2\2\u01b4\u01b8\5B\"\2"+
		"\u01b5\u01b8\5D#\2\u01b6\u01b8\5F$\2\u01b7\u01a9\3\2\2\2\u01b7\u01aa\3"+
		"\2\2\2\u01b7\u01ab\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7"+
		"\u01b0\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b7\u01b4\3\2\2\2\u01b7\u01b5\3\2"+
		"\2\2\u01b7\u01b6\3\2\2\2\u01b8\65\3\2\2\2\u01b9\u01ba\7\63\2\2\u01ba\u01bb"+
		"\5L\'\2\u01bb\u01bf\5\60\31\2\u01bc\u01be\58\35\2\u01bd\u01bc\3\2\2\2"+
		"\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c3"+
		"\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c4\5:\36\2\u01c3\u01c2\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\67\3\2\2\2\u01c5\u01c6\7\64\2\2\u01c6\u01c7\5L\'"+
		"\2\u01c7\u01c8\5\60\31\2\u01c89\3\2\2\2\u01c9\u01ca\7\65\2\2\u01ca\u01cb"+
		"\5\60\31\2\u01cb;\3\2\2\2\u01cc\u01cd\7\66\2\2\u01cd\u01ce\5L\'\2\u01ce"+
		"\u01cf\7\67\2\2\u01cf\u01d0\5L\'\2\u01d0\u01d1\78\2\2\u01d1\u01d2\5L\'"+
		"\2\u01d2\u01d3\5\60\31\2\u01d3\u01db\3\2\2\2\u01d4\u01d5\7\66\2\2\u01d5"+
		"\u01d6\7]\2\2\u01d6\u01d7\7H\2\2\u01d7\u01d8\5L\'\2\u01d8\u01d9\5\60\31"+
		"\2\u01d9\u01db\3\2\2\2\u01da\u01cc\3\2\2\2\u01da\u01d4\3\2\2\2\u01db="+
		"\3\2\2\2\u01dc\u01dd\79\2\2\u01dd\u01de\5L\'\2\u01de\u01df\5\60\31\2\u01df"+
		"?\3\2\2\2\u01e0\u01e1\t\3\2\2\u01e1A\3\2\2\2\u01e2\u01e3\7?\2\2\u01e3"+
		"\u01e4\5L\'\2\u01e4\u01e5\7*\2\2\u01e5C\3\2\2\2\u01e6\u01e7\7>\2\2\u01e7"+
		"\u01e8\5L\'\2\u01e8\u01e9\7*\2\2\u01e9E\3\2\2\2\u01ea\u01ef\5H%\2\u01eb"+
		"\u01ef\5J&\2\u01ec\u01ed\7<\2\2\u01ed\u01ef\7*\2\2\u01ee\u01ea\3\2\2\2"+
		"\u01ee\u01eb\3\2\2\2\u01ee\u01ec\3\2\2\2\u01efG\3\2\2\2\u01f0\u01f1\7"+
		"\27\2\2\u01f1\u01f2\5L\'\2\u01f2\u01f3\7*\2\2\u01f3I\3\2\2\2\u01f4\u01f5"+
		"\7\30\2\2\u01f5\u01f8\5L\'\2\u01f6\u01f9\7*\2\2\u01f7\u01f9\5:\36\2\u01f8"+
		"\u01f6\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9K\3\2\2\2\u01fa\u01fe\5T+\2\u01fb"+
		"\u01ff\5N(\2\u01fc\u01ff\5P)\2\u01fd\u01ff\5R*\2\u01fe\u01fb\3\2\2\2\u01fe"+
		"\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ffM\3\2\2\2"+
		"\u0200\u0201\7+\2\2\u0201\u0202\5L\'\2\u0202O\3\2\2\2\u0203\u0204\7\60"+
		"\2\2\u0204\u0205\5L\'\2\u0205Q\3\2\2\2\u0206\u0207\t\4\2\2\u0207\u0208"+
		"\5L\'\2\u0208S\3\2\2\2\u0209\u0210\5V,\2\u020a\u020c\7A\2\2\u020b\u020a"+
		"\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\5\u0082B"+
		"\2\u020e\u020f\5L\'\2\u020f\u0211\3\2\2\2\u0210\u020b\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211U\3\2\2\2\u0212\u0217\5X-\2\u0213\u0214\t\5\2\2\u0214\u0216"+
		"\5X-\2\u0215\u0213\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218W\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021b\7A\2\2\u021b"+
		"\u0226\5X-\2\u021c\u0222\5^\60\2\u021d\u021e\5Z.\2\u021e\u021f\5^\60\2"+
		"\u021f\u0221\3\2\2\2\u0220\u021d\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220"+
		"\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0225"+
		"\u021a\3\2\2\2\u0225\u021c\3\2\2\2\u0226Y\3\2\2\2\u0227\u0230\7B\2\2\u0228"+
		"\u0230\7C\2\2\u0229\u0230\7D\2\2\u022a\u0230\7E\2\2\u022b\u0230\7F\2\2"+
		"\u022c\u0230\7G\2\2\u022d\u0230\7H\2\2\u022e\u0230\5\\/\2\u022f\u0227"+
		"\3\2\2\2\u022f\u0228\3\2\2\2\u022f\u0229\3\2\2\2\u022f\u022a\3\2\2\2\u022f"+
		"\u022b\3\2\2\2\u022f\u022c\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u022e\3\2"+
		"\2\2\u0230[\3\2\2\2\u0231\u0232\7A\2\2\u0232\u0233\7H\2\2\u0233]\3\2\2"+
		"\2\u0234\u0239\5`\61\2\u0235\u0236\t\6\2\2\u0236\u0238\5`\61\2\u0237\u0235"+
		"\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"_\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u0241\5b\62\2\u023d\u023e\t\7\2\2"+
		"\u023e\u0240\5b\62\2\u023f\u023d\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242a\3\2\2\2\u0243\u0241\3\2\2\2\u0244"+
		"\u0245\t\6\2\2\u0245\u0248\5b\62\2\u0246\u0248\5d\63\2\u0247\u0244\3\2"+
		"\2\2\u0247\u0246\3\2\2\2\u0248c\3\2\2\2\u0249\u024e\5f\64\2\u024a\u024b"+
		"\7S\2\2\u024b\u024d\5b\62\2\u024c\u024a\3\2\2\2\u024d\u0250\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024fe\3\2\2\2\u0250\u024e\3\2\2\2"+
		"\u0251\u0257\5h\65\2\u0252\u0254\7T\2\2\u0253\u0255\5.\30\2\u0254\u0253"+
		"\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\7U\2\2\u0257"+
		"\u0252\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0262\3\2\2\2\u0259\u025b\5h"+
		"\65\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025d\7$\2\2\u025d\u025f\7]\2\2\u025e\u0260\5\u009cO\2\u025f\u025e\3"+
		"\2\2\2\u025f\u0260\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u0251\3\2\2\2\u0261"+
		"\u025a\3\2\2\2\u0262g\3\2\2\2\u0263\u0264\b\65\1\2\u0264\u0276\7[\2\2"+
		"\u0265\u0276\7X\2\2\u0266\u0276\7Y\2\2\u0267\u0276\7Z\2\2\u0268\u0276"+
		"\7\\\2\2\u0269\u0276\7]\2\2\u026a\u0276\5z>\2\u026b\u0276\5\u008aF\2\u026c"+
		"\u0276\5\u008eH\2\u026d\u026e\7T\2\2\u026e\u026f\5L\'\2\u026f\u0270\7"+
		"U\2\2\u0270\u0276\3\2\2\2\u0271\u0276\5\u0092J\2\u0272\u0276\5j\66\2\u0273"+
		"\u0276\5l\67\2\u0274\u0276\5\u00a4S\2\u0275\u0263\3\2\2\2\u0275\u0265"+
		"\3\2\2\2\u0275\u0266\3\2\2\2\u0275\u0267\3\2\2\2\u0275\u0268\3\2\2\2\u0275"+
		"\u0269\3\2\2\2\u0275\u026a\3\2\2\2\u0275\u026b\3\2\2\2\u0275\u026c\3\2"+
		"\2\2\u0275\u026d\3\2\2\2\u0275\u0271\3\2\2\2\u0275\u0272\3\2\2\2\u0275"+
		"\u0273\3\2\2\2\u0275\u0274\3\2\2\2\u0276\u0281\3\2\2\2\u0277\u0278\f\b"+
		"\2\2\u0278\u0279\7@\2\2\u0279\u0280\5n8\2\u027a\u027b\f\7\2\2\u027b\u027c"+
		"\7@\2\2\u027c\u0280\7]\2\2\u027d\u027e\f\6\2\2\u027e\u0280\5\u008cG\2"+
		"\u027f\u0277\3\2\2\2\u027f\u027a\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0283"+
		"\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282i\3\2\2\2\u0283"+
		"\u0281\3\2\2\2\u0284\u0285\7\4\2\2\u0285\u0286\5L\'\2\u0286k\3\2\2\2\u0287"+
		"\u0288\7P\2\2\u0288\u0289\5L\'\2\u0289m\3\2\2\2\u028a\u0290\5p9\2\u028b"+
		"\u0290\5r:\2\u028c\u0290\5t;\2\u028d\u0290\5v<\2\u028e\u0290\5x=\2\u028f"+
		"\u028a\3\2\2\2\u028f\u028b\3\2\2\2\u028f\u028c\3\2\2\2\u028f\u028d\3\2"+
		"\2\2\u028f\u028e\3\2\2\2\u0290o\3\2\2\2\u0291\u0292\5\u00a4S\2\u0292q"+
		"\3\2\2\2\u0293\u0294\t\b\2\2\u0294s\3\2\2\2\u0295\u029b\7\36\2\2\u0296"+
		"\u0297\7&\2\2\u0297\u0298\5,\27\2\u0298\u0299\7\'\2\2\u0299\u029b\3\2"+
		"\2\2\u029a\u0295\3\2\2\2\u029a\u0296\3\2\2\2\u029bu\3\2\2\2\u029c\u02a3"+
		"\7\35\2\2\u029d\u029e\7?\2\2\u029e\u029f\7#\2\2\u029f\u02a0\5L\'\2\u02a0"+
		"\u02a1\7#\2\2\u02a1\u02a3\3\2\2\2\u02a2\u029c\3\2\2\2\u02a2\u029d\3\2"+
		"\2\2\u02a3w\3\2\2\2\u02a4\u02a5\7\13\2\2\u02a5\u02a6\7$\2\2\u02a6\u02ab"+
		"\7]\2\2\u02a7\u02a8\7T\2\2\u02a8\u02a9\5.\30\2\u02a9\u02aa\7U\2\2\u02aa"+
		"\u02ac\3\2\2\2\u02ab\u02a7\3\2\2\2\u02ab\u02ac\3\2\2\2\u02acy\3\2\2\2"+
		"\u02ad\u02af\5|?\2\u02ae\u02b0\5\u009eP\2\u02af\u02ae\3\2\2\2\u02af\u02b0"+
		"\3\2\2\2\u02b0\u02b9\3\2\2\2\u02b1\u02b6\5\u0082B\2\u02b2\u02b4\5|?\2"+
		"\u02b3\u02b5\5\u009eP\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\u02b7\3\2\2\2\u02b6\u02b2\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\3\2"+
		"\2\2\u02b8\u02ad\3\2\2\2\u02b8\u02b1\3\2\2\2\u02b9{\3\2\2\2\u02ba\u02bb"+
		"\7\26\2\2\u02bb\u02bc\7$\2\2\u02bc\u02bd\7]\2\2\u02bd}\3\2\2\2\u02be\u02bf"+
		"\7)\2\2\u02bf\u02c0\7$\2\2\u02c0\u02c1\7]\2\2\u02c1\177\3\2\2\2\u02c2"+
		"\u02c3\7\22\2\2\u02c3\u02c4\7$\2\2\u02c4\u02c5\7]\2\2\u02c5\u0081\3\2"+
		"\2\2\u02c6\u02ca\5\u0084C\2\u02c7\u02ca\5\u0086D\2\u02c8\u02ca\5\u0088"+
		"E\2\u02c9\u02c6\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02c8\3\2\2\2\u02ca"+
		"\u0083\3\2\2\2\u02cb\u02d8\7\5\2\2\u02cc\u02d4\7O\2\2\u02cd\u02ce\7V\2"+
		"\2\u02ce\u02d1\7]\2\2\u02cf\u02d2\5\u009cO\2\u02d0\u02d2\5\u009eP\2\u02d1"+
		"\u02cf\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3\2"+
		"\2\2\u02d3\u02d5\7W\2\2\u02d4\u02cd\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u02d8\7\6\2\2\u02d7\u02cb\3\2\2\2\u02d7\u02cc\3\2"+
		"\2\2\u02d8\u0085\3\2\2\2\u02d9\u02e6\7\7\2\2\u02da\u02e2\7\b\2\2\u02db"+
		"\u02dc\7V\2\2\u02dc\u02df\7]\2\2\u02dd\u02e0\5\u009cO\2\u02de\u02e0\5"+
		"\u009eP\2\u02df\u02dd\3\2\2\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2"+
		"\u02e0\u02e1\3\2\2\2\u02e1\u02e3\7W\2\2\u02e2\u02db\3\2\2\2\u02e2\u02e3"+
		"\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\7O\2\2\u02e5\u02d9\3\2\2\2\u02e5"+
		"\u02da\3\2\2\2\u02e6\u0087\3\2\2\2\u02e7\u02f4\7\t\2\2\u02e8\u02f0\7\b"+
		"\2\2\u02e9\u02ea\7V\2\2\u02ea\u02ed\7]\2\2\u02eb\u02ee\5\u009cO\2\u02ec"+
		"\u02ee\5\u009eP\2\u02ed\u02eb\3\2\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee"+
		"\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\7W\2\2\u02f0\u02e9\3\2\2\2\u02f0"+
		"\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\7\6\2\2\u02f3\u02e7\3\2"+
		"\2\2\u02f3\u02e8\3\2\2\2\u02f4\u0089\3\2\2\2\u02f5\u02f7\7V\2\2\u02f6"+
		"\u02f8\5.\30\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2"+
		"\2\2\u02f9\u02fa\7W\2\2\u02fa\u008b\3\2\2\2\u02fb\u02fc\7V\2\2\u02fc\u02fd"+
		"\5L\'\2\u02fd\u02fe\7W\2\2\u02fe\u0306\3\2\2\2\u02ff\u0300\7V\2\2\u0300"+
		"\u0301\5L\'\2\u0301\u0302\7#\2\2\u0302\u0303\5L\'\2\u0303\u0304\7W\2\2"+
		"\u0304\u0306\3\2\2\2\u0305\u02fb\3\2\2\2\u0305\u02ff\3\2\2\2\u0306\u008d"+
		"\3\2\2\2\u0307\u0310\7&\2\2\u0308\u030d\5\u0090I\2\u0309\u030a\7L\2\2"+
		"\u030a\u030c\5\u0090I\2\u030b\u0309\3\2\2\2\u030c\u030f\3\2\2\2\u030d"+
		"\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2"+
		"\2\2\u0310\u0308\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0313\7\'\2\2\u0313\u008f\3\2\2\2\u0314\u0315\7Y\2\2\u0315\u0316\7#\2"+
		"\2\u0316\u0317\5L\'\2\u0317\u0091\3\2\2\2\u0318\u031a\7\31\2\2\u0319\u031b"+
		"\5L\'\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"\u031d\5\u0094K\2\u031d\u0093\3\2\2\2\u031e\u0322\5\u0096L\2\u031f\u0322"+
		"\5\u009aN\2\u0320\u0322\5\u0098M\2\u0321\u031e\3\2\2\2\u0321\u031f\3\2"+
		"\2\2\u0321\u0320\3\2\2\2\u0322\u0095\3\2\2\2\u0323\u0325\5\u0082B\2\u0324"+
		"\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\5|"+
		"?\2\u0327\u0329\5\u009cO\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u0097\3\2\2\2\u032a\u032b\5\u0082B\2\u032b\u032c\5\u0080A\2\u032c\u0099"+
		"\3\2\2\2\u032d\u032f\5~@\2\u032e\u0330\5\u009cO\2\u032f\u032e\3\2\2\2"+
		"\u032f\u0330\3\2\2\2\u0330\u009b\3\2\2\2\u0331\u033a\7T\2\2\u0332\u0337"+
		"\5\u00a0Q\2\u0333\u0334\7L\2\2\u0334\u0336\5\u00a0Q\2\u0335\u0333\3\2"+
		"\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u0332\3\2\2\2\u033a\u033b\3\2"+
		"\2\2\u033b\u033c\3\2\2\2\u033c\u033d\7U\2\2\u033d\u009d\3\2\2\2\u033e"+
		"\u0347\7T\2\2\u033f\u0344\5\u00a2R\2\u0340\u0341\7L\2\2\u0341\u0343\5"+
		"\u00a2R\2\u0342\u0340\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2\2\2"+
		"\u0344\u0345\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u033f"+
		"\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\7U\2\2\u034a"+
		"\u009f\3\2\2\2\u034b\u034c\7]\2\2\u034c\u034d\7+\2\2\u034d\u034e\5L\'"+
		"\2\u034e\u00a1\3\2\2\2\u034f\u0350\7]\2\2\u0350\u0351\5Z.\2\u0351\u0352"+
		"\5L\'\2\u0352\u00a3\3\2\2\2\u0353\u0354\t\t\2\2\u0354\u00a5\3\2\2\2\u0355"+
		"\u0357\7\23\2\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3"+
		"\2\2\2\u0358\u035a\t\n\2\2\u0359\u035b\5\u00c0a\2\u035a\u0359\3\2\2\2"+
		"\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\7&\2\2\u035d\u035e"+
		"\5\u00a8U\2\u035e\u035f\7\'\2\2\u035f\u00a7\3\2\2\2\u0360\u0362\5\u00aa"+
		"V\2\u0361\u0363\7*\2\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0365"+
		"\3\2\2\2\u0364\u0360\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u00a9\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u0372\5\u00b8"+
		"]\2\u036a\u0372\5\u00b2Z\2\u036b\u0372\5\u00acW\2\u036c\u036d\5\u00c0"+
		"a\2\u036d\u036e\7+\2\2\u036e\u036f\5\u00c0a\2\u036f\u0372\3\2\2\2\u0370"+
		"\u0372\5\u00be`\2\u0371\u0369\3\2\2\2\u0371\u036a\3\2\2\2\u0371\u036b"+
		"\3\2\2\2\u0371\u036c\3\2\2\2\u0371\u0370\3\2\2\2\u0372\u00ab\3\2\2\2\u0373"+
		"\u0374\t\13\2\2\u0374\u0375\5\u00aeX\2\u0375\u00ad\3\2\2\2\u0376\u0378"+
		"\7V\2\2\u0377\u0379\5\u00b0Y\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2"+
		"\u0379\u037a\3\2\2\2\u037a\u037c\7W\2\2\u037b\u0376\3\2\2\2\u037c\u037d"+
		"\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u00af\3\2\2\2\u037f"+
		"\u0382\5\u00c0a\2\u0380\u0381\7+\2\2\u0381\u0383\5\u00c0a\2\u0382\u0380"+
		"\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u0386\7L\2\2\u0385"+
		"\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u037f\3\2"+
		"\2\2\u0388\u0389\3\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u00b1\3\2\2\2\u038b\u038e\5\u00ba^\2\u038c\u038e\5\u00be`\2\u038d\u038b"+
		"\3\2\2\2\u038d\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0391\5\u00b4["+
		"\2\u0390\u0392\5\u00aeX\2\u0391\u0390\3\2\2\2\u0391\u0392\3\2\2\2\u0392"+
		"\u00b3\3\2\2\2\u0393\u0396\5\u00b6\\\2\u0394\u0397\5\u00ba^\2\u0395\u0397"+
		"\5\u00be`\2\u0396\u0394\3\2\2\2\u0396\u0395\3\2\2\2\u0397\u0399\3\2\2"+
		"\2\u0398\u0393\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b"+
		"\3\2\2\2\u039b\u00b5\3\2\2\2\u039c\u039d\t\f\2\2\u039d\u00b7\3\2\2\2\u039e"+
		"\u03a0\5\u00ba^\2\u039f\u03a1\5\u00aeX\2\u03a0\u039f\3\2\2\2\u03a0\u03a1"+
		"\3\2\2\2\u03a1\u00b9\3\2\2\2\u03a2\u03a4\5\u00c0a\2\u03a3\u03a5\5\u00bc"+
		"_\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u00bb\3\2\2\2\u03a6"+
		"\u03a7\7#\2\2\u03a7\u03aa\5\u00c0a\2\u03a8\u03a9\7#\2\2\u03a9\u03ab\5"+
		"\u00c0a\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u00bd\3\2\2\2"+
		"\u03ac\u03ae\7\25\2\2\u03ad\u03af\5\u00c0a\2\u03ae\u03ad\3\2\2\2\u03ae"+
		"\u03af\3\2\2\2\u03af\u03b1\3\2\2\2\u03b0\u03ac\3\2\2\2\u03b0\u03b1\3\2"+
		"\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\7&\2\2\u03b3\u03b4\5\u00a8U\2\u03b4"+
		"\u03b5\7\'\2\2\u03b5\u00bf\3\2\2\2\u03b6\u03b7\t\r\2\2\u03b7\u00c1\3\2"+
		"\2\2o\u00c3\u00c8\u00ce\u00d4\u00dd\u00e2\u00e8\u00ec\u00f0\u00f2\u00f6"+
		"\u00fe\u0113\u011a\u011e\u0122\u0130\u013c\u0145\u0148\u014f\u0158\u015f"+
		"\u0166\u016a\u0172\u0175\u0179\u017f\u0184\u018f\u0197\u019e\u01a4\u01b7"+
		"\u01bf\u01c3\u01da\u01ee\u01f8\u01fe\u020b\u0210\u0217\u0222\u0225\u022f"+
		"\u0239\u0241\u0247\u024e\u0254\u0257\u025a\u025f\u0261\u0275\u027f\u0281"+
		"\u028f\u029a\u02a2\u02ab\u02af\u02b4\u02b6\u02b8\u02c9\u02d1\u02d4\u02d7"+
		"\u02df\u02e2\u02e5\u02ed\u02f0\u02f3\u02f7\u0305\u030d\u0310\u031a\u0321"+
		"\u0324\u0328\u032f\u0337\u033a\u0344\u0347\u0356\u035a\u0362\u0366\u0371"+
		"\u0378\u037d\u0382\u0385\u0389\u038d\u0391\u0396\u039a\u03a0\u03a4\u03aa"+
		"\u03ae\u03b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}