package javahomeworkweek8;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class P9FibonacciNumber {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3,i,count = 10;
        //printing 0 and 1
        System.out.println(n1 +" " + n2);
        //loop start from 2
        for (i=2;i<count;i++){
            n3 = n1 + n2;
            System.out.println(" " +n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
