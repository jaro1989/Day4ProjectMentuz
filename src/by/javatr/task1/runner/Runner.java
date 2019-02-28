package by.javatr.task1.runner;

import by.javatr.task1.ArrayScanner;
import by.javatr.task1.util.ArraySorter;
import by.javatr.task1.util.IntegerArrayWrapper;

public class Runner {
    public static void main(String[] args) {
        ArrayScanner arrayScanner = new ArrayScanner();
       IntegerArrayWrapper integerArrayWrapper = new IntegerArrayWrapper(arrayScanner.getArray());
        ArraySorter arraySorter = new ArraySorter(integerArrayWrapper);
        System.out.println(arraySorter.bubbleSort());
        for(int i : integerArrayWrapper.getValues()){
            System.out.println(i);
        }

    }
}
