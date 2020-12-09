package com.company;

import processing.core.PApplet;

import java.io.*;
import java.util.Scanner;

public class Grid extends PApplet {

    private int screenSizeX;
    private int screenSizeY;
    private int r;
    private PApplet p;

    private int[][] grid = new int[19][21];

    public Grid(int screenSizeX, int screenSizeY, int r, PApplet p) {
        this.screenSizeX = screenSizeX;
        this.screenSizeY = screenSizeY;
        this.r = r;
        this.p = p;
    }


    private int blackBox = 0;
    private int blueBox = 1;

    public void gridCreator() {
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid.length; y++) {
                grid[x][y] = blackBox;
            }
        }
    }

    /*public void mousePosPainter() {
        int mouseXPos = p.mouseX;
        int mouseYPos = p.mouseY;


        outLoop:
        for (int x = r; x < screenSizeX; x += r) {
            for (int y = r; y < screenSizeY; y += r) {
                    // top left square
                if (mouseXPos < r & mouseYPos < r) {
                    if(grid[0][0] == blueBox) {
                        grid[0][0] = blackBox;
                    }else
                        grid[0][0] = blueBox;
                    break outLoop;
                    // bottom right square
                }if(mouseXPos > (grid.length-1)*r & mouseYPos > (grid[0].length-1)*r){
                    if(grid[grid.length-1][grid[0].length-1] == blueBox){
                        grid[grid.length-1][grid[0].length-1] = blackBox;
                    }
                    else
                        grid[grid.length-1][grid[0].length-1] = blueBox;
                    break outLoop;
                    // left side squares
                }if(mouseXPos < r & mouseYPos < y){
                    if(grid[0][(y/r)-1] == blueBox) {
                        grid[0][(y/r)-1] = blackBox;
                    }else
                        grid[0][(y/r)-1] = blueBox;
                    break outLoop;
                    // right side squares
                }if(mouseXPos < x & mouseYPos < r){
                    if(grid[(x/r)-1][0] == blueBox) {
                        grid[(x/r)-1][0] = blackBox;
                    }else
                        grid[(x/r)-1][0] = blueBox;
                    break outLoop;

                } if (mouseXPos > (grid.length-1)*r & mouseYPos < y){
                    if(grid[grid.length-1][(y/r)-1] == blueBox){
                        grid[grid.length-1][(y/r)-1] = blackBox;
                    }else
                        grid[grid.length-1][(y/r)-1] = blueBox;
                    break outLoop;
                }if(mouseXPos < x & mouseYPos > (grid[0].length-1)*r){
                    if(grid[(x/r)-1][grid[0].length-1] == blueBox){
                        grid[(x/r)-1][grid[0].length-1] = blackBox;
                    }else
                        grid[(x/r)-1][grid[0].length-1] = blueBox;
                    break outLoop;
                }else if (mouseXPos > r & mouseXPos < x & mouseYPos > r & mouseYPos < y) {
                    if(grid[(x/r)-1][(y/r)-1] == blueBox){
                        grid[(x/r)-1][(y/r)-1] = blackBox;
                    } else
                        grid[(x/r)-1][(y/r)-1] = blueBox;
                    break outLoop;
                }
            }
        }
    }*/


    public void gridPopulator() {

        p.noStroke();
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[0].length; y++) {
                if (grid[x][y] == blackBox) {
                    p.fill(0, 0, 0);
                } else {
                    p.fill(0, 51, 204);
                }
                p.rect(x * r, y * r, r, r);
            }
        }
    }

    public void loadMap() {


        String line = "";
        try {
            BufferedReader reader = new BufferedReader( new FileReader("Pepemap.txt"));
                for (int i = 0; i < grid[0].length; i++) {
                    if ((line = reader.readLine()) != null) {
                        for (int j = 0; j < grid.length; j++) {
                            String[] numbers = line.split(",");
                            int num = Integer.parseInt(numbers[j]);
                            grid[j][i] = num;
                        }
                    }
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        /*public void saveMap () {
            try {
                FileWriter fileWriter = new FileWriter("Pepemapweird.txt");


                for (int i = 0; i < grid.length; i++) {
                    for (int j = 0; j < grid[0].length; j++) {
                        fileWriter.write(grid[i][j] + ",");
                    }
                    fileWriter.write("\n");
                }
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/



}
