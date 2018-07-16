package com.example.salwork.chess;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by SalWork on 7/4/18.
 */

public class PositionEvaluation {

    Grid grid;
    ArrayList<Positions> blacks_temp;
    ArrayList<Positions> whites_temp;
    ArrayList<Positions> blacks_original;//original black piece positions(Precautions need to be followed when modifying this);
    int current_black_piece;
    int row_col_curr_blk_piece;
    BlackPiecesLocation temp_black_piece_locations;
    WhitePiecesLocation white_piece_locations;

    PositionEvaluation(Grid grid, ArrayList<Positions> blacks_temp, ArrayList<Positions> whites_temp,
                       ArrayList<Positions> blacks_original, int current_black_piece, int row_col_curr_blk_piece,
                        BlackPiecesLocation temp_black_piece_locations,WhitePiecesLocation white_piece_locations){

        this.grid = grid;

        // not making copies, these are links to the arrays passed in
        this.blacks_temp = blacks_temp;
        this.whites_temp = whites_temp;
        this.blacks_original = blacks_original;
        this.current_black_piece = current_black_piece;
        this.row_col_curr_blk_piece = row_col_curr_blk_piece;
        this.temp_black_piece_locations = temp_black_piece_locations;
        this.white_piece_locations = white_piece_locations;
    }


    public void evaluateIntersections(){

        for (int x = 0; x < blacks_temp.size(); x++) {

            for(int a = 0; a < whites_temp.size(); a++){

                for(int b = 0; b < whites_temp.get(a).getRows().size(); b++){

                    //whites_temp = whitePiecesPotentialPositions(tempt_grid, tempt_grid.getWhitePieceLocations());

                    if(whites_temp.get(a).getRows().get(b) == blacks_temp.get(x).getCurrentRow() &&
                            whites_temp.get(a).getColumns().get(b) == blacks_temp.get(x).getCurrentCol()){

                        //sets position eval to one if the future move could be attacked
                        blacks_original.get(current_black_piece).setPositionEvalValtoNegativeOne(row_col_curr_blk_piece);
                    }
                }
            }
        }

    }

    // I have to evaluate the black pieces & white pieces before the white pieces make a move, then I need to compare that evaluation to the evaluation
    // of the white & black pieces after the white pieces have moved

    public void evaluateTotalPiecesOnEachTeam(){

        int count[] = temp_black_piece_locations.getCount(grid);
        char piece[] = temp_black_piece_locations.getPiece(grid);

        for(int i = 0; i < count.length; i++){

           // Log.d(String.valueOf(piece[i]), String.valueOf(count[i]));
        }

    }

    //I have to pretend that the white piece has made a move after the black piece has made his. Then I need to count all the white and
    //pieces left. Then I need to check the ratio. If the ration is worse with the move, then subtract from the original black pieces array.

    public void pretendWhitePiecesHaveMoved(){

    }
}
