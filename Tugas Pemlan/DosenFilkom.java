import java.time.LocalDate;

public class DosenFilkom extends Manusia {
    private double gaji;
    private int jmlhAnak;
    private LocalDate tahunMasuk;

    public DosenFilkom(String nama, String nik, boolean jenisKelamin, boolean Sudahmenikah, LocalDate tahunMasuk, int jmlhAnak, double gaji) {
        super(nama, nik, jenisKelamin, Sudahmenikah);
        this.gaji = gaji;
        this.jmlhAnak = jmlhAnak;
        this.tahunMasuk = tahunMasuk;
    }
    public double getGaji(){
        return gaji;
    }
    public int getJmlhAnak(){
        return jmlhAnak;
    }
    public LocalDate getTahunMasuk(){
        return tahunMasuk;
    }
    public int getMasaKerja(){
        int tahunNow = LocalDate.now().getYear();
        int masaKerja = tahunNow - tahunMasuk.getYear();
        return masaKerja;
    }
    public double getBonus(){
        double bonus = 0.0;
        if (getMasaKerja() <= 5){
            bonus = getGaji() * 0.05;
        } else if (getMasaKerja() > 5 && getMasaKerja() <=10) {
            bonus = getGaji() * 0.1;
        } else {
            bonus = getGaji() * 0.15;
        }
        public double getTunjanganAnak() {       
            double tunjAnak = 0.0;       
            if (jmlhAnak > 0) {           
                tunjAnak = jmlhAnak * 20000;       
            } else {
                tunjAnak = 0.0;
            }
            return tunjAnak;
        }
        public double getTotalPendapatanAkhir () {
            double totalPendapatanAkhir = getGaji() + getBonus() + getTunjanganAnak() + super.getTotalPendapatan();
            return totalPendapatanAkhir;
        }
        public String toString(){
            return "Nama : " + getNama() +
            "\nNIK : " + getNik() +
            "\nJenis Kelamin : " + getTotalPendapatanAkhir() +
            "\nTahun Masuk : " + getTahunMasuk() +
            "\nMasa Kerja : " + getMasaKerja() +
            "\nStatus : " + super.getSudahMenikah() +
            "\nJumlah Anak : " + getJmlhAnak() +
            "\nGaji : Rp" + getGaji();
        }










    

        }
    }

