package Tugas;

class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk < 3.5) {
            return 50;
        } else if (ipk >= 3.5 && ipk <= 4) {
            return 75;
        } else {
            return 0;
        }
    }

    public double getPendapatan() {
        return getBeasiswa() + super.getTunjangan();
    }

    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodi = Character.getNumericValue(nim.charAt(6)); 
        String[] prodiNames = {"Teknik Informatika", "Teknik Komputer", "Sistem Informasi","Pendidikan Teknologi Informasi", "Teknologi Informasi"};
    
        if (prodi >= 2 && prodi <= 6) {
            return prodiNames[prodi - 2] + ", 20" + angkatan;
        } else {
            return "Prodi tidak valid";
        }
    }

    public String toString() {
        return String.format("Nama             : %s\n" +
                "NIK              : %s\n" +
                "Jenis Kelamin    : %s\n" +
                "Pendapatan       : $%.1f\n" +
                "NIM              : %s\n" +
                "IPK              : %.1f\n" +
                "Status           : %s\n" +
                "---------------------------------------\n",
                getNama(), getNik(), getJenisKelamin() ? "Laki-laki" : "Perempuan", getPendapatan(), nim, ipk, getStatus());
    }
}
