package Pertemuan1;
import java.util.*;
public class volumeKubus {

    public static void main(String[] args) {
    Scanner uI = new Scanner(System.in);  
    System.out.print("Masukkan nilai sisi kubus = ");
    double s = uI.nextDouble();
    double volume = (s * s * s);
    
    System.out.println("Volume Kubus = " + s + " * " + s + " * " + s + " = " + volume + " cm3 ");
    
    }
    
}
