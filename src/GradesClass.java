import java.util.Arrays;
import java.util.Scanner;

public class GradesClass {
    //Atributos
    private int numberGroups;
    private int numberStudents;
    private float grades[][] = new float[numberGroups][numberStudents];

    //Constructor
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

    public void enterGroups(){
        System.out.println("Ingrese el número de cursos: ");
        Scanner groupsInput = new Scanner(System.in);
        setNumberGroups(groupsInput.nextInt());
        System.out.println("Confirmaste que hay " + this.numberGroups + " cursos.");
    }
    public void enterStudents(){
        //System.out.println("Aún hay " + this.numberGroups + " cursos.");
        System.out.println("Ingrese el número de estudiantes por curso: ");
        Scanner studentsInput = new Scanner(System.in);
        setNumberStudents(studentsInput.nextInt());
        System.out.println("Confirmaste que hay " + this.numberStudents + " estudiantes por curso.");
    }
    public void populateGrades() {
        //System.out.println("Aún hay " + this.numberGroups + " cursos.");
        //System.out.println("Aún hay " + this.numberStudents + " estudiantes.");
        //System.out.println("Ahora ingresarás las notas de cada estudiante...");
        System.out.println(Arrays.deepToString(grades));
        for (int i = 0; i < this.grades.length; i++) {
            for (int j = 0; j < this.grades[i].length; j++) {
                System.out.println("Ingresa la nota del estudiante " + (i+1) + " del curso " + (j+1) + ".");
                Scanner gradeInput = new Scanner(System.in);
                float grade = gradeInput.nextFloat();
                this.grades[i][j] = grade;
            }
            System.out.println("Finalizaste con las notas del curso " + (i+1) + ".");
        }
    }
    
    
}
