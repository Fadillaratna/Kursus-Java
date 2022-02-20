package Pertemuan1;

import java.util.Scanner;

public class rumusSuhu {

    public static void main(String[] args) {
    Scanner uI = new Scanner(System.in);
    System.out.print("Masukkan Suhu Celcius = ");
    double celcius =  uI.nextDouble();
    double farenhait = ((celcius * 9/5)+ 32);
    
    System.out.println("Farenhait = (" + celcius + " * 9/5)" + " + "  + 32 + " = " + farenhait + " F");
    }
    
}
