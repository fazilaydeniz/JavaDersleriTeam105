package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C16_DenemeSilinecekListe {
    public static void main(String[] args) {

        List<String> isimListesi= new ArrayList<>();

        isimListesi.add("Fazıl");
        isimListesi.add("Zeynep");
        isimListesi.add("Muhsin");
        isimListesi.add("Meryem");

        System.out.println(isimListesi);

        List<String>silinecekliste= new ArrayList<>();
        silinecekliste.add("Fazıl");
        silinecekliste.add("Zeynep");

        isimListesi.removeAll(silinecekliste);
        System.out.println(isimListesi);

        System.out.println(isimListesi.equals(silinecekliste)); // false döner

    }
}
