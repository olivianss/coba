package sic.geometry.circles.one;

public class Circle {
    private String id;
    private double radius;

    public Circle(String id, double radius) {
        this.id = id;
        this.radius = radius;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getradius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double hitungLuasLingkaran() {
        return Math.PI * radius * radius;
    }

    public double hitungKelilingLingkaran() {
        return 2 * Math.PI * radius;
    }
    
}
