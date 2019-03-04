package by.javatr.task1.util;

public class DifferentDigitFinder {
    public void isDifferent() {
        for (int i = 102; i < 1000; i++) {
            if (i / 100 != i / 10 % 10 && i / 10 % 10 != i % 10 && i/100 != i%10){
                System.out.println(i);
            }
        }

    }
}
