import java.util.Random;

class Matrix{
    int[][] matrix;
    public Matrix(int[][] matrix){
        this.matrix = matrix;
    }
    int calculate(int n, int m){
        int d = 1;
        int dUp = 0;
        int dDown = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    d *= matrix[i][j];
                } else if (i < j) {
                    dUp += matrix[i][j];
                } else if (i > j) {
                    dDown += matrix[i][j];
                }
            }
        }
        if (m == n){
            return d;
        } else if (m < n) {
            return dUp;
        } else if (m > n) {
            return dDown;
        }
        return d;
    }

     void matrixPrint() {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + ints[j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] matrixCreate(int n){
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                Random random = new Random();
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }
}