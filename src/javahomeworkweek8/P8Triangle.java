package javahomeworkweek8;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class P8Triangle {
     public static void main(String[] args) {
          //Scanner using for reading input from console
          Scanner input = new Scanner(System.in);
          int numAsterisk;
          System.out.print("Number of asterisk : ");
          numAsterisk = input.nextInt();

          while (numAsterisk < 1 && numAsterisk > 20){
               System.out.println("Enter a valid number ");
               numAsterisk = input.nextInt();
          }
          //right angle triangle using nested for loops
          for (int i = 1; i <= numAsterisk; i++){
               for (int j = 1; j<=i; j++){
                    System.out.print("@");
               }
               System.out.println();
               //closing Scanner
               input.close();
          }
     }



}
