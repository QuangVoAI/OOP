import java.util.Scanner;;
public class Exercise13 {
    public static boolean isPalinprome(int n){

        int org = n;
        int rev = 0;
        while (n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        return org == rev;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPalinprome(n)){
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }
        sc.close();
    }
}
