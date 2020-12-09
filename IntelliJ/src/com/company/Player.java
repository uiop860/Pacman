package com.company;

import processing.core.PApplet;

public class Player {

    PApplet p;
    Controls controls = new Controls(p);
    public int p1XPos = 58;
    public int p1YPos = 58;


    public Player(PApplet p) {
        this.p = p;
    }

    public void renderPlayer(){
        p.fill(255,255,0);
        p.arc(p1XPos, p1YPos, 36, 36, 1,6,3);
    }

    public void playerMovement(){

        int x = 0;

        if(controls.rightKeyDown()){
            x = 1;
        }else if(controls.leftKeyDown()){
            x = 2;
        }else if (controls.downKeyDown()){
            x = 3;
        }else if (controls.upKeyDown()){
            x = 4;
        }


        switch (x) {
            case 1:
                p1XPos++;
                break;
            case 2:
                p1XPos--;
                break;
            case 3:
                p1YPos++;
                break;
            case 4:
                p1YPos--;
                break;
            default:
                x = 0;
                break;
        }
    }




}
