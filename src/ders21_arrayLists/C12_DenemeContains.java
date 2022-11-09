package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C12_DenemeContains {
    public static void main(String[] args) {

        /*Listede bir sayının olup olmadığını nası kontrol ederiz. Önce elimizde int array bir sayı listesi var
        Bu sayıları for loopla oluşturduğumuz bir listeye ekliyoruz.
        Sonrada listede var mı yok mu kontrol ediyoruz
        */
        List<Integer>sayilar=new ArrayList<>();

        int[] arr = {2,5,7,9,1,0,4,5,6,3,5,4,6};

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);

        }
        System.out.println(sayilar.contains(3)); //true verir
        System.out.println(sayilar.contains(8));

    }
}
