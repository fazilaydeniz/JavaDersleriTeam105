package ders07_nestedIfElseStatements;

import java.util.Scanner;

public class C09_DenemeNestedIfElseStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        System.out.println("Lütfen cinsiyetinizi giriniz.E/K");
        char cinsiyet = scan.next().charAt(0);

        if (yas < 15) {
            System.out.println("Hatalı yaş girişi");
        } else if (yas < 60) {
            System.out.println("Emekli olamazsınız");


            if (cinsiyet == 'K' || cinsiyet == 'k') {
                System.out.println("Emekli olabilmek için " + (60 - yas) + " yıl daha çalışmalısınız.");
            } else if (cinsiyet == 'E' || cinsiyet == 'e') {
                System.out.println("Emekli olabilmek için " + (65 - yas) + " yıl daha çalışmalısınız.");

            } else {
                System.out.println("Hatalı Cinsiyet Girişi");
            }


        } else if (yas < 65) {
            // kadin ise emekli olabilir, erkek calismasi lazim
            if (cinsiyet == 'K' || cinsiyet == 'k') {
                System.out.println("emekli olabilirsin");
            } else if (cinsiyet == 'E' || cinsiyet == 'e') {
                System.out.println("emekli olmak icin " + (65 - yas) + " yil daha calismalisin");
            } else {
                System.out.println("hatali cinsiyet girisi");
            }

        } else { // yas 65'den buyukse
            System.out.println("emekli olabilirsin");
        }


    }}