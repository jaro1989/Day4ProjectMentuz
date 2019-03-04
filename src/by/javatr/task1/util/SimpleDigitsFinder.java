package by.javatr.task1.util;

public class SimpleDigitsFinder {
    private int[] arrayToFindSimpleDigits;

    public SimpleDigitsFinder(IntegerArrayWrapper arrayWrapper) {
        this.arrayToFindSimpleDigits = arrayWrapper.getValues();
    }

    /**
     *
     * @return int[]
     */
    public int[] getArrayToFindSimpleDigits() {
        int[] arrayOfSimpleDigits = new int[arrayToFindSimpleDigits.length];
        int count = 0;

        for (int i = 0; i < arrayToFindSimpleDigits.length; i++) {
            if (isSimple(i)) {
                arrayOfSimpleDigits[count] = arrayToFindSimpleDigits[i];
                count++;
            }
        }

        return this.getNewArrayOfSimpleDigits(count, arrayOfSimpleDigits);
    }

    /**
     * @param i boolean
     * @return boolean
     */
    private boolean isSimple(int i) {
        for (int j = 2; j <= Math.sqrt(arrayToFindSimpleDigits[i]); j++) {
            if (arrayToFindSimpleDigits[i] % j == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param count
     * @param arrayToFindSimpleDigits
     * @return in[]
     */
    private int[] getNewArrayOfSimpleDigits(int count, int[] arrayToFindSimpleDigits) {
        int[] newArrayOfSimpleDigits = new int[count];
        for (int i = 0; i < count; i++) {
            if (arrayToFindSimpleDigits[i] != 0) {
                newArrayOfSimpleDigits[i] = arrayToFindSimpleDigits[i];
            }
        }
            return newArrayOfSimpleDigits;
    }
}
