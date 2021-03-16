package LAB8;

public class Rectangle  extends Object2D{
    //attributes
    private double width;
    private double lenght;
    //constructor

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public void calArea() {
        double area = width * lenght;
        super.setArea(area);
    }
    //getter and setter

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
}