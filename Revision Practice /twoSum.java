import java.util.*;

public class twoSum {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//array size
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the K which is sum");
        int k = scn.nextInt();
        boolean ans = TwoSum(arr, k);
        System.out.println(ans);
    }
    public static boolean TwoSum(int[] arr, int k){
        int n = arr.length;
        for(int i = 0;i<n-2;i++){
            for(int j = i+1;j<n-1;j++){
                if(arr[i]+ arr[j]==k){
                    return true;
                }
            }
        }
        return false;
    }
}
