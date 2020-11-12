import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
         int X = in.nextInt();
         for (int i = 0; i < n; i++)
             if (a[i] == X){
                 ans = i + 1;
                 break;
             }
         if (ans == 0)
             System.out.print("NO");
         else
             System.out.print(ans);
    }
}
