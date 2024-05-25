public class Character_Pyramid {
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int n) {
        char ch = 'A';


        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
