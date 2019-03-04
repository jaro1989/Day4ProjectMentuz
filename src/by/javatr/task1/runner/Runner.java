package by.javatr.task1.runner;

import by.javatr.task1.util.ArrayScanner;
import by.javatr.task1.util.*;

import java.io.FileNotFoundException;


public class Runner {
    public static void main(String[] args) {
        ArrayScanner arrayScanner = new ArrayScanner();
        IntegerArrayWrapper integerArrayWrapper = new IntegerArrayWrapper(arrayScanner.getArray());
        ArraySorter arraySorter = new ArraySorter(integerArrayWrapper);
        BinaryFinder binaryFinder = new BinaryFinder(integerArrayWrapper);
        MaxMinFinder maxMinFounder = new MaxMinFinder(integerArrayWrapper);
        SimpleDigitsFinder simpleDigitsFounder = new SimpleDigitsFinder(integerArrayWrapper);
        FibonacciFinder fibonacciFinder = new FibonacciFinder(integerArrayWrapper);
        DifferentDigitFinder differentDigitFinder = new DifferentDigitFinder();
       //Вывод сортровки пузырьком
        System.out.println("Bubble: ");
        for(int i : arraySorter.toBubbleSort()) {

            System.out.println(i);

        }
        //Вывод сортировки выборкой
        System.out.println("Selection: ");
       for (int i : arraySorter.toSelectionSort()) {

           System.out.println(i);

       }
       //Вывод сортировки вставкой
        System.out.println("Insert: ");
        for (int i : arraySorter.toInsertSort()) {

            System.out.println(i);

        }
        //Вывод бинарного поиска
        System.out.println(maxMinFounder.getArrayToFindMaxMin()[0]);
        System.out.println(maxMinFounder.getArrayToFindMaxMin()[1]);
        //Вывод простых чисел
        System.out.println("Простые числа");
        for (int i : simpleDigitsFounder.getArrayToFindSimpleDigits()){
            System.out.println(i);
        }
        //Числа Фибоначчи
        System.out.println("Числа Фибоначчи");
        for (int number : fibonacciFinder.getArrayToFindSimpleNumbers()) {
            System.out.println(number);
        }
        //Разные цифры в числе
        System.out.println("Разные цифры всякие");
        differentDigitFinder.isDifferent();
        //Чтение из файла
        System.out.println("Чтение из файла");
        try {
            arrayScanner.arrayFileScanner();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
