import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList list = new ArrayList();
        ArrayList<Integer> ints = new ArrayList<Integer>(Arrays.asList(0, 1, 2,
                3, 4, 5, 6));
        System.out.println(Arrays.toString(ints.toArray()));
    }
}
