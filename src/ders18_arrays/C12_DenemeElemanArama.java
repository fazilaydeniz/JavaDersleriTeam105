package ders18_arrays;

public class C12_DenemeElemanArama {
    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de istenen bir elemanin
        // var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {1,2,4,5,3,4,6,7,4,2,3,4,5,1,3,4,2};
        int arananeleman=4;

        elemanAramaMethodu(arr,arananeleman);



    }
    public static void elemanAramaMethodu(int[]arr, int arananEleman){

        int sayac= 0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==arananEleman){
                sayac++;



            }

        }
        if (sayac==0){
            System.out.println("Array'de aranan sayı yoktur.");
        }else {
            System.out.println("Aranan " + arananEleman  + " sayisi, array'de " + sayac + " kere kullanilmis");
        }

    }


}
