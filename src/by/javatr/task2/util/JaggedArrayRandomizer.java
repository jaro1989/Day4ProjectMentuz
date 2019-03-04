package by.javatr.task2.util;

public class JaggedArrayRandomizer {
    private int[][] jaggedArray;
    public void initializeArray() {
        this.jaggedArray= new int[5][];
        this.jaggedArray[0] = fullingArray(3);
        this.jaggedArray[1] = fullingArray(7);
        this.jaggedArray[2] = fullingArray(9);
        this.jaggedArray[3] = fullingArray(4);
        this.jaggedArray[4] = fullingArray(5);
    }

    public int[][] jaggedArrayGetter() {

        return this.jaggedArray;
    }

    private int[] fullingArray(int length) {
        int[] arrayToFill = new int[length];
        for (int i = 0; i < length; i++) {
            arrayToFill[i] = (int) (Math.random()*100);
        }

        return arrayToFill;
    }
}
