import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        int scs = scanner.nextInt();
        int[][] matrix = new int[sc][scs];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        colSwapper(scanner.nextInt(), scanner.nextInt(), matrix);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static void colSwapper(int c1, int c2, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int holder = matrix[i][c1];
            matrix[i][c1] = matrix[i][c2];
            matrix[i][c2] = holder;
        }
    }
}