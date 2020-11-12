import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 1 && n <= 12)
        {
            if (n == 2)
                System.out.print(28);
            else if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12)
                System.out.print(31);
            else
                System.out.print(30);
        }
        else
            System.out.println(0);

    }
}
