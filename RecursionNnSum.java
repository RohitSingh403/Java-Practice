import java.util.*;

public class RecursionNnSum {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the N ");
        int n = scn.nextInt();
        int ans = nNSum(n);
        System.out.println("Sum of N natural number is " + ans);
    }
    public static int nNSum(int n) {
        if (n == 1) {
            return 1;
        }
        int temp = nNSum(n - 1);
        return temp + n;
    }
}
