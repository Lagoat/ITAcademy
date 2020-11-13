import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int pre = a % 10;
        a /= 10;
        int f = 0;
        while (a != 0) {
            if (a % 10 == pre)
                f++;
            if (f == 1)
                break;
            pre = a % 10;
            a /= 10;
        }
        if (f == 1)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
