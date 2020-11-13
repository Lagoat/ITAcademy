import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int num = 2;
        while (i != n) {
            i++;
            System.out.print(num + " ");
            num += 2;
        }
    }
}
