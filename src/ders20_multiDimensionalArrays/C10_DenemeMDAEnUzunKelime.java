package ders20_multiDimensionalArrays;

public class C10_DenemeMDAEnUzunKelime {
    public static void main(String[] args) {
        // Verilen multi dimensional String bir array'deki
        // en uzun String'i bulan kod yaziniz

        String [][] arr= {{"Ilker","Nesrin"} ,{"Hasan","Heysem","Adem","Yusuf Enes"}};

        String enUzunKelime=arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

               if (arr[i][j].length()>enUzunKelime.length()){

                   enUzunKelime= arr[i][j];
               }
            }


            }
                     System.out.println("Arraydeki en uzun kelime : " + enUzunKelime);
        }

}
