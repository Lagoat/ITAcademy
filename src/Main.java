import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int N = in.nextInt();
    if ((N % 5 == 0) && (N > 99 && N < 1000)){
        System.out.print("true");
    }
    else
        System.out.print("false");
    }
}
