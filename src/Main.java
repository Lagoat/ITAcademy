import javax.swing.*;
//-1,5 2,8 NO
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static String bin(double x, int n) {
        String ans = "";
        for (int i = 0; i < n; i++) {
            x *= 2;
            ans += (int)x;
            if ((int)x == 1)
                x -= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        int n = in.nextInt();
        System.out.print(bin(x, n));
    }
}
