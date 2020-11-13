import javax.swing.*;
//-1,5 2,8 NO
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((x * x + y * y > 1 && x < 1 && y < 1 && x > 0 && y > 0) || (x * x + y * y < 1 && y != 1 && x != 1))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
