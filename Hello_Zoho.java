public class Hello_Zoho {
    public static void main(String[] args) {
        String s = "HelloAyushChaubey";
        print(s);
    }


    public static void print(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                System.out.print((j==i || j== s.length()-1-i)?s.charAt(j):" ");
            }
            System.out.println();
        }
    }
}
