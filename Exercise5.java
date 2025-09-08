import java.util.Scanner;

public class Exercise5 {
    public static void sumElement(int []arr){

        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.print("The sum of elements in the array is: " + sum);
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements n: ");
        int n = sc.nextInt();
        int []arr = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sumElement(arr);
        sc.close();

    }
}
