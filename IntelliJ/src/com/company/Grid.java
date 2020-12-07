package com.company;


import processing.core.PApplet;

public class Grid extends PApplet {


    Brain brain = new Brain();


    public int r = 10;
    public int[][] grid = new int[brain.getScreenSize()/r][brain.getScreenSize()/r];


    public void gridCreater(){

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid.length; y++) {
                grid[x][y] = 0;
                stroke(127);
                rect(x*r,y*r,r,r);
            }
        }
    }




}
