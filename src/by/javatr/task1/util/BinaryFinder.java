package by.javatr.task1.util;

public class BinaryFinder {
    private int[] arrayToBinaryFinder;


    /**
     * @param arrayWrapper
     */
    public BinaryFinder(IntegerArrayWrapper arrayWrapper) {
        this.arrayToBinaryFinder = arrayWrapper.getValues();
    }

    /**
     * @param destinationElement
     * @return int
     */
    public int toFindBinary(int destinationElement) {
        int low = 0;
        int high = arrayToBinaryFinder.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (destinationElement < arrayToBinaryFinder[mid]) {
                high = mid - 1;
                continue;
            }

            if (destinationElement > arrayToBinaryFinder[mid]) {
                low = mid + 1;
                continue;
            }

            return mid;
        }
        return -1;
    }
}
