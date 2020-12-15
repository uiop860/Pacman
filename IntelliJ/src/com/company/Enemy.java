package com.company;

import java.awt.*;

import processing.core.PApplet;
import processing.core.PImage;

public class Enemy extends Entity
{
    PApplet p;

    public static boolean fleeMode = false;
    private static double defaultSpeed = 0.8;
    private static double fleeSpeed = 0.6;
    private PImage red;
    private int enemyPosX;
    private int enemyPosY;
    private int enemyGridPosX;
    private int enemyGridPosY;
    public static boolean ifMode = false;
    private static int counter = 0;


    public Enemy(PApplet p, int enemyPosX, int enemyPosY)
    {
        this.p = p;
        this.enemyPosX = enemyPosX;
        this.enemyPosY = enemyPosY;
    }


    public void drawGreen()
    {
        String src = "";

        if (ifMode)
        {
            src = "src\\blue.png";
        }
        else {
            src = "src\\green.png";
        }
        red = p.loadImage(src);
        p.imageMode(p.CENTER);
        p.image(red, enemyPosX, enemyPosY);
    }

    public void drawPink()
    {
        String src = "";

        if (ifMode)
        {
            src = "src\\blue.png";
        }
        else {
            src = "src\\pink.png";
        }
        red = p.loadImage(src);
        p.imageMode(p.CENTER);
        p.image(red, enemyPosX, enemyPosY);
    }

    public void drawYellow()
    {
        String src = "";

        if (ifMode)
        {
            src = "src\\blue.png";
        }
        else {
            src = "src\\yellow.png";
        }
        red = p.loadImage(src);
        p.imageMode(p.CENTER);
        p.image(red, enemyPosX, enemyPosY);
    }

    public void drawRed()
    {
        String src = "";

        if (ifMode)
        {
            src = "src\\blue.png";
        }
        else {
            src = "src\\red.png";
        }
        red = p.loadImage(src);
        p.imageMode(p.CENTER);
        p.image(red, enemyPosX, enemyPosY);
    }


    static public void changeMode()
    {

         if(ifMode && counter == 420)
        {
            ifMode = false;
        }
         counter++;
    }

    public void enemyMovement()
    {

        int p1XPlus = enemyGridPosX + 1;
        int p1XMinus = enemyGridPosX - 1;
        int p1YPlus = enemyGridPosY + 1;
        int p1YMinus = enemyGridPosY - 1;

        int deltaXFromPlayer = Player.getPlayerPositionX() - enemyPosX;
        int deltaYFromPlayer = Player.getPlayerPositionY() - enemyPosY;
        double distanceFromPlayer = Math.sqrt(deltaXFromPlayer * deltaXFromPlayer + deltaYFromPlayer * deltaYFromPlayer);

        if (deltaXFromPlayer > 0 && Grid.grid[p1XPlus][enemyGridPosY] != 1)
        {
            //move right
            enemyPosX += 1;
        }
        else if (deltaXFromPlayer < 0 && Grid.grid[p1XMinus][enemyGridPosY] != 1)
        {
            // move left
            enemyPosX -= 1;

        }
        else if (deltaYFromPlayer > 0 && Grid.grid[enemyGridPosX][p1YPlus] != 1)
        {
            // move down
            enemyPosY += 1;

        }
        else if (deltaYFromPlayer < 0 && Grid.grid[enemyGridPosX][p1YMinus] != 1)
        {
            // move up
            enemyPosY -= 1;

        }
        else if (Grid.grid[p1XPlus][enemyGridPosY] == 1)
        {
            if (Grid.grid[enemyGridPosX][p1YPlus] != 1)
            {
                // down
                enemyPosY += 1;
            }
            else if (Grid.grid[p1XMinus][enemyGridPosY] != 1)
            {
                // left
                enemyPosX -= 1;
            }
            else if (Grid.grid[enemyGridPosX][p1YMinus] != 1)
            {
                // up
                enemyPosY -= 1;
            }
        }
    }


    public void checkEnemyGridPosition()
    {
        enemyGridPositionX();
        enemyGridPositionY();
        System.out.println(enemyGridPosX + " - " + enemyGridPosY);

    }

    public void enemyGridPositionX()
    {

        for (int x = 0; x < Grid.grid.length; x++)
        {
            if (((enemyPosX - (Brain.r / 2)) / Brain.r) == x && enemyPosX % 38 == 19)
            {
                enemyGridPosX = x;
                break;
            }
        }
    }

    public void enemyGridPositionY()
    {

        for (int y = 0; y < Grid.grid[0].length; y++)
        {
            if (((enemyPosY - (Brain.r / 2)) / Brain.r) == y && enemyPosY % 38 == 19)
            {
                enemyGridPosY = y;
                break;
            }
        }
    }

    public Rectangle redEnemyGetBounds()
    {
        Rectangle redEnemy = new Rectangle();
        redEnemy.setLocation(enemyPosX - 16, enemyPosY - 20);
        redEnemy.setSize(32, 40);
        return redEnemy;
    }

    public Rectangle yellowEnemyGetBounds()
    {
        Rectangle yellowEnemy = new Rectangle();
        yellowEnemy.setLocation(enemyPosX - 16, enemyPosY - 20);
        yellowEnemy.setSize(32, 40);
        return yellowEnemy;
    }

    public Rectangle greenEnemyGetBounds()
    {
        Rectangle greenEnemy = new Rectangle();
        greenEnemy.setLocation(enemyPosX - 16, enemyPosY - 20);
        greenEnemy.setSize(32, 40);
        return greenEnemy;
    }

    public Rectangle pinkEnemyGetBounds()
    {
        Rectangle pinkEnemy = new Rectangle();
        pinkEnemy.setLocation(enemyPosX - 16, enemyPosY - 20);
        pinkEnemy.setSize(32, 40);
        return pinkEnemy;
    }
}
