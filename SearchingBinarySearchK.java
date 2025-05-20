import java.util.*;
public class SearchingBinarySearchK {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the K ");
        int k = scn.nextInt();
        boolean ans = searchK(arr, k);
        System.out.println(ans);
    }
    public static boolean searchK(int[] arr, int k) {
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = low + high / 2;
            if (arr[mid] == k) {
                return true;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
