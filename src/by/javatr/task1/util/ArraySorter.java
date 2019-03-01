package by.javatr.task1.util;

public class ArraySorter {

    private int[] arrayToSortBubble;
    private int[] arrayToSortSelection;
    private int[] arrayToSortInput;
    /**
     * @param arrayWrapper
     */
    public ArraySorter(IntegerArrayWrapper arrayWrapper) {
        this.arrayToSortBubble = arrayWrapper.getValues();
        this.arrayToSortSelection = arrayWrapper.getValues();
        this.arrayToSortInput =arrayWrapper.getValues();
    }

    /**
     * @return array
     */
    public int[] toBubbleSort() {

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

    /**
     * @return array
     */
    public int[] toSelectionSort() {

        for (int i = 0; i < arrayToSortSelection.length; i++) {
            int min = arrayToSortSelection[i];
            int min_i = i;
            for (int j = i + 1; j < arrayToSortSelection.length; j++) {
                //Если находим, запоминаем его индекс

                if (arrayToSortSelection[j] < min) {
                    min = arrayToSortSelection[j];
                    min_i = j;
                }

                if (i != min_i) {
                    int tmp = arrayToSortSelection[i];
                    arrayToSortSelection[i] = arrayToSortSelection[min_i];
                    arrayToSortSelection[min_i] = tmp;
                }
            }
        }

       return arrayToSortSelection;
    }

    /**
     * @return array
     */
    public  int[] toInsertSort() {
        int temp, j;

        for(int i = 0; i < arrayToSortInput.length - 1; i++) {
            if (arrayToSortInput[i] > arrayToSortInput[i + 1]) {
                temp = arrayToSortInput[i + 1];
                arrayToSortInput[i + 1] = arrayToSortInput[i];
                j = i;

                while (j > 0 && temp < arrayToSortInput[j - 1]) {

                    arrayToSortInput[j] = arrayToSortInput[j - 1];
                    j--;

                }
                arrayToSortInput[j] = temp;
            }
        }
        return arrayToSortInput;
    }
    public int[] getArrayToSortBubble() {
        return arrayToSortBubble;
    }

    public void setArrayToSortBubble(int[] arrayToSortBubble) {
        this.arrayToSortBubble = arrayToSortBubble;
    }

    public int[] getArrayToSortSelection() {
        return arrayToSortSelection;
    }

    public void setArrayToSortSelection(int[] arrayToSortSelection) {
        this.arrayToSortSelection = arrayToSortSelection;
    }

    public int[] getArrayToSortInput() {
        return arrayToSortInput;
    }

    public void setArrayToSortInput(int[] arrayToSortInput) {
        this.arrayToSortInput = arrayToSortInput;
    }
}