import java.util.ArrayList;
import java.util.ListIterator;

public class ExampleOfListIterator {
    public static void main(String[] args) {
        ArrayList<String>  al = new ArrayList<>();

        al.add("ram");
        al.add("ganesh");
        al.add("sohan");
        al.add("mohan");

        ListIterator<String> itr = al.listIterator();

        while (itr.hasNext()) {

            String name = itr.next();


            if (name.equals("sohan")) {
                itr.add("manju");
            }
            System.out.println(name);
        }
        System.out.println(al);


        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
