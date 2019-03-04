package by.javatr.task1.util;

public class MaxMinFinder {
    private int[] arrayToFindMaxMin;

    /**
     * @param arrayWrapper
     */
    public MaxMinFinder(IntegerArrayWrapper arrayWrapper) {
        this.arrayToFindMaxMin = arrayWrapper.getValues();
    }

    /**
     * @return int[]
     */
    public int[] getArrayToFindMaxMin() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] maxmin = new int[2];

        for (int i = 0; i < arrayToFindMaxMin.length; i++) {
            if (arrayToFindMaxMin[i] > max) {
                max = arrayToFindMaxMin[i];
            }

            if (arrayToFindMaxMin[i] < min) {
                min = arrayToFindMaxMin[i];
            }
        }
        maxmin[0] = max;
        maxmin[1] = min;

        return maxmin;
    }
}
