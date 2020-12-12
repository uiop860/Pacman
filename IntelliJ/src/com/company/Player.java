package com.company;

import javafx.scene.shape.Circle;
import processing.core.PApplet;

import java.awt.*;

import static java.awt.event.KeyEvent.*;

public class Player extends Entity{

    PApplet p;
    public int playerX=getPlayerXPos();
    public int playerY=getPlayerYPos();;
    int direction = 1;
    int direction2 = 0;
    int x = 0;
    int moveX = 0;
    int moveY = 0;

    public Player(PApplet p) {
        this.p = p;
    }

    public void renderPlayer() {
        Grid grid = new Grid(722,798,38,this.p);
        grid.loadMap();
        p.shapeMode(p.CENTER);
        p.fill(255, 255, 0);
        renderP1();
    }

    public void move()
    {
    playerX+=moveX;
    playerY+=moveY;
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
                setPlayerXPos(playerX++);
                direction = 1;
                direction2 = 0;
                break;
            case 2:
                //left
                setPlayerXPos(playerX--);
                direction = -1;
                direction2 = 0;
                break;

            case 3:
                //up
                setPlayerYPos(playerY--);
                direction = 0;
                direction2 = -1;
                break;
            case 4:
                //down
                setPlayerYPos(playerY++);
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

    public Rectangle playerGetBounds()
    {
        Rectangle playerRect = new Rectangle();
        playerRect.setLocation(getPlayerXPos(),getPlayerYPos());
        playerRect.setSize(34,42);
        return playerRect;
    }
}



