package com.company;

import processing.core.PApplet;

public class Main extends PApplet{



    public static void main(String[] args) {


        String[] processingArgs = {"Main"};
        Brain brain = new Brain();
        PApplet.runSketch(processingArgs, brain);

	}
}
