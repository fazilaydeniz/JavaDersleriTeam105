package ders21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C11_DenemetopluElemanEkleme {
    public static void main(String[] args) {

        List<String>sesliharfler=new ArrayList<>();

        /* Tüm sesli harfleri listeye ekleyin
           Elementleri bir array olarak yazdırıp
           sonra for loop ile listeye ekleyebiliriz
        */

        String [] arr= {"a","e","i","o","u"};

        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            sesliharfler.add(arr[i]);


        }
        System.out.println(sesliharfler);

        System.out.println(sesliharfler.size()); // sesli harfler.size denince listenin boyutunu bize verir.

        System.out.println(sesliharfler.isEmpty());// isEmpty() bize listenin boş olup olmadığnı verir.
                                                   // Burada sesli harfler listesi boş olmadığı için false verdi.






    }
}




