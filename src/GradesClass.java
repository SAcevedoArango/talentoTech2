import java.util.Arrays;
import java.util.Scanner;

public class GradesClass {
    //Atributos
    private int numberGroups;
    private int numberStudents;
    private float grades[][];

    //Constructor
    GradesClass() {
        this.numberGroups = 0;
        this.numberStudents = 0;
    }
    GradesClass(int groups, int students) {
        this.numberGroups = groups;
        this.numberStudents = students;
    }
    
    //Métodos
    public int getNumberGroups() {
        return numberGroups;
    }
    public int getNumberStudents() {
        return numberStudents;
    }
    public float[][] getGrades() {
        return grades;
    }
    public void setNumberGroups(int numberGroups) {
        this.numberGroups = numberGroups;
    }
    public void setNumberStudents(int numberStudents) {
        this.numberStudents = numberStudents;
    }
    public void setGrades(float[][] grades) {
        this.grades = grades;
    }
    
    public void enterGroups(){ // Ingresa el número de grupos si no se ingresó en el constructor
        System.out.println("Ingrese el número de cursos: ");
        Scanner groupsInput = new Scanner(System.in);
        setNumberGroups(groupsInput.nextInt());
        System.out.println("Confirmaste que hay " + this.numberGroups + " cursos.");
    }
    public void enterStudents() { // Ingresa el número de estudiantes si no se ingresaron en el constructor
        System.out.println("Ingrese el número de estudiantes por curso: ");
        Scanner studentsInput = new Scanner(System.in);
        setNumberStudents(studentsInput.nextInt());
        System.out.println("Confirmaste que hay " + this.numberStudents + " estudiantes por curso.");
    }
    public void populateGrades() { // Ingresa las notas una a una siempre que exista #cursos y #estudiantes
        this.grades = new float[this.numberGroups][this.numberStudents];
        //System.out.println(Arrays.deepToString(grades));
        for (int i = 0; i < this.grades.length; i++) {
            for (int j = 0; j < this.grades[i].length; j++) {
                System.out.println("Ingresa la nota del estudiante " + (j+1) + " del curso " + (i+1) + ".");
                Scanner gradeInput = new Scanner(System.in);
                float grade = gradeInput.nextFloat();
                this.grades[i][j] = grade;
            }
            System.out.println("Finalizaste con las notas del curso " + (i+1) + ".");
        }
        System.out.println(Arrays.deepToString(grades));
    }
    public void userMenu() { // Función principal luego de popular notas
        System.out.println("¿Ahora qué quieres hacer? Presiona la opción que desees: ");
        System.out.println("1 para obtener la nota promedio del estudiante en todos los cursos.");
        System.out.println("2 para obtener la nota promedio de todos los estudiantes en un curso.");
        System.out.println("3 para saber cuántos estudiantes ganaron y perdieron un curso determinado.");
        Scanner menuScanner = new Scanner(System.in);
        int optionSelected = menuScanner.nextInt();

        //Para corregir avertencia de not closed scanner - crear una sola instancia del Scanner (como atributo)
        
        switch (optionSelected) {
            case 1:
            System.out.println("¿De qué estudiante desea saber el promedio de sus notas?");
            Scanner studentInput = new Scanner(System.in);
            int studentId = studentInput.nextInt();
            float averageStudent[] = new float[this.grades.length];
            for (int i = 0; i < this.grades.length; i++) {
                averageStudent[i] = this.grades[i][studentId - 1];
            }
            float totalStudentGrade = 0;
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
            float totalGradesGroup = 0;
            for (int i = 0; i < this.grades[groupId - 1].length; i++) {
                totalGradesGroup += this.grades[groupId - 1][i];
            }
            System.out.println("La nota promedio del curso " + groupId + " es " + (totalGradesGroup/this.grades[groupId - 1].length));
            break;
            case 3:
            System.out.println("Ingrese el número del curso del que desea saber cuántos estudiantes ganaron y perdieron: ");
            Scanner detailsInput = new Scanner(System.in);
            int groupDetails = detailsInput.nextInt(); 
            int pass = 0;
            int noPass = 0;
            for (int i = 0; i < this.grades[groupDetails - 1].length; i++) {
                if (this.grades[groupDetails - 1][i] >= 3) {
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
    
    
}
