package ders19_arrays;

import java.util.Arrays;

public class C13_DenemeBinarySearch {
    public static void main(String[] args) {
        int[]arr= {1,8,9,3,7,2,5,8,1};

        Arrays.sort(arr);

        System.out.println(Arrays.binarySearch(arr,8));
        System.out.println(Arrays.binarySearch(arr,4));
    }
}
