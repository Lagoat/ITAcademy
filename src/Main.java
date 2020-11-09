import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((x*x + y*y > 4) && (x < 2) && (y < x) && (y > 0) && (x > 0))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
