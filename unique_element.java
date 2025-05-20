import java.util.*;

public class unique_element {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int result = uniqueElement(arr);
        System.out.println("Unique Element = " + result);
    }
    public static int uniqueElement(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
