package sic.geometry.ui;
import sic.geometry.generalshapes.Circle;
import sic.geometry.generalshapes.Rectangle;
import java.util.Scanner;

public class GeometryDemo_v1_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geometry Demo v1.0");
        System.out.println("By : Olivia Sitorus");
        System.out.println("=================");

        System.out.println("Pilih salah satu bangun geometri berikut:");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi panjang");
        System.out.print("Pilihan: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\nDimensi lingkaran");
            System.out.println("-----------------");
            System.out.print("Masukkan radius (m): ");
            double radius = scanner.nextDouble();

            Circle circle = new Circle();
            circle.setRadius(radius);
            System.out.println("Radius: " + circle.getRadius() + " m");
            System.out.println("Luas: " + circle.calculateArea() + " m2");
            System.out.println("Keliling: " + circle.calculatePerimeter() + " m");
        } else if (choice == 2) {
            System.out.println("\nDimensi persegi panjang");
            System.out.println("-----------------------");
            System.out.print("Masukkan panjang (m): ");
            double length = scanner.nextDouble();
            System.out.print("Masukkan lebar (m): ");
            double width = scanner.nextDouble();

            Rectangle rectangle = new Rectangle();
            rectangle.setLength(length);
            rectangle.setWidth(width);
            System.out.println("Panjang: " + rectangle.getLength() + " m");
            System.out.println("Lebar: " + rectangle.getWidth() + " m");
            System.out.println("Luas: " + rectangle.calculateArea() + " m2");
            System.out.println("Keliling: " + rectangle.calculatePerimeter() + " m");
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
