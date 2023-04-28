import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Тестовий клас для класу MatrixSum
 */
public class MatrixSumTest {
    
    /**
     * Тест для методу getMatrixSum(), який перевіряє правильність обчислення суми елементів матриці
     */
    @Test
    public void testGetMatrixSum() {
        int[][] matrix1 = {{34, 262, 3}, {67, 0, 3678}, {6, 45, 32}, {0, 345, 99}};
        int expectedSum1 = 4571;
        int actualSum1 = MatrixSum.getMatrixSum(matrix1);
        assertEquals(expectedSum1, actualSum1);
        
        int[][] matrix2 = {{0, 0, 0}, {0, 0, 0}};
        int expectedSum2 = 0;
        int actualSum2 = MatrixSum.getMatrixSum(matrix2);
        assertEquals(expectedSum2, actualSum2);
        
        int[][] matrix3 = {{-34, -262, -3}, {-67, -0, -3678}, {-6, -45, -32}, {-0, -345, -99}};
        int expectedSum3 = -4571;
        int actualSum3 = MatrixSum.getMatrixSum(matrix3);
        assertEquals(expectedSum3, actualSum3);
    }
}
