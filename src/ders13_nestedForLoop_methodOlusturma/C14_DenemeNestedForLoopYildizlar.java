package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C14_DenemeNestedForLoopYildizlar {
       public static void main(String[] args) {
        //  soru 6 nested for loop kullanarak aşağıdaki şekli oluşturunuz.
        /*
         * * * * * * * *
         * * * * * *
         * * * *
         * *
         *
         */
        // Scanner scan =new Scanner(System.in);
        //  System.out.println("Yildiz yuksekligini giriniz");
        //  int yildiz=scan.nextInt();
        int yildiz=8;
        for (int i = 1; i <=8;i+=2) {
            for (int j = 0; j <=8-(i) ; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
    }
}