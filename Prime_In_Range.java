public class Prime_In_Range {
    public static void main(String[] args) {
        find_All(1,50);
    }

    static void find_All(int start, int end) {
        Is_Prime obj = new Is_Prime();
        for (int i = start;i<=end;i++) {
            if(obj.check_Prime(i)) System.out.print(i+" ");
        }
    }
}
