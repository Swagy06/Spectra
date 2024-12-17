red_int counter = 1;

violet_while (counter light_less_equal 5) {
    spectrum_display(counter); // Print the counter value without a newline
    spectrum_display(" "); // Add a space between values
    counter = counter add_color 1; // Increment the counter
}
