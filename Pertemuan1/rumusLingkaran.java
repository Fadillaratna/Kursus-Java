package Pertemuan1;
import java.util.*;
public class rumusLingkaran {

    public static void main(String[] args) {
    Scanner uI = new Scanner(System.in);
    System.out.print("Diameter = ");
    double d = uI.nextDouble();
    double r = (d / 2);
    
    double luas = ((3.14) * r * r);
    double keliling = ( 2 * (3.14) * r);
    
    System.out.println("r = " + d + " / " + 2 + " = " + r + " cm");
    System.out.println("Luas Lingkaran = " + 3.14 + " * " + r + " * " + r + " = " + luas + " cm2 " );
    System.out.println("Keliling Lingkaran = " + 2 + " * " + 3.14 + " * " + r + " = " + keliling + " cm");
    
    }
    
}
