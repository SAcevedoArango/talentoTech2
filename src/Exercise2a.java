// ...existing code...
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2a {
    public static void program() {
        System.out.println("Ingresa cuántos puntos vamos a evaluar: ");
        Scanner pointsInput = new Scanner(System.in);
        int numberPoints = pointsInput.nextInt();
        System.out.println("Evaluaremos: " + numberPoints + " puntos.");
        int[][] pointsArray = new int[numberPoints][2];

        for (int i = 0; i < pointsArray.length; i++) {
            for (int j = 0; j < pointsArray[numberPoints - 1].length; j++) {
                if (j == 0) {
                    System.out.println("Ahora ingresa la coordenada X del punto " + (i));
                    Scanner xInput = new Scanner(System.in);
                    int xPoint = xInput.nextInt();
                    pointsArray[i][j] = xPoint;
                } else {
                    System.out.println("Ahora ingresa la coordenada Y del punto " + (i));
                    Scanner yInput = new Scanner(System.in);
                    int yPoint = yInput.nextInt();
                    pointsArray[i][j] = yPoint;
                }   
            }
        }
        System.out.println(Arrays.deepToString(pointsArray));

        double maxDist = 0;
        double minDist = 8.0f/0;
        int[] maxPair = new int[2];
        int[] minPair = new int[2];

        for (int i = 0; i < pointsArray.length; i++) {
            for (int j = i + 1; j < pointsArray.length; j++) {
                int x1 = pointsArray[i][0];
                int y1 = pointsArray[i][1];
                int x2 = pointsArray[j][0];
                int y2 = pointsArray[j][1];
                if (x1 == x2 && y1 == y2) {
                    continue;
                }
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

        System.out.println("La mayor distancia es entre los puntos " + Arrays.toString(pointsArray[maxPair[0]]) +
                " y " + Arrays.toString(pointsArray[maxPair[1]]) + ": " + maxDist);
        System.out.println("La menor distancia es entre los puntos " + Arrays.toString(pointsArray[minPair[0]]) +
                " y " + Arrays.toString(pointsArray[minPair[1]]) + ": " + minDist);
    }
    public static void main(String[] args) {
        program();
    }
}
// ...existing code...