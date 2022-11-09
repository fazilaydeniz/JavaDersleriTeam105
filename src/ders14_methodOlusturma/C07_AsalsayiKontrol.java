package ders14_methodOlusturma;

public class C07_AsalsayiKontrol {
    // Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
    // Girilen sayinin asal sayi olup olmadigini kontrol edip,
    // sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
    public static void main(String[] args) {

        int sayi = 215;
        System.out.println(asalSayiKontrolMethodu(sayi));

    }

    public static String asalSayiKontrolMethodu(int sayi) {
        String sonuc = "";
        for (int i = 2; i <= (sayi - 1); i++) {

            if (sayi % i == 0) {
                sonuc = "Asal değil";
                break;

            }
            }
            if (!sonuc.equals("Asal değil")) {
                sonuc = "Asal";

            }
            return sonuc;

        }
    }

