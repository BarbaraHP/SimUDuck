package com.simuduck;

/**
 * Created by hoerman on 09.02.2016.
 */
public abstract class Duck {

    public Duck(Squeak squeak, NoFly noFly) {
    }

    public Duck() {

    }

    public void quack() {
    System.out.println("quack");
    }

    public void swim() {

    }

    public void fly() {
        System.out.println("fly");
    }

    public abstract void display() ;


}
