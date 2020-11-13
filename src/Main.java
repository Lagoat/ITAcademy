import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                a[i][j] = in.nextInt();
        }
        int[][] b = new int[m][n];
        System.out.println(m + " " + n);
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = a[n - j - 1][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
