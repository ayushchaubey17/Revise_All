public class Clear_Last_Bit {
    public static void main(String[] args) {
//        claer(15,1);
        clear_Range_Of_Bits(31,3,2);
    }
    public static  void claer(int n, int pos) {


        int a = -1;// ~(0)
        int b = a<<pos;

        System.out.println(b & n);

    }


    public static void clear_Range_Of_Bits(int n, int l, int r) {
        int a = ~(0);
        int first  = a<<(l+1);            //1111100000000
        int last = (1<<r )- 1;            //0000000000111
//int last = ((int) Math.pow(2,r) )- 1;   //0000000000111
    int bitMask = first | last;           //1111100000111


        System.out.println(bitMask & n);

    }


}
