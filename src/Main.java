import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int sum = 0;
        while (x >= 10 && x <= 99)
        {
            if (x >= 10 && x <= 99)
                sum += (x % 10) + x / 10;
            x = in.nextInt();
        }
        System.out.print(sum);
    }
}
