import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        String sen = "my name is ayush kumar chaubey";
        StringTokenizer token = new StringTokenizer(sen);

        System.out.println(token.countTokens());

        while (token.hasMoreTokens()) {
            String a = token.nextToken();
            System.out.println(a);
        }

    }
}
