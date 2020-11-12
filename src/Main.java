import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int c = 1;
        while (x >= 0) {
            c++;
            x = in.nextInt();
        }
        System.out.print(c);
    }
}
