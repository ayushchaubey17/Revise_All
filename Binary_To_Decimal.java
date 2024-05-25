public class Binary_To_Decimal {
    public static void main(String[] args) {
convert(1111);
    }

    public  static  void convert(int n){



        int number = n;
        int decimal_Value = 0;
        int power = 0;


        while(number > 0){
            int last_Digit = number % 10;
            decimal_Value = decimal_Value + last_Digit * (int) Math.pow(2,power);
            power++;
            number /=10;


        }

        System.out.println("The decimal value of "+ n +"  is "+ decimal_Value);

    }
}
