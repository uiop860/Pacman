package com.company;

import java.awt.*;

import processing.core.PApplet;
import processing.core.PImage;

public class Enemy extends Entity
{
    PApplet p;

    public static boolean fleeMode = false;
    private static double defaultSpeed = 0.8;
    private static double speed = 0;
    private static double fleeSpeed = 0.6;
    private int yPos;
    private int xPos;
    private PImage red;
    int frameCounter = 0;
    int enemyPosX;
    int enemyPosY;
    int enemyGridPosX;
    int enemyGridPosY;


    public Enemy(PApplet p, int enemyPosX, int enemyPosY)
    {
        this.p = p;
        this.enemyPosX = enemyPosX;
        this.enemyPosY = enemyPosY;
    }


    public void drawGreen()
    {
        red = p.loadImage("C:\\Users\\Olive\\Documents\\GitHub\\Pacman\\IntelliJ\\src\\green.png");
        p.imageMode(p.CENTER);
        p.image(red,enemyPosX,enemyPosY);
    }

    public void drawPink()
    {
        red = p.loadImage("C:\\Users\\Olive\\Documents\\GitHub\\Pacman\\IntelliJ\\src\\pink.png");
        p.imageMode(p.CENTER);
        p.image(red,enemyPosX,enemyPosY);
    }

    public void drawYellow()
    {
        red = p.loadImage("C:\\Users\\Olive\\Documents\\GitHub\\Pacman\\IntelliJ\\src\\yellow.png");
        p.imageMode(p.CENTER);
        p.image(red,enemyPosX,enemyPosY);
    }

    public void drawRed()
    {
        red = p.loadImage("C:\\Users\\Olive\\Documents\\GitHub\\Pacman\\IntelliJ\\src\\red.png");
        p.imageMode(p.CENTER);
        p.image(red,enemyPosX,enemyPosY);
    }


     static public void changeMode() {
        if(!fleeMode) {
            speed = fleeSpeed;
            fleeMode = true;
        }
        else if(fleeMode) {
            speed = defaultSpeed;
            fleeMode = false;
        }
    }

    public void enemyMovement(){

        int p1XPlus = enemyGridPosX + 1;
        int p1XMinus = enemyGridPosX - 1;
        int p1YPlus = enemyGridPosY + 1;
        int p1YMinus = enemyGridPosY - 1;

        if(getPlayerXPos() > enemyPosX && Grid.grid[p1XPlus][enemyGridPosY] != 1){
            //move right
            enemyPosX++;

        } else if(getPlayerXPos() < enemyPosX && Grid.grid[p1XMinus][enemyGridPosY] != 1){
            // move left
            enemyPosX--;

        } else if(getPlayerYPos() > enemyPosY && Grid.grid[enemyGridPosX][p1YPlus] != 1){
            // move down
            enemyPosY++;

        } else if (getPlayerYPos() < enemyPosY && Grid.grid[enemyGridPosX][p1YMinus] != 1){
            // move up
            enemyPosY--;

        }
    }

    public void checkEnemyGridPosition(){
        enemyGridPositionX();
        enemyGridPositionY();
        System.out.println(enemyGridPosX + " - " + enemyGridPosY);

    }
    public void enemyGridPositionX() {

        for (int x = 0; x < Grid.grid.length; x++) {
            if(((enemyPosX-(Brain.r/2))/Brain.r) == x && enemyPosX % 38 == 19){
                enemyGridPosX = x;
                break;
            }
        }
    }
    public void enemyGridPositionY(){

        for (int y = 0; y < Grid.grid[0].length; y++ ) {
            if(((enemyPosY-(Brain.r/2))/Brain.r) == y && enemyPosY % 38 == 19) {
                enemyGridPosY = y;
                break;
            }
        }
    }

    public Rectangle redEnemyGetBounds() {
        Rectangle redEnemy = new Rectangle();
        redEnemy.setLocation(enemyPosX-16,enemyPosY-20);
        redEnemy.setSize(32,40);
        return redEnemy;
    }

    public Rectangle yellowEnemyGetBounds() {
        Rectangle yellowEnemy = new Rectangle();
        yellowEnemy.setLocation(enemyPosX-16,enemyPosY-20);
        yellowEnemy.setSize(32,40);
        return yellowEnemy;
    }

    public Rectangle greenEnemyGetBounds() {
        Rectangle greenEnemy = new Rectangle();
        greenEnemy.setLocation(enemyPosX-16,enemyPosY-20);
        greenEnemy.setSize(32,40);
        return greenEnemy;
    }

    public Rectangle pinkEnemyGetBounds() {
        Rectangle pinkEnemy = new Rectangle();
        pinkEnemy.setLocation(enemyPosX-16,enemyPosY-20);
        pinkEnemy.setSize(32,40);
        return pinkEnemy;
    }
}
