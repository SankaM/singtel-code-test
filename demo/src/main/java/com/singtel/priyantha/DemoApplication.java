package com.singtel.priyantha;

import com.singtel.priyantha.animal.bird.Bird;

public class DemoApplication {

    public static void main(String[] args) {

        Bird bird = new Bird();

        bird.walk();
        bird.fly();
        bird.sing();

    }

}
