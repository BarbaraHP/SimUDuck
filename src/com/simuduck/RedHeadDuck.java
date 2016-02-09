package com.simuduck;

/**
 * Created by hoerman on 09.02.2016.
 */
public class RedHeadDuck extends Duck implements FlyBehaviour, QuackBehaviour {

    public RedHeadDuck() {
        super(new Quack(), new Fly());
    }

    @Override
    public void display() {
    }

}
