package Pertemuan3;

import java.util.Arrays;

public class arraybratching {
    
    public static void main(String[] args) {
        //Membuat array 1-10
        System.out.println("\n=================== ARRAY 1-10 ===================");
        int [] bilangan = {1,2,3,4,5,6,7,8,9,10};
        
          //Print
          System.out.println(Arrays.toString(bilangan));
          
          for (int i = 0; i < bilangan.length; i++){
              System.out.println(bilangan[i]);
          }
          
     //Membuat array genap dan menjumlahkan
       System.out.println("\n=================== ARRAY GENAP ===================");
        int genap [] = {2,4,6,8,10};
        int jumlah = 0;
       for (int j = 0; j < genap.length; j++){
            jumlah = jumlah + genap[j];
        }
        System.out.println(Arrays.toString(genap));
        System.out.println("Jumlah total = "+ jumlah);
        
        
     //Menentukan jumlah ganjil dan genap
        System.out.println("\n=================== MENENTUKAN JUMLAH GANJIL DAN GENAP ===================");
       int bilGenap = 0 ;
       int bilGanjil = 0;
      
       
       int angka [] = {1,2,3,4,5,6,7,8,9,10};
       for (int k = 0; k < angka.length; k++){
           if(k % 2 == 0){
             bilGenap++;
           }else if(k%2 != 0 ){
             bilGanjil++;
           }
       }
        System.out.println("Jumlah bilangan genap = " + bilGenap++);
        System.out.println("Jumlah bilangan ganjil= " + bilGanjil++);
        
         //Pengelompokan Ganjil dan Genap
         System.out.println("\n=================== PENGELOMPOKAN JUMLAH GANJIL DAN GENAP ===================");
         int bil [] = {1,2,3,4,5,6,7,8,9,10};
         System.out.print("Bilangan Ganjil : ");
          for (int i = 0; i < bilangan.length; i++) {
             if(bil[i] %2 != 0){
                 System.out.print (bil[i] + " ");
             }
          }
          
          System.out.println(" ");
          
          System.out.print(" Bilangan Genap : ");
          for (int i = 0; i < bilangan.length; i++) {
             if(bil[i] %2 == 0){
                 System.out.print(bil[i] + " ");
             }
          }
         
    }
    
   
    
}
