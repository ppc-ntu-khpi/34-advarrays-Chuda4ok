/**
 * Клас, що містить метод для обчислення суми елементів матриці
 */
public class MatrixSum {
    
    /**
     * Метод, який обчислює суму елементів матриці
     * @param matrix матриця цілих чисел
     * @return сума елементів матриці
     */
    public static int getMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    
    /**
     * Метод main, який демонструє роботу методу getMatrixSum()
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        int[][] matrix = {{34, 262, 3}, {67, 0, 3678}, {6, 45, 32}, {0, 345, 99}}; // змініть матрицю на потрібну
        int sum = getMatrixSum(matrix);
        System.out.println("Сума елементів матриці: " + sum);
    }
}
