package com.company;

import processing.core.PApplet;

public class Controls {

    PApplet p;
    public Controls(PApplet p) {
        this.p = p;
    }

    private boolean wDown = false;
    private boolean aDown = false;
    private boolean sDown = false;
    private boolean dDown = false;

    private boolean upKeyDown = false;
    private boolean leftKeyDown = false;
    private boolean downKeyDown = false;
    private boolean rightKeyDown = false;

    public boolean upKeyDown()
    {
        return upKeyDown;
    }
    public boolean leftKeyDown()
    {
        return leftKeyDown;
    }
    public boolean downKeyDown()
    {
        return downKeyDown;
    }
    public boolean rightKeyDown()
    {
        return rightKeyDown;
    }



    /*public boolean wDown()
    {
        return wDown;
    }

    public boolean aDown()
    {
        return aDown;
    }

    public boolean sDown()
    {
        return sDown;
    }

    public boolean dDown()
    {
        return dDown;
    }*/


    /*public void onKeyPressed(char ch)
    {
        if (ch == 'W' || ch == 'w')
        {
            wDown = true;
        } else if (ch == 'A' || ch == 'a')
        {
            aDown = true;
        } else if (ch == 'S' || ch == 's')
        {
            sDown = true;
        } else if (ch == 'D' || ch == 'd')
        {
            dDown = true;
        }
    }

    public void onKeyReleased(char ch)
    {
        if (ch == 'W' || ch == 'w')
        {
            wDown = false;
        } else if (ch == 'A' || ch == 'a')
        {
            aDown = false;
        } else if (ch == 'S' || ch == 's')
        {
            sDown = false;
        } else if (ch == 'D' || ch == 'd')
        {
            dDown = false;
        }
    }*/


    public void onKeyPressedArrow()
    {
        if (p.keyCode == p.UP)
        {
            upKeyDown = true;
        } else if (p.keyCode == p.LEFT)
        {
            leftKeyDown = true;
        } else if (p.keyCode == p.DOWN)
        {
            downKeyDown = true;
        } else if (p.keyCode == p.RIGHT)
        {
            rightKeyDown = true;
        }
    }

    void onKeyReleasedArrow()
    {
        if (p.keyCode == p.UP)
        {
            upKeyDown = false;
        } else if (p.keyCode == p.LEFT)
        {
            leftKeyDown = false;
        } else if (p.keyCode == p.DOWN)
        {
            downKeyDown = false;
        } else if (p.keyCode == p.RIGHT)
        {
            rightKeyDown = false;
        }
    }



}


