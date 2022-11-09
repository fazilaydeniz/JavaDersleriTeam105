package ders07_nestedIfElseStatements;

import java.util.Scanner;

public class C08_DenemeNestedIfElseStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        // ana degisken yas olsun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lüffen Yaşınızı Giriniz");
        int yas= scan.nextInt();

        System.out.println("Lütfen Cinsiyetinizi Giriniz E/K");
        char cinsiyet = scan.next().charAt(0);

        if (yas<15){
            System.out.println("Hatalı Yaş Girişi");
        } else if (yas<60) {
            System.out.println("Emekli olamazsınız");
            if (cinsiyet == 'K' || cinsiyet == 'k') {
                System.out.println((60-yas) + " sene daha çalışmalısın");
            } else if (cinsiyet == 'E' || cinsiyet == 'e') {
                System.out.println("Emekli olmak icin " + (65-yas)+ " sene daha çalışmalısın");

            } else {
                System.out.println("Hatalı Cinsiyet Girişi");
            }
        } else if (yas<65) {
           if (cinsiyet=='K' ||cinsiyet=='k'){
               System.out.println("Emekli olabilirsiniz");
           } else if (cinsiyet=='E' || cinsiyet=='e') {
               System.out.println("Emekli olmak için" + (65-yas) +  "sene daha çalışmalısın");

           }else{
               System.out.println("Hatalı Cinsiyet Girişi");
           }


        } else if (yas<65) {
            System.out.println("Emekli olabilirsiniz");

        }


    }

}
