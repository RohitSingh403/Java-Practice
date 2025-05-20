import java.util.*;
public class StackValidParentheses {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Parentheses ");
        String st = scn.nextLine();
        boolean ans = validParentheses(st);
        System.out.println("The Valid Parentheses is " + ans);
    }
    public static boolean validParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (st.size() == 0 || s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (s.charAt(i) == ')') {
                    if (st.peek() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (st.peek() == '[') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else {
                    if (st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (st.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
