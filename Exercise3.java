import java.util.*;
public class Exercise3 {
    public static int reverse (int n){

        int rev = 0; //reverse
        int rem; //remainder

        while (n > 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }

    /*
     * resul = 0;
     * while (n > 0){
     * result += 10;
     * result += n % 10;
     * n /= 10;
     * }
     */

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of n: ");
        int n = sc.nextInt();
        System.out.printf("The reverse of %d is %d", n, reverse(n));
    }
}
