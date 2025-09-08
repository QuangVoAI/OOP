import java.util.Scanner;
public class Exercise4 {
    public static void printFirstNegativeElement(int []arr){

        System.out.print("The first position negative elements in the array are: ");

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                System.out.print(i + " ");
                break;
            }
            
        }
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
        printFirstNegativeElement(arr);
        sc.close();

    }
}
