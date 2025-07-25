package co.udea.bootcamp.classes.figure;

// Práctica de encapsulamiento, abtracción y herencia

public abstract class Figure { // Abstracción
    // Attributes
    private double area; // Herencia
    private double perimeter; // Private solo le permite a esta clase acceder a los atributos.
    private String color;
    
    //Methods
    public abstract double getArea(); 
    /*
    La forma es un concepto abstracto, y al ser superclase de figuras cuadrado, triángulo, círculo, etc.
    es necesario definir atributos como el área o el erímetro de acuerdo a sus subclases.
    Las subclases deberán implementar sus propias versiones de los métodos abstractos.

    Esto solo es necesario cuando lo que queremos obtener o definir no puede ser aplicado al concepto
    como tal (por ser abstracto) sino a sus versiones no abstractas (p.e. perímetro de una figura vs triángulo)
    */ 
    public abstract double getPerimeter();
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    
    
}
