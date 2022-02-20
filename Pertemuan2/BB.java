package Pertemuan2;
import java.util.*;

public class BB {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Input BB anda : ");
        double BB = a.nextDouble();
        System.out.print("Input TB anda : ");
        double TB = a.nextDouble();
        
        double BMI = BB/(TB*BB);
        System.out.println("BMI anda = " + BMI);
        
        if(BMI < 18.5){
            System.out.println("Anda underweight");
        }else if(BMI >= 18.5 && BMI < 25){
            System.out.println("Anda normal");
        }else if(BMI >= 25 && BMI < 30){
            System.out.println("Anda Overheight");
        }else{
            System.out.println("Anda obesitas");
        }
    }
    
}
