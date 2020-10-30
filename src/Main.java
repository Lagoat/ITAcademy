import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (((N - 1) & N) == 0)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
