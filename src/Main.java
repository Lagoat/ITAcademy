import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = 0;
        for (int i = 0; i < n - 1; i++) {
            int x = in.nextInt();
            a[x - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                System.out.print(i + 1);
                break;
            }
        }
    }
}
