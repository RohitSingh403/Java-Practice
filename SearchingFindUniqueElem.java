import java.util.*;
public class SearchingFindUniqueElem {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = uniqueElement(arr);
        System.out.println("Unique Element is " + ans);
    }
    public static int uniqueElement(int[] arr) {
        int n = arr.length;
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }
        int low = 2;
        int high = n - 3;
        while (low <= high) {
            int mid = low + high / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            if (arr[mid] == arr[mid - 1]) {
                mid--;
            }
            if (mid % 2 == 0) {
                low = mid + 2;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
