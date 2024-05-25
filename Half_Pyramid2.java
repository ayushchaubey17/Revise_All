public class Half_Pyramid2 {
    public static void main(String[] args) {
        print(10);

    }
    public  static  void  print(int n){
int val =0;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=i ; j++) {
                val++;
//                System.out.print(val+" ");
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
