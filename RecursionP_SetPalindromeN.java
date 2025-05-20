import java.util.*;

public class RecursionP_SetPalindromeN {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = scn.nextInt();
        System.out.println("Enter the starting point");
        int sp = scn.nextInt();
        System.out.println("Enter the ending point");
        int ep = scn.nextInt();
        boolean result = palindromeN(n, sp, ep);
        System.out.println(result);
    }
    public static boolean palindromeN(int n, int sp, int ep) {
        if (sp == ep) {
            return true;
        }
        if (sp > ep) {
            return true;
        }
        if (sp != ep) {
            return false;
        } else {
            boolean ans = palindromeN(n, sp + 1, ep - 1);
            return ans;
        }
    }
}
