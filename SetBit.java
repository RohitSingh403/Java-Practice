import java.util.*;

public class SetBit {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scn.nextInt();
        System.out.println("Enter the k ");
        int k = scn.nextInt();
        setBit(n, k);
    }
    public static void setBit(int n, int k) {
        int ans = n | (1 << k);
        System.out.println("Bit Set k is " + ans);
    }
}
