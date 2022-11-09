package ders12_forLoops;

public class C09_DenemeForLoops {
    public static void main(String[] args) {
        //Kullanıcının verdiği sayının rakamlar toplamını bulun
        int sayi= 98604;
        String sayistr= ""+sayi;


        int birlerbasamagi = 0;
        int rakamlartoplami=0;

        for (int i = 1; i <=sayistr.length() ; i++) {

            birlerbasamagi=sayi%10;
            rakamlartoplami=rakamlartoplami+birlerbasamagi;
            sayi=sayi/10;


        }
        System.out.println(rakamlartoplami);
        }
    }

