package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_DenemeOrtalamaninUstundekiNot {
    public static void main(String[] args) {

        // Ogretmenden ogrenci notlarini alip bir list olusturun
        // ogretmen 100'den buyuk bir sayi girip, bitirdiginde
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        List<Double>notlar=listeOlustur();

        System.out.println(notlar);
        raporla(notlar);
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin ustunde not aldigini yazdirin

        int ogrencisayisi= notlar.size();

        double notlarToplami=0.0;

        double sinifNotOrtalmasi=0.0;

        int ortalamaUstundekiogrenciSayisi=0;

        //Notlar toplamını bulalım

        for (int i = 0; i < notlar.size(); i++) {

            notlarToplami+= notlar.get(i);


        }
            // Şimdi Not ortalamasını bulalım

        sinifNotOrtalmasi = notlarToplami/ogrencisayisi;

             // Not Ortalamasının Üstündeki Öğrenci Sayısını Bulalım

                for (int i = 0; i < notlar.size() ; i++) {
                    if(notlar.get(i)>sinifNotOrtalmasi){
                        ortalamaUstundekiogrenciSayisi ++;
                    }
        }


                // Rapor için istenenleri yazdıralım
        System.out.println("Girilen not sayısı :" + ogrencisayisi +
                           "\nSınıf Ortalaması :"   + sinifNotOrtalmasi +
                           "\nOrtalama Üstündeki Öğrenci Sayısı : " + ortalamaUstundekiogrenciSayisi);


            }

    public static void raporla(List<Double> notlar) {


    }

    public static List<Double> listeOlustur(){

        List<Double> notlar= new ArrayList<>();

        Scanner scan= new Scanner(System.in);
        Double girilenNot=5.0;


        while (girilenNot<=100){

            System.out.println("Lutfen listeye eklemek icin not giriniz" +
                    "\nBitirmek icin 100'den buyuk bir sayi yazin");
            girilenNot= scan.nextDouble();

            if (girilenNot<=100){
                notlar.add(girilenNot);
            }

        }

        return notlar;
    }

}
