package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C10_DenemeForLoop {
    public static void main(String[] args) {
        // Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.


        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz");
        String input2 = scan.nextLine();

        for (int j = input2.length() - 1; j >= 0; j--) {

            System.out.print(input2.charAt(j));
        }

    }
}

