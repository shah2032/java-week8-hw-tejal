package javahomeworkweek8;

import java.util.Scanner;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 */
public class P11EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        //declare variables
        int lastDigit;
        int sum;
        //loop to repeat the process
        for (sum = 0; number != 0; number /= 10) {
            lastDigit = number % 10;

            if (lastDigit % 2 == 0)
                sum += lastDigit;
            }
            return sum;
        }


    public static void main(String[] args) {
        //declare variables
        int number = 0;
        int sumOfEvenDigits = 0;
        //create Scanner class object
        //for reading the values
        Scanner scan = new Scanner(System.in);
        //read inputs
        System.out.println("Enter an integer number : ");
        number = scan.nextInt();
        //find sum of digits of number
        sumOfEvenDigits = getEvenDigitSum(number);
        //display result
        System.out.println("The sum fo even digit of " + "the number " + number + " = " + sumOfEvenDigits);
        //close Scanner class object
        scan.close();
    }
}
