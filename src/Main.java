import javax.swing.*;
//-1,5 2,8 NO
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static int sum(int n) {
        n = n / 10 + n % 10;
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(sum(n));
    }
}
