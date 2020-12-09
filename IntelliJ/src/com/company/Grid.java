package com.company;

import processing.core.PApplet;
import processing.core.PImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Grid extends PApplet {

    private int screenSize;
    private int r;
    private int[][] grid = new int[19][21];

    private PApplet p;
    PImage image;


    public Grid(int screenSize, int r, PApplet p, PImage image) {
        this.screenSize = screenSize;
        this.r = r;
        this.p = p;
        this.image = image;
    }


    public void gridCreator(){
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid.length; y++) {
                grid[x][y] = 0;
            }
        }
    }



    public void readImage() throws IOException{

        for (int x = 0; x < 722; x+=18) {
            for (int y = 0; y < 798; y+=18) {
                if(image.get(x,y) == -16767233){

                    grid[x/38][y/42] = 1;
                }
            }
        }
    }



    public void gridPopulator(){
//        p.stroke(255);
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid.length; y++) {
                if (grid[x][y] == 0){
                    p.fill(0,0,0);
                }
                else {
                    p.fill(0,51,204);
                }
                p.rect(x*r,y*r,r,r);
            }
        }
    }
}
