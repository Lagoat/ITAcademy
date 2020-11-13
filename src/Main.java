import javax.swing.*;
//-1,5 2,8 NO
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        switch(month) {
            case 1:
                if (day > 31 || day < 1)
                    System.out.print(-1);
                else
                    System.out.print(365 - day);
                break;
            case 2:
                if (day > 28 || day < 1)
                    System.out.print(-1);
                else
                    System.out.print(365 - day - 31);
                break;
            case 3:
                if (day > 31 || day < 1)
                    System.out.print(-1);
                else
                    System.out.print(365 - day - 59);
                break;
            case 4:
                if (day > 30 || day < 1)
                    System.out.print(-1);
                else
                    System.out.print(365 - day - 90);
                break;
            case 5:
                if (day > 31 || day < 1)
                    System.out.print(-1);
                else
                    System.out.print(365 - day - 120);
                break;
            case 6:
                if (day > 30 || day < 1)
                    System.out.print(-1);
                else
                    System.out.print(365 - day - 151);
                break;
            case 7:
                if (day > 31 || day < 1)
                    System.out.print(-1);
                else
                    System.out.print(365 - day - 181);
                break;
            case 8:
                if (day > 31 || day < 1)
                    System.out.print(-1);
                else
                    System.out.print(365 - day - 212);
                break;
            case 9:
                if (day > 30 || day < 1)
                    System.out.print(-1);
                else
                    System.out.print(365 - day - 243);
                break;
            case 10:
                if (day > 31 || day < 1)
                    System.out.print(-1);
                else
                    System.out.print(365 - day - 273);
                break;
            case 11:
                if (day > 30 || day < 1)
                    System.out.print(-1);
                else
                    System.out.print(365 - day - 304);
                break;
            case 12:
                if (day > 31 || day < 1)
                    System.out.print(-1);
                else
                    System.out.print(365 - day - 334);
                break;
            default:
                System.out.print(-1);
        }
    }
}
