public class Exercise1 {
    public static int findMax(int arr[]){
        
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Must not be null or empty");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) max = arr[i]; 
        }
        return max;
    }

    public static void main (String[] args){

        int []arr = {1,2,3,4,5};
        System.out.println("Maximum value of an array: " + findMax(arr));
    }
}
