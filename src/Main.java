import javax.swing.*;
//-1,5 2,8 NO
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static int sum(int ans) {
        int n = 14;
        ans = 0;
        while (n < 100) {
            ans += n / 10 + n % 10;
            n += 7;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        System.out.print(sum(ans));
    }
}
