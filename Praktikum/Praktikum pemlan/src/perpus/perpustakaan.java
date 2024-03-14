package perpus;
public class perpustakaan {
    private String [][] bukuTek;
    private String [][] bukuFils;
    private String [][] bukuAgama;
    private String [][] bukuFiksi;
    private String [][] bukuPolitik;
    private String [][] bukuSejarah;
    private String [][] bukuPsikologi;
    private int jlhKata;
    private int kodeBuku;

    public perpustakaan (String [][] bukuTek, String [][] bukuFils, String [][] bukuAgama, String [][] bukuFiksi, String [][] bukuPolitik, String [][]bukuSejarah, String [][]bukuPsikologi, int kodeBuku) {
        this.bukuTek = bukuTek;
        this.bukuFils = bukuFils;
        this.bukuAgama = bukuAgama;
        this.bukuFiksi = bukuFiksi;
        this.bukuPolitik = bukuPolitik;
        this.bukuSejarah = bukuSejarah;
        this.bukuPsikologi = bukuPsikologi;
        this.kodeBuku = kodeBuku;
    }

    public void tampilkanBuku(String [][] jenis, String kategori) {
        System.out.println("Daftar buku jenis ini:");
        for (int i = 0; i < jenis.length; i++) {
            System.out.println((i+1) + ". Judul: " + jenis[i][0]);
            System.out.println("Penulis: " + jenis[i][1]);
            System.out.println("Tahun terbit: " + jenis[i][2]);
            System.out.println("Jumlah halaman: " + jenis[i][3]);
            System.out.println("Penerbit: " + jenis[i][4]);
            System.out.println("Sinopsis: " + jenis[i][5]);
            int jlhKata = hitungKata(jenis[i][5]);
            System.out.println("Jumlah kata sinopsis: " + jlhKata); 
            System.out.println();
        }
    } 
    
    public int hitungKata (String sinopsis){
        String [] words = sinopsis.split("\\s+");
        return words.length;}

    public void tampilSemua() {
        tampilkanBuku (bukuTek, "Teknologi");
        tampilkanBuku (bukuFils, "Filsafat");
        tampilkanBuku (bukuAgama, "Agama");
        tampilkanBuku (bukuFiksi, "Fiksi");
        tampilkanBuku (bukuPolitik, "Politik");
        tampilkanBuku (bukuSejarah, "Sejarah");
        tampilkanBuku (bukuPsikologi, "Psikologi");
    }

    public void pilihan() {
        boolean keluar = true;
        while (keluar) {
            if (kodeBuku == 1) {
                tampilkanBuku (bukuTek, "Teknologi");
                break;
            } else if (kodeBuku == 2) {
                tampilkanBuku (bukuFils, "Filsafat");
                break;
            } else if (kodeBuku == 3) {
                tampilkanBuku (bukuAgama, "Agama");
                break;
            } else if (kodeBuku == 4) {
                tampilkanBuku (bukuFiksi, "Fiksi");
                break;
            } else if (kodeBuku == 5) {
                tampilkanBuku (bukuPolitik, "Politik");
                break;
            } else if (kodeBuku == 6) {
                tampilkanBuku (bukuSejarah, "Sejarah");
                break;
            } else if (kodeBuku == 7) {
                tampilkanBuku (bukuPsikologi, "Psikologi");
                break;
            } else if (kodeBuku == 8) {
                System.out.println("Terima Kasih");
                break;}
            keluar = false; 
        }
    } 
}



    


