import java.util.*;

public class Funtion1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sum(a, b);
        System.out.println(result);
    }

    public static int sum(int a, int b) {
        int ans = a + b;
        return ans;
    }
}
