package ders12_forLoops;

public class C08_DenemeFaktöryel {
    public static void main(String[] args) {
        //Kullanıcının verdiği sayının faktöryelini bulalım.
        // 5 ! = 5 * 4 * 3 * 2 * 1 =120
         //Kullanıcıdan bir sayı alıp faktöryelini bulalım.
        int sayi = 10;
        int faktoryel = 1;
        for (int i = sayi; i >1 ; i--) {

            faktoryel= faktoryel*i;
        }
        System.out.println(faktoryel);

        //1den 100e kadar olan sayıları toplayın.

        int toplam= 0;
        for (int i = 1; i <=100 ; i++) {
            toplam= toplam +i;

        }
        System.out.println(toplam);


            
        }

    }
    
        


