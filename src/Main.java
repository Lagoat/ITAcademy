import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A = 2 * n + 1;
        int[][] a = new int[A][A];
        int fill = A * A - 1;
        int t = 0, b = A - 1, l = 0, r = A - 1, dir = 0;
        while (t < b && l < r) {
            if (dir == 0) {
                for (int i = t; i <= b; i++) {
                    a[i][r] = fill;
                    fill--;
                }
                r--;
            } else if (dir == 1) {
                for (int i = r; i >= l; i--) {
                    a[b][i] = fill;
                    fill--;
                }
                b--;
            } else if (dir == 2) {
                for (int i = b; i >= t; i--) {
                    a[i][l] = fill;
                    fill--;
                }
                l++;
            } else if (dir == 3) {
                for (int i = l; i <= r; i++) {
                    a[t][i] = fill;
                    fill--;
                }
                t++;
            }
            dir = (dir + 1)%4;
        }
        a[n-1][n] = 1;
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++)
                System.out.printf("%3d", a[i][j]);
            System.out.println("");
        }

    }
}
