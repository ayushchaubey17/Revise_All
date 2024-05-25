public class floyds_Triangle {
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int l) {
        int k =1;
        for (int i = 1; i <= l ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print((k++)+" ");
            }
            System.out.println();
        }
    }
}
