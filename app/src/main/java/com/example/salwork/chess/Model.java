package com.example.salwork.chess;

import android.util.Log;

/**
 * Created by SalWork on 3/5/18.
 */


//This is the class that will update the board
public class Model {

    private Grid grid;

    private Player player;


    Model(){
        grid = new Grid();
    }

    public Grid getGrid(){
        return grid;
    }


    //Piece bKing = new BlackKing();

    public void test(){

        player = new Bot(grid);

        ((Bot)player).findPotentialPositions();


    }








}