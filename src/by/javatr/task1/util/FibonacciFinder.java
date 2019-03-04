package by.javatr.task1.util;

public class FibonacciFinder {
    IntegerArrayWrapper fibonacciArray;

    public FibonacciFinder(IntegerArrayWrapper integerArrayWrapper) {
        this.fibonacciArray = integerArrayWrapper;
    }
    private boolean isFibonacciNumbers(int digitToCheck) {
        int result = 1;
        int prevresult = 1;
        while (true) {
            int temp = result;
            result = result + prevresult;
            prevresult = temp;

            if (result > digitToCheck) {
                return false;

            }
           if (result == digitToCheck) {
               return true;
           }

        }
    }
    public int[] getArrayToFindSimpleNumbers() {
        int[] arrayOfFibonacci = new int[fibonacciArray.getValues().length];
        int count = 0;

        for (int i = 0; i < fibonacciArray.getValues().length; i++) {
            if (isFibonacciNumbers(fibonacciArray.getValues()[i])) {
                arrayOfFibonacci[count] = fibonacciArray.getValues()[i];
                count++;
            }
        }
        return this.getNewArrayOfFibonacciNumbers(count, arrayOfFibonacci);

    }
    private int[] getNewArrayOfFibonacciNumbers(int count, int[] arrayToFindFibonacciNumbers) {
        int[] newArrayOfFibonacciNumbers = new int[count];
        for (int i = 0; i < count; i++) {
            if (arrayToFindFibonacciNumbers[i] != 0) {
                newArrayOfFibonacciNumbers[i] = arrayToFindFibonacciNumbers[i];
            }
        }
        return newArrayOfFibonacciNumbers;
    }

}
