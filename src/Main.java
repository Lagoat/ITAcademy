import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int dig = 0;
        while (A > 0) {
            dig++;
            A /= 2;
        }
        System.out.print(dig);
    }
}
