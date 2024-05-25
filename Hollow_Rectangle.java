public class Hollow_Rectangle {
    public static void main(String[] args) {
        print_Rectangle(15,10);
    }

    public static void print_Rectangle(int b, int l) {
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <=l ; j++) {



                System.out.print((i==1 || i==b || j==1 || j==l)?"*":" ");
            }
            System.out.println();
        }
    }
}
