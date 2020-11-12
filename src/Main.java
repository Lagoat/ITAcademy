import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = -1;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] % 2 == 0)
                sum = 0;
        }
        if (sum == -1)
            System.out.print("NO");
        else {
            for (int i = 0; i < n; i++)
                if (a[i] % 2 == 0)
                    sum += a[i];
            System.out.print(sum);
        }
    }
}
