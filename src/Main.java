import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0, amnt = 0, aref = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = in.nextInt();
            if (a[i] % 2 != 0) {
                amnt++;
                sum += a[i];
            }
        }
        if (amnt == 0)
            System.out.print("NO");
        else {
            aref = sum / amnt;
            String answer = new DecimalFormat("#0.00").format(aref);
            System.out.print(answer);
        }
    }
}
