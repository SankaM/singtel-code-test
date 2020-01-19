package com.singtel.priyantha;

import com.singtel.priyantha.animal.Animal;
import com.singtel.priyantha.animal.Cat;
import com.singtel.priyantha.animal.Dog;
import com.singtel.priyantha.animal.Frog;
import com.singtel.priyantha.animal.bird.*;
import com.singtel.priyantha.animal.fish.ClownFish;
import com.singtel.priyantha.animal.fish.Dolhpin;
import com.singtel.priyantha.animal.fish.Fish;
import com.singtel.priyantha.animal.fish.Shark;

import java.sql.SQLOutput;

public class DemoApplication {

    public static void main(String[] args) {

        //a. how many of these animals can fly?
        //b. how many of these animals can walk?
        //c. how many of these animals can sing?
        //d. how many of these animals can swim?
        int flyingAnimalCount=0;
        int walkingAnimalCount=0;
        int singCount = 0;
        int swimCount = 0;

        // Answer Q E. Counting animals
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(new Dog()),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolhpin(),
                new Frog(),
                new Dog(),
                new Butterfly(false),
                new Cat()
        };


        for (int i = 0; i < animals.length; i ++) {
            Animal anm = animals[i];
            if(anm instanceof Bird ){
                flyingAnimalCount+=1;
                walkingAnimalCount+=1;
                singCount+=1;

                if(anm instanceof Butterfly){
                   Butterfly btf = (Butterfly)anm;

                   singCount-=1;

                   if(!btf.isCatepillar()) {
                       walkingAnimalCount-=1;
                   } else {
                       // Catapilar can walk!
                       flyingAnimalCount-=1;
                   }
                }else if(anm instanceof Chicken){
                    flyingAnimalCount-=1;
                }
            } else if(anm instanceof Fish || anm instanceof Dolhpin){
                swimCount+=1;

            } else if (anm instanceof Animal) {
                // Animal can walk
                walkingAnimalCount+=1;
            }
        }

        System.out.println("Flyng count : " + flyingAnimalCount);
        System.out.println("Walking count : " + walkingAnimalCount);
        System.out.println("Sing count : " + singCount);
        System.out.println("Swim count : " + swimCount);

    }

}
