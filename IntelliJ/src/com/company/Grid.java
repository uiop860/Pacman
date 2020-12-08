package com.company;

import processing.core.PApplet;
import processing.core.PGraphics;

public class Grid extends PApplet {

    private int screenSize;
    private int r;
    private int[][] grid = new int[21][21];

    private PApplet p;

    public Grid(int screenSize, int r, PApplet p) {
        this.screenSize = screenSize;
        this.r = r;
        this.p = p;
    }


    public void gridCreator(){


        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid.length; y++) {
                grid[x][y] = 0;
            }
        }
    }

    public void gridChanger(){
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid.length; y++) {
                grid[x][20] = 1;
                grid[x][0] = 1;

            }
        }
    }



    public void gridPopulator(){
        p.stroke(255);
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
