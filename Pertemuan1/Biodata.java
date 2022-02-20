package Pertemuan1;
import java.util.Scanner;
public class Biodata {

    public static void main(String[] args) {
      Scanner uI = new Scanner(System.in);

      System.out.print("Nama : ");
      String nama = uI.nextLine();
      System.out.print("Tempat Tanggal Lahir : ");
      String tTL = uI.nextLine();
      System.out.print("Alamat : " );
      String alamat = uI.nextLine();
      System.out.print("Sekolah : ");
      String sekolah = uI.nextLine();
      System.out.print("Hobi : ");
      String hobi = uI.nextLine();
      System.out.print("Umur : " );
      int umur = uI.nextInt();
      
        System.out.println("==================== BIODATA ====================");
      
      System.out.println("Nama : " + nama);  
      System.out.println("Umur : " + umur); 
      System.out.println("Tempat Tanggal Lahir : " + tTL);
      System.out.println("Alamat : " + alamat);
      System.out.println("Sekolah : " +sekolah);
      System.out.println("Hobi : " + hobi);
      
    }
    
}
