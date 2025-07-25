import java.util.ArrayList;

public class MainWrapper {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = Integer.parseInt("432");
        System.out.println("i: " + i + ", j: " + j + ", k: " + k);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(i); // Es como el push de JavaScript, añadiéndolo al final
        list.add(j);
        list.add(k);
        System.out.println("Lista: " + list);

        ArrayList<Point> pointsList = new ArrayList<>();
        pointsList.addFirst(new Point(1, 10));
        pointsList.addFirst(new Point(7, 25));
        pointsList.addFirst(new Point(16, 90));
        System.out.println("Lista: " + pointsList);
    }
}
