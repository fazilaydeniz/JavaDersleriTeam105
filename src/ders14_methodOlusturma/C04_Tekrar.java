package ders14_methodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // bu iki sayinin carpim sonucunu yeni kod yazmadan konsola yazdirin

        System.out.println(C01_Carpim.carpimMethodu(a, b));

        String c = "Nasil ";
        String d = "yani?";
        // Bu iki String'i aralarinda bir bosluk birakarak yazdirin

        System.out.println(C02_StringConcate.birlestirmethodu(c, d));

        // "Bu cumleyi terse cevirin
        String e = "bu cumleyi ters cevirin";
        System.out.println(C03_StringTerseCevirme.stringiTersCevirMethodu(e));

        String str="bu java cok guzel";
        // str'i buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase());

    }


}
