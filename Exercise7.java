import java.util.Scanner;
public class Exercise7 {
    public static int[] insertFirst (int []arr, int x){

        int n = arr.length;
        int []newArr = new int[n + 1];

        newArr[0] = x;
        for (int i = 0; i < n; i++){
            newArr[i + 1] = arr[i];
        }

        return newArr;
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
        System.out.println("Enter the number to insert at the beginning: ");
        int x = sc.nextInt();

        int[] newArr = insertFirst(arr, x);
        System.out.println("The new array is: ");
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }

        sc.close();

    }
}
