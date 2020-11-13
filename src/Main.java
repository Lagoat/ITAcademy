import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        System.out.print(sum);
    }
}
