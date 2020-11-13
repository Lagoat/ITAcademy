import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int moda = Math.abs(a);
        int modb = Math.abs(b);
        int mult = 0;
        int i = 0;
        if (a == 0 || b == 0) {
            System.out.print(mult);
        }
        else {
            while (i != moda) {
                i++;
                mult += modb;
            }
            if (a < 0 && b < 0 || a > 0 && b > 0)
                System.out.print(mult);
            else
                System.out.print(-1 * mult);
        }
    }
}
