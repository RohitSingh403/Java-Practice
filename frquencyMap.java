import java.util.*;

public class frquencyMap {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the query size");
        int m = scn.nextInt();
        System.out.println("enter queries");
        int[] q = new int[m];
        for (int j = 0; j < m; j++) {
            arr[j] = scn.nextInt();
        }
        freqMap(arr, q);
    }
    public static void freqMap(int[] arr, int[] q){
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ;i<arr.length;i++){
            int temp = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], temp+1);
        }
        for(int j = 0 ;j<q.length;j++){
            int temp = hm.getOrDefault(q[j], 0);
            System.out.println(temp+" ");
        }
    }
}
