import javax.swing.*;
//-1,5 2,8 NO
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        DecimalFormat df = new DecimalFormat("###.#");
        if (A > 0 && B > 0)
            System.out.print("any x");
        else if (A == 0 && B > 0)
            System.out.print("any x");
        else if (A > 0 && B == 0)
            System.out.print("any x");
        else if (A == 0 && B == 0)
            System.out.print("no such x");
        else if (A < 0 && B < 0)
            System.out.print("no such x");
        else if (A == 0 && B < 0)
            System.out.print("no such x");
        else if (A < 0 && B == 0)
            System.out.print("no such x");
        else if (A < 0 && B > 0) {
            double x1 = -B/A;
            double x2 = -B/(-A);
            String x1f = String.format("%.1f", x1);
            String x2f = String.format("%.1f", x2);
            System.out.printf(x2f + "<x<" + x1f);
        }
        else if (A > 0 && B < 0) {
            double x1 = -B/A;
            double x2 = -B/(-A);
            String x1f = String.format("%.1f", x1);
            String x2f = String.format("%.1f", x2);
            System.out.printf("x<" + x2f + " or x>" + x1f);
        }
    }
}
