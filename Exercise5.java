public class Exercise5 {
    public static void printOut (int n){
        
        for (int i = 1; i <= n; i += 2){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 1; i -= 2){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String[] args){

        System.out.println("n = 3");
        printOut(3);
        System.out.println("n = 5");
        printOut(5);
        System.out.println("x = 7");
        printOut(7);
    }
}
