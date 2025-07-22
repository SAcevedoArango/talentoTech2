import java.util.InputMismatchException;
import java.util.Scanner;

public class Errors {
        
    public static int sum() throws InputMismatchException {
        Scanner userInput = new Scanner(System.in);
        int a, b;
        System.out.println("Ingresa el primer número a sumar");
        a = userInput.nextInt();
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Ingresa el segundo número a sumar");
        b = userInput2.nextInt();
        return a + b;            
    }
    public static void main(String[] args) {
        
        /*System.out.println("Ingresa el primer número a sumar");
        try { // Intentará obtener el input del usuario (número entero)
            a = userInput.nextInt();
        } catch(InputMismatchException e) { // Si no lo consigue, ejecutará este código
            System.out.println("¡No escribiste un número!");
        } finally { // Finalmente, sin importar si consiguió el objetivo inicial (try) o no (catch), se ejecutará el código en finally
            userInput.close();
            System.out.println("Fin del programa");
        }

        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Ingresa el segundo número a sumar");
        try { // Intentará obtener el input del usuario (número entero)
            b = userInput2.nextInt();
        } catch(InputMismatchException e) { // Si no lo consigue, ejecutará este código
            System.out.println("¡No escribiste un número!");
        } finally { // Finalmente, sin importar si consiguió el objetivo inicial (try) o no (catch), se ejecutará el código en finally
            userInput.close();
            System.out.println("Fin del programa");
        }
        System.out.println(sum(a, b));*/

        try {
            Errors e = new Errors();
            int result = e.sum();
            System.out.println("El resultado es: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Eso no es un número");
        } catch (Exception e) {
            System.out.println("Hubo un error");
        }
        
    }
    public int enterGrades() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enterGrades'");
    }
}
