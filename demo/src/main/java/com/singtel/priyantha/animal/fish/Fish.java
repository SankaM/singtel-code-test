package com.singtel.priyantha.animal.fish;

import com.singtel.priyantha.animal.Animal;

public class Fish extends Animal {

    private String size;
    private String color;

    // Answer B. 1 b.
    public void walk(){
        // Fish cannot walk
    }

    public void swim(){
        System.out.println("I am swimming");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
