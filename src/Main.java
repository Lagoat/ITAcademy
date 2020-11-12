import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a >= b && a >= c) {
            if (b > c)
                System.out.print(c + " " + b + " " + a);
            else
                System.out.print(b + " " + c + " " + a);
        }
        else if (b >= a && b >= c) {
            if (a > c)
                System.out.print(c + " " + a + " " + b);
            else
                System.out.print(a + " " + c + " " + b);
        }
        else
            if (a > b)
                System.out.print(b + " " + a + " " + c);
            else
                System.out.print(a + " " + b + " " + c);
    }
}
