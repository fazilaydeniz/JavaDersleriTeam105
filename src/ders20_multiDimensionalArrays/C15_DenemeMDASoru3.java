package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C15_DenemeMDASoru3 {
    public static void main(String[] args) {
        // Soru 3- Verilen 2 katli bir array’de
        // her bir ic array’deki elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //	input :      int[][] arr =  {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        //	output:                       [10, 3, 12, 10, 9]


        int[][] arr =  {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int []output= new int[arr.length];

        int innerarraytoplami=0;

        for (int i = 0; i < arr.length ; i++) {
            innerarraytoplami=0;
            for (int j = 0; j < arr[i].length; j++) {

                innerarraytoplami+=arr[i][j];

            }
           output[i]= innerarraytoplami;
        }
        System.out.println(Arrays.toString(output));
    }
}
