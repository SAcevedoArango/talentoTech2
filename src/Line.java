public class Line {
    //Atributos
    private double slope;
    private double intercept;

    //Constructores
    public Line(Point p1, Point p2) {
        this.slope = p1.calculateSlope(p2);
        this.intercept = p1.getY() - this.slope * p1.getX();
    }
    public Line (double slope, double intercept) {
        this.slope = slope;
        this.intercept = intercept;
    }
}
