import java.util.Arrays;
import java.util.Scanner;

public class Calculate {
    //Atributos
    private double slope;
    private double intercept;
    private int numberPoints;
    private Point[] pointsObj;

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
        this.pointsObj = new Point[this.numberPoints];
        System.out.println("Evaluaremos: " + this.numberPoints + " puntos.");
        Point genericPoint = new Point();
        

        for (int i = 0; i < this.pointsObj.length; i++) { //Problema al querer popular el array pointsObj, todas las posiciones quedan igual al último x, y.
            for(int j = 0; j < 2; j++) {
            this.pointsObj[i] = genericPoint;
                if (j % 2 == 0) {
                    System.out.println("Ahora ingresa la coordenada X del punto " + (i));
                    Scanner xInput = new Scanner(System.in);
                    double xPoint = xInput.nextDouble();
                    this.pointsObj[i].setX(xPoint);
                } else {
                    System.out.println("Ahora ingresa la coordenada Y del punto " + (i));
                    Scanner yInput = new Scanner(System.in);
                    double yPoint = yInput.nextDouble();
                    this.pointsObj[i].setY(yPoint);
                }
            
            }
        }
        
    }   
        
    public static void getFarPoints(Point[] pointsObj) {
        //double minDis = 0;
        //double minPair[] = new double[2];
        double maxDist = 0;
        double minDist = 8.0f/0;
        double[] maxPair = new double[2];
        double[] minPair = new double[2];
        for (int i = 0; i < pointsObj.length; i++) {
            double x1 = pointsObj[i].getX();
            double x2 = pointsObj[i + 1].getX();
            double y1 = pointsObj[i].getY();
            double y2 = pointsObj[i + 1].getY();
            if (x1 == x2 && y1 == y2) {
                continue;
            }
            double dist = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
            if (dist > maxDist) {
                maxDist = dist;
                maxPair[0] = i;
                maxPair[1] = (i + 1);
            }
            if (dist < minDist) {
                minDist = dist;
                minPair[0] = i;
                minPair[1] = (i + 1);
            }
        }
        System.out.println("La mayor distancia es entre los puntos " + maxPair[0] +
                " y " + maxPair[1] + ": " + maxDist);
        System.out.println("La menor distancia es entre los puntos " + minPair[0] +
                " y " + minPair[1] + ": " + minDist);   

    }

}
