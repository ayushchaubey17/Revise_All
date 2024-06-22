public class String_Build {
    public static void main(String[] args) {

        add();
    }

    public static void add() {
        StringBuilder sb = new StringBuilder("ram ");

        for (char i = 'a'; i < 'z'; i++) {
            sb.append(i);

        }
        System.out.println(sb);

    }
}
