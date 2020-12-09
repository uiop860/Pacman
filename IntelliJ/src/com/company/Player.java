package com.company;

import processing.core.PApplet;

public class Player {

    PApplet p;

    public Player(PApplet p) {
        this.p = p;
    }

    public void renderPlayer(){
        p.fill(255,255,0);
        p.arc(58, 58, 36, 36, 1,6,3);
    }




}
