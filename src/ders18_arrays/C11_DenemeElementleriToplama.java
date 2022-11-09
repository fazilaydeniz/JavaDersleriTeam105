package ders18_arrays;

public class C11_DenemeElementleriToplama {
    public static void main(String[] args) {
        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.

        int[] arr = {3, -3, 8, -7, -6, 11, -2};
        System.out.println("İşlem Sonucu: " + elementleriToplamaMethodu(arr));


    }

    public static int elementleriToplamaMethodu(int[] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                toplam += arr[i];

            }

        }
        return toplam;
    }
}
