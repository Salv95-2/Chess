package com.example.salwork.chess;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by SalWork on 3/10/18.
 */

public class WhitePawnBehavior implements Movement {

    Grid grid;

    WhitePawnBehavior(Grid grid) {
        this.grid = grid;
    }


    public boolean isFriendly(char second_piece){

        switch (second_piece){
            case 'R':
                return true;
            case 'H':
                return true;
            case 'B':
                return true;
            case 'K':
                return true;
            case 'Q':
                return true;
            case 'P':
                return true;
            default:
                return false;
        }
    }

    public boolean isOpponent(char piece){


        switch (piece){
            case 'r':
                return true;
            case 'h':
                return true;
            case 'b':
                return true;
            case 'k':
                return true;
            case 'q':
                return true;
            case 'p':
                return true;
            default:
                return false;
        }
    }


    public boolean checkIfValidMove(char first_piece, int first_piece_row, int first_piece_col, char second_piece, int second_piece_row, int second_piece_col) {


        boolean one_up = first_piece_row >= 0;
        boolean attack_right = (first_piece_col + 1) < 8 && (first_piece_row - 1) >= 0;
        boolean attack_left = (first_piece_col - 1) >= 0 && (first_piece_row - 1) >= 0;

        if(isFriendly(second_piece)){
            return false;
        }

        if (first_piece_row == 6) {//works

            if (first_piece_col == second_piece_col) {
                if ((first_piece_row - 1) == second_piece_row) {
                    if (second_piece == '#') {
                        return true;
                    }
                }
                if ((first_piece_row - 2) == second_piece_row) {
                    if (second_piece == '#' && grid.getGridPiecesArr()[second_piece_row + 1][second_piece_col] == '#') {
                        return true;
                    }
                }
            }

        }
        if (one_up) {//works
            if (first_piece_col == second_piece_col) {
                if (((first_piece_row - 1) == second_piece_row)) {
                    if (!isOpponent(second_piece)) {
                        return true;
                    }
                }
            }
        }

        if (attack_right) {// works

            if ((second_piece_col == first_piece_col + 1) && (second_piece_row == first_piece_row - 1)) {

                if (isOpponent(second_piece)) {
                    return true;
                }

            }
        }

        if (attack_left) {//does not work

            if ((second_piece_col == first_piece_col - 1) && (second_piece_row == first_piece_row - 1)) {

                if (isOpponent(second_piece)) {
                    return true;
                }
            }
        }

        return false;
    }



    @Override
    public Positions getPossiblePositions(char first_piece, int first_piece_row, int first_piece_col){//need to make this function not be O(2)


        ArrayList<Integer> cols = new ArrayList<Integer>();
        ArrayList<Integer> rows = new ArrayList<Integer>();

        ArrayList<Character> white_pieces = new ArrayList<Character>();



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
