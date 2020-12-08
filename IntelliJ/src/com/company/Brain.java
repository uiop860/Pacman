package com.company;

import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;

import java.io.IOException;

public class Brain extends PApplet {

//    PGraphics p;
    public int screenSizeX = 722;
    public int screenSizeY = 797;
    public int r = 38;
    PImage image;
    Grid grid;


    public void settings(){
        size(screenSizeX,screenSizeY);

    }

    public void setup(){


        image = loadImage("C:\\Users\\olive\\Documents\\GitHub\\Pacman\\IntelliJ\\src\\pacmap.png");
        grid = new Grid(screenSizeX,r, this,image);

        grid.gridCreator();

        try {
            grid.readImage();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void draw(){




        grid.gridPopulator();



        // image(image,0,0);


    }






    /** getters and setters **/

}
