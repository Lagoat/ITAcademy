import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int moda = 0, max_moda = 0, index = -1;
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j])
                    moda++;
            }
            if (moda > max_moda){
                index = i;
                max_moda = moda;
            }
            moda = 0;
        }
        System.out.print(a[index]);
    }
}
