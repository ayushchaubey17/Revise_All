public class Set_Bits_In_Count {
    public static void main(String[] args) {
        count(15);
    }


    public static void count(int n) {


        int c =0;
        while (n != 0) {
            if((n & 1) == 1) c++;

            n= n>>1;
        }
        System.out.println(c);
    }

}
