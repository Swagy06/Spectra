package runtime;

import gen.SpectraLexer;
import gen.SpectraParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import gen.SpectraBaseVisitor;
import gen.SpectraParser;

public class SpectraMain {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java -cp <classpath> org.example.SpectraMain <file.spc>");
            System.exit(1);
        }

        try {
            SpectraLexer lexer = new SpectraLexer(CharStreams.fromFileName(args[0]));
            SpectraParser parser = new SpectraParser(new CommonTokenStream(lexer));
            SpectraEvaluator evaluator = new SpectraEvaluator();
            evaluator.visit(parser.program());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
