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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (null == o) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Ball ball = (Ball) o;
        if (weight != ball.weight) {
            return false;
        }
        if (null == color) {
            return (color == ball.color);
        }
        else {
            if (!color.equals(ball.color)) {
                return false;
            }
        }
        return getWeight() == ball.getWeight() &&
                getColor().equals(ball.getColor());
    }

    @Override
    public int hashCode() {
        return (int)(31*weight + ((null == color) ? 0 : color.hashCode()));
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
