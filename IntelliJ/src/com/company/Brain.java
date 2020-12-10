package com.company;

import processing.core.PApplet;


public class Brain extends PApplet {


    public int screenSizeX = 722;
    public int screenSizeY = 798;
    public int r = 38;
    Grid grid = new Grid(screenSizeX,screenSizeY,r,this);
    Player p1 = new Player(this);



    public void settings(){
        size(screenSizeX,screenSizeY);
    }

    public void setup(){
        grid.gridCreator();
        grid.loadMap();

    }

    public void draw(){
        grid.gridPopulator();
        p1.renderPlayer();
        p1.playerMovement();
    }

    public void mousePressed(){

        //grid.mousePosPainter();
    }

    public void keyPressed(){
       /* if(key == 'U' || key == 'u'){
            grid.saveMap();
        }*/
    }


    public void keyReleased(){
    }
}
