package com.company;

import java.awt.*;

import processing.core.PApplet;
import processing.core.PImage;

public class Enemy extends Entity
{
    PApplet p;

    private boolean fleeMode = false;
    private double defaultSpeed = 0.8;
    private double speed = 0;
    private double fleeSpeed = 0.6;
    private int yPos;
    private int xPos;
    private PImage blue, red, brown, pink;




    public Enemy(PApplet p)
    {
        this.p = p;
    }


    public void drawGreen()
    {
        red = p.loadImage("IntelliJ/src/green.png");
        p.image(red,getEnemyGreenXPos(),getEnemyGreenYPos());
    }

    public void drawPink()
    {
        red = p.loadImage("IntelliJ/src/pink.png");
        p.image(red,getEnemyPinkXPos(),getEnemyPinkYPos());
    }

    public void drawBlue()
    {
        red = p.loadImage("IntelliJ/src/blue.png");
        p.image(red,getEnemyBlueXPos(),getEnemyBlueYPos());
    }

    public void drawRed()
    {
        red = p.loadImage("IntelliJ/src/red.png");
        p.image(red,getEnemyRedXPos(),getEnemyRedYPos());

    }


    public void changeMode()
    {
        if(!fleeMode)
        {
            fleeMode = true;
            speed = fleeSpeed;


        }
        else if(fleeMode)
        {
            fleeMode = false;
            speed = defaultSpeed;

        }

    }





}
