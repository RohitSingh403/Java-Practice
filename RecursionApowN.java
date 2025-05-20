import java.util.*;

public class RecursionApowN {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the A");
        int a = scn.nextInt();
        System.out.println("Enter the N");
        int n = scn.nextInt();
        int ans = ApowN(a, n);
        System.out.println("A to the power N " + ans);
    }
    public static int ApowN(int a, int n) {
        if (n == 1) {
            return a;
        }
        int temp = ApowN(a, n - 1);
        return temp * a;
    }
}
