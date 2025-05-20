import java.util.*;

public class FibonacciLoop {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scn.nextInt();
        fibonacciN(n);
    }
    public static void fibonacciN(int n) {
        int a = 0;
        int b = 1;
        int ans = 0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 2; i <= n; i++) {
            ans = a + b;
            System.out.print(ans + " ");
            a = b;
            b = ans;
        }
    }
}
