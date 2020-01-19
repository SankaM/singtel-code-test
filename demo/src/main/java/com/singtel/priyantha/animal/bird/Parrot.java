package com.singtel.priyantha.animal.bird;

import com.singtel.priyantha.animal.Animal;
import com.singtel.priyantha.animal.Cat;
import com.singtel.priyantha.animal.Dog;

public class Parrot extends Bird {

    private Animal nearBy;

    public Parrot(){
        this.nearBy = null;
    }

    public Parrot(Animal nearBy){
        this.nearBy = nearBy;
    }

    public void say(){
        if(this.nearBy == null){
            System.out.println("Default parrot says");
        }else if(this.nearBy instanceof Dog){
            System.out.println("Woof, woof");
        }else if(this.nearBy instanceof Cat){
            System.out.println("Meow");
        }else if(this.nearBy instanceof Rooster){
            System.out.println("Cock-a-doodle-doo");
        }
    }
}
