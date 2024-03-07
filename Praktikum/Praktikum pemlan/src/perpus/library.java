package perpus;
import java.util.Scanner;
 public class library {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        books books = new books();
            System.out.println("***********************************************************"); 
            System.out.println("\t\tP E R P U S T A K A A N");
            System.out.println("***********************************************************"); 
            System.out.println("\t\t     1. TEKNOLOGI"); 
            System.out.println("\t\t     2. FILSAFAT"); 
            System.out.println("\t\t     3. SEJARAH"); 
            System.out.println("\t\t     4. AGAMA"); 
            System.out.println("\t\t     5. PSIKOLOGI"); 
            System.out.println("\t\t     6. POLITIK"); 
            System.out.println("\t\t     7. FIKSI"); 
            System.out.println("\t\t     8. KELUAR"); 
            System.out.println("-----------------------------------------------------------"); 
        System.out.print("Masukkan pilihan Anda: ");
        int kodeBuku = input.nextInt();

        if (kodeBuku == 1) {
            books.tampilkanBuku(books.bukuTek);
        } else if (kodeBuku == 2) {
            books.tampilkanBuku(books.bukuFils);
        } else if (kodeBuku == 3) {
            books.tampilkanBuku(books.bukuAgama);
        } else if (kodeBuku == 4) {
            books.tampilkanBuku(books.bukuFiksi);
        } else if (kodeBuku == 5) {
            books.tampilkanBuku(books.bukuPolitik);
        } else if (kodeBuku == 6) {
            books.tampilkanBuku(books.bukuSejarah);
        } else if (kodeBuku == 7) {
            books.tampilkanBuku(books.bukuPsikologi);
        } else if (kodeBuku == 8) {
            System.out.println("Terima Kasih");
        }
    } 
}
