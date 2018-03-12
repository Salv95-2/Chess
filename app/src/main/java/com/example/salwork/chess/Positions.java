package com.example.salwork.chess;

import java.util.ArrayList;

/**
 * Created by Sal on 3/11/18.
 */

public class Positions {


    ArrayList<Integer> rows;
    ArrayList<Integer> cols;

    Positions(ArrayList<Integer> rows, ArrayList<Integer> cols){

        this.rows = rows;
        this.cols = cols;
    }

    public ArrayList<Integer> getRows(){

        return rows;
    }

    public ArrayList<Integer> getColumns(){

        return cols;
    }
}