package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C15_DenemeRemove {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);
        }
        sayilar.remove(0);
        System.out.println(sayilar);
        /*
         Listemiz integer'lardan olusuyorsa
         biz int bir deger yazdigiizda hep index kabul ettiginden
         istedigimiz elementi obje olarak girip sildirmek icin
         onceden tanimlamamiz gerekir
         */
        Integer silinecekobje= 4;
        sayilar.remove(silinecekobje);
        System.out.println(sayilar);

        // tüm 3leri sildirin.
        silinecekobje=3;

        while (sayilar.contains(silinecekobje)){
           sayilar.remove(silinecekobje);

                }
        System.out.println(sayilar);

        silinecekobje=10;
        System.out.println(sayilar.remove(silinecekobje)); // Silinecek obje listemizde yoksa
                                                           // sonuç bize false olarak döner.

       // sayilar.remove(15); // Olmayan bir indexi verirsek de IndexOutOfBoundsException hatası verir.

        //sayilar.clear();               Dersek listedeki bütün elemanları siler
        //System.out.println(sayilar);
    }


    }

