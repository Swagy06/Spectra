package gen;

// Generated from src/Spectra.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SpectraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, CYAN_AND=12, MAGENTA_OR=13, GREY_NOT=14, ADD_COLOR=15, 
		SUBTRACT_COLOR=16, MULTIPLY_COLOR=17, DIVIDE_COLOR=18, MODULO_COLOR=19, 
		LIGHT_LESS_THAN=20, LIGHT_LESS_EQUAL=21, DARK_GREATER_THAN=22, DARK_GREATER_EQUAL=23, 
		BRIGHTDARK_EQUAL=24, BRIGHTDARK_NOTEQUAL=25, TRANSPARENT_IF=26, OPAQUE_ELSE=27, 
		TRANSLUCENT_ELSEIF=28, VIOLET_WHILE=29, BLUE_FOR=30, SHADE_CHECK=31, CONTRAST_DO=32, 
		SPECTRUM_DISPLAY=33, SPECTRUM_DISPLAYLN=34, QUESTION_COLOR=35, COLON_COLOR=36, 
		BREAK_COLOR=37, CONTINUE_COLOR=38, BOOLEAN=39, NUMBER=40, STRING=41, CHAR=42, 
		IDENTIFIER=43, WS=44, COMMENT=45, BLOCK_COMMENT=46;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_assignment = 3, 
		RULE_printStatement = 4, RULE_ternary = 5, RULE_ifStatement = 6, RULE_whileLoop = 7, 
		RULE_forLoop = 8, RULE_breakStatement = 9, RULE_continueStatement = 10, 
		RULE_statementBlock = 11, RULE_expression = 12, RULE_additionExpression = 13, 
		RULE_multiplicationExpression = 14, RULE_logicalExpression = 15, RULE_primaryExpression = 16, 
		RULE_condition = 17, RULE_type = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "assignment", "printStatement", 
			"ternary", "ifStatement", "whileLoop", "forLoop", "breakStatement", "continueStatement", 
			"statementBlock", "expression", "additionExpression", "multiplicationExpression", 
			"logicalExpression", "primaryExpression", "condition", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'('", "')'", "'{'", "'}'", "'red_int'", "'blue_float'", 
			"'purple_bool'", "'green_string'", "'yellow_char'", "'cyan_and'", "'magenta_or'", 
			"'grey_not'", "'add_color'", "'subtract_color'", "'multiply_color'", 
			"'divide_color'", "'modulo_color'", "'light_less_than'", "'light_less_equal'", 
			"'dark_greater_than'", "'dark_greater_equal'", "'brightdark_equal'", 
			"'brightdark_notequal'", "'transparent_if'", "'opaque_else'", "'translucent_elseif'", 
			"'violet_while'", "'blue_for'", "'shade_check'", "'contrast_do'", "'spectrum_display'", 
			"'spectrum_displayln'", "'question_color'", "'colon_color'", "'break_color'", 
			"'continue_color'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"CYAN_AND", "MAGENTA_OR", "GREY_NOT", "ADD_COLOR", "SUBTRACT_COLOR", 
			"MULTIPLY_COLOR", "DIVIDE_COLOR", "MODULO_COLOR", "LIGHT_LESS_THAN", 
			"LIGHT_LESS_EQUAL", "DARK_GREATER_THAN", "DARK_GREATER_EQUAL", "BRIGHTDARK_EQUAL", 
			"BRIGHTDARK_NOTEQUAL", "TRANSPARENT_IF", "OPAQUE_ELSE", "TRANSLUCENT_ELSEIF", 
			"VIOLET_WHILE", "BLUE_FOR", "SHADE_CHECK", "CONTRAST_DO", "SPECTRUM_DISPLAY", 
			"SPECTRUM_DISPLAYLN", "QUESTION_COLOR", "COLON_COLOR", "BREAK_COLOR", 
			"CONTINUE_COLOR", "BOOLEAN", "NUMBER", "STRING", "CHAR", "IDENTIFIER", 
			"WS", "COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "Spectra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpectraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SpectraParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13084148125576L) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				printStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				whileLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				forLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(53);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(54);
				continueStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SpectraParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TernaryContext ternary() {
			return getRuleContext(TernaryContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			type();
			setState(58);
			match(IDENTIFIER);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(59);
				match(T__0);
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(60);
					expression();
					}
					break;
				case 2:
					{
					setState(61);
					ternary();
					}
					break;
				case 3:
					{
					setState(62);
					condition(0);
					}
					break;
				}
				}
			}

			setState(67);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SpectraParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TernaryContext ternary() {
			return getRuleContext(TernaryContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IDENTIFIER);
			setState(70);
			match(T__0);
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(71);
				expression();
				}
				break;
			case 2:
				{
				setState(72);
				ternary();
				}
				break;
			}
			setState(75);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode SPECTRUM_DISPLAY() { return getToken(SpectraParser.SPECTRUM_DISPLAY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SPECTRUM_DISPLAYLN() { return getToken(SpectraParser.SPECTRUM_DISPLAYLN, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStatement);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPECTRUM_DISPLAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(SPECTRUM_DISPLAY);
				setState(78);
				match(T__2);
				setState(79);
				expression();
				setState(80);
				match(T__3);
				setState(81);
				match(T__1);
				}
				break;
			case SPECTRUM_DISPLAYLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(SPECTRUM_DISPLAYLN);
				setState(84);
				match(T__2);
				setState(85);
				expression();
				setState(86);
				match(T__3);
				setState(87);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TernaryContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode QUESTION_COLOR() { return getToken(SpectraParser.QUESTION_COLOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON_COLOR() { return getToken(SpectraParser.COLON_COLOR, 0); }
		public TernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitTernary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ternary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			condition(0);
			setState(92);
			match(QUESTION_COLOR);
			setState(93);
			expression();
			setState(94);
			match(COLON_COLOR);
			setState(95);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode TRANSPARENT_IF() { return getToken(SpectraParser.TRANSPARENT_IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<StatementBlockContext> statementBlock() {
			return getRuleContexts(StatementBlockContext.class);
		}
		public StatementBlockContext statementBlock(int i) {
			return getRuleContext(StatementBlockContext.class,i);
		}
		public List<TerminalNode> TRANSLUCENT_ELSEIF() { return getTokens(SpectraParser.TRANSLUCENT_ELSEIF); }
		public TerminalNode TRANSLUCENT_ELSEIF(int i) {
			return getToken(SpectraParser.TRANSLUCENT_ELSEIF, i);
		}
		public TerminalNode OPAQUE_ELSE() { return getToken(SpectraParser.OPAQUE_ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(TRANSPARENT_IF);
			setState(98);
			match(T__2);
			setState(99);
			condition(0);
			setState(100);
			match(T__3);
			setState(101);
			statementBlock();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TRANSLUCENT_ELSEIF) {
				{
				{
				setState(102);
				match(TRANSLUCENT_ELSEIF);
				setState(103);
				match(T__2);
				setState(104);
				condition(0);
				setState(105);
				match(T__3);
				setState(106);
				statementBlock();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAQUE_ELSE) {
				{
				setState(113);
				match(OPAQUE_ELSE);
				setState(114);
				statementBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode VIOLET_WHILE() { return getToken(SpectraParser.VIOLET_WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(VIOLET_WHILE);
			setState(118);
			match(T__2);
			setState(119);
			condition(0);
			setState(120);
			match(T__3);
			setState(121);
			statementBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode BLUE_FOR() { return getToken(SpectraParser.BLUE_FOR, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(BLUE_FOR);
			setState(124);
			match(T__2);
			setState(125);
			assignment();
			setState(126);
			condition(0);
			setState(127);
			match(T__1);
			setState(128);
			assignment();
			setState(129);
			match(T__3);
			setState(130);
			statementBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK_COLOR() { return getToken(SpectraParser.BREAK_COLOR, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(BREAK_COLOR);
			setState(133);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE_COLOR() { return getToken(SpectraParser.CONTINUE_COLOR, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(CONTINUE_COLOR);
			setState(136);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__4);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13084148125576L) != 0)) {
				{
				{
				setState(139);
				statement();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				additionExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				logicalExpression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditionExpressionContext extends ParserRuleContext {
		public MultiplicationExpressionContext multiplicationExpression() {
			return getRuleContext(MultiplicationExpressionContext.class,0);
		}
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public TerminalNode ADD_COLOR() { return getToken(SpectraParser.ADD_COLOR, 0); }
		public TerminalNode SUBTRACT_COLOR() { return getToken(SpectraParser.SUBTRACT_COLOR, 0); }
		public AdditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterAdditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitAdditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionExpressionContext additionExpression() throws RecognitionException {
		return additionExpression(0);
	}

	private AdditionExpressionContext additionExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditionExpressionContext _localctx = new AdditionExpressionContext(_ctx, _parentState);
		AdditionExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_additionExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			multiplicationExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditionExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additionExpression);
					setState(154);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(155);
					_la = _input.LA(1);
					if ( !(_la==ADD_COLOR || _la==SUBTRACT_COLOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(156);
					multiplicationExpression(0);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public MultiplicationExpressionContext multiplicationExpression() {
			return getRuleContext(MultiplicationExpressionContext.class,0);
		}
		public TerminalNode MULTIPLY_COLOR() { return getToken(SpectraParser.MULTIPLY_COLOR, 0); }
		public TerminalNode DIVIDE_COLOR() { return getToken(SpectraParser.DIVIDE_COLOR, 0); }
		public TerminalNode MODULO_COLOR() { return getToken(SpectraParser.MODULO_COLOR, 0); }
		public MultiplicationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterMultiplicationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitMultiplicationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationExpressionContext multiplicationExpression() throws RecognitionException {
		return multiplicationExpression(0);
	}

	private MultiplicationExpressionContext multiplicationExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicationExpressionContext _localctx = new MultiplicationExpressionContext(_ctx, _parentState);
		MultiplicationExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_multiplicationExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(163);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicationExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicationExpression);
					setState(165);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(166);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(167);
					primaryExpression();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public TerminalNode GREY_NOT() { return getToken(SpectraParser.GREY_NOT, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode CYAN_AND() { return getToken(SpectraParser.CYAN_AND, 0); }
		public TerminalNode MAGENTA_OR() { return getToken(SpectraParser.MAGENTA_OR, 0); }
		public TerminalNode LIGHT_LESS_THAN() { return getToken(SpectraParser.LIGHT_LESS_THAN, 0); }
		public TerminalNode LIGHT_LESS_EQUAL() { return getToken(SpectraParser.LIGHT_LESS_EQUAL, 0); }
		public TerminalNode DARK_GREATER_THAN() { return getToken(SpectraParser.DARK_GREATER_THAN, 0); }
		public TerminalNode DARK_GREATER_EQUAL() { return getToken(SpectraParser.DARK_GREATER_EQUAL, 0); }
		public TerminalNode BRIGHTDARK_EQUAL() { return getToken(SpectraParser.BRIGHTDARK_EQUAL, 0); }
		public TerminalNode BRIGHTDARK_NOTEQUAL() { return getToken(SpectraParser.BRIGHTDARK_NOTEQUAL, 0); }
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		return logicalExpression(0);
	}

	private LogicalExpressionContext logicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, _parentState);
		LogicalExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_logicalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GREY_NOT:
				{
				setState(174);
				match(GREY_NOT);
				setState(175);
				primaryExpression();
				}
				break;
			case T__2:
			case BOOLEAN:
			case NUMBER:
			case STRING:
			case IDENTIFIER:
				{
				setState(176);
				primaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
					setState(179);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(180);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66072576L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(181);
					primaryExpression();
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SpectraParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(SpectraParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SpectraParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SpectraParser.BOOLEAN, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_primaryExpression);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(T__2);
				setState(188);
				expression();
				setState(189);
				match(T__3);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(STRING);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				match(BOOLEAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode GREY_NOT() { return getToken(SpectraParser.GREY_NOT, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LIGHT_LESS_THAN() { return getToken(SpectraParser.LIGHT_LESS_THAN, 0); }
		public TerminalNode LIGHT_LESS_EQUAL() { return getToken(SpectraParser.LIGHT_LESS_EQUAL, 0); }
		public TerminalNode DARK_GREATER_THAN() { return getToken(SpectraParser.DARK_GREATER_THAN, 0); }
		public TerminalNode DARK_GREATER_EQUAL() { return getToken(SpectraParser.DARK_GREATER_EQUAL, 0); }
		public TerminalNode BRIGHTDARK_EQUAL() { return getToken(SpectraParser.BRIGHTDARK_EQUAL, 0); }
		public TerminalNode BRIGHTDARK_NOTEQUAL() { return getToken(SpectraParser.BRIGHTDARK_NOTEQUAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(SpectraParser.BOOLEAN, 0); }
		public TerminalNode CYAN_AND() { return getToken(SpectraParser.CYAN_AND, 0); }
		public TerminalNode MAGENTA_OR() { return getToken(SpectraParser.MAGENTA_OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(198);
				match(GREY_NOT);
				setState(199);
				condition(6);
				}
				break;
			case 2:
				{
				setState(200);
				match(T__2);
				setState(201);
				condition(0);
				setState(202);
				match(T__3);
				}
				break;
			case 3:
				{
				setState(204);
				expression();
				setState(205);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				expression();
				}
				break;
			case 4:
				{
				setState(208);
				match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(211);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(212);
						match(CYAN_AND);
						setState(213);
						condition(6);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(214);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(215);
						match(MAGENTA_OR);
						setState(216);
						condition(5);
						}
						break;
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpectraListener ) ((SpectraListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpectraVisitor ) return ((SpectraVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) ) {
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
		case 13:
			return additionExpression_sempred((AdditionExpressionContext)_localctx, predIndex);
		case 14:
			return multiplicationExpression_sempred((MultiplicationExpressionContext)_localctx, predIndex);
		case 15:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		case 17:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean additionExpression_sempred(AdditionExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicationExpression_sempred(MultiplicationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u00e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002@\b\u0002\u0003\u0002B\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003J\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006m\b\u0006\n\u0006\f\u0006p\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006t\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u008d\b\u000b\n\u000b\f\u000b\u0090\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0003\f\u0096\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u009e\b\r\n\r\f\r\u00a1\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00a9\b\u000e\n\u000e"+
		"\f\u000e\u00ac\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00b2\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00b7\b\u000f\n\u000f\f\u000f\u00ba\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00c4\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00d2\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00da\b\u0011\n"+
		"\u0011\f\u0011\u00dd\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0000"+
		"\u0004\u001a\u001c\u001e\"\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0005\u0001\u0000"+
		"\u000f\u0010\u0001\u0000\u0011\u0013\u0002\u0000\f\r\u0014\u0019\u0001"+
		"\u0000\u0014\u0019\u0001\u0000\u0007\u000b\u00ec\u0000)\u0001\u0000\u0000"+
		"\u0000\u00027\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006"+
		"E\u0001\u0000\u0000\u0000\bY\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000"+
		"\u0000\fa\u0001\u0000\u0000\u0000\u000eu\u0001\u0000\u0000\u0000\u0010"+
		"{\u0001\u0000\u0000\u0000\u0012\u0084\u0001\u0000\u0000\u0000\u0014\u0087"+
		"\u0001\u0000\u0000\u0000\u0016\u008a\u0001\u0000\u0000\u0000\u0018\u0095"+
		"\u0001\u0000\u0000\u0000\u001a\u0097\u0001\u0000\u0000\u0000\u001c\u00a2"+
		"\u0001\u0000\u0000\u0000\u001e\u00b1\u0001\u0000\u0000\u0000 \u00c3\u0001"+
		"\u0000\u0000\u0000\"\u00d1\u0001\u0000\u0000\u0000$\u00de\u0001\u0000"+
		"\u0000\u0000&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000(+\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000"+
		"*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\u0000\u0000"+
		"\u0001-\u0001\u0001\u0000\u0000\u0000.8\u0003\u0004\u0002\u0000/8\u0003"+
		"\u0006\u0003\u000008\u0003\b\u0004\u000018\u0003\f\u0006\u000028\u0003"+
		"\u000e\u0007\u000038\u0003\u0010\b\u000048\u0003\u0018\f\u000058\u0003"+
		"\u0012\t\u000068\u0003\u0014\n\u00007.\u0001\u0000\u0000\u00007/\u0001"+
		"\u0000\u0000\u000070\u0001\u0000\u0000\u000071\u0001\u0000\u0000\u0000"+
		"72\u0001\u0000\u0000\u000073\u0001\u0000\u0000\u000074\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008\u0003\u0001"+
		"\u0000\u0000\u00009:\u0003$\u0012\u0000:A\u0005+\u0000\u0000;?\u0005\u0001"+
		"\u0000\u0000<@\u0003\u0018\f\u0000=@\u0003\n\u0005\u0000>@\u0003\"\u0011"+
		"\u0000?<\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000"+
		"\u0000\u0000@B\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0005\u0002\u0000\u0000"+
		"D\u0005\u0001\u0000\u0000\u0000EF\u0005+\u0000\u0000FI\u0005\u0001\u0000"+
		"\u0000GJ\u0003\u0018\f\u0000HJ\u0003\n\u0005\u0000IG\u0001\u0000\u0000"+
		"\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0005\u0002"+
		"\u0000\u0000L\u0007\u0001\u0000\u0000\u0000MN\u0005!\u0000\u0000NO\u0005"+
		"\u0003\u0000\u0000OP\u0003\u0018\f\u0000PQ\u0005\u0004\u0000\u0000QR\u0005"+
		"\u0002\u0000\u0000RZ\u0001\u0000\u0000\u0000ST\u0005\"\u0000\u0000TU\u0005"+
		"\u0003\u0000\u0000UV\u0003\u0018\f\u0000VW\u0005\u0004\u0000\u0000WX\u0005"+
		"\u0002\u0000\u0000XZ\u0001\u0000\u0000\u0000YM\u0001\u0000\u0000\u0000"+
		"YS\u0001\u0000\u0000\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0003\"\u0011"+
		"\u0000\\]\u0005#\u0000\u0000]^\u0003\u0018\f\u0000^_\u0005$\u0000\u0000"+
		"_`\u0003\u0018\f\u0000`\u000b\u0001\u0000\u0000\u0000ab\u0005\u001a\u0000"+
		"\u0000bc\u0005\u0003\u0000\u0000cd\u0003\"\u0011\u0000de\u0005\u0004\u0000"+
		"\u0000en\u0003\u0016\u000b\u0000fg\u0005\u001c\u0000\u0000gh\u0005\u0003"+
		"\u0000\u0000hi\u0003\"\u0011\u0000ij\u0005\u0004\u0000\u0000jk\u0003\u0016"+
		"\u000b\u0000km\u0001\u0000\u0000\u0000lf\u0001\u0000\u0000\u0000mp\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"os\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005\u001b\u0000"+
		"\u0000rt\u0003\u0016\u000b\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000t\r\u0001\u0000\u0000\u0000uv\u0005\u001d\u0000\u0000vw\u0005"+
		"\u0003\u0000\u0000wx\u0003\"\u0011\u0000xy\u0005\u0004\u0000\u0000yz\u0003"+
		"\u0016\u000b\u0000z\u000f\u0001\u0000\u0000\u0000{|\u0005\u001e\u0000"+
		"\u0000|}\u0005\u0003\u0000\u0000}~\u0003\u0006\u0003\u0000~\u007f\u0003"+
		"\"\u0011\u0000\u007f\u0080\u0005\u0002\u0000\u0000\u0080\u0081\u0003\u0006"+
		"\u0003\u0000\u0081\u0082\u0005\u0004\u0000\u0000\u0082\u0083\u0003\u0016"+
		"\u000b\u0000\u0083\u0011\u0001\u0000\u0000\u0000\u0084\u0085\u0005%\u0000"+
		"\u0000\u0085\u0086\u0005\u0002\u0000\u0000\u0086\u0013\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005&\u0000\u0000\u0088\u0089\u0005\u0002\u0000\u0000"+
		"\u0089\u0015\u0001\u0000\u0000\u0000\u008a\u008e\u0005\u0005\u0000\u0000"+
		"\u008b\u008d\u0003\u0002\u0001\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0006\u0000\u0000"+
		"\u0092\u0017\u0001\u0000\u0000\u0000\u0093\u0096\u0003\u001a\r\u0000\u0094"+
		"\u0096\u0003\u001e\u000f\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0019\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0006\r\uffff\uffff\u0000\u0098\u0099\u0003\u001c\u000e\u0000\u0099"+
		"\u009f\u0001\u0000\u0000\u0000\u009a\u009b\n\u0002\u0000\u0000\u009b\u009c"+
		"\u0007\u0000\u0000\u0000\u009c\u009e\u0003\u001c\u000e\u0000\u009d\u009a"+
		"\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u001b"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0006\u000e\uffff\uffff\u0000\u00a3\u00a4\u0003 \u0010\u0000\u00a4\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\n\u0002\u0000\u0000\u00a6\u00a7\u0007"+
		"\u0001\u0000\u0000\u00a7\u00a9\u0003 \u0010\u0000\u00a8\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u001d\u0001\u0000"+
		"\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0006\u000f"+
		"\uffff\uffff\u0000\u00ae\u00af\u0005\u000e\u0000\u0000\u00af\u00b2\u0003"+
		" \u0010\u0000\u00b0\u00b2\u0003 \u0010\u0000\u00b1\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\n\u0003\u0000\u0000\u00b4\u00b5\u0007\u0002\u0000\u0000"+
		"\u00b5\u00b7\u0003 \u0010\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b7"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u001f\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000\u00bc"+
		"\u00bd\u0003\u0018\f\u0000\u00bd\u00be\u0005\u0004\u0000\u0000\u00be\u00c4"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c4\u0005+\u0000\u0000\u00c0\u00c4\u0005"+
		"(\u0000\u0000\u00c1\u00c4\u0005)\u0000\u0000\u00c2\u00c4\u0005\'\u0000"+
		"\u0000\u00c3\u00bb\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4!\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0006\u0011\uffff\uffff\u0000\u00c6\u00c7\u0005\u000e\u0000"+
		"\u0000\u00c7\u00d2\u0003\"\u0011\u0006\u00c8\u00c9\u0005\u0003\u0000\u0000"+
		"\u00c9\u00ca\u0003\"\u0011\u0000\u00ca\u00cb\u0005\u0004\u0000\u0000\u00cb"+
		"\u00d2\u0001\u0000\u0000\u0000\u00cc\u00cd\u0003\u0018\f\u0000\u00cd\u00ce"+
		"\u0007\u0003\u0000\u0000\u00ce\u00cf\u0003\u0018\f\u0000\u00cf\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d2\u0005\'\u0000\u0000\u00d1\u00c5\u0001\u0000"+
		"\u0000\u0000\u00d1\u00c8\u0001\u0000\u0000\u0000\u00d1\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00db\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\n\u0005\u0000\u0000\u00d4\u00d5\u0005\f\u0000"+
		"\u0000\u00d5\u00da\u0003\"\u0011\u0006\u00d6\u00d7\n\u0004\u0000\u0000"+
		"\u00d7\u00d8\u0005\r\u0000\u0000\u00d8\u00da\u0003\"\u0011\u0005\u00d9"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d9\u00d6\u0001\u0000\u0000\u0000\u00da"+
		"\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc#\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0007\u0004\u0000\u0000\u00df%\u0001"+
		"\u0000\u0000\u0000\u0012)7?AIYns\u008e\u0095\u009f\u00aa\u00b1\u00b8\u00c3"+
		"\u00d1\u00d9\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}