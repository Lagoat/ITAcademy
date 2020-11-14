import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = i + 1;
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        for (int i = 0; i < (B - A + 1)/2; i++) {
            int t = a[i + A - 1];
            a[i + A - 1] = a[B - i - 1];
            a[B - i - 1] = t;
        }
        for (int i = 0; i < (D - C + 1) / 2; i++) {
            int t = a[i + C - 1];
            a[i + C - 1] = a[D - i - 1];
            a[D - i - 1] = t;
        }
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
