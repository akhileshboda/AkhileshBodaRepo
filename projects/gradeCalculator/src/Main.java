public class Main
{
    public static void main(String[] args)
    {
        // Title Screen
        System.out.println(" -- GRADE CALCULATOR PROGRAM -- \n");

        int programError = new Calculator().runCalculator();

        // Print error message if runCalculator function was not successfully called
        if (programError != 1)
            System.out.println("An error occurred in attempting to run the program");

    }
}