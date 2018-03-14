package com.example.salwork.chess;

import java.util.ArrayList;

/**
 * Created by SalWork on 3/8/18.
 */

public class KingBehavior implements Movement{

    Grid grid;

    KingBehavior(Grid grid) {
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

        boolean up = (first_piece_row - 1) >= 0;
        boolean up_left = (first_piece_row - 1) >= 0 && (first_piece_col - 1) >= 0;
        boolean up_right = (first_piece_row - 1) >= 0 && (first_piece_col + 1) < 8;
        boolean right = (first_piece_col + 1) < 8;
        boolean down_right = (first_piece_row + 1) < 8 && (first_piece_col + 1) < 8;
        boolean down = (first_piece_row + 1) < 8;
        boolean down_left = (first_piece_row + 1) < 8 && (first_piece_col - 1) >= 0;
        boolean left = (first_piece_col - 1) >= 0;

        if(up){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row - 1][first_piece_col])){//if the upward piece is not a friendly white piece
                rows.add(first_piece_row - 1);
                cols.add(first_piece_col);
            }
        }
        if(up_left){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row - 1][first_piece_col - 1])){//if the upward piece is not a friendly white piece
                rows.add(first_piece_row - 1);
                cols.add(first_piece_col - 1);
            }
        }
        if(up_right){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row - 1][first_piece_col + 1])){//if the upward piece is not a friendly white piece
                rows.add(first_piece_row - 1);
                cols.add(first_piece_col + 1);
            }
        }
        if(right){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row][first_piece_col + 1])){//if the upward piece is not a friendly white piece
                rows.add(first_piece_row);
                cols.add(first_piece_col + 1);
            }

        }
        if(down_right){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row + 1][first_piece_col + 1])){//if the upward piece is not a friendly white piece
                rows.add(first_piece_row + 1);
                cols.add(first_piece_col + 1);
            }

        }
        if(down){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row + 1][first_piece_col])){//if the upward piece is not a friendly white piece

                rows.add(first_piece_row + 1);
                cols.add(first_piece_col);
            }

        }
        if(down_left){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row + 1][first_piece_col - 1])){//if the upward piece is not a friendly white piece

                rows.add(first_piece_row + 1);
                cols.add(first_piece_col - 1);
            }

        }
        if(left){

            if(checkTeam(first_piece, grid.getGridPiecesArr()[first_piece_row][first_piece_col - 1])){//if the upward piece is not a friendly white piece

                rows.add(first_piece_row);
                cols.add(first_piece_col - 1);
            }


        }

        return new Positions(first_piece, first_piece_row, first_piece_col, rows, cols);
    }
}
