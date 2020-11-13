import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int [n][m];
        int i = 0, j = 0;
        while (i < n && j < m) {
            a[i][j] = i * j;
            System.out.printf("%4d", a[i][j]);
            j++;
            if(j == m) {
                i++;
                j = 0;
                System.out.println("");
            }
        }
    }
}
