public class Is_Prime {
    public static void main(String[] args) {
        boolean a = check_Prime(9);
        System.out.println(a);
    }

    public static boolean check_Prime(int n) {
        if(n<=1) return  false;
        if(n==2 || n==3) return true;

        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
