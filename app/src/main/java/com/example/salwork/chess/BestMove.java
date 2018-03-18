package com.example.salwork.chess;

/**
 * Created by SalWork on 3/17/18.
 */

public class BestMove {

    private int current_row;
    private int current_col;
    private int best_move_row;
    private int best_move_col;
    private int evaluation;

    BestMove(int current_row, int current_col, int best_move_row, int best_move_col, int evaluation){

        this.current_row = current_row;
        this.current_col = current_col;
        this.best_move_row = best_move_row;
        this.best_move_col = best_move_col;
        this.evaluation = evaluation;
    }

    public int getCurrentRow(){

        return current_row;
    }

    public int getCurrentCol(){

        return current_col;
    }

    public int getBestMoveRow(){

        return best_move_row;
    }

    public int getBestMoveCol(){

        return best_move_col;
    }

    public int getEvaluation(){

        return evaluation;
    }


}
