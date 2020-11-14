import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int next = 0;
        int[] a = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            a[i] = i + 1;
            if (i == next) {
                System.out.print(a[i] + " ");
                next += n + 1;
            }
        }
    }
}
