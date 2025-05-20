import java.util.*;

public class StackRemoveAdjDupl {
    public static void main(String agrs[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = scn.nextLine();
        System.out.println("Remove Adjacent Duplicate is : " + removeAdjDuplicate(st));
    }
    public static String removeAdjDuplicate(String st) {
        Stack <Character> s = new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            if (s.size() == 0 || s.peek() != st.charAt(i)) {
                s.push(st.charAt(i));
            } else {
                s.pop();
            }
        }
        int size = s.size();
        char[] chArr = new char[size];
        for (int i = size - 1; i >= 0; i--) {
            chArr[i] = s.pop();
        }
        return String.valueOf(chArr);
    }
}
