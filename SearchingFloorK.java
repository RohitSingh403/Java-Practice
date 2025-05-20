import java.util.*;
public class SearchingFloorK {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = scn.nextInt();
        System.out.println("Enter the elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the k");
        int k = scn.nextInt();
        int ans = floorK(arr, k);
        System.out.println("The Floor is " + ans);
    }
    public static int floorK(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int floor = Integer.MIN_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return k;
            } else if (arr[mid] < k) {
                floor = arr[mid];
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return floor;
        }
    }
