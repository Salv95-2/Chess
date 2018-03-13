package com.example.salwork.chess;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by SalWork on 3/8/18.
 */

public class BishopBehavior implements Movement{

    Grid grid;

    BishopBehavior(Grid grid) {
        this.grid = grid;
    }

    public boolean checkBishopTeam(char first_piece, char second_piece){

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

    public boolean checkIfValidMove(char first_piece, int first_piece_row, int first_piece_col, char second_piece, int second_piece_row, int second_piece_col){


        if(!checkBishopTeam(first_piece,second_piece)){
            return false;
        }

        HashMap<Integer,Integer> possibles = new HashMap<Integer, Integer>();


        int temp_col = first_piece_col;
        int temp_row = first_piece_row;

        //up left
        if(second_piece_row < first_piece_row && second_piece_col < first_piece_col){

            while(temp_row > second_piece_row && temp_col > second_piece_col){
                temp_col--;
                temp_row--;
                possibles.put(temp_row, temp_col);


                if(temp_row == second_piece_row && temp_col == second_piece_col){
                    break;
                }
                else{
                    if(grid.getGridPiecesArr()[temp_row][temp_col] != '#'){
                        return false;
                    }
                }
            }

            if(possibles.get(second_piece_row) != null){

                if(possibles.get(second_piece_row) == second_piece_col){
                    return true;
                }

            }
        }

        //up right
        else if(second_piece_row < first_piece_row && second_piece_col > first_piece_col){
            possibles = new HashMap<Integer, Integer>();
            temp_col = first_piece_col;
            temp_row = first_piece_row;


            while(temp_row > 0 && temp_col < 7){
                temp_col++;
                temp_row--;
                possibles.put(temp_row, temp_col);


                if(temp_row == second_piece_row && temp_col == second_piece_col){
                    break;
                }
                else{
                    if(grid.getGridPiecesArr()[temp_row][temp_col] != '#'){
                        return false;
                    }
                }

            }
            if(possibles.get(second_piece_row) != null){

                if(possibles.get(second_piece_row) == second_piece_col){

                    return true;
                }

            }
        }

        //down left
        else if(second_piece_row > first_piece_row && second_piece_col < first_piece_col){
            possibles = new HashMap<Integer, Integer>();
            temp_col = first_piece_col;
            temp_row = first_piece_row;


            while(temp_row < 7 && temp_col > 0){//something wrong here
                temp_col--;
                temp_row++;
                possibles.put(temp_row, temp_col);

                if(temp_row == second_piece_row && temp_col == second_piece_col){
                    break;
                }
                else{
                    if(grid.getGridPiecesArr()[temp_row][temp_col] != '#'){
                        return false;
                    }
                }

            }


            if(possibles.get(second_piece_row) != null){

                if(possibles.get(second_piece_row) == second_piece_col){

                    return true;
                }

            }

        }

        //down right
        else if(second_piece_row > first_piece_row && second_piece_col > first_piece_col){
            possibles = new HashMap<Integer, Integer>();
            temp_col = first_piece_col;
            temp_row = first_piece_row;


            while(temp_row < 7 && temp_col < 7){
                temp_col++;
                temp_row++;
                possibles.put(temp_row, temp_col);

                if(temp_row == second_piece_row && temp_col == second_piece_col){
                    break;
                }
                else{
                    if(grid.getGridPiecesArr()[temp_row][temp_col] != '#'){
                        return false;
                    }
                }

            }

            if(possibles.get(second_piece_row) != null){

                if(possibles.get(second_piece_row) == second_piece_col){

                    return true;
                }

            }
        }

        return false ;

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

        return new Positions(first_piece, first_piece_row, first_piece_col, rows, cols);

    }
}
