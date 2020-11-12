import javax.swing.*;
//-1,5 2,8 NO
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int m1 = 31, m3 = 31, m5 = 31, m7 = 31, m8 = 31, m10 = 31, m12 = 31;
        int m4 = 30, m6 = 30, m9 = 30, m11 = 30;
        int m2 = 28;
        int err = 0;
        if ((month < 1 || month > 12) || (day < 1 || day > 31))
            err++;
        else if (month == 2 && day > 28)
            err++;
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)
            err++;
        if (err == 0) {
            switch (month) {
                case 1:
                    System.out.print(365 - day);
                    break;
                case 2:
                    day += m1;
                    break;
                case 3:
                    day += m1 + m2;
                    System.out.print(365 - day);
                    break;
                case 4:
                    day += m1 + m2 + m3;
                    System.out.print(365 - day);
                    break;
                case 5:
                    day += m1 + m2 + m3 + m4;
                    System.out.print(365 - day);
                    break;
                case 6:
                    day += m1 + m2 + m3 + m4 + m5;
                    System.out.print(365 - day);
                    break;
                case 7:
                    day += m1 + m2 + m3 + m4 + m5 + m6;
                    System.out.print(365 - day);
                    break;
                case 8:
                    day += m1 + m2 + m3 + m4 + m5 + m6 + m7;
                    System.out.print(365 - day);
                    break;
                case 9:
                    day += m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8;
                    System.out.print(365 - day);
                    break;
                case 10:
                    day += m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9;
                    System.out.print(365 - day);
                    break;
                case 11:
                    day += m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10;
                    System.out.print(365 - day);
                    break;
                case 12:
                    day += m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11;
                    System.out.print(365 - day);
                    break;
            }
        }
        else
            System.out.print(-1);
    }
}
