import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int num = 10000;
        int flag = -1;
        while (num <= 99999) {
            if (num % a == b && num % c == d) {
                System.out.print(num + " ");
                flag++;
            }
            num++;
        }
        if (flag == -1)
            System.out.print(flag);
    }
}
