package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C18_DenemeKullaniciyaListOlusturtma {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(ListeOlustur());

    }

    public static List<String> ListeOlustur() {

        List<String> isimler = new ArrayList<>();

        Scanner scan= new Scanner(System.in);

        String girilenisim="";

        while (!girilenisim.equalsIgnoreCase("Q")){

            System.out.println("Lütfen bir isim giriniz +" +
                    "\n bitirmek için Q'ya basınız");
            girilenisim=scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("Q")){
                isimler.add(girilenisim);
            }
        }

        return isimler;

    }

}



