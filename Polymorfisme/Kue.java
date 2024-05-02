package Polymorfisme;
public abstract class Kue {
    private String nama;
    private double harga;
    private String jenis;

    public Kue(String nama, double harga, String jenis) {
        this.nama = nama;
        this.harga = harga;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getJenis() {
        return jenis;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return String.format("Nama kue   : %s\nHarga      : Rp %,.2f\nJenis Kue  : %s\n", nama, harga, jenis);
    }
}

