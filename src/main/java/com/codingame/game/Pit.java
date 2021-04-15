package com.codingame.game;

public class Pit {

    public int row;
    public int column;


    public Pit(int x, int y)
    {
        this.row = x;
        this.column = y;

    }


    public boolean Breeze(int x, int y)
    {

        if (this.row == x && java.lang.Math.abs((this.column - y)) == 1)
        {
            return true;
        }

        if (this.column == y && java.lang.Math.abs((this.row - x)) == 1)
        {
            return true;
        }

        return false;
    }

    public int Reward()
    {

        return -1000;
    }


}
