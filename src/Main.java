import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int dig = 10;
        while (N > 0) {
            if (N % 10 < dig && N % 10 != 0)
                dig = N % 10;
            N /= 10;
        }
            System.out.print(dig);
    }
}
