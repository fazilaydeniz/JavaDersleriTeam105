package ders14_methodOlusturma;

import java.util.Scanner;

public class C08_DenemeCarpim {
    // main method icerisinde kullanicidan iki sayi alin
    // bu iki sayiyi parametre olarak kabul edip, carpimlarini main method'a döndüren bir method olusturun


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println(carpimMethodu(sayi1,sayi2));

        double carpimSonucu= carpimMethodu(sayi1, sayi2);

    }
    public static double carpimMethodu(double sayi1 , double sayi2){
        System.out.println("carpimMethod'u çalıştı");
        return sayi1*sayi2;

    }

}
