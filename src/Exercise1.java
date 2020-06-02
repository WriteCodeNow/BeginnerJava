/*
Exercise 1: Compute the average of five numbers.
The inputs should be 5 integers.
The output should be one double, the average of the first five.
 */

import java.util.Scanner; // Get access to the scanner for user input

public class Exercise1
{
    public static void main(String[] args)
    {
        System.out.println("Enter 5 Numbers");

        // Use a scanner to get 5 ints from the user.
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        // Compute the total.
        int total = num1 + num2 + num3 + num4 + num5;

        // Compute the average.
        // By typing "5.0" instead of "5" java will convert
        // the answer to a double. We do this so that we don't
        // lose the numbers after the decimal place in our average.
        var average = total / 5.0;

        // Show the results.
        System.out.println("The average is: ");
        System.out.print(average);
    }
}
