import java.util.*;
public class Exercise4 {
    public static double interestRate (int months){

        if (months <= 3) return 0.01;
        else if (months <= 6) return 0.015;
        else if (months < 12) return 0.03;
        else return 0.05;
    }

    public static int amountReceived (int amount, int months){

        return (int)(Math.round(amount + (amount * interestRate(months))));
    }

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the deposit amount: ");
        int amount;
        while (true) {

            amount = sc.nextInt();
            if (amount > 0) break;
            else {
                System.out.print("Invalid input. Please enter the deposit amount: ");
            }
        }

        System.out.print("Enter the number of months wants to deposit: ");
        int months;

        while (true) {
            months = sc.nextInt();
            if (months > 0 && months <= 12){
                break;
            }
            else {
                System.out.print("Invalid input. Please enter the number of months: ");
            }
        }

        System.out.printf("Number of months: %d with interest rate: %.1f%%\n", months, interestRate(months)*100);
        System.out.printf("The amount received: %d", amountReceived(amount, months));
    }
}
