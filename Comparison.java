public class Comparison {
    public static void main(String[] args) {

        String s[] = {"ram", "shyam", "mohan", "sohan", "sita"};

//        System.out.println("ram".compareTo("ahyam"));
        largest(s);
    }

    public static void largest(String[] str) {
        String largest = str[0];


        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i])<0) {
                largest = str[i];
            }
        }

        System.out.println(largest);
    }
}
