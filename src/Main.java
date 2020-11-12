import javax.swing.*;
//-1,5 2,8 NO
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static int amount(int n) {
        int i = 100;
        int amnt = 0;
        while (i < n) {
            if ((i % 10 + i / 100 + i / 10 % 10) % 13 == 0)
                amnt++;
            i++;
        }
        return amnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(amount(n));
    }
}
