import java.util.*;

public class RecursionP_SetGCDtwoNumber {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = scn.nextInt();
        System.out.println("Enter Second Number");
        int b = scn.nextInt();
        int ans = GCDtwoNum(a, b);
        System.out.println("GCD is " + ans);
    }
    public static int GCDtwoNum(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCDtwoNum(b, a % b);
    }
}
