package com.company;

import processing.core.PApplet;
import processing.core.PGraphics;

public class Grid extends PApplet {

    private int screenSize;
    private int r;

    private PApplet p;

    public Grid(int screenSize, int r, PApplet p) {
        this.screenSize = screenSize;
        this.r = r;
        this.p = p;
    }


    public void gridCreator(){
        int tempInt = screenSize/r;
        int[][] grid = new int[tempInt][tempInt];

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid.length; y++) {
                grid[x][y] = 0;
                p.rect(x*r,y*r,r,r);

            }
        }
    }
}
