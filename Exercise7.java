import java.util.Scanner;
public class Exercise7 {
    public static boolean checkCharacter(char c){

        return ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'));
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        if (checkCharacter(c)){
            System.out.println(c + " is a digit or an alphabet.");
        }
        else {
            System.out.println(c + " is not a digit or an alphabet.");
        }
        sc.close();
    }
}
//digit, upercase, lowercase