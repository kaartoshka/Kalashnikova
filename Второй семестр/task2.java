import java.util.Scanner;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы матрицы:");
        int n = in.nextInt();
        Matrix matrix1 = new Matrix(Matrix.matrixCreate(n));
        matrix1.matrixPrint();
        System.out.println("Произведение эллементов на глваной дигонали равно " + matrix1.calculate(1, 1));
        System.out.println("Раность правых верхних и левых нижних эллементов относительно главной дигонали равна " + (matrix1.calculate(1,2) - matrix1.calculate(2,1)));
    }
}
