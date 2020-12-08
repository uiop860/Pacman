package com.company;

import processing.core.PApplet;
import processing.core.PGraphics;

public class Brain extends PApplet {

//    PGraphics p;
    public int screenSize = 1000;
    public int r = 10;


    public void settings(){
        size(screenSize,screenSize);

    }

    public void setup(){
        background(0);


    }

    public void draw(){

        stroke(127);
        rect(10,10,50,50);
        Grid grid = new Grid(screenSize,r, this);
        grid.gridCreator();
    }






    /** getters and setters **/

}
