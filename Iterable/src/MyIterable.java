import java.util.*;

public class MyIterable<T> implements Iterable<T> {

    private List<T> list;

    public MyIterable(T [] t){
        list = Arrays.asList(t);
        Collections.reverse(list);
    }

    public Iterator<T> iterator(){
        return list.iterator();
    }

}
