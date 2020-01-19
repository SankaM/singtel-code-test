package com.singtel.priyantha.model;

import com.singtel.priyantha.animal.bird.Bird;
import com.singtel.priyantha.animal.bird.Butterfly;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ButterflyTest {

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

    // Answers Q D
    @Test
    public void testD1a(){
        Butterfly b1 = new Butterfly(false);
        b1.fly();
        Assert.assertEquals("I am flying"+System.getProperty("line.separator"), outContent.toString());
    }

    @Test
    public void testD1b(){
        Butterfly b2 = new Butterfly(false);
        b2.sing();
        Assert.assertEquals("", outContent.toString());
    }

    @Test
    public void testD2a(){
        // catapilar cannot fly
        Butterfly c1 = new Butterfly(true);
        c1.fly();
        Assert.assertEquals("", outContent.toString());
    }

    @Test
    public void testD2b(){
        // catapilar can walk
        Butterfly c2 = new Butterfly(true);
        c2.walk();
        Assert.assertEquals("I am walking"+System.getProperty("line.separator"), outContent.toString());
    }
}
