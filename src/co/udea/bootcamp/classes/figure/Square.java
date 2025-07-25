package co.udea.bootcamp.classes.figure;

public class Square extends Rectangle { // Herencia
    // Attributes
    
    // Methods
    public double getSide() {
        return this.base;
    }
    public void setSide(double side) {
        this.base = side;
    }
    @Override
    public double getPerimeter() {
        return this.base * 4;
    }
    @Override
    public double getArea() {
        return this.base * this.base;
    }
}
