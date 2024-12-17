grammar Spectra;

// Lexer rules
CYAN_AND: 'cyan_and';
MAGENTA_OR: 'magenta_or';
GREY_NOT: 'grey_not';
ADD_COLOR: 'add_color';
SUBTRACT_COLOR: 'subtract_color';
MULTIPLY_COLOR: 'multiply_color';
DIVIDE_COLOR: 'divide_color';
MODULO_COLOR: 'modulo_color';
LIGHT_LESS_THAN: 'light_less_than';
LIGHT_LESS_EQUAL: 'light_less_equal';
DARK_GREATER_THAN: 'dark_greater_than';
DARK_GREATER_EQUAL: 'dark_greater_equal';
BRIGHTDARK_EQUAL: 'brightdark_equal';
BRIGHTDARK_NOTEQUAL: 'brightdark_notequal';
TRANSPARENT_IF: 'transparent_if';
OPAQUE_ELSE: 'opaque_else';
TRANSLUCENT_ELSEIF: 'translucent_elseif';
VIOLET_WHILE: 'violet_while';
BLUE_FOR: 'blue_for';
SHADE_CHECK: 'shade_check';
CONTRAST_DO: 'contrast_do';
SPECTRUM_DISPLAY: 'spectrum_display';
SPECTRUM_DISPLAYLN: 'spectrum_displayln';
QUESTION_COLOR:'question_color';
COLON_COLOR:'colon_color';
BREAK_COLOR: 'break_color';
CONTINUE_COLOR: 'continue_color';

BOOLEAN: 'white'|'black';  // white = true, black = false
NUMBER: [0-9]+ ('.' [0-9]+)?;
STRING: '"' .*? '"';
CHAR: '\'' . '\'';
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/' .? '*/' -> skip;

program
    : statement* EOF;

statement
    : declaration
    | assignment
    | printStatement
    | ifStatement
    | whileLoop
    | forLoop
    | expression
    | breakStatement
    | continueStatement
    ;

declaration
    : type IDENTIFIER ('=' (expression|ternary|condition))? ';'
    ;

assignment
    : IDENTIFIER '=' (expression|ternary) ';'
    ;

printStatement
    : SPECTRUM_DISPLAY '(' expression ')' ';'
    | SPECTRUM_DISPLAYLN '(' expression ')' ';'
    ;

ternary
    : condition QUESTION_COLOR expression COLON_COLOR expression
    ;



ifStatement
    : TRANSPARENT_IF '(' condition ')' statementBlock
      (TRANSLUCENT_ELSEIF '(' condition ')' statementBlock)*
      (OPAQUE_ELSE statementBlock)?
    ;

whileLoop
    : VIOLET_WHILE '(' condition ')' statementBlock
    ;

forLoop
    : BLUE_FOR '(' assignment condition ';' assignment ')' statementBlock
    ;

breakStatement
    : BREAK_COLOR ';'
    ;

continueStatement
    : CONTINUE_COLOR ';'
    ;

statementBlock
    : '{' statement* '}'
    ;

// Expression rules

expression
    : additionExpression
    | logicalExpression
    ;

additionExpression
    : additionExpression (ADD_COLOR | SUBTRACT_COLOR) multiplicationExpression
    | multiplicationExpression
    ;

multiplicationExpression
    : multiplicationExpression (MULTIPLY_COLOR | DIVIDE_COLOR | MODULO_COLOR) primaryExpression
    | primaryExpression
    ;

logicalExpression
    : logicalExpression (CYAN_AND | MAGENTA_OR|LIGHT_LESS_THAN | LIGHT_LESS_EQUAL | DARK_GREATER_THAN | DARK_GREATER_EQUAL | BRIGHTDARK_EQUAL | BRIGHTDARK_NOTEQUAL) primaryExpression
    | GREY_NOT primaryExpression
    | primaryExpression
    ;

primaryExpression
    : '(' expression ')'
    | IDENTIFIER
    | NUMBER
    | STRING
    | BOOLEAN
    ;

// Condition rules
condition
    :GREY_NOT condition
    | condition CYAN_AND condition
    | condition MAGENTA_OR condition
    | '(' condition ')'
    | expression (LIGHT_LESS_THAN | LIGHT_LESS_EQUAL | DARK_GREATER_THAN | DARK_GREATER_EQUAL | BRIGHTDARK_EQUAL | BRIGHTDARK_NOTEQUAL) expression
    | BOOLEAN
    ;


type
    : 'red_int'
    | 'blue_float'
    | 'purple_bool'
    | 'green_string'
    | 'yellow_char'
    ;

