package ders17_scope;

public class C06_DenemeObjectVariables {

    public static void main(String[] args) {

       C03_ObjectVariables pers1= new C03_ObjectVariables();

        pers1.persIsmi="Süleyman";
        pers1.persYasi=35;
        pers1.persTelefonu= "0 5352521465";
        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);
        System.out.println(pers1.persTelefonu);


        C03_ObjectVariables pers2= new C03_ObjectVariables();
        pers2.persIsmi="Meryem";
        pers2.persYasi=20;
        pers2.persTelefonu="0 532 555 2555555";
        System.out.println(pers2.persIsmi);

    }
}
