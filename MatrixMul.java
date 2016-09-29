/**
 * Created by Muhammad Ali (BSCS3A 6978)
 */
import java.util.Scanner;

public class MatrixMul {

    public static int[][] iterative (int matrix1[][], int matrix2[][])
    {
        int mat1 = matrix1.length;
        int mat2 = matrix1[0].length;
        int mat3 = matrix2[0].length;

        // Dimensions of answer will be X x Z

        int[][] answer = new int[mat1][mat3];
        for (int i = 0; i<mat1; i++)
            for (int j = 0; j<mat3; j++) {
                int sum = 0;
                for (int k = 0; k < mat2; k++)
                    sum = sum + (matrix1[i][k] * matrix2[k][j]);
                answer[i][j] = sum;
            }
        return answer;
    }
    public static void printAnswer (int answer[][])
    {
        int mat1 = answer.length;
        int mat2 = answer[0].length;
        System.out.print("\n");
        for (int i = 0; i<mat1; i++) {
            System.out.print("|");
            for (int j = 0; j < mat2; j++) {
                if (j==mat2-1)
                    System.out.print(answer[i][j]);
                else
                    System.out.print(answer[i][j] + ",");
            }
            System.out.print("|\n");
        }
        System.out.print("\n");
    }
    public static void main (String args[]) {

        int[][] matrix1 = new int[3][4];
        int[][] matrix2 = new int[4][4];

        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[0][2] = 3;
        matrix1[0][3] = 4;
        matrix1[1][0] = 1;
        matrix1[1][1] = 2;
        matrix1[1][2] = 3;
        matrix1[1][3] = 4;
        matrix1[2][0] = 1;
        matrix1[2][1] = 2;
        matrix1[2][2] = 3;
        matrix1[2][3] = 4;

        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[0][2] = 3;
        matrix2[0][3] = 4;
        matrix2[1][0] = 1;
        matrix2[1][1] = 2;
        matrix2[1][2] = 3;
        matrix2[1][3] = 4;
        matrix2[2][0] = 1;
        matrix2[2][1] = 2;
        matrix2[2][2] = 3;
        matrix2[2][3] = 4;
        matrix2[3][0] = 1;
        matrix2[3][1] = 2;
        matrix2[3][2] = 3;
        matrix2[3][3] = 4;


        printAnswer(iterative(matrix1,matrix2));
    }
}
