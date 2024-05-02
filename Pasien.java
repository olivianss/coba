import java.util.Scanner;

class Pasien {
    private String nama;
    private int umur;
    private long nik;
    private int kategoriAsuransi;
    private double totalTagihan;

    // Constructor
    public Pasien(String nama, int umur, long nik, int kategoriAsuransi) {
        this.nama = nama;
        this.umur = umur;
        this.nik = nik;
        this.kategoriAsuransi = kategoriAsuransi;
        this.totalTagihan = 0;
    }

    // Setter dan Getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public long getNik() {
        return nik;
    }

    public int getKategoriAsuransi() {
        return kategoriAsuransi;
    }

    public double getTotalTagihan() {
        return totalTagihan;
    }

    public void setTotalTagihan(double totalTagihan) {
        this.totalTagihan = totalTagihan;
    }

    // Method untuk menghitung total tagihan berdasarkan layanan
    public void tambahTagihan(double tagihanLayanan) {
        this.totalTagihan += tagihanLayanan;
    }

    // Method untuk menghitung potongan harga berdasarkan kategori asuransi
    public void hitungPotonganHarga() {
        if (kategoriAsuransi == 3) {
            totalTagihan *= 0.5; // Potongan 50%
        } else if (kategoriAsuransi == 2) {
            totalTagihan *= 0.8; // Potongan 20%
        }
    }
}