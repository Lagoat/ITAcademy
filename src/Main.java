import javax.swing.*;
//-1,5 2,8 NO
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void aver(int[] a)
    {
        Scanner in = new Scanner(System.in);
        int amnt = 0; int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            if (a[i] >= 1000 && a[i] <= 9999) {
                sum += a[i];
                amnt++;
            }
        }
        if (amnt == 0)
            System.out.print(-1.00);
        else
            System.out.print(sum/amnt);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int [n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        aver(a);
    }
}
