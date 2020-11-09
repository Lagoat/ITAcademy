import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((y < 2 - x * x) && (y > x) || (y < x) && (x > 0) && (y > 0) && (y < 2 - x*x))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
