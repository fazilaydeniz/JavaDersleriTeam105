package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_DenemeElemanEkleme {
    public static void main(String[] args) {

        List<Integer>sayilar= new ArrayList<>();

        System.out.println(sayilar);
        sayilar.add(3);
        sayilar.add(5);
        System.out.println(sayilar.add(8));// Bu şekilde yazdırıp eklenip eklenmediği kontrol edildiğinde true olarak görünüp eklendiğini görürüz.

        System.out.println(sayilar);

        sayilar.add(1,4); //Bu şekilde ekleme yaparsak 1. indexe 4 sayısını eklemiş oluruz.
        System.out.println(sayilar);

        //Listenin başına 35 ekle denirse
        sayilar.add(0,35);
        System.out.println(sayilar);

        //eklenecek liste oluşturup sayilar listesinin sonuna ekleyin denirse

        List<Integer>eklenecekliste=new ArrayList<>();
        eklenecekliste.add(10);
        eklenecekliste.add(20);

        sayilar.addAll(eklenecekliste);
        System.out.println(sayilar);

        // sayılar listesinin başındaki 35ten sonraya eklenecek listeyi bir kez daha ekleyin

        sayilar.addAll(1,eklenecekliste);
        System.out.println(sayilar);


    }
}
