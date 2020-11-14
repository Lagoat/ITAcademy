import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int min = 500;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] < min)
                min = a[i];
        }
        int max = min;
        for (int i = 0; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.print(max);
    }
}
