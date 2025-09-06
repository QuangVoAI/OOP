import java.util.Scanner;
public class Exercise10 {
    public static int sumFirstLast(int n){
        int firstDigit = n;
        int lastDigit = n % 10;

        while (firstDigit >= 10){
            firstDigit /= 10;
        }
        return firstDigit + lastDigit;
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        System.out.printf("The sum of First and Last digit of %d is %d", n, sumFirstLast(n));
        sc.close();
    }

}
