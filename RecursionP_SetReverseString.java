import java.util.*;

public class RecursionP_SetReverseString {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scn.nextLine();
        String reveString = reverseString(str);
        System.out.println("Reverse String is " + "'" + reveString + "'");
    }
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
