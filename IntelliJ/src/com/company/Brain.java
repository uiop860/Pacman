package com.company;

import processing.core.PApplet;
import processing.core.PGraphics;

public class Brain extends PApplet {

//    PGraphics p;
    public int screenSizeX = 800;
    public int screenSizeY = 800;
    public int r = 38;


    public void settings(){
        size(screenSizeX,screenSizeY);

    }

    public void setup(){
        background(0);


    }

    public void draw(){

        Grid grid = new Grid(screenSizeX,r, this);
        grid.gridCreator();
        grid.gridChanger();
        grid.gridPopulator();
    }






    /** getters and setters **/

}
