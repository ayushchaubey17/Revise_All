public class FInd_Exponent {
    public static void main(String[] args) {
        find_it(2,5);
    }

    public static void find_it(int num, int pow) {
        int a = num;
        int ans = 1;

        while (pow > 0) {
            if((pow & 1) == 1) ans*=a;

            a*=a;
            pow>>=1;
        }

        System.out.println(ans);




    }
}
