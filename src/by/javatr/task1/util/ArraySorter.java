package by.javatr.task1.util;

public class ArraySorter {
    private IntegerArrayWrapper arrayWrapper;

    int[] arrayToSortBubble = arrayWrapper.getValues();

    public ArraySorter(IntegerArrayWrapper arrayWrapper) {
        this.arrayWrapper = arrayWrapper;
    }

    public int[] bubbleSort() {

        int tmp;

        for (int i = 0; i < arrayToSortBubble.length; i++) {

            for (int j = i + 1; j < arrayToSortBubble.length; j++) {
                if (arrayToSortBubble[i] > arrayToSortBubble[j]) {
                    tmp = arrayToSortBubble[i];
                    arrayToSortBubble[i] = arrayToSortBubble[j];
                    arrayToSortBubble[j] = tmp;

                }
            }
        }

        return arrayToSortBubble;

    }

    public void selectionSort() {

        for (int i = 0; i < arrayToSortBubble.length; i++) {
            int min = arrayToSortBubble[i];
            int min_i = i;
            for (int j = i + 1; j < arrayToSortBubble.length; j++) {
                //Если находим, запоминаем его индекс

                if (arrayToSortBubble[j] < min) {
                    min = arrayToSortBubble[j];
                    min_i = j;
                }

                if (i != min_i) {
                    int tmp = arrayToSortBubble[i];
                    arrayToSortBubble[i] = arrayToSortBubble[min_i];
                    arrayToSortBubble[min_i] = tmp;
                }
            }
        }

        arrayWrapper.setValues(arrayToSortBubble);
    }

}