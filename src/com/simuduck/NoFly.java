package com.simuduck;

/**
 * Created by hoerman on 09.02.2016.
 */
public class NoFly implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Nofly");
    }
}
