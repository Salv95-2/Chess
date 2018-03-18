package com.example.salwork.chess;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Sal on 3/11/18.
 */

public class Positions {


    private ArrayList<Integer> rows;
    private ArrayList<Integer> cols;
    private ArrayList<Integer> positionEvalVal;

    private char current_piece;
    private int current_row;
    private int current_col;

    Positions(char current_piece, int current_row, int current_col, ArrayList<Integer> rows, ArrayList<Integer> cols){

        this.current_piece = current_piece;
        this.current_row = current_row;
        this.current_col = current_col;
        this.rows = rows;
        this.cols = cols;

        positionEvalVal = new ArrayList<Integer>();
        for(int i = 0; i < this.rows.size(); i++){
            positionEvalVal.add(0);
        }
    }

    public void printPositionEvalVal(){

        Log.d("Piece", String.valueOf(current_piece));

        for(int i = 0; i < positionEvalVal.size(); i++){
            Log.d((current_piece + " - posVal:"), String.valueOf(positionEvalVal.get(i)));
        }
    }

    public void printRowsAnfCols(){

        Log.d("Current Pience: ", String.valueOf(current_piece));
        Log.d("Current row: ", String.valueOf(current_row));
        Log.d("Current col: ", String.valueOf(current_col));

        for(int i = 0; i < rows.size(); i++){
            Log.d((current_piece + " - rows:"), String.valueOf(rows.get(i)));
            Log.d((current_piece + " - cols:"), String.valueOf(cols.get(i)));
        }
    }

    public char getCurrentPiece(){
        return current_piece;
    }

    public int getCurrentRow(){
        return current_row;
    }

    public int getCurrentCol(){
        return current_col;
    }

    public ArrayList<Integer> getRows(){

        return rows;
    }

    public ArrayList<Integer> getColumns(){

        return cols;
    }

    public ArrayList<Integer> getPositionEvalVal(){
        return positionEvalVal;
    }

    public void addOneToPositionEvalVal(int index){

        positionEvalVal.set(index, positionEvalVal.get(index) + 1);
    }

    public void subtractOneFromPositionEvalVal(int index){

        positionEvalVal.set(index, positionEvalVal.get(index) - 1);
    }

}