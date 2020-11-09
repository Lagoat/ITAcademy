import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    double N = in.nextDouble();
    if ((N >= -2 && N <= 3) || (N >= 6 && N <= 9)){
        System.out.print("false");
    }
    else
        System.out.print("true");
    }
}
