package com.company;

import processing.core.PApplet;

import static java.awt.event.KeyEvent.*;

public class Player extends Entity{

    PApplet p;
    public int p1XPos = getPlayerXPos();
    public int p1YPos = getPlayerYPos();
    int direction = 1;
    int direction2 = 0;
    int x = 0;


    public Player(PApplet p) {
        this.p = p;
    }

    public void renderPlayer() {
        p.shapeMode(p.CENTER);
        p.fill(255, 255, 0);
        renderP1();
    }

    //CONTROLS
    public void playerMovement() {
        if (p.keyCode == VK_RIGHT) {
            x = 1;
        } else if (p.keyCode == VK_LEFT) {
            x = 2;
        } else if (p.keyCode == VK_UP) {
            x = 3;
        } else if (p.keyCode == VK_DOWN) {
            x = 4;
        }

        switch (x) {
            case 1:
                //right
                setPlayerXPos(p1XPos++);
                direction = 1;
                direction2 = 0;
                break;
            case 2:
                //left
                setPlayerXPos(p1XPos--);
                direction = -1;
                direction2 = 0;
                break;

            case 3:
                //up
                setPlayerYPos(p1YPos--);
                direction = 0;
                direction2 = -1;
                break;
            case 4:
                //down
                setPlayerYPos(p1YPos++);
                direction = 0;
                direction2 = 1;
                break;
            default:
                x = 0;
                break;
        }
    }

    public void renderP1() {
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                p.fill(255,255,0);
                p.pushMatrix();
                p.translate(getPlayerXPos() + (i * 722), getPlayerYPos() + (j * 798));
                if (direction == -1) {
                    p.rotate(p.PI);
                }
                if (direction2 == 1) {
                    p.rotate(p.HALF_PI);
                }
                if (direction2 == -1) {
                    p.rotate(p.PI + p.HALF_PI);
                }
                p.arc(0, 0, 36, 36, p.radians(45), p.radians(315), 3);
                p.popMatrix();
            }
        }
    }
}



