package hw;

import static hw.FizzBuzz.fizzBuzz;

public class Main {

    //private static String[] MyfizzBuzzArray;

    public static void main(final String[] args) {
        int max = 0;
        if (args.length > 0) {
            try {
                max = Integer.parseInt(args[0]);

                //String[] fizzBuzzArray;
                //fizzBuzzArray = fizzBuzz(max);


            } catch (NumberFormatException e) {
                System.err.println("The argument entered must be an integer ");
                //In our case, you can useSystem.out.println.
                System.exit(1);

            }
            String[] MyfizzBuzzArray = fizzBuzz(max);
            fizzBuzz(max);
            //System.out.println(fizzBuzz);


            // /* Since you are trapping the error, you can exit with a 0 instead of* 1.
            // By convention, a 0 means a normal exit (no error), and a non-* zero value means some type of error.
            // But it still ends the program * and returns to the OS.
            // So it’s more of a status message to you.*/

        }

    }


}    //TODO insert your fizzbuzz logic in here

