package ders05_concatenation_operatorler;

public class C04_Deneme {
    public static void main(String[] args) {
        // sadece asagida verilen variable'lari kullanarak istenen degerleri yazdiralim

        String s1= "Java";
        String s2= "Guzeldir";
        String s3= ""; // hiclik
        String s4= " "; // space, bosluk

        int sayi1= 4;
        int sayi2= 3;

        // Java7 Guzeldir43

        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);

        //34 Java

        System.out.println(sayi2+sayi1+s4+s1);
        System.out.println(s3+sayi2+sayi1+s4+s1);

        // Java7 Guzeldir43
        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);
    }

}
