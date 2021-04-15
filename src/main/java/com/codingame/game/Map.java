package com.codingame.game;

import java.util.Arrays;
public class Map {

    private String[][] blocks;
    private Wumpus wumpus;
    private Pit[] pits;
    private int rows;
    private int columns;


    public Map(int x, int y) {

        this.blocks = new String[x][y];
        this.rows = x;
        this.columns = y;

        //Arrays.stream(this.blocks).forEach(a -> Arrays.fill(a, "None"));

    }


        public void PrintMap() {

            System.out.println(Arrays.deepToString(this.blocks));

        }


}