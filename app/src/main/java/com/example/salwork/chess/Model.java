package com.example.salwork.chess;

/**
 * Created by SalWork on 3/5/18.
 */

public class Model {

    private Grid grid;


    Model(){
        grid = new Grid();
    }

    public Grid getGrid(){
        return grid;
    }


    Piece bKing = new BlackKing();

}
