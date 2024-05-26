public class Get_The_ith_Bit {
    public static void main(String[] args) {
//        getBit(10,2);
//        clearBit(10,0);
//        setBit(10,2);

        clear_And_Set_Bit(3,0,1);
        clear_And_Set_Bit2(3,0,1);
    }

    public static void getBit(int n, int pos) {
        int bit_Mask = 1<<pos;
       if ((bit_Mask & n) == 0) System.out.println(0);
       else System.out.println(1);
    }


    public static void setBit(int n, int pos) {

        int bitMask = 1<<pos;
        System.out.println(n | bitMask);

    }


    public static int clearBit(int n,int pos) {
        int bitMask = ~(1<<pos);
        System.out.println(bitMask & n);

        return  bitMask & n;
    }


    public  static  void  clear_And_Set_Bit(int n, int pos,int bit){
        if(bit ==0) clearBit(n,pos);
        else setBit(n,pos);
    }


    public static void clear_And_Set_Bit2(int n, int pos, int bit) {
     int cleard = clearBit(n,pos);
     int masked_Bit = bit<<pos;
        System.out.println(masked_Bit | cleard);
    }





}
