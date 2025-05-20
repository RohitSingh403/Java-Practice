import java.util.*;

public class RecursionP_SetFactorialN {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = scn.nextInt();
        int ans = factorialN(n);
        System.out.println("Factorial using recursion = " + ans);
    }

    public static int factorialN(int n) {
        if (n == 1) {
            return 1;
        }
        int fact = factorialN(n - 1) * n;
        return fact;
    }
}
