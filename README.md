LANGUAGE DESCRIPTION:

● Spectra is a programming language that will involve features similar to other imperative programming languages.

● The language development follows a pipeline from lexical analysis and parsing to the execution of code through a runtime environment.

● The programming language will be based on Java.

● The language will be designed to be cross-platform that can be used on: Windows and macOS.

LANGUAGE FEATURES:

Boolean Operators: and, or, not for logical operations on boolean values.
Numeric and String Datatypes: Support for assigning numeric values (int, float) and strings to variables.
Arithmetic Operators: Basic arithmetic operations such as + (addition), - (subtraction), (multiplication), / (division), % (Modulo).
Relational Operators: Includes relational comparisons such as <, <=, >, >=, == (equals), and != (not equals).
Conditional Statements: Standard if, else and elseif statements for conditional branching.
Loops: Traditional for and while loops for iteration.
Ternary Operator: Compact conditional expressions using condition ? expr1 : expr2.
Print : Simple print function to display output for variables and expressions (print and print in new line).
Break and Continue
SYSTEM SUPPORT:

Operating Systems: Cross-platform with support for Windows and macOS.

TOOLS AND TECHNOLOGIES:

ANTLR4 (Another Tool for Language Recognition):
• For lexical analysis

• To tokenize the source code into meaningful symbols, which will be consumed by the Prolog-based parser.

• Parse Tree Construction: ANTLR 4 generates a parse tree directly from the grammar, simplifying syntax analysis and enabling further semantic processing for Spectra.

EBNF for ANTLR4:
• The grammar for Spectra is defined using Extended Backus-Naur Form (EBNF) and implemented using ANTLR 4, which provides powerful parsing capabilities for context-free grammars with flexible lookahead and backtracking mechanisms.

• Parse Tree Construction: ANTLR 4 generates a parse tree directly from the grammar, simplifying syntax analysis and enabling further semantic processing for Spectra.

Java:
• The runtime environment (virtual machine) is implemented in Java.

• The JVM(JAVA VIRTUAL MACHINE) ensures that Spectra’s compiled code can be executed across platforms like Windows and macOS.

BUILD AND RUN INSTRUCTIONS

Prerequisites:

Ensure that the ANTLR JAR file (antlr-4.13.2-complete.jar) is downloaded and its path is set.
Recommended aliases for convenience:
alias antlr4="java -jar /path/to/ANTLR/jar/file/antlr-4.13.2-complete.jar"
alias grun="java org.antlr.v4.gui.TestRig"
Commands to generate, compile, and run the Spectra program:

Important Note: The github directory has all the files including the ANTLR generated files, the build files generated post javac compilation. You can begin directly from Step 3 and rebuild the java files already present in github or zipfile as the files have been updated to reflect the correct packages which are not present natively in antlr generated files OR skip directly to step 4 as the build .class files have also been uploaded to github and in the zip file in the required directories.

Navigate to the parent project folder folder:
Move to the folder containing the grammar file and source code:

cd path/to/parent/folder
Generate lexer, parser, and relevant ANTLR files:

java -jar "/path/to/ANTLR/jar/file/antlr-4.13.2-complete.jar" -Dlanguage=Java -visitor -o src/gen src/Spectra.g4
Compile all Java files:

javac -d src/build -cp "/path/to/ANTLR/jar/file/antlr-4.13.2-complete.jar" src/gen/*.java src/runtime/*.java
Run the Spectra program:

java -cp "src/build:/path/to/ANTLR/jar/file/antlr-4.13.2-complete.jar" runtime.SpectraMain "path/to/your/file.spc"
Optional: Tokenization and Parse Tree Generation

To debug or analyze input files, you can generate tokens or parse trees using grun:

Generate tokens:

grun Spectra program -tokens path/to/your/file.spc
Generate a raw parse tree:

grun Spectra program -tree path/to/your/file.spc
Generate a GUI parse tree:

grun Spectra program -gui path/to/your/file.spc
Note:

To create a new Spectra program file:

Open a new file using a text editor:
nano NewProgramName.spc
Write the program code, save the file, and follow the steps above for running the program.
Make sure to replace all placeholder paths (e.g., path/to/ANTLR/jar/file and path/to/your/file.spc) with actual paths on your system.

GitHub Link : https://github.com/Swagy06/Spectra

YouTube Link : https://www.youtube.com/watch?v=d_6i0Zr4PZc
