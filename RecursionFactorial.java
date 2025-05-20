import java.util.*;

public class RecursionFactorial {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = scn.nextInt();
        int ans = factorialN(n);
        System.out.println("Factorial of N is " + ans);
    }
    public static int factorialN(int n) {
        if (n == 1) {
            return 1;
        }
        int temp = factorialN(n - 1) * n;
        return temp;
    }
}
