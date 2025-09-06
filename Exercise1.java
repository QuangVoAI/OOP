import java.util.Scanner;
public class Exercise1 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your date of birth: ");
        String dob = sc.nextLine();
        System.out.print("Enter your student ID: ");
        String studentid = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Student ID: " + studentid);
        sc.close();

    }
}
