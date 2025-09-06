import java.util.Scanner;
public class Exercise6 {
    public static void minimum(int a, int b, int c){

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("The minimum is: " + min);
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        minimum(a, b, c);
        sc.close();
    }
}
