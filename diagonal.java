public class diagonal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        flipDiagonal(matrix);

        System.out.println("\nMatrix after flipping diagonal elements:");
        displayMatrix(matrix);
    }

    // Function to flip diagonal elements of the matrix
    public static void flipDiagonal(int[][] matrix) {
        int n = matrix.length;

        // Traverse only the upper triangle (excluding the diagonal)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap the elements across the diagonal
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
            
    // Function to display the matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

