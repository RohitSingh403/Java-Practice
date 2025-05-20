import java.util.*;

public class RecursionP_SetSumNnNumber {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = scn.nextInt();
        int ans = SumNnNumber(n);
        System.out.println("Sum of N Natural Number is " + ans);
    }
    public static int SumNnNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = SumNnNumber(n - 1) + n;
        return sum;
    }
}
