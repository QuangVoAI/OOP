import java.util.Scanner;
public class Exercise8 {
    public static int sumN(int n){
        
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    
    }

    public static long factorial(int n){

        long f = 1;
        for (int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }

    public static int squareSum (int n){

        int sum = 1;
        for (int i = 1; i <= n; i++){
            sum += Math.pow(2, i);
        }
        return sum;
    }
    
    public static double fractionSum (int n){

        double sum = 0.0;
        for (int i = 1; i <= n; i++){
            sum += 1.0 / (2 * i); 
        }
        return sum;
    }

    public static int sumSquare (int n){

        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        System.out.println("The sum of numbers is: " + sumN(n));
        System.out.println("The factorial of number is: " + factorial(n));
        System.out.println("The sum of squares is: " + squareSum(n));
        System.out.printf("The sum of fractions is: %.2f\n", fractionSum(n));
        System.out.println("The sum of squares is: " + sumSquare(n));
        sc.close();
    }    
}
