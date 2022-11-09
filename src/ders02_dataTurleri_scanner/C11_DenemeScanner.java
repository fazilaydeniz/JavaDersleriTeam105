package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C11_DenemeScanner {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //		Isminiz : John
        //		Soyisminiz : Doe
        //		Yasiniz : 44
        //		Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz");
        String isim = scan .nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();
        System.out.println("Kaydınız başarıyla tamamlanmıştır");



    }
}
