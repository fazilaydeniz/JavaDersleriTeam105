package ders06_IfElseStatements;

import java.util.Scanner;

public class C17_DenemeIfElse {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli olabilirsiniz");
        } else {
            System.out.println("Emekli olamazsınız. Emekli olabilmek için "  + (65-yas)+  " yıl daha çalışmalısınız." );
        }
    }
}
