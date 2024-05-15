package Tugas_Interface;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee currentEmployee = null;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("========= KOPERASI =========");
            System.out.println("Pilihan program :");
            System.out.println("1. Login");
            System.out.println("2. Belanja");
            System.out.println("3. Lihat detail belanja");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama anda                : ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan nomor registrasi pegawai : ");
                    int registrationNumber = scanner.nextInt();
                    System.out.print("Masukkan jumlah gaji perbulan     : ");
                    int salaryPerMonth = scanner.nextInt();
                    scanner.nextLine(); 
                    currentEmployee = new Employee(registrationNumber, name, salaryPerMonth);
                    break;
                case 2:
                    if (currentEmployee != null) {
                        while (true) {
                            System.out.println();
                            System.out.println("========= DAFTAR PRODUK =========");
                            System.out.printf("%2d. %-15s %s%n", 1, "Air mineral", "Rp 4,500.00");
                            System.out.printf("%2d. %-15s %s%n", 2, "Pulpen", "Rp 2,000.00");
                            System.out.printf("%2d. %-15s %s%n", 3, "Spidol", "Rp 3,000.00");
                            System.out.printf("%2d. %-15s %s%n", 4, "Buku tulis", "Rp 5,000.00");
                            System.out.printf("%2d. %-15s %s%n", 5, "Pensil", "Rp 1,500.00");
                            System.out.printf("%2d. %-15s %s%n", 6, "Penghapus", "Rp 1,000.00");
                            System.out.printf("%2d. %-15s %s%n", 7, "Penggaris", "Rp 3,000.00");
                            System.out.printf("%2d. %-15s %s%n", 8, "Rautan", "Rp 2,500.00");
                            System.out.printf("%2d. %-15s %s%n", 9, "Stapler", "Rp 8,000.00");
                            System.out.printf("%2d. %-15s %s%n", 10, "Klip kertas", "Rp 500.00");
                            System.out.println("11. Selesai belanja");
                            System.out.print("Masukkan pilihan produk: ");
                            int productChoice = scanner.nextInt();
                            if (productChoice == 11) {
                                System.out.println("USERINFO: Anda telah mengakhiri belanja.");
                                break;
                            }
                            System.out.print("Masukkan jumlah yang ingin dibeli: ");
                            int quantity = scanner.nextInt();
                            scanner.nextLine(); 

                            String productName = "";
                            int pricePerItem = 0;

                            switch (productChoice) {
                                case 1:
                                    productName = "Air mineral";
                                    pricePerItem = 4500;
                                    break;
                                case 2:
                                    productName = "Pulpen";
                                    pricePerItem = 2000;
                                    break;
                                case 3:
                                    productName = "Spidol";
                                    pricePerItem = 3000;
                                    break;
                                case 4:
                                    productName = "Buku tulis";
                                    pricePerItem = 5000;
                                    break;
                                case 5:
                                    productName = "Pensil";
                                    pricePerItem = 1500;
                                    break;
                                case 6:
                                    productName = "Penghapus";
                                    pricePerItem = 1000;
                                    break;
                                case 7:
                                    productName = "Penggaris";
                                    pricePerItem = 3000;
                                    break;
                                case 8:
                                    productName = "Rautan";
                                    pricePerItem = 2500;
                                    break;
                                case 9:
                                    productName = "Stapler";
                                    pricePerItem = 8000;
                                    break;
                                case 10:
                                    productName = "Klip kertas";
                                    pricePerItem = 500;
                                    break;
                                default:
                                    System.out.println("Pilihan produk tidak valid.");
                                    continue;
                            }

                            Invoice invoice = new Invoice(productName, quantity, pricePerItem);
                            currentEmployee.addInvoice(invoice);
                        }
                    } else {
                        System.out.println("Silakan login terlebih dahulu.");
                    }
                    break;
                case 3:
                    if (currentEmployee != null) {
                        currentEmployee.displayEmployeeDetails();
                    } else {
                        System.out.println("Silakan login terlebih dahulu.");
                    }
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
