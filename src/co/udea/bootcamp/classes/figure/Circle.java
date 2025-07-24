package co.udea.bootcamp.classes.figure;

public class Circle extends Figure{ // Herencia
    // Attributes
    private double radius;
    static final private double PI = 3.1416; // Podríamos usar Math.PI, pero se crea este atributo estático como ejemplo
    
    // Methods
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.pow(this.radius, 2) * Circle.PI;
    }
    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }
}
