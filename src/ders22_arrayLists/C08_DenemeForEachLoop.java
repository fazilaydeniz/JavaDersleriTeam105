package ders22_arrayLists;

import java.util.Arrays;

public class C08_DenemeForEachLoop {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 4, 2, 6, 9, 6, 4, 5};

        // bu array'deki 5'den buyuk olan tum elementleri toplayalim
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 5)
                toplam += arr[i];
        }
        System.out.println("for loop ile toplam : " + toplam);

        toplam = 0;
        for (int each : arr) {
            if (each > 5) {
                toplam += each;

            }

        }
        System.out.println("for each loop ile toplam  : " + toplam);
    }







    }

