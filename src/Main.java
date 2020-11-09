import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        if (x >= 0 && x <= 9)
            System.out.print("DIGIT");
        else if (x >= 10 && x <= 99)
            System.out.println("NUM");
        else
            System.out.println("OTHER");
    }
}
