package javahomeworkweek8;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class P2MinAndMaxInputChallenge {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console

        Scanner scan = new Scanner(System.in);
        int num1, num2 , max,min;
        System.out.println("Enter a number : ");
        num1 = scan.nextInt();
        System.out.println("Enter another number : ");
        num2 = scan.nextInt();
        max = Math.max(num1,num2);
        min = Math.min(num1,num2);
        // using endless while loop
        while (num2 != 0){
            System.out.println("Enter a number or 0 to stop: ");
            num2 = scan.nextInt();
            if (num2 != 0){
                max = Math.max(max , num2);
                min = Math.min(min , num2);
            }

        }
        System.out.println("Largest is : " + max);
        System.out.println("Smallest is :"   + min);
        // Closing the scanner object
        scan.close();
    }
}

