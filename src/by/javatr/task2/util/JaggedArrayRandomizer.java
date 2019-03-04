package by.javatr.task2.util;

public class JaggedArrayRandomizer {
    private int[][] jaggedArray;
    private boolean isInitialized = false;
      
    /**
     * @return int[]
     */
    public int[][] jaggedArrayGetter() {
        if (!this.isInitialized) {
            this.initializedArray();
        }
        
        return this.jaggedArray;
    }
    
    private void initializeArray() {
        this.jaggedArray= new int[5][];
        this.jaggedArray[0] = fullingArray(3);
        this.jaggedArray[1] = fullingArray(7);
        this.jaggedArray[2] = fullingArray(9);
        this.jaggedArray[3] = fullingArray(4);
        this.jaggedArray[4] = fullingArray(5);
        this.isInitialized = true;
    }
    
    /**
     * @param int lendth
     * @return int[]
     */
    private int[] fullingArray(int length) {
        int[] arrayToFill = new int[length];
        
        for (int i = 0; i < length; i++) {
            arrayToFill[i] = (int) (Math.random()*100);
        }

        return arrayToFill;
    }
}
