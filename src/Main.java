import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       ArrayListImplementation list = new ArrayListImplementation(10);

       ArrayList<Integer> arraylist = new ArrayList<>(10);

       list.add(10);
       list.add(10);
       list.add(10);
       list.add(10);
       list.add(10);
       list.add(10);
       list.add(10);
       list.add(10);

        System.out.println(Arrays.toString(list.array));
    }
}
