package javahomeworkweek8;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 *  alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 *  Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */
public class P3FindVowelOrNot {
    //method creation

    //entering a char by using nested if else
    void findVowelOrNot(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Entered character " + ch + " is Vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Entered character " + ch + "is Consonent");
        } else {
            System.out.println("Not an alphabet");

        }
    }
    //main method
    public static void main(String[] args) {
        //calling instance method by creating an object
        P3FindVowelOrNot c = new P3FindVowelOrNot();
        //Scanner using for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character :");
        char in = scanner.next().charAt(0);
        c.findVowelOrNot(in);
        //closing Scanner
        scanner.close();
    }


    }