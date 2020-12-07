package com.company;


import processing.core.PApplet;

public class Grid extends PApplet {


    public int screenSize = 1000;
    public int r = 10;
    public int[][] grid = new int[screenSize/r][screenSize/r];


    public void settings(){
        size(screenSize,screenSize);

    }



    public void draw(){

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid.length; y++) {
                grid[x][y] = 0;
                stroke(127);
                rect(x*r,y*r,r,r);
            }
        }
    }
}
