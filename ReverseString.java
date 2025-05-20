import java.util.*;
public class ReverseString {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = scn.nextLine();
        String ans = reverseString(st);
        System.out.println("Reverse String is " +  ans);
    }
    public static String reverseString(String st) {
        char[] arr = st.toCharArray();
        int sp = 0;
        int ep = arr.length-1;
        while (sp < ep) {
            char temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
        return "".valueOf(arr);
    }
}
