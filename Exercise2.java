public class Exercise2 {
    public static int findMin(int arr[]){

        if (arr == null || arr.length == 0 ){
            throw new IllegalArgumentException("Must not be null or empty");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static void main (String[] args){

        int []arr = {1,2,3,4,5,6};
        System.out.println("Minimum value of an array: " + findMin(arr));
    }
}
