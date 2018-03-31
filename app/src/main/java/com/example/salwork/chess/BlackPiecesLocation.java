package com.example.salwork.chess;

import android.util.Log;

/**
 * Created by SalWork on 3/14/18.
 */


public class BlackPiecesLocation {

    private int[] row;
    private int[] col;
    private char[] piece;
    private boolean[] alive;
    private int[] count;

    /*
        5 - Pawns
        0 - Rooks
        1 - Knights
        2 - Bishops
        3 - Queen
        4 - King **should never go lower than 1
     */

    BlackPiecesLocation(){

        row = new int[]{0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
        col = new int[]{0,1,2,3,4,5,6,7,0,1,2,3,4,5,6,7};
        piece = new char[]{'r','h','b','q','k','b','h','r','p','p','p','p','p','p','p','p'};
        alive = new boolean[]{true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true};
        count = new int[]{2,2,2,1,1,8};
    }

//    BlackPiecesLocation(BlackPiecesLocation blacks,Grid grid){
//
//        setRow(blacks.getRows(grid));
//        setCol(blacks.getColumns(grid));
//        setPiece(blacks.getPiece(grid));
//        setAlive(blacks.getAlive(grid));
//        setCount(blacks.getCount(grid));
//    }

    public void printCount(Grid grid){

        updateCount(grid);
        Log.d("Paws Count", String.valueOf(count[5]));
        Log.d("Rooks Count", String.valueOf(count[0]));
        Log.d("Knights Count", String.valueOf(count[1]));
        Log.d("Bishops Count", String.valueOf(count[2]));
        Log.d("Queen Count", String.valueOf(count[3]));
        Log.d("King Count", String.valueOf(count[4]));
    }

    public void updateCount(Grid grid){

        int tempCount[] = {0,0,0,0,0,0};

        for(int i = 0; i < 16; i++){

            piece[i] = grid.getGridPiecesArr()[row[i]][col[i]];
        }

        //Pawns
        for(int i = 8; i < 16; i++){

            if(piece[i] == 'p'){
                tempCount[5]++;
            }
            else {
                alive[i] = false;
            }
        }
        //Rooks
        if(piece[0] == 'r'){
            tempCount[0]++;
        }
        else {
            alive[0] = false;
        }

        if(piece[7] == 'r'){
            tempCount[0]++;
        }
        else {
            alive[7] = false;
        }
        //Knights
        if(piece[1] == 'h'){
            tempCount[1]++;
        }
        else {
            alive[1] = false;
        }
        if(piece[6] == 'h'){
            tempCount[1]++;
        }
        else {
            alive[6] = false;
        }
        //Bishops
        if(piece[2] == 'b'){
            tempCount[2]++;
        }
        else {
            alive[2] = false;
        }
        if(piece[5] == 'b'){
            tempCount[2]++;
        }
        else {
            alive[5] = false;
        }
        //Queen
        if(piece[3] == 'q'){
            tempCount[3]++;
        }
        else {
            alive[3] = false;
        }
        //King
        if(piece[4] == 'k'){
            tempCount[4]++;
        }
        else {
            alive[4] = false;
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

    int getAliveCount(){

        int count = 0;
        for(int i = 0; i < alive.length; i++){

            if(alive[i]){
                count++;
            }
        }
        return count;
    }

    void setRow(int [] row){

        for(int i = 0; i < row.length; i++){
            this.row[i] = row[i];
        }
    }

    void setCol(int [] col){

        for(int i = 0; i < col.length; i++){
            this.col[i] = col[i];
        }
    }

    void setPiece(char [] piece){

        for(int i = 0; i < piece.length; i++){
            this.piece[i] = piece[i];
        }
    }

    void setAlive(boolean [] alive){

        for(int i = 0; i < alive.length; i++){
            this.alive[i] = alive[i];
        }
    }

    void setCount(int [] count){

        for(int i = 0; i < count.length; i++){
            this.count[i] = count[i];
        }
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

