public class Inverted_Half_Pyramid_With_Number

{
    public static void main(String[] args) {
        print_Pattern(17);
    }

    public static void print_Pattern(int l) {
        for (int i = 1; i <=l ; i++) {
            for (int j = 1; j <=(l+1-i) ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
