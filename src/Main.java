import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int dig = 0;
        while (N > 0) {
            if ((N % 10) % 2 != 0)
            {
                dig = N % 10;
                break;
            }
            N /= 10;
        }
        if (dig == 0)
            System.out.print("NO");

        else
            System.out.print(dig);
    }
}
