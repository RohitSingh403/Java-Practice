import java.util.*;

public class largestNumTwice {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }
    public static int LargestNumTwice(int[] arr){
        int n = arr.length;
        int max1= Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        for(int i = 0 ;i<n;i++){
            if(arr[i]>max){
                max2 = max;
                max= arr[i];
            }
        }
    }
}
