import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = 4 + 3 * i;
            System.out.print(a[i] + " ");
        }
    }
}
