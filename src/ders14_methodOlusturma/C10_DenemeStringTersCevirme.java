package ders14_methodOlusturma;

public class C10_DenemeStringTersCevirme {
    // parametre olarak bir String kabul edip
    // String'in terse cevrilmis halini döndüren bir method olusturun

    public static void main(String[] args) {
        String input= "Java kod yazdıkça güzelleşiyor.";
        System.out.println(stringiTersCevirMethodu(input));

    }

    public static String stringiTersCevirMethodu(String input){

        String tersStr="";
        for (int i =input.length()-1; i>=0 ; i--) {
            tersStr= tersStr+ input.charAt(i);
                    }
        return tersStr;
    }
}
