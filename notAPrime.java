public class notAPrime {
    public static void main(String[] args) {
        checkPrime(67);
    }

    public static void checkPrime(int n) {

        int factor =0;
        int start =1;
        while (start<= Math.sqrt(n)){

            if(n%start==0) factor++;
            start++;
    }
        if (factor>2){
            System.out.println("not prime");
        }
        else {
            System.out.println("prime");
        }
    }
}
