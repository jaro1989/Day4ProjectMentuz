package by.javatr.task1.util;


import java.util.Scanner;

public class BinaryFinder {
    private int[] arrayToBinaryFinder;

    /**
     * @param arraySorter
     */
    public BinaryFinder(ArraySorter arraySorter) {
        this.arrayToBinaryFinder = arraySorter.getArrayToSortBubble();
    }


    private int toFindBinary(int[] arrayToBinaryFinder) {
        Scanner scanner = new Scanner(System.in);
        int destinationElement = scanner.nextInt();

        int lo = 0;
        int hi = arrayToBinaryFinder.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (destinationElement < arrayToBinaryFinder[mid]) hi = mid - 1;
            else if (destinationElement > arrayToBinaryFinder[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
