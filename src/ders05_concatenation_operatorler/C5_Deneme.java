package ders05_concatenation_operatorler;

public class C5_Deneme {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        System.out.println(a>b && b<0);

        System.out.println(a<=b-5 && a> b-8);

        boolean c;

        System.out.println(c=15>=b && a<0);
        c= a>=b && 3*a<4*b;
        System.out.println(c);
    }
}
