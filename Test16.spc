// Define the number of terms for the Fibonacci sequence
red_int n = 10; // Example: Generate the first 10 terms

// Initialize the first two terms of the Fibonacci sequence
red_int a = 0; // First term
red_int b = 1; // Second term

// Print the initial terms
spectrum_displayln("Fibonacci Sequence:");
spectrum_displayln(a);
spectrum_displayln(b);

// Loop to generate the remaining terms
red_int i = 3; // Start from the third term
red_int nextTerm = 0;

violet_while (i light_less_equal n) {
    nextTerm = a add_color b; // Calculate the next term
    spectrum_displayln(nextTerm); // Print the next term
    a = b; // Update `a` to the previous `b`
    b = nextTerm; // Update `b` to the newly calculated term
    i = i add_color 1; // Increment the counter
}