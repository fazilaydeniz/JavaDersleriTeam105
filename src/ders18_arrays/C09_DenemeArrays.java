package ders18_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C09_DenemeArrays {
    public static void main(String[] args) {

        String [] arr= {"Ali", "Ulus","Nesrin"};

        // Bu array'in tum elementlerini aralarinda bir bosluk birakarak yazdiralim

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");


        }
          System.out.println("");
        System.out.println(Arrays.toString(arr));
    }
}
