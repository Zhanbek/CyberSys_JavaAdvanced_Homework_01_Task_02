import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");

        Iterator<String> iterator = list.iterator();
        int count = 0;
        while (iterator.hasNext()){
            System.out.println(++count + ": " + iterator.next());
        }
    }
}