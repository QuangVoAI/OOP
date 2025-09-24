import java.util.Arrays;

public class Exercise9 {
    public static int thirdLargest(int [] arr){
        if (arr.length < 3){
            throw new IllegalArgumentException("Array must have atleast 3 elements");
        }

        Arrays.sort(arr);
        return arr[arr.length - 3];
    }

    public static void main(String[] args){
        int []arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("The third largest number in array is: "+ thirdLargest(arr));
    }

}
