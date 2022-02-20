package Pertemuan4;

public class perulangan {

    public static void main(String[] args) {
        //Perulangan while
        System.out.println("\n=================== Perulangan While ===================");
        int i = 0;
        int hasil1 = 0;
        while (i < 5) {
            hasil1= hasil1 + i;
            System.out.println(i);
            i++;
        }

        System.out.println("Jumlah = " + hasil1);
        
        //Perulangan  do while
        System.out.println("\n=================== Perulangan Do While ===================");
        int m = 0;
        int hasil2 = 0;
        do{
            hasil2 = hasil2 + m;
            System.out.println(m);
            m++; 
        }while(m<5);
        
        System.out.println("Jumlah = " + hasil2);
        
        //Perulangan for
         System.out.println("\n=================== Perulangan For ===================");
         int j;
         int hasil3 = 0;
         for( j = 0; j<5; j++){
             hasil3 = hasil3 + j;
             System.out.println(j);
         }
         
         System.out.println("Jumlah = " + hasil3);
         

           
      //Menjumlahkan hasil dari perualangan while, do while, dan for
        System.out.println("\n=== Menjumlahkan hasil dari perualangan while, do while, dan for ===");
      int jumlah = hasil1 + hasil2 + hasil3;
        System.out.println("Jumlah = " + hasil1 + " + " + hasil2  + " + "+ hasil3+ " = " + jumlah);
    }
    
    

}
