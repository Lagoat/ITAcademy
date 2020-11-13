import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - i - 1)
                    a[i][j] = 1;
                else if (i < n - j - 1 && j < n - i - 1)
                    a[i][j] = 0;
                else
                    a[i][j] = 2;
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
