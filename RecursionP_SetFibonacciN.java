import java.util.*;

public class RecursionP_SetFibonacciN {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = scn.nextInt();
        int ans = fiboancciN(n);
        System.out.println("Factorial of N is " + ans);
    }

    public static int fiboancciN(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int temp1 = fiboancciN(n - 1);
        int temp2 = fiboancciN(n - 2);
        return temp1 + temp2;
    }
}
