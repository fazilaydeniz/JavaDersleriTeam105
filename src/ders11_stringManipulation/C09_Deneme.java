package ders11_stringManipulation;

public class C09_Deneme {
    public static void main(String[] args) {
        // Soru 1 : Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa, "home home sweet home" yazdirin
        // - cumlede is geciyorsa, "calismak guzeldir"
        // - ikisini de iceriyorsa "Hem ev lazim hem is"
        // - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        String str= "Meryem gelince çantasını bırakıp noodle yer.";

        if (str.contains("ev") && str.contains("iş")) {
            System.out.println("Hem ev lazım hem iş");

        } else if (str.contains("ev")) {
            System.out.println("home home sweet home");

        } else if (str.contains("iş")) {
            System.out.println("Çalışmak güzeldir.");

        }else {
            System.out.println("Çok çalışman lazım");
        }
    }
}
