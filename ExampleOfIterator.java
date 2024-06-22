import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleOfIterator {

    public static void main(String[] args) {
       List<String> al = new ArrayList<>();

        al.add("ram");
        al.add("shyam");
        al.add("mohan");
        al.add("sohan");


        Iterator<String> itr = al.iterator();

        while (itr.hasNext()) {
                 String k = itr.next();
                 System.out.println(k);
        }

    }
}
