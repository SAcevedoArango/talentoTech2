import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculate {
    //Atributos
    private double slope;
    private double intercept;
    private int numberPoints;
    private Point[] pointsObj;
    private ArrayList<Point> pointsList;

    public double getSlope() {
        return slope;
    }
    public double getIntercept() {
        return intercept;
    }
    public int getNumberPoints() {
        return numberPoints;
    }
    public Point[] getPointsObj() {
        return pointsObj;
    }
    public ArrayList<Point> getPointsList() {
        return pointsList;
    }   

    public void setSlope(double slope) {
        this.slope = slope;
    }
    public void setIntercept(double intercept) {
        this.intercept = intercept;
    }
    public void setNumberPoints(int numberPoints) {
        this.numberPoints = numberPoints;
    }
    public void setPointsObj(Point[] pointsObj) {
        this.pointsObj = pointsObj;
    }
    public void setPointsList(ArrayList<Point> pointsList) {
        this.pointsList = pointsList;
    }  
    //Constructores
    public Calculate() {
        this.slope = 0;
        this.intercept = 0;
        this.numberPoints = 0;
    }
    public Calculate(Point p1, Point p2) {
        this.slope = p1.calculateSlope(p2);
        this.intercept = p1.getY() - this.slope * p1.getX();
    }
    public Calculate(double slope, double intercept) {
        this.slope = slope;
        this.intercept = intercept;
    }

    //Métodos
    public void enterNumberPoints() {
        System.out.println("Ingresa cuántos puntos vamos a evaluar: ");
        Scanner pointsInput = new Scanner(System.in);
        this.numberPoints = pointsInput.nextInt();
        //this.pointsObj = new Point[this.numberPoints];
        this.pointsList = new ArrayList<Point>();
        System.out.println("Evaluaremos: " + this.numberPoints + " puntos.");
        
        for (int k = 0; k < this.numberPoints; k++) { // Solución al problema 1.2
            Point genericPoint = new Point();
            this.pointsList.add(genericPoint);
        }
        

        for (int i = 0; i < this.pointsList.size(); i++) { 
            for(int j = 0; j < 2; j++) {
                //Point genericPoint = new Point();
                //this.pointsObj[i] = genericPoint;
                if (j % 2 == 0) {
                    System.out.println("Ahora ingresa la coordenada X del punto " + (i + 1));
                    Scanner xInput = new Scanner(System.in);
                    double xPoint = xInput.nextDouble();
                    this.pointsList.get(i).setX(xPoint);
                } else {
                    System.out.println("Ahora ingresa la coordenada Y del punto " + (i + 1));
                    Scanner yInput = new Scanner(System.in);
                    double yPoint = yInput.nextDouble();
                    this.pointsList.get(i).setY(yPoint);
                }
            }
        }
    }   

}
