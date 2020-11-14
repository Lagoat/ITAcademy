import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static double l(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        return Math.sqrt(x*x + y*y);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();
        System.out.printf("%.10f", (l(x1, y1, x2, y2) + l(x2, y2, x3, y3) + l(x3, y3, x1, y1)));
    }
}
