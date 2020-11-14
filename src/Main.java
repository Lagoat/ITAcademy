import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int amnt = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] > 0)
                amnt++;
        }
        System.out.print(amnt);
    }
}
