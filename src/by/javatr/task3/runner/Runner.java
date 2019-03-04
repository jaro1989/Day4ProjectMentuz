package by.javatr.task3.runner;

import by.javatr.task3.util.Ball;
import by.javatr.task3.util.Basket;

public class Runner {
    public static void main(String[] args) {
        Ball basketball = new Ball(345, "orange");
        Ball football = new Ball(217, "white");
        Ball floorball = new Ball(123, "white");
        Ball tennis = new Ball(86, "green");
        Ball simpleballforkids = new Ball(345,"blue");
        Ball secondsimpleball = new Ball(217, "blue" );
        Basket basket = new Basket();
        basket.putItem(basketball);
        basket.putItem(football);
        basket.putItem(floorball);
        basket.putItem(tennis);
        basket.putItem(simpleballforkids);
        basket.putItem(secondsimpleball);

        System.out.println(basket.getBlueItems());
        System.out.println(basket.getItemsWeight());
    }
}
