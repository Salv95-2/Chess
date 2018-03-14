package com.example.salwork.chess;

import java.util.ArrayList;

/**
 * Created by SalWork on 3/8/18.
 */

public class RookBehavior implements Movement{


    Grid grid;

    RookBehavior(Grid grid) {
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

    //in the case the the Rook is selected first
    public boolean checkIfValidMove(char first_piece, int first_piece_row, int first_piece_col,
                                    char second_piece, int second_piece_row, int second_piece_col){


        if((second_piece_row !=  first_piece_row) &&  (second_piece_col !=  first_piece_col)){//if piece not in range, tower can't attack
            return false;
        }
        if(first_piece_row == second_piece_row && first_piece_col == second_piece_col){//Rook can't attak itself
            return false;
        }

        if(!checkTeam(first_piece,second_piece)){//Rook can't attach friendly pieces
            return false;
        }


        //check if there are any pieces intersecting the path of the Rook

        if(first_piece_row == second_piece_row){

            if(first_piece_col < second_piece_col){

                for(int j = first_piece_col + 1; j < second_piece_col; j++){//runs through the pieces in between the two selected

                    if(grid.getGridPiecesArr()[first_piece_row][j] != '#'){
                        return false;
                    }
                }
            }
            else if(first_piece_col > second_piece_col){

                for(int j = second_piece_col + 1; j < first_piece_col; j++){

                    if(grid.getGridPiecesArr()[first_piece_row][j] != '#'){
                        return false;
                    }
                }
            }
        }

        if(first_piece_col == second_piece_col){

            if(first_piece_row < second_piece_row){
                for(int i = first_piece_row + 1; i < second_piece_row; i++){

                    if(grid.getGridPiecesArr()[i][first_piece_col] != '#'){
                        return false;
                    }
                }
            }
            else if(first_piece_row > second_piece_row){

                for(int i = second_piece_row + 1; i < first_piece_row; i++){

                    if(grid.getGridPiecesArr()[i][first_piece_col] != '#'){
                        return false;
                    }
                }
            }
        }


        return true;
    }

    //need to create function that returns an array with all the possible positions the Rook can land on

    @Override
    public Positions getPossiblePositions(char first_piece, int first_piece_row, int first_piece_col){

        ArrayList<Integer> cols = new ArrayList<Integer>();
        ArrayList<Integer> rows = new ArrayList<Integer>();

        for(int row = 0; row < 8; row++){

            if(row != first_piece_row){//Skip the row where the piece is currently located
                if(checkIfValidMove(first_piece, first_piece_row, first_piece_col, grid.getGridPiecesArr()[row][first_piece_col], row, first_piece_col )){

                    rows.add(row);
                    cols.add(first_piece_col);
                }
            }
        }

        for(int col = 0; col < 8; col++){

            if(col != first_piece_col){//Skip the column where the piece is currently located
                if(checkIfValidMove(first_piece, first_piece_row, first_piece_col, grid.getGridPiecesArr()[first_piece_row][col], first_piece_row, col )){

                    rows.add(first_piece_row);
                    cols.add(col);
                }
            }
        }

        return  new Positions(first_piece, first_piece_row, first_piece_col, rows, cols);


    }
}
