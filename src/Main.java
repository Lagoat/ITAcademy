import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] f = new int[n];
        int ans = 1;
        for (int i = 0; i < n; i++) {
            f[i] = i + 1;
            ans *= f[i];
        }
        System.out.print(ans);
    }
}
