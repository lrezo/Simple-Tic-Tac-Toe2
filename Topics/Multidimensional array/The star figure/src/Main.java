import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] matrix = new String[n][n];
        for (String[] strings : matrix) {
            Arrays.fill(strings, ". ");
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[matrix.length / 2][i] = "* ";
            matrix[i][matrix.length / 2] = "* ";
            for (int j = 0, x = matrix[i].length - 1; j < matrix[i].length; j++, x--) {
                matrix[j][j] = "* ";
                matrix[j][x] = "* ";
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j == matrix.length - 1 && i != matrix.length - 1) {
                    System.out.println();
                }
            }
        }
    }
}