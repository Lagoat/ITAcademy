import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((y < x) && (y > x * x - 2) || (y < -x) && (y > x * x - 2))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
