package sic.academia.mains;
import java.util.Scanner;
import sic.academia.one.Student;

public class StudentDemo_v1_0 {
    public static void main(String[] args) {
        System.out.println("**************************");
        System.out.println("Student Demo v1.0");
        System.out.println("by Olivia Sitorus");
        System.out.println("**************************");
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Ada berapa mahasiswa yang akan didaftarkan? ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine(); 

        Student[] mahasiswa = new Student[jumlahMahasiswa];

        System.out.println("\nIsian data mahasiswa");
        System.out.println("====================");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("  Masukkan nama: ");
            String nama = input.nextLine();
            mahasiswa[i] = new Student(nama);
        }

        System.out.println("\nDeskripsi seluruh mahasiswa");
        System.out.println("===========================");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("    No registrasi: " + mahasiswa[i].getRegistrationNumber());
            System.out.println("    Nama: " + mahasiswa[i].getName());
        }
    }
}
