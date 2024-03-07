package sic.geometri.ui;
import java.util.Scanner;

import sic.geometri.circles.circle;

public class CircleDemo_v_1_0 {
    public static void main(String[] args) {
        System.out.println("Circle Demo v1.0" + "\nby Oliva Sitorus" + "\n=====================");
        System.out.println("Silakan isi dimensi sebuah lingkaran berikut:");
        System.out.println("Masukkan radius (m): ");
        circle circle1;
        circle1 = new circle();
        Scanner scan = new Scanner(System.in);
        circle1.setRadius(scan.nextDouble());
        System.out.println("Dimensi lingkaran" + "\n===================");
        System.out.println("Radius: " + circle1.getRadius() + " m" + "\nLuas : " + circle1.luas() + " m2" + "\nKeliling: " + circle1.keliling() + " m2 ");
        scan.close();
    }
}
