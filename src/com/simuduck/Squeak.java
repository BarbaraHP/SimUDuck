package com.simuduck;

/**
 * Created by hoerman on 09.02.2016.
 */
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}