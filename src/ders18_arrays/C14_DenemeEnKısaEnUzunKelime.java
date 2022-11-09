package ders18_arrays;

public class C14_DenemeEnKısaEnUzunKelime {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr ={"Hasan", "Ilker","Senturk","Omer Faruk"};

       EnKısaEnUzunKelime(arr);
    }

    public static void EnKısaEnUzunKelime(String[] arr){

        String enuzunkelime=arr[0];
        String enkisakelime=arr[0];

        for (int i = 1; i < arr.length ; i++) {

            if (arr[i].length()>=enuzunkelime.length()){

                enuzunkelime=arr[i];
            }

                if (arr[i].length()<=enkisakelime.length()){


        }

    }
        System.out.println(enuzunkelime);
        System.out.println(enkisakelime);
}
}
