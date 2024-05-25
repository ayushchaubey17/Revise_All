public class Factorial_Of_A_Number {
    public static void main(String[] args) {


       int n =  find_Factorial2(5);
        System.out.println(n);
    }

   public static int find_Factorial(int n) {
        if(n==0 || n==1) return 1;

        return n*find_Factorial(n-1);

    }


    static int find_Factorial2(int n) {
        if(n==0 || n==1 ) return  1;

        int fact =1;
        while(n!=1){
            fact*=(n--);
        }
        return  fact;
    }
}

