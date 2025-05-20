import java.util.*;

public class HM_firstNonRepeat {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = FirstNonRepeating(arr);
        System.out.println("The First Non Repeating Number is " + ans);
    }
    public static int FirstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], temp + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
