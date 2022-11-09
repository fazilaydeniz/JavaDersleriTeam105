package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C09_Deneme {
    public static void main(String[] args) {
         /*
        Kullanicidan toplanmak uzere tamsayilar alin
        kullanici 0'a basarsa sayi alma islemini bitirin
        kullanicinin kac sayi girdigini
        ve bu sayilarin toplaminin kac oldugunu yazdirin
         */
        Scanner scan= new Scanner(System.in);
        int girilensayi=1;
        int sayac=0;
        int toplam=0;

        while (girilensayi!=0) {
            System.out.println("Lütfen tam sayılar giriniz\n" +
                               "0 tuşuna bastığınızda işlem bitecektir.");
            girilensayi= scan.nextInt();
            if (girilensayi!=0){
               sayac++;
               toplam=toplam+girilensayi;

            }
        }
        System.out.println("Girilen " + sayac + " adet sayının toplamı : " + toplam);

    }
}
