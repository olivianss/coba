package hewan;
import java.util.Scanner;
public class Vet_v1_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PantheraTigris tiger; //pert 3
        tiger = new PantheraTigris();

        System.out.println("=============================");
        System.out.println("Vet_v1_0");
        System.out.println("by olivia");
        System.out.println("===============================");

        PantheraTigris tiger1 = new PantheraTigris();

        System.out.println("\nApakah ID harimau anda?");
        tiger1.id = input.nextLine();

         System.out.println("\nSiapakah nama harimau anda?");
         tiger1.name = input.nextLine();

         System.out.println("\nTahun berapa dia lahir? ");
         tiger1.yearOfBirth = input.nextInt();

         int umur = 2024 - tiger1.yearOfBirth;

        


         System.out.println("\nSelamat datang " + tiger1.name + " dengan ID: " + tiger1.id + " di vet v1 0");
         // input.close()

         System.out.println("Tahun ini " + tiger1.name + " telah berumur " + umur + " tahun");
         System.out.println("Ingin mengaum? (y/t)");
         String aum = input.next();

        if(aum.equals("y")){
            System.out.println(tiger1.roar());
        }else if (aum.equals("t")){
            System.out.println("Baik tidak apa. Mungkin lain kali");
        }
        System.out.println("Terima kasih telah menggunakan sistem kami.");

            



         
}
}

