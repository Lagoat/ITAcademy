import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int del = 2;
        int flag = 0;
        while (del != a) {
            if (a % del == 0) {
                flag = 1;
                break;
            }
            del++;
        }
        if (flag == 1)
            System.out.print("composite");
        else
            System.out.print("prime");
    }
}
