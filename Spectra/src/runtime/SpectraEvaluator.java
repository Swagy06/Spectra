package runtime;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

import gen.SpectraBaseVisitor;
import gen.SpectraParser;

public class SpectraEvaluator extends SpectraBaseVisitor<Object> {

    // Store variables and their values
    private final Map<String, Object> variables = new HashMap<>();
    private boolean breakFlag = false;      // To handle 'cut' (break)
    private boolean continueFlag = false;


    @Override
    public Object visitProgram(SpectraParser.ProgramContext ctx) {
        for (SpectraParser.StatementContext statement : ctx.statement()) {
            visit(statement);
        }
        return null; // No return value for a program
    }

    @Override
    public Object visitDeclaration(SpectraParser.DeclarationContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        Object value = null;

        if (ctx.expression() != null) {
            value = visit(ctx.expression());
        } else if (ctx.ternary() != null) {
            value = visit(ctx.ternary());
        }

        variables.put(varName, value);
        return value;
    }

//    @Override
//    public Object visitAssignment(SpectraParser.AssignmentContext ctx) {
//        String varName = ctx.IDENTIFIER().getText();
//        Object value = visit(ctx.expression());
//        variables.put(varName, value);
//        return value;
//    }
@Override
public Object visitAssignment(SpectraParser.AssignmentContext ctx) {
    String varName = ctx.IDENTIFIER().getText();
    Object value = null;

    // Check and evaluate the possible assignment value
    if (ctx.expression() != null) {
        value = visit(ctx.expression());
    } else if (ctx.ternary() != null) {
        value = visit(ctx.ternary());
    } else if (ctx.expression() != null) {
        value = visit(ctx.expression());
    }

    // Store the evaluated value in the variables map
    variables.put(varName, value);
    return value;
}


    @Override
    public Object visitPrintStatement(SpectraParser.PrintStatementContext ctx) {
        Object value = visit(ctx.expression());
if(value.equals(true)){
    value="white";

}
        if(value.equals(false)){
            value="black";

        }

        if (ctx.SPECTRUM_DISPLAY() != null) {
            System.out.print(value);
        } else if (ctx.SPECTRUM_DISPLAYLN() != null) {
            System.out.println(value);
        }
        return value;
    }

    @Override
    public Object visitTernary(SpectraParser.TernaryContext ctx) {
        boolean condition = (boolean) visit(ctx.condition());
        if (condition) {
            return visit(ctx.expression(0));
        } else {
            return visit(ctx.expression(1));
        }
    }

    @Override
    public Object visitIfStatement(SpectraParser.IfStatementContext ctx) {
        if ((boolean) visit(ctx.condition(0))) {
            visit(ctx.statementBlock(0));
        } else {
            for (int i = 1; i < ctx.condition().size(); i++) {
                if ((boolean) visit(ctx.condition(i))) {
                    visit(ctx.statementBlock(i));
                    return null;
                }
            }
            if (ctx.OPAQUE_ELSE() != null) {
                visit(ctx.statementBlock(ctx.statementBlock().size() - 1));
            }
        }
        return null;
    }

//    @Override
//    public Object visitWhileLoop(SpectraParser.WhileLoopContext ctx) {
//        while ((boolean) visit(ctx.condition())) {
//            visit(ctx.statementBlock());
//        }
//        return null;
//    }
//
//    @Override
//    public Object visitForLoop(SpectraParser.ForLoopContext ctx) {
//        visit(ctx.assignment(0)); // Initialization
//        while ((boolean) visit(ctx.condition())) {
//            visit(ctx.statementBlock());
//            visit(ctx.assignment(1)); // Increment
//
//
//        }
//        return null;
//    }


    @Override
    public Object visitBreakStatement(SpectraParser.BreakStatementContext ctx) {
        // Set the break flag to true when a 'break' statement is encountered
        breakFlag = true;
        return null; // No need to return anything
    }

    @Override
    public Object visitContinueStatement(SpectraParser.ContinueStatementContext ctx) {
        // Set the continue flag to true when a 'continue' statement is encountered
        continueFlag = true;
        return null; // No need to return anything
    }

    @Override
    public Object visitWhileLoop(SpectraParser.WhileLoopContext ctx) {
        while ((boolean) visit(ctx.condition())) {
            if (breakFlag) {
                break; // Exit the loop if breakFlag is set
            }
            if (continueFlag) {
                continue; // Skip the rest of the loop and go to the next iteration
            }
            visit(ctx.statementBlock());
        }

        // Reset flags after loop execution
        breakFlag = false;
        continueFlag = false;
        return null;
    }

    @Override
    public Object visitForLoop(SpectraParser.ForLoopContext ctx) {
        // Initialization
        visit(ctx.assignment(0));

        while ((boolean) visit(ctx.condition())) {
            if (breakFlag) {
                break; // Exit the loop if breakFlag is set
            }
            if (continueFlag) {
                continue; // Skip the rest of the loop and go to the next iteration
            }
            visit(ctx.statementBlock());
            visit(ctx.assignment(1)); // Increment
        }

        // Reset flags after loop execution
        breakFlag = false;
        continueFlag = false;
        return null;
    }

    @Override
    public Object visitExpression(SpectraParser.ExpressionContext ctx) {
        if (ctx.additionExpression() != null) {
            return visit(ctx.additionExpression());
        } else if (ctx.logicalExpression() != null) {
            return visit(ctx.logicalExpression());
        }
        throw new IllegalArgumentException("Invalid expression structure.");
    }

    @Override
    public Object visitAdditionExpression(SpectraParser.AdditionExpressionContext ctx) {
        if (ctx.additionExpression() != null) {
            Object left = visit(ctx.additionExpression());
            Object right = visit(ctx.multiplicationExpression());

            if (!(left instanceof Double) || !(right instanceof Double)) {
                throw new IllegalArgumentException("Addition and subtraction require numeric values.");
            }

            double leftVal = (double) left;
            double rightVal = (double) right;

            if (ctx.ADD_COLOR() != null) {
                return leftVal + rightVal;
            } else if (ctx.SUBTRACT_COLOR() != null) {
                return leftVal - rightVal;
            }
        }
        return visit(ctx.multiplicationExpression());
    }

    @Override
    public Object visitMultiplicationExpression(SpectraParser.MultiplicationExpressionContext ctx) {
        if (ctx.multiplicationExpression() != null) {
            Object left = visit(ctx.multiplicationExpression());
            Object right = visit(ctx.primaryExpression());

            if (!(left instanceof Double) || !(right instanceof Double)) {
                throw new IllegalArgumentException("Multiplication, division, and modulo require numeric values.");
            }

            double leftVal = (double) left;
            double rightVal = (double) right;

            if (ctx.MULTIPLY_COLOR() != null) {
                return leftVal * rightVal;
            } else if (ctx.DIVIDE_COLOR() != null) {
                if (rightVal == 0) {
                    throw new ArithmeticException("Division by zero.");
                }
                return leftVal / rightVal;
            } else if (ctx.MODULO_COLOR() != null) {
                return leftVal % rightVal;
            }
        }
        return visit(ctx.primaryExpression());
    }

    @Override
    public Object visitLogicalExpression(SpectraParser.LogicalExpressionContext ctx) {
        if (ctx.logicalExpression() != null) {
            Object left = visit(ctx.logicalExpression());
            Object right = visit(ctx.primaryExpression());

            if (ctx.CYAN_AND() != null) {
                return (boolean) left && (boolean) right;
            } else if (ctx.MAGENTA_OR() != null) {
                return (boolean) left || (boolean) right;
            } else if (ctx.LIGHT_LESS_THAN() != null) {
                return compareValues(left, right) < 0;
            } else if (ctx.LIGHT_LESS_EQUAL() != null) {
                return compareValues(left, right) <= 0;
            } else if (ctx.DARK_GREATER_THAN() != null) {
                return compareValues(left, right) > 0;
            } else if (ctx.DARK_GREATER_EQUAL() != null) {
                return compareValues(left, right) >= 0;
            } else if (ctx.BRIGHTDARK_EQUAL() != null) {
                return left.equals(right);
            } else if (ctx.BRIGHTDARK_NOTEQUAL() != null) {
                return !left.equals(right);
            }
        } else if (ctx.GREY_NOT() != null) {
            return !(boolean) visit(ctx.primaryExpression());
        }
        return visit(ctx.primaryExpression());
    }

    @Override
    public Object visitPrimaryExpression(SpectraParser.PrimaryExpressionContext ctx) {
        if (ctx.expression() != null) {
            return visit(ctx.expression());
        } else if (ctx.NUMBER() != null) {
            return Double.parseDouble(ctx.NUMBER().getText());
        } else if (ctx.STRING() != null) {
            return ctx.STRING().getText().replace("\"", "");
        } else if (ctx.BOOLEAN() != null) {
            return ctx.BOOLEAN().getText().equals("white"); // "white" is true, "black" is false
        } else if (ctx.IDENTIFIER() != null) {
            String varName = ctx.IDENTIFIER().getText();
            if (!variables.containsKey(varName)) {
                throw new IllegalArgumentException("Undefined variable: " + varName);
            }
            return variables.get(varName);
        }
        throw new IllegalArgumentException("Invalid primary expression structure.");
    }
    @SuppressWarnings("unchecked")
    private int compareValues(Object left, Object right) {
        if (!(left instanceof Comparable) || !(right instanceof Comparable)) {
            throw new IllegalArgumentException("Comparison requires comparable values.");
        }
        return ((Comparable<Object>) left).compareTo(right);
    }


    @Override
    public Object visitCondition(SpectraParser.ConditionContext ctx) {
        // Handle the GREY_NOT condition (negation)
        if (ctx.GREY_NOT() != null) {
            boolean value = (boolean) visit(ctx.condition(0));
            return !value;
        }

        // Handle logical AND (CYAN_AND) and logical OR (MAGENTA_OR)
        if (ctx.CYAN_AND() != null || ctx.MAGENTA_OR() != null) {
            boolean left = (boolean) visit(ctx.condition(0));
            boolean right = (boolean) visit(ctx.condition(1));
            if (ctx.CYAN_AND() != null) {
                return left && right;
            } else {
                return left || right;
            }
        }

        // Handle parenthesized condition
        if (ctx.getChildCount() == 3 && ctx.getChild(0).getText().equals("(")) {
            return visit(ctx.condition(0));
        }

        // Handle comparison operations
        if (ctx.expression().size() == 2) {
            Object left = visit(ctx.expression(0));
            Object right = visit(ctx.expression(1));

            if (!(left instanceof Comparable) || !(right instanceof Comparable)) {
                throw new IllegalArgumentException("Invalid comparison between non-comparable values.");
            }

            @SuppressWarnings("unchecked")
            Comparable<Object> leftComp = (Comparable<Object>) left;

            if (ctx.LIGHT_LESS_THAN() != null) {
                return leftComp.compareTo(right) < 0;
            }
            if (ctx.LIGHT_LESS_EQUAL() != null) {
                return leftComp.compareTo(right) <= 0;
            }
            if (ctx.DARK_GREATER_THAN() != null) {
                return leftComp.compareTo(right) > 0;
            }
            if (ctx.DARK_GREATER_EQUAL() != null) {
                return leftComp.compareTo(right) >= 0;
            }
            if (ctx.BRIGHTDARK_EQUAL() != null) {
                return left.equals(right);
            }
            if (ctx.BRIGHTDARK_NOTEQUAL() != null) {
                return !left.equals(right);
            }
        }

        // Handle Boolean literals
        if (ctx.BOOLEAN() != null) {
            return ctx.BOOLEAN().getText().equals("white"); // "white" is true, "black" is false
        }

        // Default: should not reach here if grammar is correct
        throw new IllegalArgumentException("Invalid condition structure.");
    }

}
