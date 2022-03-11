package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [][] matrix = new char[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=' ';
            }
        }
        int counter_1 = 1;
        System.out.println("---------");
        System.out.print("| ");
        for (int i = 0; i <9; i++) {
            counter_1 = getCounter_2(counter_1, ' ');
        }
        System.out.println("---------");
        int check = 0;
        int counter_3 = 0;
        String selection2;
        while (check == 0){
            System.out.print("Enter the coordinates: ");
            selection2 = (scanner.next());
            selection2 += (scanner.next());
            if (selection2.length()<2 || !Character.isDigit(selection2.charAt(0)) || !Character.isDigit(selection2.charAt(1))) {
                System.out.println("You should enter numbers!");
            }
            else if (Integer.parseInt(String.valueOf(selection2.charAt(0))) >3 || Integer.parseInt(String.valueOf(selection2.charAt(1))) >3){
                System.out.println("Coordinates should be from 1 to 3!");
            }
            else if (matrix[Integer.parseInt(String.valueOf(selection2.charAt(0)))-1]
                    [Integer.parseInt(String.valueOf(selection2.charAt(1)))-1]!=' '){
                System.out.println("This cell is occupied! Choose another one!");
            }
            else {
                if (counter_3 % 2 == 0){
                    matrix[Integer.parseInt(String.valueOf(selection2.charAt(0)))-1]
                            [Integer.parseInt(String.valueOf(selection2.charAt(1)))-1]='X';
                }
                else {
                    matrix[Integer.parseInt(String.valueOf(selection2.charAt(0)))-1]
                            [Integer.parseInt(String.valueOf(selection2.charAt(1)))-1]='O';

                }
                counter_3++;
                int counter_2 = 1;
                System.out.println("---------");
                System.out.print("| ");
                for (char[] i :matrix) {
                    for (char j :i){
                        counter_2 = getCounter_2(counter_2, j);
                    }

                }
                System.out.println("---------");
                if (checkAllIsFull(matrix) || checkIfMatrixHas3(matrix)){
                    if (matrix[0][0] !=' ' && matrix[0][1] !=' ' && matrix[0][2] !=' ' && matrix[0][0] == matrix[0][1] && matrix[0][1] == matrix[0][2]){
                        System.out.println(matrix[0][0]+" wins");
                        check=1;
                    }
                    else if (matrix[1][0] !=' ' && matrix[1][1] !=' ' && matrix[1][2] !=' ' && matrix[1][0] == matrix[1][1] && matrix[1][1] == matrix[1][2]){
                        System.out.println(matrix[1][0]+" wins");
                        check=1;
                    }
                    else if (matrix[2][0] !=' ' && matrix[2][1] !=' ' && matrix[2][2] !=' ' && matrix[2][0] == matrix[2][1] && matrix[2][1] == matrix[2][2]){
                        System.out.println(matrix[2][0]+" wins");
                        check=1;
                    }
                    else if (matrix[0][0] !=' ' && matrix[1][1] !=' ' && matrix[2][2] !=' ' && matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]){
                        System.out.println(matrix[0][0]+" wins");
                        check=1;
                    }
                    else if (matrix[2][0] !=' ' && matrix[1][1] !=' ' && matrix[0][2] !=' ' && matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]){
                        System.out.println(matrix[0][2]+" wins");
                        check=1;
                    }
                    else if (matrix[0][0] !=' ' && matrix[1][0] !=' ' && matrix[2][0] !=' ' && matrix[0][0] == matrix[1][0] && matrix[1][0] == matrix[2][0]){
                        System.out.println(matrix[0][0]+" wins");
                        check=1;
                    }
                    else if (matrix[0][1] !=' ' && matrix[1][1] !=' ' && matrix[2][1] !=' ' && matrix[0][1] == matrix[1][1] && matrix[1][1] == matrix[2][1]){
                        System.out.println(matrix[0][1]+" wins");
                        check=1;
                    }
                    else if (matrix[2][2] !=' ' && matrix[1][2] !=' ' && matrix[0][2] !=' ' && matrix[0][2] == matrix[1][2] && matrix[1][2] == matrix[2][2]){
                        System.out.println(matrix[0][2]+" wins");
                        check=1;
                    }
                    else if (checkAllIsFull(matrix)){
                        System.out.println("Draw");
                        check =1;
                    }
                }

            }

        }



    }

    private static int getCounter_2(int counter_2, char j) {
        System.out.print(j);
        if(counter_2 %3==0){
            System.out.println(" |");
            if (counter_2!=9){
                System.out.print("| ");
            }
        }
        else {
            System.out.print(" ");
        }
        counter_2++;
        return counter_2;
    }

    public static boolean checkAllIsFull(char[][] matrix){
        int counter = 0;
        boolean check = false;
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                if (aChar == 'X' || aChar == 'O'){
                    counter++;
                }
            }
        }
        if (counter==9){
            check=true;
        }
        return check;
    }
    public static boolean checkIfMatrixHas3 (char [][] matrix){
        int counter = 0;
        boolean check = false;
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                if (aChar == 'X' || aChar == 'O'){
                    counter++;
                }
            }
        }
        if (counter>2){
            check=true;
        }
        return check;
    }
}
