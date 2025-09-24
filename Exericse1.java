public class Exericse1 {
    public static boolean removeFirst(int arr[], int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                for (int j = i; j < arr.length - 1; j++){
                    arr[j] = arr[j+1];
                }
                arr[arr.length - 1] = 0;
                return true;
            }
        }
        return false;
    }

    public static void insertElement(int arr[],int pos, int target){
        if (pos < 0 || pos >= arr.length) throw new IllegalArgumentException("The possition must in the array");

        for (int i = arr.length - 1; i > pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = target;
    }

    public static void findDuplicate(int arr[]){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

    public static int removeDuplicate(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;
                    j--;
                    
                }
            }
        }
        for (int i = n; i < arr.length; i++) {
            arr[i] = 0;
        }
        return n;
    }

    public static void printArray(int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if (i < arr.length-1) System.out.print(", ");  
        }
        System.out.print("]");
    }

    public static void main (String[] args){
        int []a = {1,2,2,3,4,4,5,6,5,7,8,9};
        int number = 5;
        int pos = 3; //vi tri muon them

        printArray(a);
        System.out.println();

        System.out.printf("The array after removing element %d is: ", number);
        removeFirst(a, number);
        printArray(a);
        System.out.println();

        System.out.printf("The array after insert an element at position %d is:", pos);
        insertElement(a, pos, number);
        printArray(a);
        System.out.println();

        System.out.print("Duplicate values in this array: ");
        findDuplicate(a);
        System.out.println();

        System.out.print("The array after removing duplicate values is: ");
        removeDuplicate(a);
        printArray(a);
        System.out.println();
        
    }
}
