package Pertemuan5;
import java.util.*;
public class programpenjumlahan {

    public static void main(String[] args) {
        System.out.println("================ Membuat Program a + b ================");
        int hasil1 = hitungJumlah(15, 5);
        int hasil2 = hitungJumlah(17, 5);
        int hasil3 = hitungJumlah(119, 4);
        
        int a = 91;
        int b = 11;
        int hasil4 = hitungJumlah(a, b);
    }
    private static int hitungJumlah(int a, int b){
        int hasil = a + b;
        System.out.println(a + " + " + b + " = " + hasil );
        return hasil;
    }
}
