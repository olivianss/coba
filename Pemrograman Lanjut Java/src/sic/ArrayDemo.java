//package Pemrograman Lanjut Java.src.sic;

//import sic.geometry.circles.one;
import sic.geometry.circles.one.Circle;

public class ArrayDemo {
    public static void main(String[] args) {
        // //cara 1
        // int[] arrx = {2,4,6};
        // //cara 2
        // int[] arry;
        // arry = new int[3];
        // //cara 3
        // int[] arrZ;
        // arrZ = new int[] {1,3,5};
        Circle[] arrC;
        arrC =new Circle[3];
        System.out.println(arrC[0]);

        Circle c1 = new Circle("c1", 2.5);
        arrC[2] =c1;
        System.out.println(arrC[2]);
        System.out.println(arrC[2].hitungLuasLingkaran());
        arrC[0] = c1;
        //arrC[1] = new Circle();

       

    }
    
}
