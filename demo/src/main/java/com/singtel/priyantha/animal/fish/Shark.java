package com.singtel.priyantha.animal.fish;

import com.singtel.priyantha.utils.Constants;

public class Shark extends Fish {

    private boolean eatOtherFish = true;

    public Shark(){
        this.setColor(Constants.GREY);
        this.setSize(Constants.LARGE);
    }

    public boolean isEatOtherFish() {
        return eatOtherFish;
    }

    public void setEatOtherFish(boolean eatOtherFish) {
        this.eatOtherFish = eatOtherFish;
    }
}
