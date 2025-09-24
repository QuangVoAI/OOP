public class Exercise2 {

    public static int[][] addMatrix(int [][] a, int [][]b){
        int rows = a.length;
        int cols = a[0].length;
        int [][] result = new int [rows][cols];
        
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static int[][] mulMatrix (int [][] matrix, int number ){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int [][] result = new int [rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                result[i][j] = matrix[i][j] * number;
            }
        }
        return result;
    }

    public static void prinMatrix (int [][] m){
        System.out.println("[");
        for (int i = 0; i < m.length; i++){
            System.out.print("[");
            for (int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.print("]");
            System.out.print("\n");
        }
        System.out.print("]");
    }

    public static void main (String[] args){
        int [][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int [][] b = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int [][] c = addMatrix(a, b);
        int number = 3;

        System.out.println("The result of matrix addition is: ");
        prinMatrix(c);
        System.out.println();

        System.out.printf("The result of multiplying matrix a with %d is: \n", number);
        mulMatrix(a, number);
        prinMatrix(mulMatrix(a, number));
        System.out.println();



    }
}
