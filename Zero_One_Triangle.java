public class Zero_One_Triangle {
    public static void main(String[] args) {
        print(8);
    }
    public  static  void  print(int n) {

        for (int i = 1; i <= n ; i++) {
            boolean a = (i%2==0)? true:false;

            for (int j = 1; j <=i ; j++) {
                a = !a;
                System.out.print(a?"1":"0");

            }


            System.out.println();

        }
    }
}
