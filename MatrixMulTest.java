import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixMulTest {

    @Test
    public void testIterative() throws Exception {
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
        assertArrayEquals(new int[][]{{10,20,30,40},{10,20,30,40},{10,20,30,40}},MatrixMul.iterative(matrix1,matrix2));
    }

    @Test
    public void testPrintAnswer() throws Exception {

    }

    @Test
    public void testMain() throws Exception {

    }
}