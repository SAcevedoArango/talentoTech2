package co.udea.bootcamp.classes.figure;

public class Rectangle extends Figure {
    // Attributes
    protected double height;
    protected double base; // Protected permite que en el mismo paquete se pueda acceder a los atributos.
    
    // Constructor


    //Methods
    @Override
    public double getArea() {
        return this.height * this.base;
    }
    @Override
    public double getPerimeter() {
        return this.height * 2 + this.base * 2;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public String toString() {
        return super.toString();
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setBase(double base) {
        this.base = base;
    }
}

