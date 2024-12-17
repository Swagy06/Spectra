// Define the number for which we want the factorial
red_int number = 5; // Example input number

// Initialize the factorial result to 1
red_int factorial = 1;

// Loop to calculate factorial (factorial = factorial * i for i = 1 to number)
red_int i = 1;
blue_for (i = 1; i light_less_equal number; i = i add_color 1;) {
    factorial = factorial multiply_color i;
}

// Display the result of the factorial
spectrum_display("Factorial of ");
spectrum_display(number);
spectrum_display(" is: ");
spectrum_display(factorial);
