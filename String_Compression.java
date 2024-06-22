public class String_Compression {
    public static void main(String[] args) {
        method("baaajjjssbbslpppe");

    }

    public static void method(String s) {

        int n = s.length();

        String p = "";
        for (int i = 0; i < n; i++) {
            int k =1;

            while (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                k++;
                i++;
            }

            p += s.charAt(i);
            if (k>1) {
                p += String.valueOf(k);
            }

        }
        System.out.println(p);

    }
}
