import java.util.*;

public class HS_DistinctElements {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = distinctElement(arr);
        System.out.println("The Distinct Elements is " + ans);
    }
    public static int distinctElement(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        return hs.size();
    }
}
