// Define the number of rows for the pattern
red_int rows = 5;

// Star pattern using while loop
spectrum_displayln("Left-aligned Triangle:");
red_int i = 1;
red_int j = 1;

violet_while (i light_less_equal rows) {
    // Print stars for the current row
    j = 1;
    violet_while (j light_less_equal i) {
        spectrum_display("*");
        j = j add_color 1;
    }

    spectrum_displayln(""); // Move to the next line after printing stars for the current row
    i = i add_color 1;
}
