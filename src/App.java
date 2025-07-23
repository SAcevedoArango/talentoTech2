public class App {
    public static void main(String[] args) throws Exception {
        int i = 0;
        System.out.println(i++); //modifica la variable después de imprimirla/usarla
        System.out.println(i);
        System.out.println(++i); //modifica la variable antes de imprimirla/usarla
        System.out.println(i+=2);

        String txt = "abcd";
        String txt2 = "abcd";

        if (txt.equals(txt2)) {
            System.out.println("Son iguales (equals)");
        }
        if (txt == txt2) {
            System.out.println("Son iguales (==)");
        }

        int numbers[] = new int[5];
        int numbers2[] = {3, 5, 6, 7, 8, 9};
        int matrix[][][] = new int[][][] {{{1, 2, 3}, {4, 5, 6}}};
        for (i = 0; i < numbers2.length; i++) {
            //numbers[i] = i + 1;
            System.out.println(numbers2[i]);
        }
    }
}
