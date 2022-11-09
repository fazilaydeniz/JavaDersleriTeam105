package ders14_methodOlusturma;

public class C03_StringTerseCevirme {
    // parametre olarak bir String kabul edip
    // String'in terse cevrilmis halini döndüren bir method olusturun

    public static void main(String[] args) {

        String input = "Java kod yazdıkça öğrenilir";
        System.out.println(stringiTersCevirMethodu(input));
       // System.out.println(stringiTersCevirMethodu("Beykoz baharları çok güzeldir"));
        System.out.println(stringiTersCevirMethodu("Meryem Zahide Aydeniz"));

    }
     public static String stringiTersCevirMethodu(String input){

        String tersStr ="";

         for (int i = input.length()-1; i >=0 ; i--) {

             tersStr= tersStr+ input.charAt(i);

         }
         return tersStr;
     }
}