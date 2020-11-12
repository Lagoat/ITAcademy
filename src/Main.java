import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int n = 26;
        int sum = 0;
        while (n <= N) {
            sum += n;
            n += 2;
        }
        System.out.print(sum);
    }
}
