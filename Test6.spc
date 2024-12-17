purple_bool isRaining = white;
purple_bool hasUmbrella = black;

transparent_if (isRaining brightdark_equal white cyan_and hasUmbrella brightdark_equal black) {
    spectrum_displayln("Stay indoors!");
} opaque_else {
    spectrum_displayln("You can go outside.");
}
