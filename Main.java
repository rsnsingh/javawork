import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jatin");
        names.add("Amar");
        names.add("Boby");
        names.add("Charan");

        //============= Using Sort Function in Collection Package =============
        System.out.println("Before sorting: " + names);

        Collections.sort(names);

        System.out.println("After sorting : " + names);

        Collections.sort(names, Collections.reverseOrder());

        System.out.println("After sorting in Reverse Order : " + names);

        // ========== Sorting names with Bubble sort ========================
        names.add("Zaplin");
        names.add("Dalbir");
        names.add("Karan");
        names.add("Varinder");
        names.add("Atul");
        for (int i = 0; i < names.size() - 1; i++) {
            for (int j = 0; j < names.size() - i - 1; j++) {
                if (names.get(j).compareTo(names.get(j + 1)) > 0) {
                    String temp = names.get(j);
                    names.set(j, names.get(j + 1));
                    names.set(j + 1, temp);
                }
            }
        }

        System.out.println("sorting USING Bubble Sort  : " + names);

    }
}
