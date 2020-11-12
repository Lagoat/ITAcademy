import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double x1 = B / A, x2 = -B / A;

        if (A == 0)
            System.out.print("no such x");
        else if (A > 0) {
            if (x1 > -B && x2 > -B)
                System.out.print("any x");
            else if (x1 > x2)
                System.out.print("x<" + x2 + " or x>" + x1);
            else
                System.out.print("x<" + x1 + " or x>" + x2);
        }
        else {
            if (x1 < -B && x2 < -B)
                System.out.print("any x");
            else if (x1 > x2)
                System.out.print(x2 + "<x<" + x1);
            else
                System.out.print(x1 + "<x<" + x2);
        }

    }
}
