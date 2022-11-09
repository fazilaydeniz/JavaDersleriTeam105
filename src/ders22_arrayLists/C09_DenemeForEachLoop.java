package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C09_DenemeForEachLoop {
    public static void main(String[] args) {

        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        //	- Kelimenin uzunlugu cift sayi ise ilk yarisini
        //	- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //	yeni bir listeye ekleyip yazdirin.

        String[] arr = {"Sumeyra","Mehmet","Ekrem","Yilmaz","Ayse"};

        List<String>yeniIsimListesi=new ArrayList<>();

        for (String each:arr
             ) {

            if (each.length()%2==0) { // çift olanları yazdırmak için

                yeniIsimListesi.add(each.substring(0,each.length()/2));

        } else{
                yeniIsimListesi.add(each.substring((each.length()-1)/2));
            }



        }
        System.out.println(yeniIsimListesi);

    }
}
