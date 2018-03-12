package com.example.salwork.chess;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by SalWork on 3/10/18.
 */

public class Bot implements Player{

    Piece piece;
    Grid grid;

    Bot(Grid grid){
        this.grid = grid;

    }

    public void findPotentialPositions() {

        //create am object for each piece and get potential locations of all pieces

        piece = new Pawn(new BlackPawnBehavior(grid));

        Positions possibleMoves = piece.getPossibilities('p',3,4);

        for(int i = 0; i < possibleMoves.getRows().size(); i++){

            Log.d("Black pawn poss row", String.valueOf(possibleMoves.getRows().get(i)));
            Log.d("Black pawn poss col", String.valueOf(possibleMoves.getColumns().get(i)));
        }

        piece = new Pawn(new WhitePawnBehavior(grid));

        possibleMoves = piece.getPossibilities('P',6,0);

        for(int i = 0; i < possibleMoves.getRows().size(); i++){

            Log.d("White pawn poss row", String.valueOf(possibleMoves.getRows().get(i)));
            Log.d("White pawn poss col", String.valueOf(possibleMoves.getColumns().get(i)));
        }

    }


}
