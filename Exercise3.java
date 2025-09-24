public class Exercise3 {
    public static int sumEven(int[]arr){

        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Must not be null or empty");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) sum += arr[i];
        }
        return sum;

    }

    public static void main(String[] args) {
        
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Sum all even number: " + sumEven(arr));
    }
}
