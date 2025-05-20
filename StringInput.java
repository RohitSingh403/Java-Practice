import java.util.*;
public class StringInput {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = scn.nextLine();
        System.out.println(st);
        System.out.println("Enter the character");
        char ch = scn.nextLine().charAt(0);
        System.out.println(ch);
        
    }
}
