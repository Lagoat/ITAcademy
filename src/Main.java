import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int h = n / 3600 % 24;
        int m = n / 60 % 60;
        int s = n % 60;
        System.out.print(h + ":");
        if (m / 10 == 0)
            System.out.print("0" + m + ":");
        else
            System.out.print(m + ":");
        if (s / 10 == 0)
            System.out.print("0" + s);
        else
            System.out.print(s);
    }
}