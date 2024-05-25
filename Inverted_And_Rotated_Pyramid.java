public class Inverted_And_Rotated_Pyramid {
    public static void main(String[] args) {
print_Pattern(13);
    }


    public  static void print_Pattern(int l){
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <=l ; j++) {


                System.out.print(i+j>l?"*":" ");
            }
            System.out.println();

        }
    }
}
