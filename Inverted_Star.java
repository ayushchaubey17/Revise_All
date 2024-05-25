public class Inverted_Star {
    public static void main(String[] args) {
        print(15);
    }
    public  static  void  print (int n){


        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j >=n-i+1 ; j++) {
            for (int j = n;j>=i;j--){
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
