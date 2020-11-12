import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int neg = 0;
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] < 0) {
                b[neg] = a[i];
                neg++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0)
            {
                b[neg] = a[i];
                neg++;
            }
            System.out.print(b[i] + " ");
        }

    }
}
