package Pertemuan4;

public class perpangkatan {

    public static void main(String[] args) {
    System.out.println("\n=================== Menghitung Perpangkatan ===================");
    int hitung1 = hasilPangkat(2, 5);
    int hitung2 = hasilPangkat(5, 6);
    int hitung3 = hasilPangkat(3, 5);
    
    
    }
    private static int hasilPangkat(int angka, int pangkat){
        int hasil = 1;
        for(int i = 1 ; i<=pangkat ;i++){
        hasil*= angka;
       }
       System.out.println(angka + " pangkat " + pangkat+ " = "+ hasil);
       return hasil;
        
    }
}
