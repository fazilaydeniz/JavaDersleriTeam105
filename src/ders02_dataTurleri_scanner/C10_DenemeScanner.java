package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C10_DenemeScanner {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kenar uzunluklarını giriniz" +
                "\n iki kenar uzunluğu arasında entera basınız");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println("Dikdörtgenin alanı : " + (kenar1*kenar2));
    }
}
