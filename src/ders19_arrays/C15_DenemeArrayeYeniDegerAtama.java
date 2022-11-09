package ders19_arrays;

import java.util.Arrays;

public class C15_DenemeArrayeYeniDegerAtama {
    public static void main(String[] args) {
        String str= "Java";

        str="Hava";
        System.out.println(str);

        String[]arr1={"Ali", "Veli"};
        String[] arr2={"A","B","C"};

        arr1=arr2;
        System.out.println(Arrays.toString(arr1));// [A, B, C]

        arr1= new String[6];
        System.out.println(Arrays.toString(arr1));


    }
}
