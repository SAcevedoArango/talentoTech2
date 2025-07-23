import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
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
        int b1 = 0;
        int x = 0;
        int m1 = 0;
        int value1 = m1 * x + b1;
        int difference = 0;
        
        for (int i = 0; i < pointsArray.length; i++) {
            int j = 0;
        }
        System.out.println(difference);
    }
    public static void main(String[] args) {
        program();
    }
}
