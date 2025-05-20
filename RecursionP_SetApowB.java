import java.util.*;

public class RecursionP_SetApowB {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = scn.nextInt();
        System.out.println("Enter the power");
        int b = scn.nextInt();
        int ans = ApowB(a, b);
        System.out.println("A to the power " + ans);
    }
    public static int ApowB(int a, int b) {
        if (b == 1) {
            return a;
        }
        int temp = ApowB(a, b - 1);
        return temp * a;
    }
}
