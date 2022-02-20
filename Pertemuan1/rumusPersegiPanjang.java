package Pertemuan1;
import java.util.*;
public class rumusPersegiPanjang {

    public static void main(String[] args) {
    Scanner uI = new Scanner(System.in);
    System.out.print("Masukkan Panjang = ");
    double p = uI.nextDouble();
    System.out.print("Masukkan Lebar = ");
    double l = uI.nextDouble();
    double luas = (p * l);
    double keliling = (2 * (p + l));
    
    System.out.println("Luas Persegi Panjang = " + p + " * " + l + " = " + luas + " cm2");
    System.out.println("Keliling Persegi Panjang = " + 2  +  " * (" + p + " + " + l + " ) = " + keliling + " cm");
    }
    
}
