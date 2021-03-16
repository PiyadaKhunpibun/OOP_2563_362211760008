package LAB8;

public class Triangle extends Object2D{
    //attributes
    private double base;
    private double height;

    //constructor


    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calArea() {

        double area = base * height * 0.5;
        super.setArea(area);
    }

    //getter and setter

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}