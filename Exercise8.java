import java.util.Scanner;

public class Exercise8 {
    public static void deleteFirstGreaterElement(int []arr){

        int n = arr.length;
        int index = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                index = i;
                break;
            }
            
        }

        if (index == -1){
            System.out.println("No positive element found in the array.");
            return;
        }

        int []newArr = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++){
            if (i != index){
                newArr[j++] = arr[i];
            }
        }
        System.out.println("The new array after deleting the first positive element is: ");
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
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
        deleteFirstGreaterElement(arr);

        sc.close();

    }
}
