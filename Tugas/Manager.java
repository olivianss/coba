package Tugas;
import java.time.LocalDate;

class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public double getPendapatan() {
        return super.getPendapatan() + (0.1 * getGaji());
    }

    public String toString() {
        return String.format("Nama             : %s\n" +
                "NIK              : %s\n" +
                "Jenis Kelamin    : %s\n" +
                "Pendapatan       : $ %.1f\n" + 
                "Tahun Masuk      : %s\n" +
                "Jumlah Anak      : %d\n" +
                "Gaji             : $%.1f\n" + 
                "Departemen       : %s\n" +
                "---------------------------------------\n",
                getNama(), getNik(), getJenisKelamin() ? "Laki-laki" : "Perempuan", getPendapatan(), getTahunMasuk(), getJumlahAnak(), getGaji(), departemen);
    }
}

