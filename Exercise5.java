public class Exercise5 {
    public static boolean isPrime(int n){
        if (n <= 1) return false;
        if (n == 2) return true; //2 is prime
        if (n % 2 == 0) return false; //even number > 2 are not prime

        for (int i = 3; i * i <= n; i+=2){
            if (n % i == 0) return false; // ton tai uoc so ngoai 1 va 0 => khong phai prime
        }
        return true;
    }

    public static int countPrime(int[] arr){
        int count = 0;
        for (int num : arr){
            if (isPrime(num)){
                count ++;
            }
        }
        return count;
    }

    public static void main (String[] args){
        int[] number = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println("The number in array are: " + countPrime(number));
    }
}
