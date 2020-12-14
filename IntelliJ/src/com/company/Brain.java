package com.company;

import processing.core.PApplet;

import static java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_LEFT;


public class Brain extends PApplet {


    public int screenSizeX = 722;
    public int screenSizeY = 798;
    static int r = 38;
    Grid grid = new Grid(screenSizeX,screenSizeY,r,this);
    Player p1 = new Player(this);
    Enemy red = new Enemy(this);
    Enemy blue = new Enemy(this);
    Enemy green = new Enemy(this);
    Enemy pink = new Enemy(this);



    public void settings(){
        size(screenSizeX,screenSizeY);
    }

    public void setup(){
        grid.gridCreator();
        grid.loadMap();
        p1.checkPlayerPosition();
        frameRate(60);

    }

    public void draw(){
        grid.gridPopulator();
        p1.renderPlayer();
        p1.checkIfPlayerIsOnFood();
        p1.checkPlayerPosition();
        p1.playerMovement();
        red.drawRed();
        blue.drawBlue();
        green.drawGreen();
        pink.drawPink();

        if (p1.playerGetBounds().intersects(pink.pinkEnemyGetBounds()))
        {
            System.out.println("intersection player pink");
        }

        if (p1.playerGetBounds().intersects(blue.blueEnemyGetBounds()))
        {
            System.out.println("intersection player blue");
        }

        if (p1.playerGetBounds().intersects(green.greenEnemyGetBounds()))
        {
            System.out.println("intersection player green");
        }

        if (p1.playerGetBounds().intersects(red.redEnemyGetBounds()))
        {
            System.out.println("intersection player red");
        }

    }

    public void mousePressed(){

        //grid.mousePosPainter();
    }

    public void keyPressed(){
       /* if(key == 'U' || key == 'u'){
            grid.saveMap();
        }*/

        if (keyCode == VK_UP) {
            p1.setMoveUp(true);
            p1.setMoveDown(false);
            p1.setMoveRight(false);
            p1.setMoveLeft(false);

        } else if (keyCode == VK_DOWN) {
            p1.setMoveUp(false);
            p1.setMoveDown(true);
            p1.setMoveRight(false);
            p1.setMoveLeft(false);

        } else if (keyCode == VK_RIGHT) {
            p1.setMoveUp(false);
            p1.setMoveDown(false);
            p1.setMoveRight(true);
            p1.setMoveLeft(false);

        } else if (keyCode == VK_LEFT) {
            p1.setMoveUp(false);
            p1.setMoveDown(false);
            p1.setMoveRight(false);
            p1.setMoveLeft(true);

        }
    }

    public void keyReleased(){
    }
}
