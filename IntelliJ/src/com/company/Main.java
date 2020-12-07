package com.company;

import processing.core.PApplet;

public class Main extends PApplet{

    public static void main(String[] args) {


        String[] processingArgs = {"MySketch"};
        Grid grid = new Grid();
        PApplet.runSketch(processingArgs, grid);



	}



}
