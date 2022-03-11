import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int[][] matrixRotated = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < matrixRotated.length; i++) {
            for (int j = 0; j < matrixRotated[i].length; j++) {
                System.out.print(matrix[matrixRotated[i].length - 1 - j][i] + " ");
                if (j == matrix.length - 1) {
                    System.out.println();
                }
            }


        }
    }
}