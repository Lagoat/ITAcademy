import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double a1 = 1;
        long n = in.nextLong();
        long i = 0;
        if (n % 2 == 0) {
            while (i != n/2) {
                a1 *= a;
                i++;
            }
            System.out.print(a1 * a1);
        }
        else {
            while (i != n - 1) {
                a1 *= a;
                i++;
            }
            System.out.print(a * a1);
        }

    }
}
