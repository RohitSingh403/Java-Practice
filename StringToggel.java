import java.util.*;
public class StringToggel {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = scn.nextLine();
        System.out.println("Yout String is " + st);
        char[] ch = st.toCharArray();
        
        toggel(ch);
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
    public static void toggel(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            } else {
                ch[i] = (char) (ch[i] - 32);
            }
        }
    }
}