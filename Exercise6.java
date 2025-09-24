public class Exercise6 {
    
    public static int find(int arr[], int k){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    public static void main (String[] args){
        int[] a = {1,2,3,4,5,6,7};
        int num = 6;

        System.out.println("The number need to find is: " + find(a, num));
    }
}
