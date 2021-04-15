package com.codingame.game;

public class Gold {

    public int row;
    public int column;

    public Gold(int x, int y)
    {
        this.row = x;
        this.column = y;

    }

    public int Reward()
    {
        return 1000;
    }


}
