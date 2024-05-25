public class ButterFly_Pattern {
    public static void main(String[] args) {
        print_Second(4);

    }
    public static  void  print_First(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=2*n ; j++) {

                if (j<=i || (j>2*n-i)) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("    ");
                }



            }
            System.out.println();
        }


        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=2*n ; j++) {

                if (j<=i || (j>2*n-i)) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print( "   ");
                }



            }
            System.out.println();
        }
    }


    public static void print_Second(int n) {
        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            for (int j = 1; j < (2*n- 2*i) ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }



        for (int i = n; i >= 1 ; i--) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            for (int j = 1; j < (2*n- 2*i) ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
