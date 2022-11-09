package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_DenemeTamBolenlerListesi {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan pozitif bir tamsayi alip,
        //        o tamsayiyi tam bolebilen tum pozitif tamsayilari
        //        bir liste olarak bize donduren bir method olusturun.

        int input= 128;
        System.out.println(tambolensayilarlistesiolustur(input));


    }
    public static List<Integer>tambolensayilarlistesiolustur(int input) {

        List<Integer>tamBolenlerListesi= new ArrayList<>();

        for (int i = 1; i < input; i++) {

            if (input % (i)==0) {
              tamBolenlerListesi.add(i);
            }


        }
        return tamBolenlerListesi;
    }
}
