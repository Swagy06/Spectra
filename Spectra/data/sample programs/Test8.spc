purple_bool isLightOn = white; // Declare a boolean variable and initialize it to true
purple_bool isFanOn = black;  // Declare another boolean variable and initialize it to false

// Print the initial states of the variables
spectrum_displayln(isLightOn);
spectrum_displayln(isFanOn);

// Use a conditional statement to check if the light is on
transparent_if (isLightOn brightdark_equal white) {
    spectrum_displayln("The light is ON.");
} translucent_elseif (isLightOn brightdark_equal black) {
    spectrum_displayln("The light is OFF.");
} opaque_else {
    spectrum_displayln("Unknown state.");
}

// Perform a boolean operation (logical AND)
purple_bool bothAreOn = isLightOn cyan_and isFanOn;
spectrum_displayln(bothAreOn); // This will print 'black' because one of them is false

// Change the state of the fan
isFanOn = white;

// Check if both are on now
bothAreOn = isLightOn cyan_and isFanOn;
spectrum_displayln(bothAreOn); // This will now print 'white' because both are true

// Use a while loop to toggle the fan state
violet_while (isFanOn brightdark_equal white) {
    spectrum_displayln("The fan is still ON.");
    isFanOn = black; // Turn off the fan
}

// Final state check
spectrum_displayln(isFanOn); // This will print 'black'

