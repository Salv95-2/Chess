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

        ArrayList<Positions> positions = new ArrayList<Positions>();
        Positions possibleMoves;

        piece = new Pawn(new BlackPawnBehavior(grid));

        possibleMoves = piece.getPossibilities('p',1,0);

        positions.add(possibleMoves);

        ////////

        piece = new Bishop(new BishopBehavior(grid));

        possibleMoves = piece.getPossibilities('b',4,4);

        positions.add(possibleMoves);

        ///////


        

    }


}
