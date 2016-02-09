package com.simuduck;

/**
 * Created by hoerman on 09.02.2016.
 */
public class RubberDuck extends Duck {

    public RubberDuck () {
        super (new Squeak(), new NoFly());
    }

    @Override
    public void quack() {
        System.out.println("tweet");
    }

    @Override
    public void display() {

    }
    @Override
    public void fly() {

    }
}
