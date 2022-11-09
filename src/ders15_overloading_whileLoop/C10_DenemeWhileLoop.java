package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C10_DenemeWhileLoop {
    /*
     Kullanicidan toplanmak uzere sayi alin
     sayilarin toplami 500'e esit olur veya gecerse
     girilen sayi adedi,
     girilen sayilarin toplamini ve
     "Bu kadar yeter" yazdirin
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double girilensayi = 1;
        int sayac = 0;
        double toplam = 0;

        while (toplam < 500) {
            System.out.println("Lütfen sayı giriniz");
            girilensayi= scan.nextDouble();

            toplam+= girilensayi;
            sayac++;

        }
        System.out.println("Girilen " + sayac + "adet sayının toplamı :" + toplam  );
    }
}
