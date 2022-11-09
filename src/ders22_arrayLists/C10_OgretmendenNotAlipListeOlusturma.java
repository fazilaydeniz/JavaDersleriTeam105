package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_OgretmendenNotAlipListeOlusturma {
    public static void main(String[] args) {
        // ogretmenden ogrenci notlarini alip bir list olusturun   ++
        //ogretmen 100 den buyuk bir sayi girince girme islemini bitirsin
        //sinifdaki ogrenci sayisini sinif ortalamasini ve kac kisinin ortalamanin ustunde aldigini
        // en dusuk notun kac oldugunu en yuksek notun kac oldugunu bulunuz
        List<Integer> notlar = ListeOlustur();
        System.out.println(notlar);
        raporla(notlar);
    }
    public static List<Integer> ListeOlustur() {
        List<Integer> sinifList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int girilenNot = 0;
        while (girilenNot <=100) {
            System.out.println("Lutfen ogrenci notlarini giriniz \n bitirmek icin 100 den buyuk sayi giriniz");
            girilenNot = scan.nextInt();
            if (girilenNot <= 100) {
                sinifList.add(girilenNot);
            }
        }
        return sinifList;
    }
    public static void raporla(List<Integer> notlar){
        int ogrenciSayisi=notlar.size();
        double sinifOrtalamasi=0;
        double notlarToplami=0;
        int ortalamaUstu = 0;
        int enDusukNot=100;
        int enYuksekNot=0;
        for (int i = 0; i < notlar.size(); i++) {
            notlarToplami+=notlar.get(i);
        }
        sinifOrtalamasi=notlarToplami/ogrenciSayisi;
        for (int i = 0; i <notlar.size() ; i++) {
            if (notlar.get(i)>sinifOrtalamasi){
                ortalamaUstu++;
            }
        }
        for (int i = 0; i <notlar.size() ; i++) {
            if (notlar.get(i)>=enYuksekNot){
                enYuksekNot=notlar.get(i);
            }
        }
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)<=enDusukNot){
                enDusukNot=notlar.get(i);
            }
        }
        System.out.println("Sinava giren ogrenci sayisi: "+ogrenciSayisi+"\nsinifin ortalamasi: "+sinifOrtalamasi+
                "\nortalamanin ustunde not alan ogrenci sayisi: "+ortalamaUstu+ "\nen dusuk not: "+ enDusukNot+ "\nen yuksek not: "+enYuksekNot);
    }
}





