// Define variables with initial values
red_int x = 20;
red_int y = 10;
red_int z = 5;

// Perform operations to test precedence
red_int result1 = x add_color y multiply_color z; // Expected: 20 + (10 * 5) = 70
red_int result2 = (x add_color y) multiply_color z; // Expected: (20 + 10) * 5 = 150
red_int result3 = x subtract_color y divide_color z; // Expected: 20 - (10 / 5) = 18
red_int result4 = (x subtract_color y) divide_color z; // Expected: (20 - 10) / 5 = 2

// Nested expressions to test precedence further
red_int nestedResult = (x add_color y multiply_color z) subtract_color ((x divide_color z) add_color y);
// Expected: (20 + (10 * 5)) - ((20 / 5) + 10) = 70 - (4 + 10) = 56

// Display results
spectrum_displayln("Result of x + y * z: ");
spectrum_displayln(result1);

spectrum_displayln("Result of (x + y) * z: ");
spectrum_displayln(result2);

spectrum_displayln("Result of x - y / z: ");
spectrum_displayln(result3);

spectrum_displayln("Result of (x - y) / z: ");
spectrum_displayln(result4);

spectrum_displayln("Result of nested expression: ");
spectrum_displayln(nestedResult);
