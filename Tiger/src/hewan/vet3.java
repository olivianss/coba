package hewan;

import java.util.Scanner;

public class vet3 {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("=============================");
    System.out.println("Vet_v3_0");
    System.out.println("by Olivia Sitorus");
    System.out.println("===============================");

    PantheraTigris tiger1 = new PantheraTigris();

    System.out.println("\nApakah ID harimau anda?");
    tiger1.id = input.nextLine();

    System.out.println("\nSiapakah nama harimau anda?");
    tiger1.name = input.nextLine();

    System.out.println("\nTahun berapa dia lahir? ");
    tiger1.yearOfBirth = input.nextInt();

    System.out.println("Tahun berapa saat ini?");
    int year = input.nextInt();

    tiger1.age = tiger1.getAge(year);

    System.out.println("\nSelamat datang " + tiger1.name + " di Vet v3.0");

    System.out.println("Tahun ini " + tiger1.name + " telah berumur " + tiger1.getAge(year) + " tahun");

    System.out.println("Ingin mengaum? (y/t)");
    String aum = input.next();

    if(aum.equals("y")){
        System.out.println(tiger1.roar());
    }
    else if (aum.equals("t")){
        System.out.println("Baik tidak apa. Mungkin lain kali");
    }

    System.out.println("Terima kasih telah menggunakan sistem kami.");

// access modifier
// kalau level class kemungkinan hanya 2 yaitu public dan package private

//private = hanya bisa diakses oleh kelas yang memilikinya
//package
//pubic dapat diakses dari mana pun
//protected

//field kalau tidak ada kepeluan jadikan private
//method kalau tidak ada keperluan jadikan public



    
}
    
}
