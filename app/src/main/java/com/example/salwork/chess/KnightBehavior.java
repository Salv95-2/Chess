package com.example.salwork.chess;

import java.util.ArrayList;

/**
 * Created by SalWork on 3/8/18.
 */

public class KnightBehavior implements Movement{

    Grid grid;

    KnightBehavior(Grid grid) {
        this.grid = grid;
    }

    public boolean checkTeam(char first_piece, char second_piece){

        if(Character.isUpperCase(first_piece)) {
            if (second_piece == 'R') {
                return false;
            } else if (second_piece == 'H') {
                return false;
            } else if (second_piece == 'B') {
                return false;
            } else if (second_piece == 'K') {
                return false;
            } else if (second_piece == 'Q') {
                return false;
            } else if (second_piece == 'P') {
                return false;
            }
        }
        else{
            if (second_piece == 'r') {
                return false;
            } else if (second_piece == 'h') {
                return false;
            } else if (second_piece == 'b') {
                return false;
            } else if (second_piece == 'k') {
                return false;
            } else if (second_piece == 'q') {
                return false;
            } else if (second_piece == 'p') {
                return false;
            }
        }

        return true;
    }


    @Override
    public Positions getPossiblePositions(char first_piece, int first_piece_row, int first_piece_col){

        ArrayList<Integer> cols = new ArrayList<Integer>();
        ArrayList<Integer> rows = new ArrayList<Integer>();

        boolean upper_right = ((first_piece_col + 1) < 8) && ((first_piece_row - 2) >= 0);
        boolean upper_mid_right = ((first_piece_col + 2) < 8) && ((first_piece_row - 1) >= 0);
        boolean lower_mid_right = ((first_piece_col + 2) < 8) && ((first_piece_row + 1) < 8);
        boolean lower_right = ((first_piece_col + 1) < 8) && ((first_piece_row + 2) < 8);

        boolean upper_left = ((first_piece_col - 1) >= 0) && ((first_piece_row - 2) >= 0);
        boolean upper_mid_left = ((first_piece_col - 2) >= 0) && ((first_piece_row - 1) >= 0);
        boolean lower_mid_left = ((first_piece_col - 2) >= 0) && ((first_piece_row + 1) < 8);
        boolean lower_left = ((first_piece_col - 1) >= 0) && ((first_piece_row + 2) < 8);


        if(upper_right){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row - 2][first_piece_col + 1])){//if the upward  right piece is not a friendly white piece
                cols.add(first_piece_col + 1);
                rows.add(first_piece_row - 2);
            }

        }
        if(upper_mid_right){//works

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row - 1][first_piece_col + 2])){
                cols.add(first_piece_col + 2);
                rows.add(first_piece_row - 1);
            }


        }
        if(lower_mid_right){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row +1 ][first_piece_col + 2])){
                cols.add(first_piece_col + 2);
                rows.add(first_piece_row + 1);
            }

        }
        if(lower_right){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row + 2 ][first_piece_col + 1])){
                cols.add(first_piece_col + 1);
                rows.add(first_piece_row + 2);
            }

        }
        if(upper_left){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row - 2 ][first_piece_col - 1])){
                cols.add(first_piece_col - 1);
                rows.add(first_piece_row - 2);
            }

        }
        if(upper_mid_left){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row - 1][first_piece_col - 2])){
                cols.add(first_piece_col - 2);
                rows.add(first_piece_row - 1);
            }

        }
        if(lower_mid_left){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row + 1][first_piece_col - 2])){
                cols.add(first_piece_col - 2);
                rows.add(first_piece_row + 1);
            }

        }

        if(lower_left){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row + 2][first_piece_col - 1])){
                cols.add(first_piece_col - 1);
                rows.add(first_piece_row + 2);
            }
        }

        return  new Positions(first_piece, first_piece_row, first_piece_col, rows, cols);
    }
}
