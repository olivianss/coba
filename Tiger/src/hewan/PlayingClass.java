package hewan;
import java.util.Scanner;

public class PlayingClass {
    public static void main(String[] args)  {

        //final int KONSTANTA_x = 11;
        //System.out.println(KONSTANTA_X);

        int x ;
        x = 13;

        PantheraTigris tiger1, tiger2;
        tiger1 = new PantheraTigris();
        tiger1.id ="t1";
        tiger1.colour = "coklat";
        tiger1.yearOfBirth = 2019;

        tiger2 = new PantheraTigris();
        tiger2.id ="t2";
        tiger2.colour = "putih";
        tiger2.yearOfBirth = 2021;

        

        System.out.println("Spesisfikasi harimau 1\n" +
         "ID: " + tiger1.id + "\nWarna: " + tiger1.colour +
         "\nTahun lahir " + tiger1.yearOfBirth + 
         "\nSuara makan: " + tiger1.eat() +
         "\nSuara mengaum " + tiger1.roar());
         tiger1.roar();
         tiger1.eat();

         System.out.println();

        System.out.println("Spesifikasi harimau 2\n" +
        "ID: " + tiger2.id + "\nWarna: " + tiger2.colour + "\nTahun Lahir : " + tiger2.yearOfBirth);

        // contoh camel case
        //TataKelas = Tata sebagai nama kelas dan Kelas sebagai nama method
 
        
    }
}
