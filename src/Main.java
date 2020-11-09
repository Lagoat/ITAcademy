import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if ((a == -b) || (a == -c) || (a == -d)) {
            System.out.print("true");
        } else if ((b == -c) || (b == -d)) {
            System.out.print("true");
        } else if (c == -d) {
            System.out.print("true");
        } else
            System.out.print("false");
    }
}
