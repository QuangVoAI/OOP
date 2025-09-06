import java.util.Scanner;
public class Exercise12 {
    public static int reverse(int n){
        int reversed = 0;
        while (n != 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        System.out.printf("The reverse of %d is %d", n, reverse(n));
        sc.close();
    }
}
