import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }
        
        System.out.println("The array elements are: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
