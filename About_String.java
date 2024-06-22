public class About_String {
    public static void main(String[] args) {
        String a = "Ramayan";

        System.out.println(a.length());
        String c = a.toUpperCase();
        String b = c.toLowerCase();
        System.out.println(c);
        System.out.println(b);

        String s = " my name is ayush kumar    chaubey    ";
    String p =     s.trim();
        System.out.println(p);


        String q = a.substring(3,5);
        System.out.println(q);


        String s1 = p.replace("my", "his");
        System.out.println(s1);


     boolean p1 =    s1.startsWith("his ");
        System.out.println(p1 +" \n");

        int value =2;

        switch (value) {
//            case 0 -> {
//                System.out.println("case0");
//            }
//            case 1 -> {System.out.println("case1");}
//            case 2 -> {System.out.println("case2");}
//            case 3 -> {System.out.println("case3");}
//            default -> {System.out.println("case default");}

            case 1:
                System.out.println("ds");
                System.out.println("sd");
                break;

            case 2:
                System.out.println("ds2");
                System.out.println("sd2");
                break;

            default:
                System.out.println("dsn");
                System.out.println("sdn");
        }
    }
}
