import java.util.*;

public class SortingRemovalOrder {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scn.nextInt();
        System.out.println("Enter the Elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int result = removalOrder(arr);
        System.out.println("Order of removal is " + result);
    }
    public static int removalOrder(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans = ans + (arr[i] * (n - i));
        }
        return ans;
    }
}
