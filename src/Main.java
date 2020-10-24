import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner in = new Scanner(System.in);
        //int x = in.nextInt();
        //int y = in.nextInt();
        //System.out.println("Сумма " + (x + y));
        int a = 5, b, c;
        c = ++a;
        b = a++;
        System.out.println(b + " , " + c + " , " + a);
    }
}
