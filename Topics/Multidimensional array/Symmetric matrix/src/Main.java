import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.next();
        int scs = Integer.parseInt(sc);
        StringBuilder yup = new StringBuilder();
        String[][] numbers = new String[scs][scs];
        for (int i = 0; i < scs * scs; i++) {
            yup.append(scanner.next());
        }
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = String.valueOf(yup.charAt(counter));
                counter++;

            }
        }
        String checkS;
        int check = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j].equals(numbers[j][i]) && i != j) {
                    check++;
                }
            }
        }
        checkS = check == scs * scs - scs ? "YES" : "NO";
        System.out.println(checkS);

    }
}