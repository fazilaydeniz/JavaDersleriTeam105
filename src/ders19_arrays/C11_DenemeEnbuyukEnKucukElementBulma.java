package ders19_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C11_DenemeEnbuyukEnKucukElementBulma {
    public static void main(String[] args) {
        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun

        int[] arr= {3,8,1,5,2,9};
        enbuyukenkucukelementyazdir(arr);

    }
    public static void enbuyukenkucukelementyazdir(int[]arr){

        Arrays.sort(arr);

        System.out.println("En Büyük element  : " + arr[arr.length-1]);
        System.out.println("En küçük element  : " + arr[0]);
    }




}
