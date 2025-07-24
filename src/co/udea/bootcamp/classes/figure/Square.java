package co.udea.bootcamp.classes.figure;

public class Square extends Figure { // Herencia
    // Attributes
    private double side;
    private double base;
    
    // Methods
    public double getSide() {
        return side;
    }
    public double getBase() {
        return base;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getPerimeter() {
        return this.side * 4;
    }
    public double getArea() {
        return this.side * this.side;
    }
}
