import java.util.Random;

class Matrix{
    int size;
    int[][] matrix;
    public Matrix(int size){
        this.size = size;
        matrix = new int[size][size];
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
        } else {
            return dDown;
        }
    }

    String matrixPrint() {
        StringBuilder matrixString = new StringBuilder();
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrixString.append(" ").append(ints[j]).append(" ");
            }
            matrixString.append("\n");
        };
        return matrixString.toString();
    }

    void fillMatrix(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                Random random = new Random();
                matrix[i][j] = random.nextInt(10);
            }
        }
    }
}