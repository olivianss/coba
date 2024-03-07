package perpus;
import java.util.Scanner;

public class perpustakaan {

    private String teknologi[][] = new String[5][5]; 
    private String filsafat[][] = new String[5][5]; 
    private String agama[][] = new String[5][5]; 
    private String fiksi[][] = new String[5][5]; 
    private String politik[][] = new String[5][5]; 
    private String sejarah[][] = new String[5][5]; 
    private String psikologi[][] = new String[5][5]; 
    public void callTek() { 
    String teknologi1[][] 
                = {{"Teknologi Big Data", "W.M Wijaya, B.Eng, M.Png."}, 
                {"Teknologi Informasi Pendidikan", "Riyanto"}, 
                {"Perkembangan Teknologi Komunikasi", "Nurudin"}, 
                {"Teknologi Komunikasi Modern", "Jusak"}, 
                {"Teknologi Pendidikan", "Prof. Dr. Nasution, M.A."}, 
                {"", ""}}; 
    teknologi = teknologi1; 
    System.out.printf("%-35s%10s", "\tJudul", "Pengarang\n"); 
        for (int i = 0; i < teknologi.length; i++) { 
            for (int j = 0; j < teknologi[0].length; j++) 
{ 
        System.out.printf("%-35s", 
teknologi[i][j]); 
            } 
            System.out.println(""); 
        } 
        System.out.println(""); 
    } 

    public void callFils() {
    

    String Filsafat1[][] 
                = {{"Pohon Filsafat", "Dr. Stephen Palmquis"}, 
                {"Filsafat Ilmu", "Dr. Ardian Husaini, ef. al."}, 
                {"Filsafat Manusia", "Zainal Abidin"}, 
                {"Filasafat Lingkungan Hidup", "Dr. A. Sonny Keraf"}, 
                {"Filsafat Alam", "Moritz Sghlick"}, 
                {"", ""}};
w
        filsafat = Filsafat1; 
        System.out.printf("%-35s%10s", "\tJudul", "Pengarang\n"); 
        for (int i = 0; i < filsafat.length; i++) { 
            for (int j = 0; j < filsafat[0].length; j++) 
{ 
                System.out.printf("%-35s", 
filsafat[i][j]); 
            } 
            System.out.println(""); 
        } 
        System.out.println(""); 
    }
    

public void callAgama() { 

String Agama1[][] 
                = {{"Agama-Agama Manusia", "Huston Smith"}, 
                {"Zikir Akhir Zaman", "Abu Fatiah AlAdnam"}, 
                {"Agama & Konflik Sosial", "Prof. Dr. Afif Muhammad, M.A."}, 
                {"Fiqh Ibadah", "K.H. Abdul Hamid"}, 
                {"Hadis & Sunah Pilihan", "Syamsul Rizal Hamid"}, 
                {"", ""}}; 
        agama = Agama1; 
        System.out.printf("%-35s%10s", "\tJudul", "Pengarang\n"); 
        for (int i = 0; i < agama.length; i++) { 
            for (int j = 0; j < agama[0].length; j++) { 
                System.out.printf("%-35s", 
agama[i][j]); 
            } 
            System.out.println(""); 
        } 
        System.out.println(""); 
    } 

    public void callFiksi() { 
        String fiksi1[][] 
                = {{"The False Prince", "Jennifer A. Nielsen"}, 
                {"Harry Potter and the Deathly Hallows", "J.K. Rowling"}, 
                {"Mark Of Athena", "Rick Riordan"}, 
                {"Eragon", "Christoher Paolini"}, 
                {"Magic Thief", "Sarah Prineas"}, 
                {"", ""}}; 
        fiksi = fiksi1; 

        System.out.printf("%-40s%10s", "\tJudul", "Pengarang\n"); 
        for (int i = 0; i < fiksi.length; i++) { 
            for (int j = 0; j < fiksi[0].length; j++) { 
                System.out.printf("%-40s", 
fiksi[i][j]); 
            } 
            System.out.println(""); 
        } 
        System.out.println(""); 
    } 

    public void callPolitik() { 
        String politik1[][] 
                = {{"Politik Etnik", "Sofyan Sjaf"}, 
                {"Ilmu Politik", "Prof. Dr. J.M. Papasi"}, 
                {"Teori-Teori Politik", "Indra J. Piliang"}, 
                {"Komunikasi Politik", "Dan Nimmo"}, 
                {"Politik & Kekuasaan", "Ibnu Qutaibah"}, 
                {"", ""}}; 
        politik = politik1; 
        System.out.printf("%-35s%10s", "\tJudul", "Pengarang\n"); 
        for (int i = 0; i < politik.length; i++) { 
            for (int j = 0; j < politik[0].length; j++) 
{ 
                System.out.printf("%-35s", 
politik[i][j]); 
            } 
            System.out.println(""); 
        } 
        System.out.println(""); 
    } 

    public void callSejarah() { 
        String sejarah1[][] 
                = {{"Sejarah Dunia", "Huton Webster, Ph.D."}, 
                {"Sejarah Eropa", "Muhammad Basri, S.Pd."}, 
                {"Sejarah Nusantara", "Alfred Russel Wallace"}, 
                {"Sejarah Perang", "Sri Wintala Achmad"}, 
                {"Sejarah Filsafat Cina", "Fung YuLan"}, 
                {"", ""}}; 
        sejarah = sejarah1; 
        System.out.printf("%-35s%10s", "\tJudul", "Pengarang\n"); 
        for (int i = 0; i < sejarah.length; i++) { 
            for (int j = 0; j < sejarah[0].length; j++) 
{ 
                System.out.printf("%-35s", 
sejarah[i][j]); 
            } 
            System.out.println(""); 
        } 

        System.out.println(""); 
    } 

    public void callPsikologi() { 
        String psikologi1[][] 
                = {{"Psikologi Komunikasi", "Dr. Suciati, S.Sos, M.Si"}, 
                {"Psikologi Pertumbuhan", "Duane Schultz"}, 
                {"Psikologi Kepribadian", "Ki Fudyartanta"}, 
                {"Psikologi Abnormal", "Thomas F. Oltmanns"}, 
                {"Psikologi Pendidikan", "Prof. Dr. Sofyan S. Willis"}, 
                {"", ""}}; 
        psikologi = psikologi1; 
        System.out.printf("%-35s%10s", "\tJudul", "Pengarang\n"); 
        for (int i = 0; i < psikologi.length; i++) { 
            for (int j = 0; j < psikologi[0].length; j++) 
{ 
                System.out.printf("%-35s", psikologi[i][j]); 
            } 
            System.out.println(""); 
        } 
        System.out.println(""); 
    } 
    public void inputanUser() { 
        Scanner input = new Scanner(System.in); 
        int pilihan; 
        do { 
            System.out.println("********************************************************************"); 
            System.out.println("\t\t\tP E R P U S T A K A A N"); 
            System.out.println(" ********************************************************************"); 
            System.out.println("\t\t1. \tTEKNOLOGI"); 
            System.out.println("\t\t2. \tFILSAFAT"); 
            System.out.println("\t\t3. \tSEJARAH"); 
            System.out.println("\t\t4. \tAGAMA"); 
            System.out.println("\t\t5. \tPSIKOLOGI"); 
            System.out.println("\t\t6. \tPOLITIK"); 
            System.out.println("\t\t7. \tFIKSI"); 
            System.out.println("\t\t8. \tKELUAR"); 
            System.out.println("--------------------------------------------------------------------"); 
            System.out.print("Masukkan Pilihan : "); 
            pilihan = input.nextInt(); 
            System.out.println("********************************************************************"); 
            System.out.println(""); 
            switch (pilihan) { 
                case 1: 
                    callTek(); 
                    break; 
                    case 2: 
                        callFils(); 
                        break; 
                    case 3: 
                        callSejarah(); 
                        break; 
                    case 4: 
                        callAgama(); 
                        break; 
                    case 5: 
                        callPsikologi(); 
                        break; 
                    case 6: 
                        callPolitik(); 
                        break; 
                    case 7: 
                        callFiksi(); 
                        break; 
                    case 8: 
                        System.out.println("\nTerima Kasih\n"); 
                        System.exit(0); 
                        break; 
                    default: 
                        System.out.println("!!!!! Pilihan yang diinput tidak terdaftar !!!!!!"); 
                        System.exit(0); 
                        break; 
                } 
            } while (pilihan != 8); 
        } 
    } 




   
    

