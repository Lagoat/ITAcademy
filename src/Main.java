import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int count = 0;
        if (a % 2 == 0) count++;
        if (b % 2 == 0) count++;
        if (c % 2 == 0) count++;
        if (count >= 2)
            System.out.print("true");
        else
            System.out.print("false");

    }
}
