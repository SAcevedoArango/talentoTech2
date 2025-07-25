package co.udea.bootcamp.classes.figure;

public class Circle extends Figure{ // Herencia
    // Attributes
    private double radius;
    static final public double PI = 3.1416; // Podríamos usar Math.PI, pero se crea este atributo estático como ejemplo
    private static int instanceCounter = 0;
    // Constructor
    public Circle() {
        Circle.instanceCounter++; // No se usa this. porque instanceCoutner es estático, por lo que se llama a la clase.
    }
    public Circle(double radius) {
        Circle.instanceCounter++;
        this.radius = radius;
    }

    // Methods
    public static int countInstance() {
        return Circle.instanceCounter;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * Circle.PI;
    }
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
    
}
