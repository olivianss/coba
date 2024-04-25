package sic.geometry.ui;
import sic.geometry.circles.one.Circle;
import java.util.Scanner;

public class CircleDemo_v_2_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println ("Circle Demo v2.0");
        System.out.println ("by Olivia Sitorus");
        System.out.println("=====================");

        System.out.print("\nAda berapa lingkaran yang akan dibuat? ");
        int banyakLingkaran = input.nextInt();
        input.nextLine();

        Circle[] circles = new Circle[banyakLingkaran];

        for (int i = 0; i < banyakLingkaran; i++) {
            System.out.println("\nLingkaran " + (i + 1));
            System.out.print("  Masukkan ID: ");
            String id = input.nextLine();
            System.out.print("  Masukkan radius (m): ");
            double radius = input.nextDouble();
            input.nextLine(); 

            Circle circle = new Circle(id, radius);
            circles[i] = circle;
        }

        System.out.println("\nDeskripsi seluruh lingkaran " );
        System.out.println("---------------------------");
        for (int j = 0; j < banyakLingkaran; j++) {
            Circle circle = circles[j];
            System.out.println("Lingkaran " + (j+1));
            System.out.println("  ID: " + circle.getId());
            System.out.println("  Radius: " + circle.getradius() + " m");
            System.out.println("  Luas: " + circle.hitungLuasLingkaran() + " m2");
            System.out.println("  Keliling: " + circle.hitungKelilingLingkaran() + " m");
            System.out.println();
        }

        input.close();
    }
}
