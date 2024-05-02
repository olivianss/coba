package TugasPolymorfisme;
class KuePesanan extends Kue {
    private double berat; 

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga, "Kue Pesanan");
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * berat;
    }
}