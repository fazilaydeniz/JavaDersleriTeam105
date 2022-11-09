package ders09_StringManipulations;

public class C05_length {
    public static void main(String[] args) {

        String str = "Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length()); // 34

        // son karakteri yazdirin

        System.out.println(str.charAt(33)); // u
        System.out.println(str.charAt(str.length()-1)); // son karakteri elde etmek icin kullanilir

        // sondan 3.karakteri yazdirin

        System.out.println(str.charAt(str.length()-3)); // g

        String str5 = "Mehmet Fazıl Aydeniz";
        System.out.println(str5.length());
        System.out.println(str5.charAt(19));
        System.out.println(str5.charAt(str5.length()-4));


    }
}
