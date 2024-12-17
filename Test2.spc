red_int score = 85;

transparent_if (score dark_greater_equal 90) {
    spectrum_displayln("Grade: A");
} translucent_elseif (score dark_greater_equal 80) {
    spectrum_displayln("Grade: B");
} translucent_elseif (score dark_greater_equal 70) {
    spectrum_displayln("Grade: C");
} opaque_else {
    spectrum_displayln("Grade: F");
}
