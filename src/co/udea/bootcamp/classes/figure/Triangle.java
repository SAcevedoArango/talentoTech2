package co.udea.bootcamp.classes.figure;

public class Triangle extends Figure{ // Herencia
    // Attributes
    private double base;
    private double heigth;
    private double side1;
    private double side2;
    private double side3;

    // Methods
    public double getBase() {
        return base;
    }
    public double getHeigth() {
        return heigth;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
    public double getArea() {
        return (this.base * this.heigth) / 2;
    }
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    

    
}
