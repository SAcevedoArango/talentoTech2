public class Casting {
    public static void main(String[] args) {
        byte a = 98;
        double b = a;
        System.out.println(a + " " + b);

        // long c = b; Esto daría error ya que debe ser convertido de forma manual, no automática
        int e = 160;
        byte f = (byte) e;
        System.out.println(f + " " + e);

        String strNumber = "121";
        int numberObtained = Integer.parseInt(strNumber); // Conversión de String a Int, muy útil para captar info del usuario.
        float floatObtained = Float.parseFloat(strNumber);
        System.out.println(numberObtained + " " + floatObtained);
    }
    
}
