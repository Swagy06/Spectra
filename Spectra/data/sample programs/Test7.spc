red_int i= 1 ;
blue_for (i= 1 ; i light_less_equal 10; i = i add_color 1;) {
    transparent_if (i brightdark_equal 5) {
        break_color; // Exit the loop when i equals 5
    }
    spectrum_display(i);
    spectrum_display(" ");
}
