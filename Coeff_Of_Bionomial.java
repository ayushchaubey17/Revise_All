public class Coeff_Of_Bionomial {
    public static void main(String[] args) {
        calculate_Coeff(6,2);
    }
    public static void calculate_Coeff(int n,int r) {
        Factorial_Of_A_Number obj = new Factorial_Of_A_Number();
        int a = obj.find_Factorial(n);
        int b = obj.find_Factorial(r);
        int c = obj.find_Factorial(n-r);

        System.out.println(a/(b*c));


    }
}
