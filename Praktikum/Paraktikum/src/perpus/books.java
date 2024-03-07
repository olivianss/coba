package perpus;
import java.util.Scanner;
public class books {
        String[][] bukuTek = {
            {"Buku Dasar-Dasar Teknik Informatika", "Novega Pratama Adiputra", "2020", "117", "Gramedia"},
            {"Teknologi Informasi Pendidikan", "Riyanto", "2020", "250", "Erlangga"},
            {"Perkembangan Teknologi Komunikasi", "Nurudin", "2021", "280", "Triputra"},
            {"Teknologi Komunikasi Modern", "Jusak", "2019", "320", "Inari"},
            {"Teknologi Pendidikan", "Prof. Dr. Nasution, M.A.", "2018", "290", "Bintang Media"},}; 
        String[][] bukuFils = {
            {"Pohon Filsafat", "Dr. Stephen Palmquis", "2022", "200", "Greenbook"},
            {"Filsafat Ilmu", "Dr. Ardian Husaini, ef. al.", "2021", "180", "Bentang Pustaka"},
            {"Filsafat Manusia", "Zainal Abidin", "2020", "220", "PT Grasindo"},
            {"Filasafat Lingkungan Hidup", "Dr. A. Sonny Keraf", "2019", "240", "Meidaa Kita"},
            {"Filsafat Alam", "Moritz Sghlick", "2018", "190", "GagasMedia"},};
        String[][] bukuAgama = {
            {"Agama-Agama Manusia", "Huston Smith", "2023", "280", "Falcon Publishing"},
            {"Zikir Akhir Zaman", "Abu Fatiah AlAdnam", "2020", "310", "Replica"},
            {"Agama & Konflik Sosial", "Prof. Dr. Afif Muhammad, M.A.", "2019", "240", "Stiletto Book"},
            {"Fiqh Ibadah", "K.H. Abdul Hamid", "2018", "260", "Pro-U Media"},
            {"Hadis & Sunah Pilihan", "Syamsul Rizal Hamid", "2017", "290", "Metafind"},};
        String[][] bukuFiksi = {
            {"The False Prince", "Jennifer A. Nielsen", "2023", "350", "Gramedia Pustaka Utama"},
            {"Harry Potter and the Deathly Hallows", "J.K. Rowling", "2020", "400", "Bloobury"},
            {"Mark Of Athena", "Rick Riordan", "2021", "380", "Disney-Hyperion"},
            {"Eragon", "Christoher Paolini", "2019", "420", "Gramedia"},
            {"Magic Thief", "Sarah Prineas", "2018", "360", "HarperCollins"},}; 
        String[][] bukuPolitik = {
            {"Politik Etnik", "Sofyan Sjaf", "2022", "280", "Gramedia"},
            {"Ilmu Politik", "Prof. Dr. J.M. Papasi", "2021", "300", "Bukune"},
            {"Teori-Teori Politik", "Indra J. Piliang", "2020", "260", "Twigora"},
            {"Komunikasi Politik", "Dan Nimmo", "2019", "290", "Media Kita"},
            {"Politik & Kekuasaan", "Ibnu Qutaibah", "2018", "320", "Diva Press"},};
        String[][] bukuSejarah = {
            {"Sejarah Dunia", "Huton Webster, Ph.D.", "2023", "380", "Indo Literasi"},
            {"Sejarah Eropa", "Muhammad Basri, S.Pd.", "2020", "420", "Penerbit Ombak"},
            {"Sejarah Nusantara", "Alfred Russel Wallace", "2021", "350", "Indo Literasi"},
            {"Sejarah Perang", "Sri Wintala Achmad", "2019", "400", "Araska"},
            {"Sejarah Filsafat Cina", "Fung YuLan", "2018", "370", "Pustaka Pelajar"},};
        String[][] bukuPsikologi = {
            {"Psikologi Komunikasi", "Dr. Suciati, S.Sos, M.Si", "2023", "310", "Buku Litera Yogyakarta"},
            {"Psikologi Pertumbuhan", "Duane Schultz", "2020", "340", "Kanisius"},
            {"Psikologi Kepribadian", "Ki Fudyartanta", "2021", "290", "Yogyakarta Pustaka Pelajar"},
            {"Psikologi Abnormal", "Thomas F. Oltmanns", "2019", "320", "Yogyakarta Pustaka Pelajar"},
            {"Psikologi Pendidikan", "Prof. Dr. Sofyan S. Willis", "2018", "360", "Alfabeta"},};
        
        public void tampilkanBuku(String [][] jenis) {
            System.out.println("Daftar buku jenis ini:");
            for (int i = 0; i < jenis.length; i++) {
                System.out.println((i+1) + ". Judul: " + jenis[i][0]);
                System.out.println("   Penulis: " + jenis[i][1]);
                System.out.println("   Jumlah halaman: " + jenis[i][2]);
                System.out.println("   Tahun terbit: " + jenis[i][3]);
                System.out.println("   Penerbit: " + jenis[i][4]);
                System.out.println();
            }
        }
        }

    

    

       
