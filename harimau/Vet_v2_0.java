package hewan;
import java.util.Scanner;

public class Vet_v2_0 {
    public static void main(String[] args) {
        System.out.println("\n====================" + "\nVet v2.0" + "\nby olivia" + "===================");
        PantheraTigris tiger1 = new PantheraTigris();
        Scanner input = new Scanner(System.in);
        System.out.println("Apakah ID harimau Anda?");
        tiger1.id = input.nextLine();
        System.out.println("Siapakah nama harimau Anda?");
        tiger1.name = input.nextLine();
        System.out.println("Tahun berapa dia dilahirkan?");
        tiger1.yearOfBirth = input.nextInt();
        int umur = 2024 - tiger1.yearOfBirth;
        System.out.println("\nSelamat datang " + tiger1.name + "di vet v2.0" + "\ntahun ini" + tiger1.name + "\ntelah berumur " + umur + "tahun" );
        System.out.println("Ingin mengaum (y/t)?"); 
        String aum = input.next();
        if(aum.equals("y")){
            System.out.println(tiger1.roar());
        }else if (aum.equals("t")){
            System.out.println("Baik tidak apa. Mungkin lain kali");
        }
        System.out.println("Terima kasih telah menggunakan sistem kami.");


        }
    }

