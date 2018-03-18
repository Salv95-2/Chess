package com.example.salwork.chess;

import android.util.Log;

/**
 * Created by SalWork on 3/7/18.
 */

public class Grid {

    private char [][] gridPieces;
    private int [][] gridViewIds;
    protected BlackPiecesLocation blackPiecesLocation;


    int size = 8;


    Grid(){
        gridPieces = new char[][]{
                {'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'},//white: uppercase, black: lowercase
                {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
                {'#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#'},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {'R', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'}
        };

        gridViewIds = new int[][]{
                {2131099737, 2131099734, 2131099732, 2131099736, 2131099733, 2131099732, 2131099734, 2131099737},
                {2131099735, 2131099735, 2131099735, 2131099735, 2131099735, 2131099735, 2131099735, 2131099735},
                {17170445, 17170445, 17170445, 17170445, 17170445, 17170445, 17170445, 17170445},
                {17170445, 17170445, 17170445, 17170445, 17170445, 17170445, 17170445, 17170445},
                {17170445, 17170445, 17170445, 17170445, 17170445, 17170445, 17170445, 17170445},
                {17170445, 17170445, 17170445, 17170445, 17170445, 17170445, 17170445, 17170445},
                {2131099758, 2131099758, 2131099758, 2131099758, 2131099758, 2131099758, 2131099758, 2131099758},
                {2131099760, 2131099757, 2131099755, 2131099759, 2131099756, 2131099755, 2131099757, 2131099760}
        };

        blackPiecesLocation = new BlackPiecesLocation();
    }

    public void updateVieIds(){

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){

                switch (gridPieces[i][j]){

                    case 'r': gridViewIds[i][j] = 2131099737;
                              break;
                    case 'h': gridViewIds[i][j] = 2131099734;
                              break;
                    case 'b': gridViewIds[i][j] = 2131099732;
                              break;
                    case 'q': gridViewIds[i][j] = 2131099736;
                              break;
                    case 'k': gridViewIds[i][j] = 2131099733;
                              break;
                    case 'p': gridViewIds[i][j] = 2131099735;
                              break;

                    case 'R': gridViewIds[i][j] = 2131099760;
                        break;
                    case 'H': gridViewIds[i][j] = 2131099757;
                        break;
                    case 'B': gridViewIds[i][j] = 2131099755;
                        break;
                    case 'Q': gridViewIds[i][j] = 2131099759;
                        break;
                    case 'K': gridViewIds[i][j] = 2131099756;
                        break;
                    case 'P': gridViewIds[i][j] = 2131099758;
                        break;

                    default: gridViewIds[i][j] = 17170445;
                        break;
                }
            }
        }

    }

    public int[][] getGridViewIdsArr(){

        updateVieIds();
        return gridViewIds;
    }



    public char[][] getGridPiecesArr(){

        return gridPieces;
    }

    public void printGridArr(){

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){

                Log.d("Piece: ", String.valueOf(gridPieces[i][j]) + ": " + i + " : " + j);
            }
        }
    }

    public void updateGridPiecesArr(int first_row, int first_col, int second_row, int second_col){

        gridPieces[second_row][second_col] = gridPieces[first_row][first_col];
        gridPieces[first_row][first_col] = '#';
    }
}
