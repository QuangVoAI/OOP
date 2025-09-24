    import java.math.BigDecimal;
public class Exercise10_11_12 {
    public static BigDecimal findMax (BigDecimal[] arr){
        if (arr == null | arr.length == 0){
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        BigDecimal max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i].compareTo(max) > 0){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        BigDecimal[] arr = new BigDecimal[5];

        arr[0] = new BigDecimal("10.5");
        arr[1] = new BigDecimal("200.123");
        arr[2] = new BigDecimal("-45.67");
        arr[3] = new BigDecimal("999999.99");
        arr[4] = new BigDecimal("3.14159");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println("The max value of Decimal object in array: " + findMax(arr));
    }
}
