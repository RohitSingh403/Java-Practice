import java.util.*;

public class RecursionIsPalindrome {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String of character");
        String st = scn.nextLine();
        char[] ch = st.toCharArray();
        System.out.println("Enter the starting index");
        int sp = scn.nextInt();
        System.out.println("Enter the Ending index");
        int ep = scn.nextInt();
        boolean ans = isPalindrome(ch, sp, ep);
        System.out.println(ans);
    }

    public static boolean isPalindrome(char[] ch, int sp, int ep) {
        if (sp == ep) {// if both are equal
            return true;
        }
        if (sp > ep) {// if the sp cross the ep or both are same
            return true;
        }
        if (ch[sp] != ch[ep]) {
            return false;
        } else {
            boolean temp = isPalindrome(ch, sp + 1, ep - 1);
            return temp;
        }
    }
}
