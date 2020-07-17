package PositivNumbersSum;

import java.util.Scanner;

public class ScannerImputFromUser {
    public static Double scannerFromUser (){
        Scanner fromUserKeyboard = new Scanner(System.in);
        System.out.println("Podaj proszę wybraną przez siebię liczbę.");
        return fromUserKeyboard.nextDouble();
    }
}
