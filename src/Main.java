import javax.swing.*;
//-1,5 2,8 NO
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String rom = "";
        if (num == 100) {
            num = -1;
            rom += "C";
        }
        if (num >= 90) {
            num -= 90;
            rom += "XC";
        }
        if (num >= 50) {
            num -= 50;
            rom += "L";
        }
        if (num >= 40) {
            num -= 40;
            rom += "XL";
        }
        if (num >= 30) {
            num -= 30;
            rom += "XXX";
        }
        if (num >= 20) {
            num -= 20;
            rom += "XX";
        }
        if (num >= 10) {
            num -= 10;
            rom += "X";
        }
        if (num >= 9) {
            num -= 9;
            rom += "IX";
        }
        if (num >= 5) {
            num -= 5;
            rom += "V";
        }
        if (num >= 4) {
            num -= 4;
            rom += "IV";
        }
        if (num >= 3) {
            num -= 3;
            rom += "III";
        }
        if (num >= 2) {
            num -= 2;
            rom += "II";
        }
        if (num >= 1) {
            num -= 1;
            rom += "I";
        }
        System.out.print(rom);
    }
}
