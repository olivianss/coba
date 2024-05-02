

public class Manusia {
    private String nama;
    private String nik;
    private boolean jenisKelamin;
    private boolean Sudahmenikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.Sudahmenikah = Sudahmenikah;
    }
    public String getNama() {
        return nama;
    }
    public String getJenisKelamin() {
        return jenisKelamin ? "Laki - laki" : "Perempuan";
    }
    public String getNik(){
        return nik;
    }

public String getSudahMenikah () {
    String menikah = "";
    if (Sudahmenikah == true) {
        menikah = "menikah";
    } else {
        menikah = "Blom menikah";
    }
    return menikah;
}

public double getTunjangan() {
    double tunjangan = 0.0;
    if (Sudahmenikah == true) {
        if (jenisKelamin == true) {
            tunjangan = 25000;
        } else if (jenisKelamin == false) {
            tunjangan = 20000;
        }
        else {
            tunjangan = 15000;
        }
    }
    return tunjangan;
    }
    public double getPendapatan(){
        double pendapatan = 0.0;
        if (jenisKelamin == true) {
            pendapatan = 50000;
        } else {
            pendapatan = 30000;
        }
        return pendapatan;
    }
    public double getTotalPendapatan(){
        double totalPendapatan = getTunjangan() + getPendapatan();
        return totalPendapatan;
    }
    public String toString(){
        return "Nama : " + getNama() +
                "NIK : " + getNik() +
                "Jenis Kelamin : " + getJenisKelamin() + 
                "Pendapatan : Rp" + getPendapatan();
    }
}
