package com.example.salwork.chess;

import android.util.Log;

/**
 * Created by SalWork on 3/14/18.
 */


public class WhitePiecesLocation {

    private int[] row;
    private int[] col;
    private char[] piece;
    private boolean[] alive;
    private int[] count;

    /*
        0 - Pawns
        1 - Rooks
        2 - Knights
        3 - Bishops
        4 - Queen
        5 - King **should never go lower than 1
     */

    WhitePiecesLocation(){

        row = new int[]{6,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7};
        col = new int[]{0,1,2,3,4,5,6,7,0,1,2,3,4,5,6,7};
        piece = new char[]{'P','P','P','P','P','P','P','P','R','H','B','Q','K','B','H','R'};
        alive = new boolean[]{true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
        count = new int[]{8,2,2,2,1,1};
    }

    public void printCount(Grid grid){

        updateCount(grid);
        Log.d("Paws Count", String.valueOf(count[0]));
        Log.d("Rooks Count", String.valueOf(count[1]));
        Log.d("Knights Count", String.valueOf(count[2]));
        Log.d("Bishops Count", String.valueOf(count[3]));
        Log.d("Queen Count", String.valueOf(count[4]));
        Log.d("King Count", String.valueOf(count[5]));
    }

    public void updateCount(Grid grid){//problems

        int tempCount[] = {0,0,0,0,0,0};

        for(int i = 0; i < 16; i++){

            piece[i] = grid.getGridPiecesArr()[row[i]][col[i]];
        }

        //Pawns
        for(int i = 0; i < 8; i++){

            if(piece[i] == 'P'){
                tempCount[0]++;
            }
            else {
                alive[i] = false;
            }
        }
        //Rooks
        if(piece[8] == 'R'){
            tempCount[1]++;
        }
        else {
            alive[8] = false;
        }
        if(piece[15] == 'R'){
            tempCount[1]++;
        }
        else {
            alive[15] = false;
        }
        //Knights
        if(piece[9] == 'H'){
            tempCount[2]++;
        }
        else {
            alive[9] = false;
        }
        if(piece[14] == 'H'){
            tempCount[2]++;
        }
        else {
            alive[14] = false;
        }
        //Bishops
        if(piece[10] == 'B'){
            tempCount[3]++;
        }
        else {
            alive[10] = false;
        }
        if(piece[13] == 'B'){
            tempCount[3]++;
        }
        else {
            alive[13] = false;
        }
        //Queen
        if(piece[11] == 'Q'){
            tempCount[4]++;
        }
        else {
            alive[11] = false;
        }
        //King
        if(piece[12] == 'K'){
            tempCount[5]++;
        }
        else {
            alive[12] = false;
        }

        count = tempCount;

    }


    int[] getRows(Grid grid){

        updateCount(grid);
        return row;
    }

    int[] getColumns(Grid grid){

        updateCount(grid);
        return col;
    }

    int[] getCount(Grid grid){

        updateCount(grid);
        return count;
    }

    char[] getPiece(Grid grid){

        updateCount(grid);
        return piece;
    }

    boolean[] getAlive(Grid grid){
        updateCount(grid);
        return alive;
    }



    public void printLocations(){

        int row_temp = 0;
        int col_temp = 0;
        String together = "";

        for(int i = 0; i < 16; i++){

            row_temp = row[i];
            col_temp = col[i];
            together = "Row: " + Integer.toString(row_temp) + " - " + "Col: " + Integer.toString(col_temp) + " Piece: " + piece[i];
            Log.d("White piece Location: ", together);
        }
    }

    public void upDateLocation(int first_piece_row, int first_piece_col, int second_piece_row, int second_piece_col, Grid grid){


        for(int i = 0; i < 16; i++){

            if(row[i] == first_piece_row && col[i] == first_piece_col){

                row[i] = second_piece_row;
                col[i] = second_piece_col;
                piece[i] = grid.getGridPiecesArr()[row[i]][col[i]];
            }
        }

    }


}

