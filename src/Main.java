import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if ((y > 0) && (x > 0) && (y < 0.5) && (y < Math.sin(x)) && (x < Math.PI))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
