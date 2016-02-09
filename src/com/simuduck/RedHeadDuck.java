package com.simuduck;

/**
 * Created by hoerman on 09.02.2016.
 */
public class RedHeadDuck extends Duck implements FlyBehaviour, QuackBehaviour {


    public RedHeadDuck(Squeak squeak, NoFly noFly) {
        super(squeak, noFly);
    }

    public RedHeadDuck() {
        super();
    }

    @Override
    public void display() {
    }

    @Override
    public void fly(){
        System.out.println("fly");
    }

}
