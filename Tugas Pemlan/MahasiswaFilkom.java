class MahasiswaFilkom extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFilkom(String nama, String nik, boolean jenisKelamin, boolean Sudahmenikah, String nim, double ipk) {
        super(nama, nik, jenisKelamin, Sudahmenikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    public String getNim(){
        return nim;
    }
    public double getIpk(){
        return ipk;
    }
    public String getStatus() {
        String angkatan = "";
        String prodi = "";
        if (getNim().charAt(0) == '1') {
            if (getNim().charAt(1) == '6') {
                angkatan = "2016";           
            } else if (getNim().charAt(1) == '7') {               
                angkatan = "2017";           
            } else if (getNim().charAt(1) == '8') {               
                angkatan = "2018";           
            } else if (getNim().charAt(1) == '9') {               
                angkatan = "2019";           
            }
    }
    if (getNim().charAt(0) == '2') {           
        if (getNim().charAt(1) == '0') {               
            angkatan = "2020";           
        } else if (getNim().charAt(1) == '1') {               
            angkatan = "2021";           
        } else if (getNim().charAt(1) == '2') {               
            angkatan = "2022"; 
        } 
    }
    if (getNim().charAt(6) == '2') {           
        prodi = "Teknik Informatika";       
    } else if (getNim().charAt(6) == '3') {           
        prodi = "Teknik Komputer";       
    } else if (getNim().charAt(6) == '4') {           
        prodi = "Sistem Informasi";       
    } else if (getNim().charAt(6) == '6') {           
        prodi = "Pendidikan Teknologi Informasi";       
    } else if (getNim().charAt(6) == '7') {           
        prodi = "Teknologi Informasi";       
    }       
    return prodi + ", " + angkatan;   
}         

public double getBeasiswa() {       
    double bea = 0.0;       
    if (ipk >= 3.0 && ipk <= 3.5) {           
        bea = 50000;       
    } else if (ipk >= 3.5 && ipk <= 4) {           
        bea = 75000;       
    } else if (ipk < 3.0) {           
        bea = 0.0;       
    }       
    return bea;
}

public double getPendapatanAkhir(){
    double getPendapatanAkhir= getBeasiswa() + super.getTotalPendapatan();
    return getPendapatanAkhir;
}
public String toString(){
    return "Nama\t\t\t : " + getNama() + 
    "\nNIK\t\t\t\t : " + getNik() + 
    "\nJenis Kelamin\t : " + getJenisKelamin() + 
    "\nTotal Pendapatan : Rp" + getPendapatanAkhir() + 
    "\nNIM\t\t\t\t : " + getNim() + 
    "\nIPK\t\t\t\t : " + getIpk() +
    "\nStatus\t\t\t : " + getStatus();
}















}
