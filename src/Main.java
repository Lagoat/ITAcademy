import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    double N = in.nextDouble();
    if ((N >= -3 && N <= 5) || (N >= 9 && N <= 15)){
        System.out.print("true");
    }
    else
        System.out.print("false");
    }
}
