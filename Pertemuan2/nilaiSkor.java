package Pertemuan2;
import java.util.*;
public class nilaiSkor {

    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("Input nilai  = ");
        int nilai = a.nextInt();
       char skor= 'D';
       if (nilai <= 100){
             if(nilai > 85 &&  nilai <= 100){//86, 87, 88, 89, 90,..., 99
           skor = 'A';
           System.out.println("Skor anda " + skor);
       }else if(nilai > 70 && nilai <= 84){//70,71,72,73,74,...83
           skor = 'B';
           System.out.println("Nilai anda " + skor);
       }else if(nilai <= 69 && nilai > 60){//61,62,63,64,65,66,67,68,
           skor = 'C';
           System.out.println("Nilai anda " + skor);
       }else{
           skor = 'D';
           System.out.println("Nilai anda " + skor);
       }
       }else{
           System.out.println("Mohon maaf anda salah");
       }
     
    }
    
}
