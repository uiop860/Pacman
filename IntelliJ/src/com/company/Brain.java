package com.company;

import processing.core.PApplet;

public class Brain extends PApplet {

    static public int screenSize = 1000;

    public void settings(){
        size(screenSize,screenSize);

    }

    public void draw(){
        Grid grid = new Grid();
        grid.gridCreater();

    }






    /** getters and setters **/

    public int getScreenSize() {
        return screenSize;
    }
}
