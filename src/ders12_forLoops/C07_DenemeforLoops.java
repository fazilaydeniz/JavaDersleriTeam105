package ders12_forLoops;

public class C07_DenemeforLoops {
    public static void main(String[] args) {
        //1'den 100e kadar olan sayıları yazdırın.
        for (int i = 0; i <100 ; i++) {
            System.out.print(i + " ");
        }
        for (int i = 100; i <999 ; i++) {

            if (i%23==0){
                System.out.println(i);
            }

        }
    }
}