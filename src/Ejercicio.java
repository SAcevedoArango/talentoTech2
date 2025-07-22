import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio {
    
    public static void enterGrades() throws InputMismatchException {
        Scanner groupsNumberInput = new Scanner (System.in);
        System.out.println("Ingrese el número de cursos: ");
        int numberGroups = groupsNumberInput.nextInt();

        Scanner studentsNumberInput = new Scanner (System.in);
        System.out.println("Ingrese el número de estudiantes por curso: ");
        int numberStudents = studentsNumberInput.nextInt();

        int grades[][] = new int [numberGroups][numberStudents];
        System.out.println("Ahora ingresarás las notas de los estudiantes de cada curso.");

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) { 
                System.out.println("Ingresa la nota del estudiante: " + (j+1) + " en el curso " + (i+1));
                Scanner gradesIterative = new Scanner(System.in);
                grades[i][j] = gradesIterative.nextInt();

            }  
        }
        System.out.println("Has terminado de ingresar todas las notas.");
        System.out.println("¿Ahora qué quieres hacer? Presiona la opción que desees: ");
        System.out.println("1 para obtener la nota promedio del estudiante en todos los cursos.");
        System.out.println("2 para obtener la nota promedio de todos los estudiantes en un curso.");
        System.out.println("3 para saber cuántos estudiantes ganaron y perdieron un curso determinado.");
        Scanner menuScanner = new Scanner(System.in);
        int optionSelected = menuScanner.nextInt();
        
        switch (optionSelected) {
            case 1:
            System.out.println("¿De qué estudiante desea saber el promedio de sus notas?");
            Scanner studentInput = new Scanner(System.in);
            int studentId = studentInput.nextInt();
            int averageStudent[] = new int[grades.length];
            for (int i = 0; i < grades.length; i++) {
                averageStudent[i] = grades[i][studentId - 1];
            }
            int totalStudentGrade = 0;
            for (int i = 0; i < averageStudent.length; i++)
            {
                totalStudentGrade += averageStudent[i];
            }
            System.out.println("La nota promedio del estudiante " + studentId + " es " + (totalStudentGrade/averageStudent.length));
            break;
            case 2:
            System.out.println("Ingrese el número del curso del que desea adquirir el promedio: ");
            Scanner groupInput = new Scanner(System.in);
            int groupId = groupInput.nextInt();
            int totalGradesGroup = 0;
            for (int i = 0; i < grades[groupId - 1].length; i++) {
                totalGradesGroup += grades[groupId - 1][i];
            }
            System.out.println("La nota promedio del curso " + groupId + " es " + (totalGradesGroup/grades[groupId - 1].length));
            break;
            case 3:
            System.out.println("Ingrese el número del curso del que desea saber cuántos estudiantes ganaron y perdieron: ");
            Scanner detailsInput = new Scanner(System.in);
            int groupDetails = detailsInput.nextInt(); 
            int pass = 0;
            int noPass = 0;
            for (int i = 0; i < grades[groupDetails - 1].length; i++) {
                if (grades[groupDetails - 1][i] >= 3) {
                    pass++;
                } else {
                    noPass++;
                }
            }
            System.out.println("En el curso " + groupDetails + " hay " + pass + " estudiantes que ganaron la materia, mientras que " + noPass + " la perdieron.");    
            break;
            default:
            System.out.println("Error inesperado");
        }



    }
    public static void main(String[] args) {
        try {
            enterGrades();
        } catch (InputMismatchException e) {
            System.out.println("Eso no es un número");
        } catch (Exception e) {
            System.out.println("Hubo un error");
        }
        
        
    }
}
