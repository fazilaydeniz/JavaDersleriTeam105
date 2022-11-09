package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C13_Deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen İsminizi giriniz");

        String kullanıcıAdi = scan.nextLine();
        System.out.println("lütfen Soyadınızı Giriniz");
        String kullaniciSoyadi= scan.nextLine();

        System.out.println((kullanıcıAdi.toUpperCase() + " " + kullaniciSoyadi.toUpperCase()));

    }





}
