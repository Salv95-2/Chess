package com.example.salwork.chess;

import android.accessibilityservice.AccessibilityService;

import java.util.ArrayList;

/**
 * Created by SalWork on 3/8/18.
 */

public class QueenBehavior implements Movement{

    private Grid grid;

    QueenBehavior(Grid grid) {
        this.grid = grid;
    }

    public boolean checkIfValidMove(char first_piece, int first_piece_row, int first_piece_col, char second_piece, int second_piece_row, int second_piece_col) {


        RookBehavior rookBehaviorQ = new RookBehavior(grid);
        BishopBehavior bishopBehaviorQ = new BishopBehavior(grid);

        boolean validMove2;
        boolean validMove3;

        validMove2 = rookBehaviorQ.checkIfValidMove(first_piece,first_piece_row,first_piece_col, second_piece, second_piece_row, second_piece_col);
        validMove3 = bishopBehaviorQ.checkIfValidMove(first_piece,first_piece_row,first_piece_col, second_piece, second_piece_row, second_piece_col);


        if(validMove2 || validMove3){
            return true;
        }

        return false;
    }

    @Override
    public Positions getPossiblePositions(char first_piece, int first_piece_row, int first_piece_col){


        ArrayList<Integer> cols = new ArrayList<Integer>();
        ArrayList<Integer> rows = new ArrayList<Integer>();

        for(int i = 0; i < 8; i++){

            for(int j = 0; j < 8; j++){

                if(checkIfValidMove(first_piece, first_piece_row, first_piece_col, grid.getGridPiecesArr()[i][j], i, j)){

                    if(!(first_piece_row == i && first_piece_col == j)){
                        cols.add(j);
                        rows.add(i);
                    }
                }
            }
        }

        return  new Positions(first_piece, first_piece_row, first_piece_col, rows, cols);
    }
}
