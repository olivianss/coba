package hewan;

import java.util.Scanner;

public class Vet_v2 {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("=============================");
    System.out.println("Vet_v2_0");
    System.out.println("by Olivia Sitorus");
    System.out.println("===============================");

    PantheraTigris tiger1 = new PantheraTigris();

    System.out.println("\nApakah ID harimau anda?");
    tiger1.id = input.nextLine();

    System.out.println("\nSiapakah nama harimau anda?");
    tiger1.name = input.nextLine();

    System.out.println("\nTahun berapa dia lahir? ");
    tiger1.yearOfBirth = input.nextInt();


    tiger1.age = tiger1.getAge();

    System.out.println("\nSelamat datang " + tiger1.name + " di Vet v2.0");

    System.out.println("Tahun ini " + tiger1.name + " telah berumur " + tiger1.age + " tahun");

    System.out.println("Ingin mengaum? (y/t)");
    String aum = input.next();

    if(aum.equals("y")){
        System.out.println(tiger1.roar());
    }
    else if (aum.equals("t")){
        System.out.println("Baik tidak apa. Mungkin lain kali");
    }

    System.out.println("Terima kasih telah menggunakan sistem kami.");




    
}
}
