public class Exercise4 {
    
    public static int count (int[]arr, int t ){
        if (arr == null) return 0; //check null

        int c = 0;
        for (int num : arr){
            if (num == t){
                c++;
            }
        }
        return c;
    }

    public static void main (String [] args){
        int[] a = {1,2,3,4,5,6,2,3,4,2,3};
        int t = 2;

        System.out.println();
        int o = count(a,t);
        System.out.printf("Element %d occur %d time in array", t, o);
    }

}
