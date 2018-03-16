package com.example.salwork.chess;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by SalWork on 3/8/18.
 */

public class Player {

    protected Piece piece;
    protected Grid grid;
    protected WhitePiecesLocation whitePiecesLocation;
    protected BlackPiecesLocation blackPiecesLocation;

    Player(Grid grid) {
        this.grid = grid;
        blackPiecesLocation = new BlackPiecesLocation();
        whitePiecesLocation = new WhitePiecesLocation();

    }

}


