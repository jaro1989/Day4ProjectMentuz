package by.javatr.task1.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayScanner {
    public Scanner scanner = new Scanner(System.in);

    /**
     * @return int[]
     */
    public int[] getArray() {
       return this.resultArrayGetter(this.arrayLengthScanner());
    }

    /**
     * @return int
     */
    private int arrayLengthScanner() {
        int number;

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Введите число!");
        }

        number = scanner.nextInt();

        return number;
    }

    /**
     * @return
     * @throws FileNotFoundException
     */
    public int[] arrayFileScanner() throws FileNotFoundException {
            int count =0;
            File file=new File("C:\\Users\\mentuz\\IdeaProjects\\Day4ProjectsMentuz\\src\\by\\javatr\\task1\\util\\scanner.txt");
            Scanner scanner =new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
                count++;
            }
            scanner.reset();
            int[] fileArray = new int[count];
            for (int i = 0; i < count-1; i++){
                fileArray[i] = Integer.parseInt(scanner.nextLine());
            }
            return fileArray;
         }

    /**
     * @param length
     * @return int[]
     */
    private int[] randomInputArray(int length) {
        int[] resultArray = new int[length];

        for(int i = 0; i < length; i++){
            resultArray[i]  = (int) Math.random()*100;
        }

        return resultArray;
    }

    /**
     * @param length int
     * @return int[]
     */
    private int[] resultArrayGetter(int length) {
        int[] resultArray = new int[length];

        for(int i = 0; i < length; i++){
            resultArray[i]  = scanner.nextInt();
        }

        return resultArray;
    }

}
