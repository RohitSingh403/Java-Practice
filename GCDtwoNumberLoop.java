import java.util.*;

public class GCDtwoNumberLoop {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = scn.nextInt();
        System.out.println("Enter the second Number");
        int b = scn.nextInt();
        int ans = gcdNum(a, b);
        System.out.println(" GCD = " + ans);
    }

    public static int gcdNum(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
