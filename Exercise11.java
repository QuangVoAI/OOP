import java.util.Scanner;
public class Exercise11 {
    public static int countDigit(int n){

        int count = 0;
        while (n != 0){
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        System.out.printf("the number %d has %d digits", n, countDigit(n));
        sc.close();
    }
}
