package com.codingame.game;
import java.lang.Math.*;


public class Wumpus {

    public boolean alive;
    public int row;
    public int column;

    public Wumpus(int x, int y)
    {
        this.alive = true;
        this.row = x;
        this.column = y;
    }

    public void Die()
    {
        this.alive = false;

    }

    public void Check()
    {

        if (this.alive)
        {
            System.out.println("Wumpus is still alive");
        }
        else
        {
            System.out.println("Wumpus was shot dead");
        }
    }

    public boolean Stench(int x, int y)
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


}
