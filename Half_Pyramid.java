public class Half_Pyramid {
    public static void main(String[] args) {
        print(6);
    }

    public static void print(int n) {
        for (int i =1;i<=n;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }
}
