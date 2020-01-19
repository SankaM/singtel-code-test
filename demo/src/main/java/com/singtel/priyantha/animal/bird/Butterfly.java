package com.singtel.priyantha.animal.bird;

public class Butterfly extends Bird {

    private boolean isCatepillar;

    public Butterfly(boolean isCatepillar){
            this.isCatepillar = isCatepillar;
    }

    public void sing(){
       // Butterfly cannot make a sound
    }

    public void fly(){
        if(!this.isCatepillar){
            super.fly();
        }
    }

    public void walk(){
        if(this.isCatepillar){
            super.walk();
        }
    }

    public boolean isCatepillar() {
        return isCatepillar;
    }

    public void setCatepillar(boolean catepillar) {
        isCatepillar = catepillar;
    }
}
