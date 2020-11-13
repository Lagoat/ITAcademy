import javax.swing.*;
//-1,5 2,8 NO
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void t6(int[] a, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }
        int min = max + 1;
        int min_i = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
                min_i = i;
            }
        }
        for (int i = min_i; i > 0; i--) {
            int t = a[i];
            a[i] = a[i - 1];
            a[i - 1] = t;
        }
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a  = new int [n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        t6(a,n);
    }
}
