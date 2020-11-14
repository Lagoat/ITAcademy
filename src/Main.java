import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static int min (int a, int b, int c, int d){
        int arr[] = new int[] {a, b, c, d};
        int max = -1;
        for (int i = 0; i < 4; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int min = max + 1;
        for (int i = 0; i < 4; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.print(min(a,b,c,d));
    }
}
