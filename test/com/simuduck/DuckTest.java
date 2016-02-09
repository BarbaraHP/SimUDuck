package com.simuduck;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hoerman on 09.02.2016.
 */
public class DuckTest {
    @Test
    public void testMallordDuck() {
        MallordDuck duck = new MallordDuck();
        Assert.assertEquals("quack", duck.quack());
    }

    @Test
    public void testRubberDuck() {
        RubberDuck duck = new RubberDuck();
        Assert.assertEquals("squeak", duck.quack());
    }

    @Test
    public void testRedHeadDuck() {
        RedHeadDuck duck = new RedHeadDuck();
        Assert.assertEquals("quack", duck.quack());
    }
}