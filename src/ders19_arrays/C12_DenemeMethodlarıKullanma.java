package ders19_arrays;

import ders18_arrays.*;

import java.util.Arrays;

public class C12_DenemeMethodlarıKullanma {
    public static void main(String[] args) {
        // verilen bir int array'in elementlerini 2 artirin
        int[] arr = {2, 3, 4};

        arr = C03_ArrayElementleriniArtirma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(C04_ArrayElementleriToplama.pozitifElementleriTopla(arr));

        C05_ArraydeElemanArama.elemanAra(arr,10);

        int[]yeniArr=C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));
    }
}
