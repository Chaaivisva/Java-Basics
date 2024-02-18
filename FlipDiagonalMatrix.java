import java.util.Scanner;

public class FlipDiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

  
        int[][] matrix = new int[size][size];
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        flipDiagonal(matrix);

        System.out.println("\nModified Matrix:");
        printMatrix(matrix);

        scanner.close();
    }


    private static void flipDiagonal(int[][] matrix) {
        int size = matrix.length;

        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j && (i + j) != (size - 1)) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[size - 1 - j][size - 1 - i];
                    matrix[size - 1 - j][size - 1 - i] = temp;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
