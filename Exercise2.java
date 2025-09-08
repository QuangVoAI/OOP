import java.util.*;
public class Exercise2 {
    public static boolean isEven(int n){

        if (n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    // return n % 2 == 0;
    // return n % 2 == 0 ? true : false;

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if (isEven(n)){
            System.out.println(n + " is even.");
        }
        else{
            System.out.println(n + " is odd.");
        }
    }
}
