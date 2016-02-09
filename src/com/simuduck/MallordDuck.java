package com.simuduck;

/**
 * Created by hoerman on 09.02.2016.
 */
public class MallordDuck extends Duck implements FlyBehaviour, QuackBehaviour {


    public MallordDuck(Squeak squeak, NoFly noFly) {
        super(squeak, noFly);
    }

    public MallordDuck() {
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
