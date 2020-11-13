import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int fill = 0;
        int[][] a = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    a[i][j] = fill;
                }
                else {
                    a[i][m - j - 1] = fill;
                }
                fill++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.printf("%3d", a[i][j]);
            System.out.println("");
        }
    }
}
