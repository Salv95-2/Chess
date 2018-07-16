package com.example.salwork.chess;

import android.util.Log;

/**
 * Created by SalWork on 3/7/18.
 */

public class Grid {

    private char [][] gridPieces;
    private String [][] gridViewTags;
    private int [][] gridViewIds;

    private BlackPiecesLocation blackPiecesLocation;
    private WhitePiecesLocation whitePiecesLocation;



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

        gridViewTags = new String[][]{
                {"b_rook", "b_knight", "b_bishop", "b_queen", "b_king", "b_bishop", "b_knight", "b_rook"},
                {"b_pawn", "b_pawn", "b_pawn", "b_pawn", "b_pawn", "b_pawn", "b_pawn", "b_pawn"},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
                {"w_pawn", "w_pawn", "w_pawn", "w_pawn", "w_pawn", "w_pawn", "w_pawn", "w_pawn"},
                {"w_rook", "w_knight", "w_bishop", "w_queen", "w_king", "w_bishop", "w_knight", "w_rook"}
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
        whitePiecesLocation = new WhitePiecesLocation();

    }

    Grid(Grid old_grid){

        gridPieces = new char[][]{
                {'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'},//white: uppercase, black: lowercase
                {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
                {'#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', 'Q', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#'},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {'R', 'H', 'B', '#', 'K', 'B', 'H', 'R'}
        };

        gridViewTags = new String[][]{
                {"b_rook", "b_knight", "b_bishop", "b_queen", "b_king", "b_bishop", "b_knight", "b_rook"},
                {"b_pawn", "b_pawn", "b_pawn", "b_pawn", "b_pawn", "b_pawn", "b_pawn", "b_pawn"},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
                {"empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"},
                {"w_pawn", "w_pawn", "w_pawn", "w_pawn", "w_pawn", "w_pawn", "w_pawn", "w_pawn"},
                {"w_rook", "w_knight", "w_bishop", "w_queen", "w_king", "w_bishop", "w_knight", "w_rook"}
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


        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                this.gridPieces[i][j] =  old_grid.gridPieces[i][j];
                this.gridViewIds[i][j] =  old_grid.gridViewIds[i][j];
                this.gridViewTags[i][j] =  old_grid.gridViewTags[i][j];
            }
        }

        this.blackPiecesLocation =  new BlackPiecesLocation();
        this.whitePiecesLocation =  new WhitePiecesLocation();

        for(int i = 0; i < old_grid.getBlackPieceLocations().getRows(old_grid).length; i++){

            blackPiecesLocation.setRow(old_grid.blackPiecesLocation.getRows(old_grid));
            blackPiecesLocation.setCol(old_grid.blackPiecesLocation.getColumns(old_grid));
            blackPiecesLocation.setPiece(old_grid.blackPiecesLocation.getPiece(old_grid));
            blackPiecesLocation.setAlive(old_grid.blackPiecesLocation.getAlive(old_grid));
            blackPiecesLocation.setPiece(old_grid.blackPiecesLocation.getPiece(old_grid));
            blackPiecesLocation.setCount(old_grid.blackPiecesLocation.getCount(old_grid));

        }
    }

    public void updateViewIdAndTag(){

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){

                switch (gridPieces[i][j]){

                    case 'r': gridViewIds[i][j] = 2131099737;
                              gridViewTags[i][j] = "b_rook";
                              break;
                    case 'h': gridViewIds[i][j] = 2131099734;
                              gridViewTags[i][j] = "b_knight";
                              break;
                    case 'b': gridViewIds[i][j] = 2131099732;
                              gridViewTags[i][j] = "b_bishop";
                              break;
                    case 'q': gridViewIds[i][j] = 2131099736;
                              gridViewTags[i][j] = "b_queen";
                              break;
                    case 'k': gridViewIds[i][j] = 2131099733;
                              gridViewTags[i][j] = "b_king";
                              break;
                    case 'p': gridViewIds[i][j] = 2131099735;
                              gridViewTags[i][j] = "b_pawn";
                              break;
                    case 'R': gridViewIds[i][j] = 2131099760;
                              gridViewTags[i][j] = "b_rook";
                              break;
                    case 'H': gridViewIds[i][j] = 2131099757;
                              gridViewTags[i][j] = "w_knight";
                              break;
                    case 'B': gridViewIds[i][j] = 2131099755;
                              gridViewTags[i][j] = "w_bishop";
                              break;
                    case 'Q': gridViewIds[i][j] = 2131099759;
                              gridViewTags[i][j] = "w_queen";
                              break;
                    case 'K': gridViewIds[i][j] = 2131099756;
                              gridViewTags[i][j] = "w_king";
                              break;
                    case 'P': gridViewIds[i][j] = 2131099758;
                              gridViewTags[i][j] = "w_pawn";
                              break;
                    default:
                        gridViewIds[i][j] = 17170445;
                        gridViewTags[i][j] = "empty";
                        break;
                }
            }
        }

    }

    public int[][] getGridViewIdsArr(){

        updateViewIdAndTag();
        return gridViewIds;
    }

    public String[][] getGridViewTagsArr(){

        updateViewIdAndTag();
        return gridViewTags;
    }



    public char[][] getGridPiecesArr(){

        return gridPieces;
    }

    public void setGridPieces(char gridPieces[][]){

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){

                this.gridPieces[i][j] = gridPieces[i][j];
            }
        }
    }

    public void printGridArr(){

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){

                Log.d("Piece: ", String.valueOf(gridPieces[i][j]) + ": " + i + " : " + j);
            }
        }
    }

    public BlackPiecesLocation getBlackPieceLocations(){
        return  blackPiecesLocation;
    }

    public void printBlackPiecesLocations(){
        blackPiecesLocation.printLocations();
    }


    public WhitePiecesLocation getWhitePieceLocations(){
        return  whitePiecesLocation;
    }


    public void upDateLocation(int first_piece_row, int first_piece_col, int second_piece_row, int second_piece_col, Grid grid){


        blackPiecesLocation.upDateLocation(first_piece_row,first_piece_col,second_piece_row,second_piece_col,grid);

    }

    public void updateGridPiecesArr(int first_row, int first_col, int second_row, int second_col){

        gridPieces[second_row][second_col] = gridPieces[first_row][first_col];
        gridPieces[first_row][first_col] = '#';

    }
}
