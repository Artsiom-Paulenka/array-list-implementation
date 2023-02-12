import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayListImplementation list = new ArrayListImplementation(30);


        ArrayList<Integer> arraylist = new ArrayList<>(10);

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);

        int a = list.size();
        list.printInScreen();
        list.remove(7);
        list.addAdd(21, 2);

        System.out.println(Arrays.toString(list.array));


    }
}
