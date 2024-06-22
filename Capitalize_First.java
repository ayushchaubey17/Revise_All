public class Capitalize_First {
    public static void main(String[] args) {
        String b = "helllo i am a good boy";
        method2(b);

        System.out.println();
    }

    public static void method1(String s) {

        String p ="";
        for (int i = 0; i < s.length(); i++) {

            if (i == 0 || ( i >0 && s.charAt(i - 1) == ' ')) {
              char x =   Character.toUpperCase(s.charAt(i));
              p+=x;
              continue;
            }
            p+=s.charAt(i);


        }

        System.out.println(p);

    }

    public static void method2(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(s.charAt(0)));

        for (int i = 1; i < n; i++) {

            if (s.charAt(i) == ' ') {
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));

            } else {
                sb.append(s.charAt(i));
            }

        }
        System.out.println(sb);
    }

}
