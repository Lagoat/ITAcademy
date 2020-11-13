import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = 437;
        int i = 0;
        int flag = 0;
        while (i != n) {
            i++;
            int h1 = in.nextInt();
            if (h1 <= h) {
                System.out.print("Crash " + i);
                flag++;
                break;
            }
        }
        if (flag == 0)
            System.out.print("No crash");
    }
}
