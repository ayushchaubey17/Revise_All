public class ReverseTriangle {
    public static void main(String[] args) {
        print(15);
    }

    public  static  void  print(int n ){
        for (int i = 1; i < n ; i++) {
            int val = i;
            for (int j = 1; j <=n ; j++) {
                if (j+val>n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
