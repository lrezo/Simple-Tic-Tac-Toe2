class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        final int columns = 4;
        final int lastNumber = 3;
        String[] numbers = new String[columns];
        StringBuilder text = new StringBuilder();
        StringBuilder text2 = new StringBuilder();
        numbers[0] = String.valueOf(twoDimArray[0][0]);
        numbers[1] = String.valueOf(twoDimArray[0][twoDimArray[0].length - 1]);
        numbers[2] = String.valueOf(twoDimArray[twoDimArray.length - 1][0]);
        numbers[lastNumber] = String.valueOf(twoDimArray[twoDimArray.length - 1]
                [twoDimArray[twoDimArray.length - 1].length - 1]);
        for (int i = 0; i < numbers.length / 2; i++) {
            text.append(numbers[i]);
            text.append(" ");
        }
        for (int i = numbers.length / 2; i < numbers.length; i++) {
            text2.append(numbers[i]);
            text2.append(" ");
        }
        for (int i = 0; i < text.length() - 1; i++) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < text2.length() - 1; i++) {
            System.out.print(text2.charAt(i));
        }
    }
}