public class PointTest {
    public static void main(String[] args) {
        Point p1, p2;
        p1 = new Point();
        p2 = new Point();
        p2.setX(3);
        double distance = p1.calculateDistance(p2);
        System.out.println("Distancia en cm es igual a: " + distance);
    }    
}
