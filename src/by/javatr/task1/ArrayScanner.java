package by.javatr.task1;

import java.util.Scanner;

public class ArrayScanner {
    private Scanner scanner = new Scanner(System.in);

    /**
     * @return int[]
     */
    public int[] getArray() {
       return this.resultArrayGetter(this.arrayLengthScanner());
    }

    /**
     * @return int
     */
    private int arrayLengthScanner() {
        int number;

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Введите число!");
        }

        number = scanner.nextInt();

        return number;
    }

    /**
     * @param length int
     * @return int[]
     */
    private int[] resultArrayGetter(int length) {
        int[] resultArray = new int[length];

        for(int i = 0; i < length; i++){
            resultArray[i]  = scanner.nextInt();
        }

        return resultArray;
    }
}
