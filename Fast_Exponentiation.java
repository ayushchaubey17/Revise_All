public class Fast_Exponentiation {
    public static void main(String[] args) {
        find(5,3);
    }

    public static void find(int num, int power) {
        int a = num;
        int ans =1;
        while (power != 0) {

            if ((power & 1) ==1) ans = a* ans;

            a = a*a;
            power = power>>1;

        }
        System.out.println(ans);
    }
}
