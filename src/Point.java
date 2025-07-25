public class Point { //Práctica de creación de clases
    //Atributos
    private double x;
    private double y;
    //Constructores
    Point() { //Overloading ya que Java no acepta parámetros por defecto, como si lo hace JavaScript
        this.x = 0;
        this.y = 0;
    }

    Point(double u) { //Overloading ya que Java no acepta parámetros por defecto, como si lo hace JavaScript
        this.x = u;
        this.y = u;
    }

    Point(double x, double y) { //Overloading ya que Java no acepta parámetros por defecto, como si lo hace JavaScript
        this.x = x;
        this.y = y;
    }

    //Métodos
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double calculateDistance(Point p2){
        double value = Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y, 2);
        double distance = Math.sqrt(value);
        return distance;
    }

    public double calculateSlope(Point p2) {
        return (p2.y - this.y) / (p2.x - this.x);
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    @Override
    protected Point clone() {
        Point point = new Point();
        point.setX(this.x);
        point.setY(this.y);
        return point;
    }
    
    
}
