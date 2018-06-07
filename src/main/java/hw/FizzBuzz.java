package hw;

public class FizzBuzz {


    public static String[] fizzBuzz(int n) {



            String[] fizzBuzzArray = new String[n];
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzBuzzArray[i] = "FizzBuzz";
                }
                else if (i % 3 == 0) {
                    fizzBuzzArray[i] = "Fizz";

                }
                else if (i % 5 == 0) {
                    fizzBuzzArray[i] = "Buzz";

                }
                else
                    fizzBuzzArray[i] = String.valueOf(i);


            }
            return fizzBuzzArray;
        }



   }
