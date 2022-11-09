package ders13_nestedForLoop_methodOlusturma;

public class C15_DenemeStringiTersKaydedipYazdirma {
    // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
    public static void main(String[] args) {

        String input= "Beykoz'da manzara çok güzel";
        String tersInput="";

        for (int i = input.length()-1; i >=0 ; i--) {
            tersInput+=input.charAt(i);


        }
        System.out.println(tersInput);
    }
}
