public class Check_Palindrome {
    public static void main(String[] args) {

      boolean s=   check("rammar");
        System.out.println(s);
    }

    public static boolean check(String s) {

        int start = 0;
        int last = s.length()-1;


        while (start < last) {
            if (s.charAt(start)!= s.charAt(last)) {
                return false;
            }
            start++;
            last--;
        }

        return  true;

    }
}
