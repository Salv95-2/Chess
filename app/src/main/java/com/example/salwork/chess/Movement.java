package com.example.salwork.chess;

/**
 * Created by SalWork on 3/8/18.
 */

public interface Movement {

    public Positions getPossiblePositions(char first_piece, int first_piece_row, int first_piece_col);

    }
