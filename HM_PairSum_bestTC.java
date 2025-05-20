import java.util.*;

public class HM_PairSum_bestTC {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter K");
        int k = scn.nextInt();
        System.out.println("Enter the array size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 1; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        boolean ans = PairSum(arr, k);
        System.out.println("Pair Sum is " + ans);
    }
    public static boolean PairSum(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], temp + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = k - a;
            if (hm.containsKey(b) == true && a != b) {
                return true;
            } else if (a == b && hm.get(b) >= 2) {
                return true;
            }
        }
        return false;
    }
}
