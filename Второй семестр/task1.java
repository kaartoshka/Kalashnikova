import java.util.Scanner;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту матрицы:");
        int n = in.nextInt();
        System.out.println("Введите длину матрицы:");
        int m = in.nextInt();
        int[][] matrix = matrix_create(n,m);
        mayrix_print(matrix);
        int d = 1;
        int d_up = 0;
        int d_down = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j){
                    d *= matrix[i][j];
                }else if (i < j){
                    d_up += matrix[i][j];
                }else if (i > j){
                    d_down += matrix[i][j];
                }
            }
        }
        System.out.println("Произведение эллементов на глваной дигонали равно " + d);
        System.out.println("Раность правых верхних и левых нижних эллементов относительно главной дигонали равна " + (d_up - d_down));
    }
    public static void mayrix_print( int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrix_create (int n, int m){
        int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    Random random = new Random();
                    matrix[i][j] = random.nextInt(10);
                }
            }
        return matrix;
    }
}