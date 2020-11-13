import javax.swing.*;
//-1,5 2,8 NO
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void t5(int[] a, int n) {
        double sum = 0;
        double amnt = 0;
        for (int i = 0; i < n; i++) {
                 if (a[i] >= 1000 && a[i] <= 9999) {
                     sum += a[i];
                     amnt++;
                 }
             }
        if (amnt == 0)
            System.out.printf("-1.00");
        else {
            String ans = String.format("%.2f", (sum / amnt));
            System.out.printf(ans);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a  = new int [n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        t5(a, n);
    }
}
