package com.example.salwork.chess;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by SalWork on 3/8/18.
 */

public class Player {

    Piece piece;
    Grid grid;
    WhitePiecesLocation whitePiecesLocation;
    BlackPiecesLocation blackPiecesLocation;

    Player(Grid grid) {
        this.grid = grid;
        blackPiecesLocation = new BlackPiecesLocation();

    }

}


