import java.util.Scanner;
public class Exercise5 {
    public static void isLeapYear (int year){
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("" + year + " is a leap year.");
        }
        else {
            System.out.println("" + year + " is not a leap year.");
        }
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        isLeapYear(year);
        sc.close();
    }
}

// chia het cho 4 khong chia het cho 100
// hoac chia het cho 400