public class Exercise8 {
    public static int[] divisibleNumber(int[] arr, int k){
        // Bước 1: đếm số phần tử chia hết cho k
        // Bước 2: tạo mảng mới có độ dài = count
        //Bước 3: điền các phần tử chia hết cho k vào mảng result

        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % k == 0) count++;
        }

        int [] result = new int [count];

        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % k == 0){
                result[index] = arr[i];
                index++; 
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,6,7,8,9,20};
        int k = 4;

        int [] result = divisibleNumber(arr, k);
        System.out.printf("The array number divisible for %d is:\n", k);
        System.out.print("[");
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]);
            if (i < result.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
