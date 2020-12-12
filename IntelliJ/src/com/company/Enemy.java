package com.company;

import java.awt.*;

import javafx.geometry.Bounds;
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
        red = p.loadImage("C:\\Users\\Lukas\\Documents\\GitHub\\Pacman\\IntelliJ\\src\\green.png");
        p.image(red,getEnemyGreenXPos(),getEnemyGreenYPos());
    }

    public void drawPink()
    {
        red = p.loadImage("C:\\Users\\Lukas\\Documents\\GitHub\\Pacman\\IntelliJ\\src\\pink.png");
        p.image(red,getEnemyPinkXPos(),getEnemyPinkYPos());
    }

    public void drawBlue()
    {
        red = p.loadImage("C:\\Users\\Lukas\\Documents\\GitHub\\Pacman\\IntelliJ\\src\\blue.png");
        p.image(red,getEnemyBlueXPos(),getEnemyBlueYPos());
    }

    public void drawRed()
    {
        red = p.loadImage("C:\\Users\\Lukas\\Documents\\GitHub\\Pacman\\IntelliJ\\src\\red.png");
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

    public Rectangle redEnemyGetBounds()
    {
        Rectangle redEnemy = new Rectangle();
        redEnemy.setLocation(getEnemyRedXPos(),getEnemyRedYPos());
        redEnemy.setSize(34,42);
        return redEnemy;
    }

    public Rectangle blueEnemyGetBounds()
    {
        Rectangle blueEnemy = new Rectangle();
        blueEnemy.setLocation(getEnemyBlueXPos(),getEnemyBlueYPos());
        blueEnemy.setSize(34,42);
        return blueEnemy;
    }

    public Rectangle greenEnemyGetBounds()
    {
        Rectangle greenEnemy = new Rectangle();
        greenEnemy.setLocation(getEnemyGreenXPos(),getEnemyGreenYPos());
        greenEnemy.setSize(34,42);
        return greenEnemy;
    }

    public Rectangle pinkEnemyGetBounds()
    {
        Rectangle pinkEnemy = new Rectangle();
        pinkEnemy.setLocation(getEnemyPinkXPos(),getEnemyPinkYPos());
        pinkEnemy.setSize(34,42);
        return pinkEnemy;
    }
}
