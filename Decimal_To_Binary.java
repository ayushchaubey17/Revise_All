public class Decimal_To_Binary {
    public static void main(String[] args) {

        convert(15);
    }
    public  static  void  convert(int dec){
        int n = dec;
        int num = 0;
        int power = 0;

        while(dec>0){

            int rem = dec % 2;
            num = num + rem * (int) Math.pow(10,power++);
            dec /= 2;
        }

        System.out.println("the binary value of "+ n + " is " +num);
    }
}
