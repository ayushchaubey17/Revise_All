public class ReverseOfNumber2 {
    public static void main(String[] args) {
       reverse(3498);
    }
    public static  void  reverse(int n) {
        int rev =0;
        while (n>0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n = n/10;
        }
        System.out.println(rev);

    }
}
