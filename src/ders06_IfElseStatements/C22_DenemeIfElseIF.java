package ders06_IfElseStatements;

import java.util.Scanner;

public class C22_DenemeIfElseIF {
    public static void main(String[] args) {
        // kullanicidan bir tam sayi alin
        // sayi negatif ise "gecersiz sayi"
        // tek basamakli ise "rakam"
        // iki basamakli ise "iki basamakli sayi"
        // bunun disindaki sayilar icin "buyuk sayi" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz.");

        int sayi= scan.nextInt();

        if (sayi<0){
            System.out.println("Geçersiz sayı");
        } else if (sayi<10) {
            System.out.println("Rakam");

        } else if (sayi<100) {
            System.out.println("İki Basamaklı Sayı");

        } else{
            System.out.println("Büyük Sayı");
        }


    }
}
