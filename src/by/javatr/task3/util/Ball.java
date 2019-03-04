package by.javatr.task3.util;

import java.util.Objects;

public class Ball implements ItemInterface{
    private int weight;
    private String color;

    /**
     * @param weight int
     * @param color String
     */
    public Ball(int weight, String color) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getColor() {
        return color;
    }
}
