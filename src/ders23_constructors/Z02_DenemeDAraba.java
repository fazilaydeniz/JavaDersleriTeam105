package ders23_constructors;

public class Z02_DenemeDAraba {

    String Marka="Marka belirtilmedi";
    String Model="Model belirtilmedi";
    String Yakit;
    int Yil;
    int Fiyat;


    public String toString() {
        return "Araba Özellikleri: " +
                "\n Marka : " + Marka +
                "\n Model : " + Model +
                "\n Yakit : " + Yakit +
                "\n Yil   : " + Yil +
                "\n Fiyat : " + Fiyat ;
    }
}
