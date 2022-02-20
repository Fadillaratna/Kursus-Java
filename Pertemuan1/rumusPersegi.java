package Pertemuan1;
import java.util.*;
public class rumusPersegi {

    public static void main(String[] args) {
    Scanner uI = new Scanner(System.in);
    System.out.print("Sisi = ");
    double sisi = uI.nextDouble();
    double luas = (sisi * sisi);
    double keliling = (4 * sisi);
    
    System.out.println("Luas Persegi = " + sisi + " * " + sisi + " = " + luas + " cm2");
    System.out.println("Keliling Persegi = " + 4 + " *" + sisi + " = " + keliling + " cm");
    
    
    }
    
}
