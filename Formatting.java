import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Scanner;

public class Formatting {
    public static void main(String[] args) {
//        double num  = 7687812334.4545d;
//        DecimalFormat df = new DecimalFormat("##,##,###.##");
//        String fd = df.format(num);
//        System.out.println(fd);

//        int a = 2353421;
//
//        DecimalFormat df = new DecimalFormat("##,##,##,##");
//        System.out.println(df.format(a));


        String ptrn = "hello {0}! . How are you. today is a nice {1}.";
        Object arg[] = data();
        String mm = MessageFormat.format(ptrn, arg);
        System.out.println(mm);

    }

    public static String[] data() {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String arr[] = {a, b};
        return  arr;
    }
}
