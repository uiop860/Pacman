package com.company;

import javafx.scene.shape.Circle;
import processing.core.PApplet;

import java.awt.*;

import static java.awt.event.KeyEvent.*;

public class Player extends Entity{

    PApplet p;
    public static int playerPositionX=665;
    public static int playerPositionY=57;
    int direction = 1;
    int direction2 = 0;
    int playerGridPositionX;
    int playerGridPositionY;
    int points = 0;


    boolean moveLeft = false;
    boolean moveRight = false;
    boolean moveUp = false;
    boolean moveDown = false;

    public Player(PApplet p) {
        this.p = p;
    }

    public void renderPlayer() {
        p.shapeMode(p.CENTER);
        p.fill(255, 255, 0);
        renderP1();
    }

    public void checkPlayerPosition(){
        playerGridPositionX();
        playerGridPositionY();
        /*System.out.print(playerPositionX+ " - ");
        System.out.print(playerPositionY);
        System.out.print(" - " + playerGridPositionX + " - " + playerGridPositionY);
        System.out.println(" - " +points);
        System.out.println();*/
    }

    public void playerGridPositionX() {

        for (int x = 0; x < Grid.grid.length; x++) {
            if(((playerPositionX-(Brain.r/2))/Brain.r) == x && playerPositionX % 38 == 19){
                playerGridPositionX = x;
                break;
            }
        }
    }
    public void playerGridPositionY(){

        for (int y = 0; y < Grid.grid[0].length; y++ ) {
            if(((playerPositionY-(Brain.r/2))/Brain.r) == y && playerPositionY % 38 == 19) {
                playerGridPositionY = y;
                break;
            }
        }
    }


    //CONTROLS
    public void playerMovement() {

        int p1XPlus = playerGridPositionX + 1;
        int p1XMinus = playerGridPositionX - 1;
        int p1YPlus = playerGridPositionY + 1;
        int p1YMinus = playerGridPositionY - 1;

        if (moveRight && Grid.grid[p1XPlus][playerGridPositionY] != 1) {
            playerPositionX++;
            direction = 1;
            direction2 = 0;
        } else if (moveLeft && Grid.grid[p1XMinus][playerGridPositionY] != 1) {
            playerPositionX--;
            direction = -1;
            direction2 = 0;
        } else if (moveUp  && Grid.grid[playerGridPositionX][p1YMinus] != 1) {
            playerPositionY--;
            direction = 0;
            direction2 = -1;
        } else if (moveDown && Grid.grid[playerGridPositionX][p1YPlus] != 1) {
            playerPositionY++;
            direction = 0;
            direction2 = 1;
        }
    }

    public void checkIfPlayerIsOnFood(){

        if(Grid.grid[playerGridPositionX][playerGridPositionY] == 2){
            Grid.grid[playerGridPositionX][playerGridPositionY] = 0;
            points++;
        } else if(Grid.grid[playerGridPositionX][playerGridPositionY] == 3){

            Enemy.ifMode = true;
            Grid.grid[playerGridPositionX][playerGridPositionY] = 0;

        }
    }

    public void renderP1() {
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                p.fill(255,255,0);
                p.pushMatrix();
                p.translate(playerPositionX + (i * 722), playerPositionY + (j * 798));
                if (direction == -1) {
                    p.rotate(p.PI);
                }
                if (direction2 == 1) {
                    p.rotate(p.HALF_PI);
                }
                if (direction2 == -1) {
                    p.rotate(p.PI + p.HALF_PI);
                }
                p.arc(0, 0, 36, 36,p.map((p.millis() % 500), 0, 500, 0, (float) 0.75), p.map((p.millis() % 500), 0, 500, p.TWO_PI, (float) 5.45) );
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

    public void setMoveLeft(boolean moveLeft) {
        this.moveLeft = moveLeft;
    }

    public void setMoveRight(boolean moveRight) {
        this.moveRight = moveRight;
    }

    public void setMoveUp(boolean moveUp) {
        this.moveUp = moveUp;
    }

    public void setMoveDown(boolean moveDown) {
        this.moveDown = moveDown;
    }

    public static int getPlayerPositionX() {
        return playerPositionX;
    }

    public static int getPlayerPositionY() {
        return playerPositionY;
    }
}



