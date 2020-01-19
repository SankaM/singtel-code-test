package com.singtel.priyantha.model;

import com.singtel.priyantha.animal.bird.Bird;
import com.singtel.priyantha.animal.bird.Chicken;
import com.singtel.priyantha.animal.bird.Duck;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BirdTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    //1 a. How did you unit test it?
    @Test
    public void testSinging(){
        Bird b1 = new Bird();
        b1.sing();
        Assert.assertEquals("I am singing"+System.getProperty("line.separator"), outContent.toString());
    }

    @Test
    public void testWalk(){
        Bird b1 = new Bird();
        b1.walk();
        Assert.assertEquals("I am walking"+System.getProperty("line.separator"), outContent.toString());
    }

    @Test
    public void testFly(){
        Bird b1 = new Bird();
        b1.fly();
        Assert.assertEquals("I am flying"+System.getProperty("line.separator"), outContent.toString());
    }

    // Test Q 2
    @Test
    public void testQ2a(){

        Duck d1 = new Duck();
        d1.say();
        Assert.assertEquals("Quack, quack"+System.getProperty("line.separator"), outContent.toString());
    }

    @Test
    public void testQ2b(){

        Duck d2 = new Duck();
        d2.swim();
        Assert.assertEquals("I am swimming"+System.getProperty("line.separator"), outContent.toString());
    }


    @Test
    public void testQ2c(){

        Chicken c1 = new Chicken();
        c1.say();
        Assert.assertEquals("Cluck, cluck"+System.getProperty("line.separator"), outContent.toString());
    }

    @Test
    public void testQ2d(){

        Chicken c2 = new Chicken();
        c2.fly();
        Assert.assertEquals("", outContent.toString());
    }



}
