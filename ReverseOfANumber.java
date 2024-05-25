public class ReverseOfANumber {
    public static void main(String[] args) {
        reverse(1236545);

    }

    public static void reverse(int n) {
        String s = Integer.toString(n);

        int i = 0;
        String ns = "";
        while (n != 0) {
            int l = n % 10;
            String p = Integer.toString(l);
            ns+=p;

            System.out.print(l + "");
            n = n / 10;
        }
        System.out.println();
        System.out.println( ns);
    }
}
