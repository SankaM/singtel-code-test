package com.singtel.priyantha.animal.fish;

import com.singtel.priyantha.utils.Constants;

public class ClownFish extends Fish {

    private boolean isMakeJokes = true;

    public ClownFish(){
        this.setColor(Constants.ORANGE);
        this.setSize(Constants.SMALL);
    }
    public boolean isMakeJokes() {
        return isMakeJokes;
    }

    public void setMakeJokes(boolean makeJokes) {
        isMakeJokes = makeJokes;
    }
}
