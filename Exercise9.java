import java.util.Scanner;
public class Exercise9 {
    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        while (n != 1){
            if (isEven(n)){
                System.out.printf("%d is even, so we take n / 2: ", n);
            }
            else {
                System.out.printf("%d is odd, so we take 3n + 1: ", n);
            }
        }
        sc.close();
    }
}
