package ders15_overloading_whileLoop;

public class C12_DenemeWhileLoop {
    // Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
    // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.
    public static void main(String[] args) {

        int sayi=3;
        int us= 4;
        ushesapla(sayi,us);

    }
    public static void ushesapla(int sayi, int us){
        int sonuc=1;

        while (us>0){
            sonuc*=sayi;
            us--;
        }
        System.out.println(sonuc);
    }



    }
