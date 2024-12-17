// Define the number of rows for the pyramid
red_int rows = 5;

// Print the pyramid pattern
spectrum_displayln("Pyramid Pattern:");
red_int i = 1;
red_int spaces = 0;
red_int stars = 0;

// Outer loop for each row
violet_while (i light_less_equal rows) {
    // Calculate and print spaces for the current row
    spaces = rows subtract_color i;
    red_int j = 1;
    violet_while (j light_less_equal spaces) {
        spectrum_display(" ");
        j = j add_color 1;
    }

    // Calculate and print stars for the current row
    stars = i multiply_color 2 subtract_color 1;
    red_int k = 1;
    violet_while (k light_less_equal stars) {
        spectrum_display("*");
        k = k add_color 1;
    }

    // Move to the next line after printing spaces and stars
    spectrum_displayln("");
    i = i add_color 1;
}
