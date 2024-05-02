package Polymorfisme;
public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];
        daftarKue[0] = new KueJadi("Klepon", 9000.0, 10);
        daftarKue[1] = new KuePesanan("Onde-onde", 2000.0, 100);
        daftarKue[2] = new KueJadi("Martabak Manis", 20000.0, 2);
        daftarKue[3] = new KuePesanan("Kue Lapis", 3000.0, 100);
        daftarKue[4] = new KueJadi("Kue Cubit", 3000.0, 10);
        daftarKue[5] = new KuePesanan("Kue Balok", 4000.0, 200);
        daftarKue[6] = new KueJadi("Lumpia Semarang", 5000.0, 5);
        daftarKue[7] = new KuePesanan("Kue Putu", 2000.0, 150);
        daftarKue[8] = new KueJadi("Kue Rangi", 7000.0, 4);
        daftarKue[9] = new KuePesanan("Kue Lumpur", 2500.0, 100);
        daftarKue[10] = new KueJadi("Pastel", 6000.0, 8);
        daftarKue[11] = new KuePesanan("Kue Ape", 6000.0, 200);
        daftarKue[12] = new KueJadi("Kue Serabi", 12000.0, 3);
        daftarKue[13] = new KuePesanan("Kue Clorot", 9000.0, 100);
        daftarKue[14] = new KueJadi("Kue Leker", 8000.0, 6);
        daftarKue[15] = new KuePesanan("Kue Talam", 20000.0, 150);
        daftarKue[16] = new KueJadi("Kue Bugis", 10000.0, 4);
        daftarKue[17] = new KuePesanan("Kue Mangkok", 20000.0, 200);
        daftarKue[18] = new KueJadi("Kue Dadar Gulung", 10000.0, 5);
        daftarKue[19] = new KuePesanan("Kue Pancong", 10000.0, 100);

        double totalHargaSemua = 0;
        for (Kue kue : daftarKue) {
            totalHargaSemua += kue.hitungHarga();
        }

        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        for (Kue kue : daftarKue) {
            if (kue.getJenis().equals("Kue Pesanan")) {
                totalHargaPesanan += kue.hitungHarga();
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            }
        } 

        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        for (Kue kue : daftarKue) {
            if (kue.getJenis().equals("Kue Jadi")) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }
        }

        String jenisKueTertinggi = "";
        String namaKueTertinggi = "";
        double hargaTertinggi = 0;

        for (Kue kue : daftarKue) {
            if (kue.getHarga() > hargaTertinggi) {
                hargaTertinggi = kue.getHarga();
                jenisKueTertinggi = kue.getJenis();
                namaKueTertinggi = kue.getNama();
            }
        }

        System.out.println("=============== DAFTAR KUE ===============");
        for (Kue kue : daftarKue) {
            if (kue != null) {
                System.out.println(kue);
            }
        }

        System.out.println("\n=================[S T A T S]====================");
        System.out.printf("TOTAL HARGA SEMUA KUE        : Rp %,.2f\n", totalHargaSemua);
        System.out.printf("\nTOTAL HARGA KUE PESANAN      : Rp %,.2f\n", totalHargaPesanan);
        System.out.printf("TOTAL BERAT KUE PESANAN      : %.1f gram \n", totalBeratPesanan);
        System.out.printf("\nTOTAL HARGA KUE JADI         : Rp %,.2f \n", totalHargaJadi);
        System.out.println("TOTAL JUMLAH KUE JADI        : " + totalJumlahJadi + " buah ");
        System.out.println();

        System.out.println("KUE DENGAN HARGA TERTINGGI");
        System.out.println("  Berdasarkan jenis kue     : " + jenisKueTertinggi);
        System.out.println("  Berdasarkan nama Kue      : " + namaKueTertinggi);
    }
}
