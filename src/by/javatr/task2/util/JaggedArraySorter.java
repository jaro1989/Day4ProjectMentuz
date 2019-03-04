package by.javatr.task2.util;

import by.javatr.task1.util.ArraySorter;
import by.javatr.task1.util.IntegerArrayWrapper;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JaggedArraySorter {
    private JaggedArrayRandomizer jaggedArrayRandomizer = new JaggedArrayRandomizer();
    private int[][] jaggedArrayToSort;
    public static final String BY_MAX = "max";
    public static final String BY_MIN = "min";
    public static final String BUBBLE = "bubble";

    private String sortType;

    public JaggedArraySorter(String sortType) {
        this.sortType = sortType;
    }

    /**
     * @return int[][]
     */
    public int[][] getSortedArray() {
        jaggedArrayRandomizer.initializeArray();
        this.jaggedArrayToSort = jaggedArrayRandomizer.jaggedArrayGetter();

        int[] sortedArray = this.sort();
        int[][] resultArray = new int[sortedArray.length][];

        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < this.jaggedArrayToSort.length; j++) {
                if (sortedArray[i] == this.getJaggedArrayMatches(this.jaggedArrayToSort[j])) {
                    resultArray[i] = this.jaggedArrayToSort[j];
                }
            }
        }

        return resultArray;
    }

    /**
     * @return int[]
     */
    private int[] rowsSorter() {
        int[] tmpArray = new int[this.jaggedArrayToSort.length];
        switch (sortType) {
            case BUBBLE:
                for (int i = 0; i < this.jaggedArrayToSort.length; i++) {
                    for (int j = 0; j < this.jaggedArrayToSort[i].length; j++) {
                        tmpArray[i] += this.jaggedArrayToSort[i][j];
                    }
                }

                break;
            case BY_MAX:
                for (int i = 0; i < this.jaggedArrayToSort.length; i++) {
                    int maximum = Integer.MIN_VALUE;
                    for (int j = 0; j < this.jaggedArrayToSort[i].length; j++) {
                        if (this.jaggedArrayToSort[i][j] > maximum) {
                            tmpArray[i] = this.jaggedArrayToSort[i][j];
                            maximum = this.jaggedArrayToSort[i][j];
                        }
                    }
                }

                break;
            case BY_MIN:
                for (int i = 0; i < this.jaggedArrayToSort.length; i++) {
                    int minimum = Integer.MAX_VALUE;
                    for (int j = 0; j < this.jaggedArrayToSort[i].length; j++) {
                        if (this.jaggedArrayToSort[i][j] < minimum) {
                            tmpArray[i] = this.jaggedArrayToSort[i][j];
                            minimum = this.jaggedArrayToSort[i][j];
                        }
                    }
                }

                break;
        }
        return tmpArray;
    }

    /**
     * @return int[]
     */
    private int[] sort() {
        ArraySorter arraySorter = new ArraySorter(new IntegerArrayWrapper(this.rowsSorter()));

        return arraySorter.toBubbleSort();
    }

    /**
     * @param arrayToSum int[]
     * @return int
     */
    private int getArraySum(int[] arrayToSum) {
        int sum = 0;
        for (int value : arrayToSum) {
            sum += value;
        }

        return sum;
    }

    private int getArrayMax(int[] jaggedArray) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < jaggedArray.length; i++) {
            if (jaggedArray[i] > maximum) {
                maximum = jaggedArray[i];
            }
        }
        return maximum;
    }

    private int getArrayMin(int[] jaggedArray) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < jaggedArray.length; i++) {
            if (jaggedArray[i] < minimum) {
                minimum = jaggedArray[i];
            }
        }
        return minimum;
    }

    private int getJaggedArrayMatches(int[] jaggedArray) {
        switch (this.sortType) {
            case BUBBLE:
                return this.getArraySum(jaggedArray);
            case BY_MAX:
                return this.getArrayMax(jaggedArray);
            case BY_MIN:
                return this.getArrayMin(jaggedArray);
            default:
                throw new RuntimeException("Wrong type wsa provided");
        }
    }
}
