public class Bitwise_Odd_And_Even_Check {
    public static void main(String[] args) {
        check_Odd(10);

    }

    public static void check_Odd(int a) {
       System.out.println(((a & 1 )==1)?"odd number":"even number");
    }
}
