package sic.geometri.circles;

public class circle {
    private double radius;
    private double phi = Math.PI;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double luas(){
        return radius*radius*phi;
    }
    public double keliling(){
        return 2*radius*phi;
    }
    
}
