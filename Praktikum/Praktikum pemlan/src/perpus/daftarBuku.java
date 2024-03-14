package perpus;
import java.util.Scanner;
 public class daftarBuku {
        public static void main(String[] args) {
            String[][] bukuTek = {
                {"Buku Dasar-Dasar Teknik Informatika", "Novega Pratama Adiputra", "2020", "117", "Gramedia", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"},
                {"Teknologi Informasi Pendidikan", "Riyanto", "2020", "250", "Erlangga","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore"},
                {"Perkembangan Teknologi Komunikasi", "Nurudin", "2021", "280", "Triputra","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet. Praesent tellus tellus, aliquam id velit porta, laoreet euismod nulla. Praesent consequat imperdiet ligula sed porta. Nam congue euismod mollis. Maecenas mattis libero eu risus ullamcorper, in rutrum elit hendrerit."},
                {"Teknologi Komunikasi Modern", "Jusak", "2019", "320", "Inari", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet. Praesent tellus tellus, aliquam id velit porta, laoreet euismod nulla. Praesent consequat imperdiet ligula sed porta. Nam congue euismod mollis."},
                {"Teknologi Pendidikan", "Prof. Dr. Nasution, M.A.", "2018", "290", "Bintang Media", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident"},}; 
            String[][] bukuFils = {
                {"Pohon Filsafat", "Dr. Stephen Palmquis", "2022", "200", "Greenbook", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"},
                {"Filsafat Ilmu", "Dr. Ardian Husaini, ef. al.", "2021", "180", "Bentang Pustaka", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet. Praesent tellus tellus, aliquam id velit porta, laoreet euismod nulla. Praesent consequat imperdiet ligula sed porta. Nam congue euismod mollis. Maecenas mattis libero eu risus ullamcorper, in rutrum elit hendrerit. Curabitur ornare rutrum pretium."},
                {"Filsafat Manusia", "Zainal Abidin", "2020", "220", "PT Grasindo", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet. Praesent tellus tellus, aliquam id velit porta, laoreet euismod nulla. Praesent consequat imperdiet ligula sed porta. Nam congue euismod mollis. Maecenas mattis libero eu risus ullamcorper, in rutrum elit hendrerit."},
                {"Filasafat Lingkungan Hidup", "Dr. A. Sonny Keraf", "2019", "240", "Meidaa Kita", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet. Praesent tellus tellus, aliquam id velit porta, laoreet euismod nulla. Praesent consequat imperdiet ligula sed porta. Nam congue euismod mollis. Maecenas mattis libero eu risus ullamcorper, in rutrum elit hendrerit. Curabitur ornare rutrum pretium. Morbi pulvinar at est nec luctus."},
                {"Filsafat Alam", "Moritz Sghlick", "2018", "190", "GagasMedia", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur"},};
            String[][] bukuAgama = {
                {"Agama-Agama Manusia", "Huston Smith", "2023", "280", "Falcon Publishing", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore"},
                {"Zikir Akhir Zaman", "Abu Fatiah AlAdnam", "2020", "310", "Replica", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"},
                {"Agama & Konflik Sosial", "Prof. Dr. Afif Muhammad, M.A.", "2019", "240", "Stiletto Book", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet. Praesent tellus tellus, aliquam id velit porta, laoreet euismod nulla. Praesent consequat imperdiet ligula sed porta. Nam congue euismod mollis. Maecenas mattis libero eu risus ullamcorper, in rutrum elit hendrerit. Curabitur ornare rutrum pretium. Morbi pulvinar at est nec luctus."},
                {"Fiqh Ibadah", "K.H. Abdul Hamid", "2018", "260", "Pro-U Media", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet. Praesent tellus tellus, aliquam id velit porta, laoreet euismod nulla. Praesent consequat imperdiet ligula sed porta. Nam congue euismod mollis. Maecenas mattis libero eu risus ullamcorper, in rutrum elit hendrerit. Curabitur ornare rutrum pretium."},
                {"Hadis & Sunah Pilihan", "Syamsul Rizal Hamid", "2017", "290", "Metafind", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur"},};
            String[][] bukuFiksi = {
                {"The False Prince", "Jennifer A. Nielsen", "2023", "350", "Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore"},
                {"Harry Potter and the Deathly Hallows", "J.K. Rowling", "2020", "400", "Bloobury", "orem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet. Praesent tellus tellus, aliquam id velit porta, laoreet euismod nulla. Praesent consequat imperdiet ligula sed porta. Nam congue euismod mollis. Maecenas mattis libero eu risus ullamcorper, in rutrum elit hendrerit. Curabitur ornare rutrum pretium. Morbi pulvinar at est nec luctus. Suspendisse vestibulum, massa nec convallis lacinia, libero elit pretium dolor, sit amet suscipit orci neque sed elit. Vivamus velit orci, tristique id magna et, fermentum rhoncus dolor."},                       
                {"Mark Of Athena", "Rick Riordan", "2021", "380", "Disney-Hyperion", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit."},
                {"Eragon", "Christoher Paolini", "2019", "420", "Gramedia", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore"},
                {"Magic Thief", "Sarah Prineas", "2018", "360", "HarperCollins", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet."},}; 
            String[][] bukuPolitik = {
                {"Politik Etnik", "Sofyan Sjaf", "2022", "280", "Gramedia", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident"},
                {"Ilmu Politik", "Prof. Dr. J.M. Papasi", "2021", "300", "Bukune", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"},
                {"Teori-Teori Politik", "Indra J. Piliang", "2020", "260", "Twigora", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"},
                {"Komunikasi Politik", "Dan Nimmo", "2019", "290", "Media Kita", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet. Praesent tellus tellus, aliquam id velit porta, laoreet euismod nulla. Praesent consequat imperdiet ligula sed porta. Nam congue euismod mollis."},
                {"Politik & Kekuasaan", "Ibnu Qutaibah", "2018", "320", "Diva Press", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet. Praesent tellus tellus, aliquam id velit porta, laoreet euismod nulla. Praesent consequat imperdiet ligula sed porta. Nam congue euismod mollis. Maecenas mattis libero eu risus ullamcorper, in rutrum elit hendrerit. Curabitur ornare rutrum pretium. Morbi pulvinar at est nec luctus."},};
            String[][] bukuSejarah = {
                {"Sejarah Dunia", "Huton Webster, Ph.D.", "2023", "380", "Indo Literasi", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore"},
                {"Sejarah Eropa", "Muhammad Basri, S.Pd.", "2020", "420", "Penerbit Ombak", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore"},
                {"Sejarah Nusantara", "Alfred Russel Wallace", "2021", "350", "Indo Literasi", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet. Praesent tellus tellus, aliquam id velit porta, laoreet euismod nulla. Praesent consequat imperdiet ligula sed porta. Nam congue euismod mollis. Maecenas mattis libero eu risus ullamcorper, in rutrum elit hendrerit."},
                {"Sejarah Perang", "Sri Wintala Achmad", "2019", "400", "Araska", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"},
                {"Sejarah Filsafat Cina", "Fung YuLan", "2018", "370", "Pustaka Pelajar", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet. Praesent tellus tellus, aliquam id velit porta, laoreet euismod nulla."},};
            String[][] bukuPsikologi = {
                {"Psikologi Komunikasi", "Dr. Suciati, S.Sos, M.Si", "2023", "310", "Buku Litera Yogyakarta", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut consectetur justo nec magna posuere tristique. Fusce molestie finibus imperdiet. Praesent tellus tellus, aliquam id velit porta, laoreet euismod nulla. Praesent consequat imperdiet ligula sed porta. Nam congue euismod mollis. Maecenas mattis libero eu risus ullamcorper, in rutrum elit hendrerit. Curabitur ornare rutrum pretium."},
                {"Psikologi Pertumbuhan", "Duane Schultz", "2020", "340", "Kanisius", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit."},
                {"Psikologi Kepribadian", "Ki Fudyartanta", "2021", "290", "Yogyakarta Pustaka Pelajar", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"},
                {"Psikologi Abnormal", "Thomas F. Oltmanns", "2019", "320", "Yogyakarta Pustaka Pelajar", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur"},
                {"Psikologi Pendidikan", "Prof. Dr. Sofyan S. Willis", "2018", "360", "Alfabeta", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"},};

                System.out.println("***********************************************************"); 
                        System.out.println("\t\tP E R P U S T A K A A N");
                        System.out.println("***********************************************************"); 
                        System.out.println("\t\t     1. TEKNOLOGI"); 
                        System.out.println("\t\t     2. FILSAFAT"); 
                        System.out.println("\t\t     3. SEJARAH"); 
                        System.out.println("\t\t     4. AGAMA"); 
                        System.out.println("\t\t     5. PSIKOLOGI"); 
                        System.out.println("\t\t     6. POLITIK"); 
                        System.out.println("\t\t     7. FIKSI"); 
                        System.out.println("\t\t     8. KELUAR"); 
                        System.out.println("-----------------------------------------------------------"); 
                    System.out.print("Masukkan pilihan Anda: ");
                    Scanner input = new Scanner(System.in);
                    int kodeBuku = input.nextInt();

                    perpustakaan bookperpus = new perpustakaan(bukuTek, bukuFils,bukuSejarah, bukuAgama, bukuPsikologi, bukuPolitik, bukuFiksi, kodeBuku);
                    bookperpus.pilihan();
                    }

                             
}
            

    

    

       

    

