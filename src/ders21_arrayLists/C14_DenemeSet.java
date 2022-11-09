package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C14_DenemeSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5};
        // list.set(index, yeniDeger) method'u
        // istenen index'deki eski degeri silip bize dondurur
        // ve o indexdeki degeri verdigimiz yeni deger olarak atar

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

               sayilar.add(arr[i]);
            // Java'da set() u update icin kullanir
            // add() ile set() farklidir





        }
        System.out.println(sayilar.set(0, 8));
        int eskiDeger=sayilar.set(0, 8);                          // set () hangi indexteki rakamı kaçla değiştirmek istiyorsak yeni değer atamaya yarar.
        System.out.println(sayilar.set(1, 9)); // eski değer silinir, yeni girilen değer kaydedilir. Yanız bunları yazdırırsak üstlerinde eski
        System.out.println(sayilar);           // değerlerini de görürüz. 8'in eski değeri 1'di. 9'un 2ydi gibi...
    }
}