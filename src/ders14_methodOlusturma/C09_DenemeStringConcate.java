package ders14_methodOlusturma;

import java.util.Scanner;

public class C09_DenemeStringConcate {
    // verilen iki String'i parametre olarak kabul edip
    // bu iki String'i aralarinda bir bosluk olan tek bir String olarak
    // main method'a donduren bir method olusturun

    public static void main(String[] args) {
        String str1= "Java ";
        String str2 = "Candir";
        System.out.println(birlestirMethodu(str1, str2));
        System.out.println(birlestirMethodu("Bu da ", "oldu"));


    }

    public static String birlestirMethodu(String str1, String str2) {

        return str1 + str2;
    }
}
