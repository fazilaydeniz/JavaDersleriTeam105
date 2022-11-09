package ders18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C13_DenemeKullanıcıyaArrayOluşturma {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan array’in boyutunu
        // ve elementlerini alip array’i olusturan
        // ve bize donduren bir method olusturun.}
            int[]kullanıcıArrayi=ArrayOlustur();
        System.out.println(Arrays.toString(kullanıcıArrayi));

        }
        public static int[] ArrayOlustur(){

        Scanner scan= new Scanner(System.in);
            System.out.println("Lütfen oluşturmak istediğiniz Array'in boyutunu giriniz");
            int lenght= scan.nextInt();
            int [] kullaniciArrayi= new int[lenght];

            for (int i = 0; i < lenght ; i++) {

                System.out.println("Array'e yüklemek istediğiniz sayıyı giriniz");
                kullaniciArrayi[i]= scan.nextInt();

            }
            return kullaniciArrayi;
        }

}
