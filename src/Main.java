import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int mod = a % 100;
        if (mod / 10 == 1){
            System.out.print(a + " " + "TOPTOB");
        }
        else {
            if (mod % 10 == 1)
                System.out.print(a + " " + "TOPT");
            else if (mod % 10 >= 2 && mod % 10 <= 4)
                System.out.println(a + " " + "TOPTA");
            else
                System.out.println(a + " " + "TOPTOB");
        }
    }
}
