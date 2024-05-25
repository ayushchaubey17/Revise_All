public class Solid_Rhombhus {
    public static void main(String[] args) {
print_Hollow(15);
    }

    public static void print(int n) {
        for (int i = n; i >=1 ; i--) {

            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void print_Hollow(int n) {
        for (int i = n; i >=1 ; i--) {

            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=n ; j++) {


                if(j==1 || j==n || i==1 || i==n)
                System.out.print("*");

                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}