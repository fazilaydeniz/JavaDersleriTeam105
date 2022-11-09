package ders14_methodOlusturma;

import java.util.Scanner;

public class C06_Soru {
    // Soru 2- Kullanicidan main method icinde
    // ayri ayri isim ve soyismini alin
    // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    // isim bosluk soyisim seklinde bize donduren bir method olusturun
    // input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= scan.next();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scan.next();

        System.out.println(isimSoyisimDüzenleMethodu(isim,soyisim));
        //System.out.println(isimSoyisimDüzenleMethodu("Fazıl","Aydeniz"));



    }
    public static String isimSoyisimDüzenleMethodu(String isim, String soyisim) {

        String yeniisimsoyisim= isim.substring(0,1).toUpperCase() +
                                isim.substring(1).toLowerCase()+
                                " "+
                                soyisim.substring(0,1).toUpperCase()+
                                soyisim.substring(1).toLowerCase();
        return yeniisimsoyisim;
    }

}
