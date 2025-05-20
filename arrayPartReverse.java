import java.util.*;

public class arrayPartReverse {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the first index");
        int s = scn.nextInt();
        System.out.println("enter the second index");
        int e = scn.nextInt();
        partReverse(arr, s, e);
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void partReverse(int[] arr, int s, int e) {
        int n = arr.length;
        int sp = s;
        int ep = e;
        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}
