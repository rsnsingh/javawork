import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jatin");
        names.add("Amar");
        names.add("Boby");
        names.add("Charan");

        System.out.println("Before sorting: " + names);

        Collections.sort(names);

        System.out.println("After sorting : " + names);

        Collections.sort(names, Collections.reverseOrder());

        System.out.println("After sorting in Reverse Order : " + names);
    }
}
