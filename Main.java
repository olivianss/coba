import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah pasien
        System.out.println("Masukkan jumlah pasien: ");
        int jumlahPasien = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline

        // Array untuk menyimpan data pasien
        Pasien[] daftarPasien = new Pasien[jumlahPasien];

        // Input data pasien
        for (int i = 0; i < jumlahPasien; i++) {
            System.out.println("Masukkan nama pasien ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();

            System.out.println("Masukkan umur pasien ke-" + (i + 1) + ": ");
            int umur = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            System.out.println("Masukkan NIK pasien ke-" + (i + 1) + ": ");
            long nik = scanner.nextLong();
            scanner.nextLine(); // Membersihkan newline

            System.out.println("Masukkan kategori asuransi pasien ke-" + (i + 1) + " (1= Biasa, 2= VIP, 3= VVIP): ");
            int kategoriAsuransi = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            // Membuat objek Pasien baru dan menyimpannya dalam array
            daftarPasien[i] = new Pasien(nama, umur, nik, kategoriAsuransi);
        }

        // Input layanan untuk setiap pasien
        for (int i = 0; i < jumlahPasien; i++) {
            System.out.println("Masukkan layanan untuk pasien " + daftarPasien[i].getNama() + ": ");
            System.out.println("1. Check-Up (Rp. 20,000.00)");
            System.out.println("2. Rawat Gigi (Rp. 40,000.00)");
            System.out.println("3. Dokter Umum (Rp. 75,000.00)");
            System.out.println("4. Dokter Spesialis (Rp. 100,000.00)");

            System.out.println("Pilih layanan untuk pasien " + daftarPasien[i].getNama() + ": ");
            int layanan = scanner.nextInt();
            double tagihanLayanan = 0;

            // Menetapkan harga layanan berdasarkan pilihan
            switch (layanan) {
                case 1:
                    tagihanLayanan = 20000;
                    break;
                case 2:
                    tagihanLayanan = 40000;
                    break;
                case 3:
                    tagihanLayanan = 75000;
                    break;
                case 4:
                    tagihanLayanan = 100000;
                    break;
                default:
                    System.out.println("Layanan tidak valid.");
                    break;
            }

            // Menambahkan tagihan layanan ke total tagihan pasien
            daftarPasien[i].tambahTagihan(tagihanLayanan);
        }

        // Menghitung total tagihan dan potongan harga
        for (int i = 0; i < jumlahPasien; i++) {
            daftarPasien[i].hitungPotonganHarga();
        }

        // Menampilkan tagihan setiap pasien
        System.out.println("Tagihan setiap pasien: ");
        for (int i = 0; i < jumlahPasien; i++) {
            System.out.printf("Rp. %.2f%n", daftarPasien[i].getTotalTagihan());
        }
    }
}