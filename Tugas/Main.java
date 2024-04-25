package Tugas;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("John Doe", true, "1234567890", true);
        Manusia manusia2 = new Manusia("Jane Smith", false, "0987654321", true);
        Manusia manusia3 = new Manusia("Alice Johnson", false, "5678901234", false);

        System.out.println("Testcase Manusia");
        System.out.println(manusia1);
        System.out.println(manusia2);
        System.out.println(manusia3);

        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("Alex", true, "18211020", true, "20515030209876", 2.8);
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("Bob", true, "19123456", true, "22515060337694", 3.3);
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("Olivia", false, "20123456", false, "23515040209803", 3.8);

        System.out.println("\nTestcase MahasiswaFILKOM");
        System.out.println(mahasiswa1);
        System.out.println(mahasiswa2);
        System.out.println(mahasiswa3);

        Pekerja pekerja1 = new Pekerja("Michael", true, "123456789", true, 1000, LocalDate.of(2022, 2, 4), 2);
        Pekerja pekerja2 = new Pekerja("Sarah", false, "987654321", true, 6000, LocalDate.of(2013, 10, 15), 0);
        Pekerja pekerja3 = new Pekerja("David", true, "456789012", true, 7000, LocalDate.of(2004, 1, 20), 10);

        System.out.println("\nTestcase Pekerja");
        System.out.println(pekerja1);
        System.out.println(pekerja2);
        System.out.println(pekerja3);
        Manager manager = new Manager("Rachel", false, "321098765", false, 7500, LocalDate.of(2009, 2, 1), 0, "IT Department");
        System.out.println("\nTestcase Manager");
        System.out.println(manager);
    }
}


