public class GradesClassTest {
    public static void main(String[] args) {
        /*
        GradesClass notas = new GradesClass();
        notas.enterGroups();
        notas.enterStudents();
        notas.populateGrades();
        notas.userMenu();
        */

        GradesClass notas2 = new GradesClass(5, 5);
        notas2.populateGrades();
        notas2.userMenu();
    }
}
