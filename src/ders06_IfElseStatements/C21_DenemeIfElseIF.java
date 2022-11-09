package ders06_IfElseStatements;

import java.util.Scanner;

public class C21_DenemeIfElseIF {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // kenar uzunluklari 0 veya negatifse gecersiz kenar uzunlugu yazdirin
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1<=0 || kenar2<=0 || kenar3<=0){
            System.out.println("Geçersiz Kenar Uzunluğu");
        } else if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("Bu bir eşkenar üçgendir");

        }else{
            System.out.println("Bu bir eşkenar üçgen değildir.");
        }


    }
}
