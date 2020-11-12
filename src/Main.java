import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int prime;
        if (N % 2 == 0)
            prime = N + 1;
        else
            prime = N;
        int check = 0;

        while (check != 1){
            prime += 2;
            int i = 2;
            int amnt = 0;
            while (i != prime) {
                if (prime % i == 0)
                    amnt++;
                i++;
            }
            if (amnt == 0)
                check = 1;
        }
        System.out.print(prime);
    }
}
