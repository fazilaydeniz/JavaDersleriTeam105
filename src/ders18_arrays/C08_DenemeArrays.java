package ders18_arrays;

public class C08_DenemeArrays {
    public static void main(String[] args) {

        int [] arr1= {2,4,6,8,10};

        System.out.println(arr1[2]);

        arr1[3]=20;
        System.out.println(arr1[3]);

        System.out.println(arr1.length);

        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i] + " ");

        }
        arr1[5]=40; // Array'a sonradan ekleme yapılmıyor. Yapılırsa burada sıkıntı göstermiyor ama
                    // yazarken hata veriyor.
        System.out.println(arr1[5]);
    }
}
