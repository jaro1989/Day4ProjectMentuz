package by.javatr.task2.runner;

import by.javatr.task2.util.JaggedArraySorter;

public class Runner {
    public static void main(String[] args) {
        JaggedArraySorter jaggedArrayBubbleSorter = new JaggedArraySorter(JaggedArraySorter.BUBBLE);
        JaggedArraySorter jaggedArrayBubbleSorter1 = new JaggedArraySorter(JaggedArraySorter.BY_MAX);
        JaggedArraySorter jaggedArrayBubbleSorter2 = new JaggedArraySorter(JaggedArraySorter.BY_MIN);
        System.out.println("bubble");

        for (int[] values : jaggedArrayBubbleSorter.getSortedArray()) {
            System.out.println("Next row");
            for (int value: values) {
                System.out.println(value);
            }
        }
        System.out.println("Maximum");
        for (int[] values : jaggedArrayBubbleSorter1.getSortedArray()) {
            System.out.println("Next row");
            for (int value: values) {
                System.out.println(value);
            }
        }
        System.out.println("Minimum");
        for (int[] values : jaggedArrayBubbleSorter2.getSortedArray()) {
            System.out.println("Next row");
            for (int value: values) {
                System.out.println(value);
            }
        }
    }
}
