import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterableTester {
    public static void main(String[] args) {
        Integer [] ints = {1,2,3,4,5};
        List<String> stringList = new ArrayList<>();
        stringList.add("Ali");
        stringList.add("Andreas");
        stringList.add("Wajid");

        MyIterable<Integer> myList = new MyIterable<>(ints);

        // foreach loop for strings
        for (String s: stringList) {

            System.out.println(s);
        }

        //for each loop for integers, gonna print it in reverse
        for (Integer i : myList){
            System.out.println(i);

        }

    }
}
