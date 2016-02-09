package com.simuduck;


/**
 * XXXXXXXX
 * Created by hoerman on 09.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.quack();
        redHeadDuck.fly();

        MallordDuck mallordDuck = new MallordDuck();
        mallordDuck.quack();
        mallordDuck.display();
        mallordDuck.fly();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.quack();
        rubberDuck.display();


    }
}
