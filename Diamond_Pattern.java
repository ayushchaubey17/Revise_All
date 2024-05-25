public class Diamond_Pattern {
    public static void main(String[] args) {
        print_Pattern(4);
    }
    public  static  void print_Pattern(int n){
        int k =1;
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print("   ");

            }


            for (int j = 1; j <= k ; j++) {
                System.out.print(" * ");

            }
            k+=2;
                if(i == n)k-=2;
            System.out.println();
        }


        for (int i = n; i >=1 ; i--) {

            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print("   ");

            }


            for (int j = 1; j <= k ; j++) {  // j<2*i -1
                System.out.print(" * ");

            }
            k-=2;

            System.out.println();
        }


    }
}
