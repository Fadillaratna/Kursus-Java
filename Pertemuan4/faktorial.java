package Pertemuan4;

public class faktorial {
 
    public static void main(String[] args) {
    System.out.println("\n=================== Menghitung Faktorial ===================");
    long hitung1 = hitungFaktorial(3);
    long hitung2 = hitungFaktorial(6);
    long hitung3 = hitungFaktorial(7);
    long hitung4 = hitungFaktorial(8);
    long hitung5 = hitungFaktorial(20);
    }
    
    private static long hitungFaktorial(long bilangan){
        long hasil = 1;
        for(long i = bilangan; i>0 ; i--){
           hasil*= i;
        }
        System.out.println(bilangan + "! = " + hasil );
        return hasil;
    }
            
}
