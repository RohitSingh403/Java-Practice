import java.util.*;
public class BitManipulation {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scn.nextInt();
        CheckE_O(n);
    }
    public static void CheckE_O(int n){
        if((n&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
