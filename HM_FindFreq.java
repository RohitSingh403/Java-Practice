import java.util.*;
public class HM_FindFreq {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scn.nextInt();
        System.out.println("Enter the array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter query size");
        int q = scn.nextInt();
        System.out.println("enter the Queries");
        int[] query = new int[q];
        for (int i = 0; i < q; i++) {
            query[i] = scn.nextInt();
        }
        findFrequency(arr, query);
    }
    public static void findFrequency(int[] arr, int[] query) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], temp + 1);
        }
        for (int i = 0; i < query.length; i++) {
            int temp = hm.getOrDefault(query[i], 0);
            System.out.print(temp + " ");
        }
    }
}
