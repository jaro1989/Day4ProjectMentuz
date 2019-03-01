package by.javatr.task1.runner;

import by.javatr.task1.ArrayScanner;
import by.javatr.task1.util.ArraySorter;
import by.javatr.task1.util.BinaryFinder;
import by.javatr.task1.util.IntegerArrayWrapper;

public class Runner {
    public static void main(String[] args) {
        ArrayScanner arrayScanner = new ArrayScanner();
        IntegerArrayWrapper integerArrayWrapper = new IntegerArrayWrapper(arrayScanner.getArray());
        ArraySorter arraySorter = new ArraySorter(integerArrayWrapper);
        BinaryFinder binaryFinder = new BinaryFinder(arraySorter);
       //Вывод сортровки пузырьком
        for(int i : arraySorter.toBubbleSort()) {

            System.out.println(i);

        }
        //Вывод сортировки выборкой
       for (int i : arraySorter.toSelectionSort()) {

           System.out.println(i);

       }
       //Вывод сортировки вставкой
        for (int i : arraySorter.toInsertSort()) {

            System.out.println(i);

        }
        //Вывод бинарного поиска
        System.out.println(binaryFinder);

    }
}
