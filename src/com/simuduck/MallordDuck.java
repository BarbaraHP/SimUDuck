package com.simuduck;

/**
 * Created by hoerman on 09.02.2016.
 */
public class MallordDuck extends Duck implements FlyBehaviour, QuackBehaviour {


    public MallordDuck() {
        super(new Quack(), new Fly());
    }

    @Override
    public void display() {
    }
}
