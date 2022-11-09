package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C17_DenemeIndexOff {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();

        int[] arr = {1,2,4,3,5,7,9,1,0,4,5,6,3,5,4,6};

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);


        }
        System.out.println(sayilar.indexOf(2));//1 verdi

        System.out.println(sayilar.indexOf(5));//4 verdi

        System.out.println(sayilar.lastIndexOf(5)); //13  lastindexof  sondaki 5'in indexini bulup onu verir


    }

}
