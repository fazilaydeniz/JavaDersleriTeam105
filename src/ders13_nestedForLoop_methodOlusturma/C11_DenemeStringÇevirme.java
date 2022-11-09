package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C11_DenemeStringÇevirme {
    public static void main(String[] args) {
        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedip, yazdırın.
        //Scanner scan= new Scanner(System.in);
        //System.out.println("Lüttfen isminizi ve soyisminizi giriniz");
       // String str =scan.nextLine();
        String input= "Java gün geçtikçe güzelleşiyor";
        String tersInput="";

        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));

        }


    }
}
