import java.util.*;
public class PrintColoums2Darray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the rows");
        int n = scn.nextInt();
        System.out.println("Enter the coloums");
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        PrintColoums(arr);
    }
    public static void PrintColoums(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        System.out.println("Coloums are printed");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
