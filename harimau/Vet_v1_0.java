package harimau;   
import java.util.Scanner;
public class Vet_v1_0 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PantheraTigris tiger; //pert 3
        tiger = new PantheraTigris();
        System.out.println("===============================");

        PantheraTigris tiger1 = new PantheraTigris();

        System.out.println("\nApakah ID harimau anda?");
        tiger1.id = input.nextLine();

         System.out.println("\nSiapakah nama harimau anda?");
         tiger1.name = input.nextLine();

         System.out.println("\nSelamat datang " + tiger1.name + " dengan ID: " + tiger1.id + " di vet v1 0");
         // input.close()












    }
}
