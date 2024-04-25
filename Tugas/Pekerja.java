package Tugas;
import java.time.LocalDate;

class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji,LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int lamaKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaKerja <= 5) {
            return 0.05 * gaji;
        } else if (lamaKerja <= 10) {
            return 0.1 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    public double getPendapatan() {
        double tunjanganMenikah = getMenikah() ? super.getTunjangan() : 0; 
        double tunjanganAnak = jumlahAnak * 20; 
        double bonus = getBonus(); 
        return gaji + tunjanganMenikah + tunjanganAnak + bonus;
    }

    public double getGaji() {
        return gaji;
    }

    public String toString() {
        return String.format("Nama             : %s\n" +
                "NIK              : %s\n" +
                "Jenis Kelamin    : %s\n" +
                "Pendapatan       : $ %.1f\n" +
                "Tahun Masuk      : %s\n" +
                "Jumlah Anak      : %d\n" +
                "Gaji             : $%.1f\n" +
                "---------------------------------------\n",
                getNama(), getNik(), getJenisKelamin() ? "Laki-laki" : "Perempuan", getPendapatan(),tahunMasuk, jumlahAnak, getGaji());
    }
}
