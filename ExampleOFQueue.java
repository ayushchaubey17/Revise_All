import java.util.*;

public class ExampleOFQueue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("aram");
        q.add("bram");
        q.add("cram");
        q.add("dram");


        System.out.println(q);

       Iterator<String>  itr = q.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());

        }


     Set<String> hs = new HashSet<>();
    }
}
