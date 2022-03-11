import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(Math.abs(j - i) + " ");
            }
            System.out.println();
        }
    }
}