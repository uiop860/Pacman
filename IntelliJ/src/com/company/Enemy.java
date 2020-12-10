package com.company;

public class Enemy extends Entity{

    private boolean chaseMode = true;
    private int ghostSpeed;
    private int yPos;
    private int xPos;




    public Enemy(int ghostSpeed)
    {
        this.ghostSpeed = ghostSpeed;
    }




    /*public void movement(boolean mode)
    {
        int opposite =
        if(mode)
        {


        }

    }
*/


    public void changeMode()
    {
        chaseMode = false;
    }










}
