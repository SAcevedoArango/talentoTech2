public class Parameters {
    private void method1(int a, float b) {
        System.out.println("Método 1: " + a + ", " + b);
        a = a * 20;
        b = b + 10.5f;
        System.out.println("Método 1 después: " + a + ", " + b);
    }

    private void method2(Point a, float b) {
        System.out.println("Método 2: " + a + ", " + b);
        a.setX(a.getX() * 20);
        b = b + 10.5f;
        System.out.println("Método 2 después: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Parameters p = new Parameters();
        int a = 10;
        float b = 5.5f;
        System.out.println("Antes del método: " + a + ", " + b); // Se ejecuta el método, se crean copias de las variables que contiene datos primitivos.
        p.method1(a, b);
        System.out.println("Después del método: " + a + ", " + b); // Nunca se modificó el valor ya que los tipos de datos primitivos son pasados por referencia.

        Point c = new Point(10, 20);
        float d = 5.5f;
        System.out.println("Antes del método: " + c.toString() + ", " + d); // Se ejecuta el método, se crean copias de las variables que contiene datos primitivos.
        p.method2((c.clone()), b); // Usamos el método clone para no pasar el valor del objeto, solo una "referencia".
        System.out.println("Después del método: " + c.toString() + ", " + d); // Nunca se modificó el valor ya que los tipos de datos primitivos son pasados por referencia.
    }
}
