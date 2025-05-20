import java.util.*;
public class PrintWaveForm2Darray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the row size");
        int n = scn.nextInt();
        System.out.println("Enter the coloums size");
        int m = scn.nextInt();
        System.out.println("Enter the array :");
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        printWaveForm(arr);
    }
    public static void printWaveForm(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        System.out.println("The Wave Form 2D Array is : ");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
