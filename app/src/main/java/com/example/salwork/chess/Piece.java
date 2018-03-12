package com.example.salwork.chess;

import com.example.salwork.chess.Movement;

/**
 * Created by SalWork on 3/8/18.
 */

public class Piece {

    Movement movement;


    public Positions getPossibilities(char first_piece, int first_piece_row, int first_piece_col){

        return movement.getPossiblePositions(first_piece, first_piece_row, first_piece_col);
    }

}

