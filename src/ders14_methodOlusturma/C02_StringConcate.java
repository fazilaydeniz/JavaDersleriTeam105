package ders14_methodOlusturma;

public class C02_StringConcate {
    // verilen iki String'i parametre olarak kabul edip
    // bu iki String'i aralarinda bir bosluk olan tek bir String olarak
    // main method'a donduren bir method olusturun


    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candir";

        System.out.println(birlestirmethodu(str1,str2));
        System.out.println(birlestirmethodu("Bu da" , "oldu"));
        System.out.println(birlestirmethodu("Anladınız","mı"));
        System.out.println(birlestirmethodu("Anladık","hocam"));

    }

    public static String birlestirmethodu(String str1, String str2){
        return str1 + str2;
    }
}
