package javahomeworkweek8;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class P10ArmstrongNumberOrNot {
    //creating return type method for return value
    public static boolean is_Amstrong(int n){
        int remainder, sum = 0 , temp = 0;
        temp = n;
        //return value by using while loop
        while ( n > 0){
            remainder = n % 10;
            sum = sum + (remainder * remainder * remainder);
            n = n / 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        //Scanner using for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer : ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        System.out.println("Is Armstrong number? " + is_Amstrong(number));
        //Closing the Scanner

    }



}
