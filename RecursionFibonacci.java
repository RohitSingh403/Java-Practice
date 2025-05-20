import java.util.*;

public class RecursionFibonacci {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = scn.nextInt();
        int ans = fibonacciN(n);
        System.out.println("Fibonacci series sum till n is " + ans);
    }
    public static int fibonacciN(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int temp1 = fibonacciN(n - 1);
        int temp2 = fibonacciN(n - 2);
        return temp1 + temp2;
    }
}
