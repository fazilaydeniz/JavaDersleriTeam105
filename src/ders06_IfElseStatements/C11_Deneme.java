package ders06_IfElseStatements;

import java.util.Scanner;

public class C11_Deneme {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.                                         NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ay isminin ilk harfini giriniz");
        char ilkHarf =  scan. next().charAt(0);

        if (ilkHarf== 'o' || ilkHarf== 'O') {
            System.out.println("Ocak");
        }
        if (ilkHarf== 's' || ilkHarf== 'S') {
            System.out.println("Subat");
        }
        if (ilkHarf== 'm' || ilkHarf== 'M') {
            System.out.println("Mart veya Mayıs");
        }

        if (ilkHarf== 'h' || ilkHarf== 'H') {
            System.out.println("Haziran");
        }

        if (ilkHarf== 't' || ilkHarf== 'T') {
            System.out.println("Temmuz");
        }

        if (ilkHarf== 'a' || ilkHarf== 'A') {
            System.out.println("Ağustos veya Aralık");
        }

        if (ilkHarf== 'e' || ilkHarf== 'E') {
            System.out.println("Eylül veya Ekim");
        }

        if (ilkHarf== 'k' || ilkHarf== 'K') {
            System.out.println("Kasım");
        }


    }
}
