import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int chast = 0;
        while (A >= B) {
            A -= B;
            chast++;
        }
        System.out.print(chast + " " + A);
    }
}
