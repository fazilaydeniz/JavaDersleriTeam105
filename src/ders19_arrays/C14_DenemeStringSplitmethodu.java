package ders19_arrays;

import java.util.Arrays;

public class C14_DenemeStringSplitmethodu {
    public static void main(String[] args) {
        String str= "java gercekten cok cok guzel";
        // verilen str'da kac tane e harfi oldugunu bulunuz

        String[]eArrayi=str.split("e");

        System.out.println(Arrays.toString(eArrayi));

        System.out.println(eArrayi.length);

        System.out.println("Metindeki e sayısı : " +(eArrayi.length-1));

        // 2. yöntem

        String[]tumkarakterlerArr=str.split("");
        System.out.println(Arrays.toString(tumkarakterlerArr));

        int sayac=0;

        for (int i = 0; i <tumkarakterlerArr.length ; i++) {

            if (tumkarakterlerArr[i].equals("e")){

                sayac++;

            }

        }

        System.out.println("Metinde geçen e sayısı : " + sayac);
    }
}
