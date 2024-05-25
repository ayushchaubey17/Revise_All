public class SquarePattern {
    public static void main(String[] args) {

        pattern(7);
    }
    public static  void pattern(int n){

        for (int line = 0; line <n ; line++) {
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
