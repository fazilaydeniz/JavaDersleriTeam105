package ders06_IfElseStatements;

import java.util.Scanner;

public class C19_DenemeIfElse {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz." );
        char harf = scan.next().charAt(0);

        if (harf>='a' && harf<='z'){
            //Küçük harftir
            System.out.println((char)(harf-32));
        }else{
            // küçük harf değildir.

        }







    }
}
