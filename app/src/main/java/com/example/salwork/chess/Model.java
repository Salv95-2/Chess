package com.example.salwork.chess;

import android.util.Log;

/**
 * Created by SalWork on 3/5/18.
 */


//This is the class that will update the board
public class Model {

    private Grid grid;

    private Player player;
    private BlackPiecesLocation blackPiecesLocation;


    Model(){
        grid = new Grid();
    }

    public Grid getGrid(){
        return grid;
    }


    //Piece bKing = new BlackKing();

    public void test(){

        player = new Bot(grid);

        Grid newGrid = ((Bot)player).evaluateBlackPositions();

        this.grid = newGrid;


        //what ever function is called needs to return the updated grid so that the view board can get updated
    }








}