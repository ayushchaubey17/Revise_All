public class Palindromic_Pattern {
    public static void main(String[] args) {
        print(6);
    }
    public  static  void print(int n){
        for (int i = 1; i <=n ; i++) {
            int k =i;
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(" "+k+" " );
                k--;
            }

            for (int l = 2; (l<=i) ; l++) {
                System.out.print(" "+l+" ");
            }
            System.out.println();

        }


    }
}
