package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C09_DenemeScanner {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        //        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ondalıklı bir sayı giriniz");
        double ondaliklisayi= scan.nextDouble();

        System.out.println("Lütfen bir tam sayı giriniz");
        int tamsayi = scan.nextInt();



        System.out.println("Girilen Sayıların Toplamı : " + (tamsayi+ondaliklisayi));
        System.out.println("Girilen Sayıların Çarpımı : " + (tamsayi*ondaliklisayi));
    }
}
