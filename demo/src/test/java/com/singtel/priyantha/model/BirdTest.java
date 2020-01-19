package com.singtel.priyantha.model;

import com.singtel.priyantha.animal.Cat;
import com.singtel.priyantha.animal.Dog;
import com.singtel.priyantha.animal.bird.*;
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

    //Test answer 1 a. How did you unit test it?
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

    // Test answer Q 2
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


    //Test answer Q3
    @Test
    public void testQ3a(){

        Rooster r1 = new Rooster();
        r1.say();
        Assert.assertEquals("Cock-a-doodle-doo"+System.getProperty("line.separator"), outContent.toString());
    }

    // Q 3.B
    // How is the rooster related to the chicken? >> Rooster is a Chicken. Can be considered as a child of chicken

    // Q 3.C
    //Can you think of other ways to model a rooster without using inheritance? >>
    // Yes, By using flag in Chicken class saying isRooster, if it is true then set chicken sounds like a rooster

    // Test answer Q4

    @Test
    public void testQ4a(){

        Parrot p1 = new Parrot(new Dog());
        p1.say();
        Assert.assertEquals("Woof, woof"+System.getProperty("line.separator"), outContent.toString());
    }

    @Test
    public void testQ4b(){

        Parrot p2 = new Parrot(new Cat());
        p2.say();
        Assert.assertEquals("Meow"+System.getProperty("line.separator"), outContent.toString());
    }

    @Test
    public void testQ4c(){

        Parrot p3 = new Parrot(new Rooster());
        p3.say();
        Assert.assertEquals("Cock-a-doodle-doo"+System.getProperty("line.separator"), outContent.toString());
    }

    //Q4d
    //How do you keep the parrot maintainable? What if we need another parrot
    //lives near a Duck? Or near a phone that rings frequently?
    //Answer >> add new object type to the if condition inside the parrot say method.





}
