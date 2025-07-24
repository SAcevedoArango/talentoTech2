public class CalculateTest {
    
    public static void getFarPoints(Point[] pointsObj) {
    // Revisa si al menos se incluyeron 2 puntos para comparar.
    if (pointsObj == null || pointsObj.length < 2) {
        System.out.println("Se necesitan al menos dos puntos para calcular la distancia.");
        return;
    }

    double maxDist = 0; // Comparamos contra el valor 0 (menos negativo y menos positivo de todos)
    double minDist = Double.MAX_VALUE; // Comparamos contra el valor más alejado de 0 y positivo.
    int[] maxPair = new int[2];        
    int[] minPair = new int[2];

    for (int i = 0; i < pointsObj.length; i++) {
        for (int j = i + 1; j < pointsObj.length; j++) {
            double x1 = pointsObj[i].getX();
            double x2 = pointsObj[j].getX();
            double y1 = pointsObj[i].getY();
            double y2 = pointsObj[j].getY();

            double dist = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));

            if (dist > maxDist) {
                maxDist = dist;
                maxPair[0] = i; 
                maxPair[1] = j;
            }

            if (dist < minDist) {
                minDist = dist;
                minPair[0] = i;
                minPair[1] = j;
            }
        }
    }

    // Puntos más lejanos y más cercanos entre si registrados en maxPair y minPair
    Point farthestPoint1 = pointsObj[maxPair[0]];
    Point farthestPoint2 = pointsObj[maxPair[1]];
    Point closestPoint1 = pointsObj[minPair[0]];
    Point closestPoint2 = pointsObj[minPair[1]];

    System.out.println("La mayor distancia (" + maxDist + ") es entre:");
    System.out.println("  - Punto " + maxPair[0] + ": (" + farthestPoint1.getX() + ", " + farthestPoint1.getY() + ")");
    System.out.println("  - Punto " + maxPair[1] + ": (" + farthestPoint2.getX() + ", " + farthestPoint2.getY() + ")");

    System.out.println("\nLa menor distancia (" + minDist + ") es entre:");
    System.out.println("  - Punto " + minPair[0] + ": (" + closestPoint1.getX() + ", " + closestPoint1.getY() + ")");
    System.out.println("  - Punto " + minPair[1] + ": (" + closestPoint2.getX() + ", " + closestPoint2.getY() + ")");
}
    public static void main (String[] args) {
        
        Calculate test1 = new Calculate();
        test1.enterNumberPoints();
        getFarPoints(test1.getPointsObj());
    }
}
