import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int amnt = 0;
        while (N > 0) {
            amnt++;
            N /= 10;
        }
        System.out.print(amnt);
    }
}
