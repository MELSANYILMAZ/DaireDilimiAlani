/*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        int r,a ;
        double pi=3.14;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz:");
        r = inp.nextInt();
        System.out.print("a'yi giriniz:");
        a=inp.nextInt();

        double alan = ( (pi) * (r*r) * (a)) / 360.0;


        System.out.print("daire diliminin alanı:"+ alan);
    }
}