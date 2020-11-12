import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int sum = 0;
        if (x > 10)
            sum += x;
        while (x % 5 != 0)
        {
            x = in.nextInt();
            if (x > 10)
                sum += x;
        }
        System.out.print(sum);
    }
}
