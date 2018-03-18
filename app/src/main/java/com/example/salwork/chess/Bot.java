package com.example.salwork.chess;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by SalWork on 3/10/18.
 */

public class Bot extends Player{

    ArrayList<Positions> blacks;
    ArrayList<Positions> whites;

    Bot(Grid grid) {
        super(grid);
    }



    public ArrayList<Positions> blackPiecesPotentialPositions(Grid temp_grid, BlackPiecesLocation temp_black_piecesLocations) {
        ArrayList<Positions> positions = new ArrayList<Positions>();
        Positions possibleMoves;

        //Left Rook
        if(temp_black_piecesLocations.getAlive(temp_grid)[0]){// if left rook is alive
            piece = new Rook(new RookBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[0],
                    temp_black_piecesLocations.getRows(temp_grid)[0],temp_black_piecesLocations.getColumns(temp_grid)[0]);
            positions.add(possibleMoves);
        }

        //Left Knight
        if(temp_black_piecesLocations.getAlive(temp_grid)[1]){
            piece = new Knight(new KnightBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[1],
                    temp_black_piecesLocations.getRows(temp_grid)[1],temp_black_piecesLocations.getColumns(temp_grid)[1]);
            positions.add(possibleMoves);
        }

        //Left Bishop
       if(temp_black_piecesLocations.getAlive(temp_grid)[2]){
           piece = new Bishop(new BishopBehavior(temp_grid));
           possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[2],
                   temp_black_piecesLocations.getRows(temp_grid)[2],temp_black_piecesLocations.getColumns(temp_grid)[2]);
           positions.add(possibleMoves);
       }
        //Queen
        if(temp_black_piecesLocations.getAlive(temp_grid)[3]){
            piece = new Queen(new QueenBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[3],
                    temp_black_piecesLocations.getRows(temp_grid)[3],temp_black_piecesLocations.getColumns(temp_grid)[3]);
            positions.add(possibleMoves);
        }

        //King
        if(temp_black_piecesLocations.getAlive(temp_grid)[4]){
            piece = new King(new KingBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[4],
                    temp_black_piecesLocations.getRows(temp_grid)[4],temp_black_piecesLocations.getColumns(temp_grid)[4]);
            positions.add(possibleMoves);
        }

        //Right Bishop
        if(temp_black_piecesLocations.getAlive(temp_grid)[5]){
            piece = new Bishop(new BishopBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[5],
                    temp_black_piecesLocations.getRows(temp_grid)[5],temp_black_piecesLocations.getColumns(temp_grid)[5]);
            positions.add(possibleMoves);
        }

        //Right Knight
        if(temp_black_piecesLocations.getAlive(temp_grid)[6]) {
            piece = new Knight(new KnightBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[6],
                    temp_black_piecesLocations.getRows(temp_grid)[6], temp_black_piecesLocations.getColumns(temp_grid)[6]);
            positions.add(possibleMoves);
        }

        //Right Rook
        if(temp_black_piecesLocations.getAlive(temp_grid)[7]) {
            piece = new Rook(new RookBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[7],
                    temp_black_piecesLocations.getRows(temp_grid)[7], temp_black_piecesLocations.getColumns(temp_grid)[7]);
            positions.add(possibleMoves);
        }

        //Pawn 1 (from left to right)
        if(temp_black_piecesLocations.getAlive(temp_grid)[8]) {
            piece = new Pawn(new BlackPawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[8],
                    temp_black_piecesLocations.getRows(temp_grid)[8], temp_black_piecesLocations.getColumns(temp_grid)[8]);
            positions.add(possibleMoves);
        }

        //Pawn 2
        if(temp_black_piecesLocations.getAlive(temp_grid)[9]) {
            piece = new Pawn(new BlackPawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[9],
                    temp_black_piecesLocations.getRows(temp_grid)[9], temp_black_piecesLocations.getColumns(temp_grid)[9]);
            positions.add(possibleMoves);
        }

        //Pawn 3
        if(temp_black_piecesLocations.getAlive(temp_grid)[10]) {
            piece = new Pawn(new BlackPawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[10],
                    temp_black_piecesLocations.getRows(temp_grid)[10], temp_black_piecesLocations.getColumns(temp_grid)[10]);
            positions.add(possibleMoves);
        }

        //Pawn 4
        if(temp_black_piecesLocations.getAlive(temp_grid)[11]) {
            piece = new Pawn(new BlackPawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[11],
                    temp_black_piecesLocations.getRows(temp_grid)[11], temp_black_piecesLocations.getColumns(temp_grid)[11]);
            positions.add(possibleMoves);
        }

        //Pawn 5
        if(temp_black_piecesLocations.getAlive(temp_grid)[12]) {
            piece = new Pawn(new BlackPawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[12],
                    temp_black_piecesLocations.getRows(temp_grid)[12], temp_black_piecesLocations.getColumns(temp_grid)[12]);
            positions.add(possibleMoves);
        }

        //Pawn 6
        if(temp_black_piecesLocations.getAlive(temp_grid)[13]) {
            piece = new Pawn(new BlackPawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[13],
                    temp_black_piecesLocations.getRows(temp_grid)[13], temp_black_piecesLocations.getColumns(temp_grid)[13]);
            positions.add(possibleMoves);
        }

        //Pawn 7
        if(temp_black_piecesLocations.getAlive(temp_grid)[14]) {
            piece = new Pawn(new BlackPawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[14],
                    temp_black_piecesLocations.getRows(temp_grid)[14], temp_black_piecesLocations.getColumns(temp_grid)[14]);
            positions.add(possibleMoves);
        }

        //Pawn 8
        if(temp_black_piecesLocations.getAlive(temp_grid)[15]) {
            piece = new Pawn(new BlackPawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_black_piecesLocations.getPiece(temp_grid)[15],
                    temp_black_piecesLocations.getRows(temp_grid)[15], temp_black_piecesLocations.getColumns(temp_grid)[15]);
            positions.add(possibleMoves);
        }

        return positions;
    }

    public ArrayList<Positions> whitePiecesPotentialPositions(Grid temp_grid, WhitePiecesLocation temp_white_piece_locations) {

        ArrayList<Positions> positions = new ArrayList<Positions>();
        Positions possibleMoves;

        //Pawn 1 (from left to right)
        if(temp_white_piece_locations.getAlive(temp_grid)[0]){
            piece = new Pawn(new WhitePawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[0],
                    temp_white_piece_locations.getRows(temp_grid)[0],temp_white_piece_locations.getColumns(temp_grid)[0]);
            positions.add(possibleMoves);
        }

        //Pawn 2
        if(temp_white_piece_locations.getAlive(temp_grid)[1]) {
            piece = new Pawn(new WhitePawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[1],
                    temp_white_piece_locations.getRows(temp_grid)[1], temp_white_piece_locations.getColumns(temp_grid)[1]);
            positions.add(possibleMoves);
        }

        //Pawn 3
        if(temp_white_piece_locations.getAlive(temp_grid)[2]) {
            piece = new Pawn(new WhitePawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[2],
                    temp_white_piece_locations.getRows(temp_grid)[2], temp_white_piece_locations.getColumns(temp_grid)[2]);
            positions.add(possibleMoves);
        }

        //Pawn 4
        if(temp_white_piece_locations.getAlive(temp_grid)[3]) {
            piece = new Pawn(new WhitePawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[3],
                    temp_white_piece_locations.getRows(temp_grid)[3], temp_white_piece_locations.getColumns(temp_grid)[3]);
            positions.add(possibleMoves);
        }

        //Pawn 5
        if(temp_white_piece_locations.getAlive(temp_grid)[4]) {
            piece = new Pawn(new WhitePawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[4],
                    temp_white_piece_locations.getRows(temp_grid)[4], temp_white_piece_locations.getColumns(temp_grid)[4]);
            positions.add(possibleMoves);
        }

        //Pawn 6
        if(temp_white_piece_locations.getAlive(temp_grid)[5]) {
            piece = new Pawn(new WhitePawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[5],
                    temp_white_piece_locations.getRows(temp_grid)[5], temp_white_piece_locations.getColumns(temp_grid)[5]);
            positions.add(possibleMoves);
        }

        //Pawn 7
        if(temp_white_piece_locations.getAlive(temp_grid)[6]) {
            piece = new Pawn(new WhitePawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[6],
                    temp_white_piece_locations.getRows(temp_grid)[6], temp_white_piece_locations.getColumns(temp_grid)[6]);
            positions.add(possibleMoves);
        }

        //Pawn 8
        if(temp_white_piece_locations.getAlive(temp_grid)[7]) {
            piece = new Pawn(new WhitePawnBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[7],
                    temp_white_piece_locations.getRows(temp_grid)[7], temp_white_piece_locations.getColumns(temp_grid)[7]);
            positions.add(possibleMoves);
        }

        //Left Rook
        if(temp_white_piece_locations.getAlive(temp_grid)[8]) {
            piece = new Rook(new RookBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[8],
                    temp_white_piece_locations.getRows(temp_grid)[8], temp_white_piece_locations.getColumns(temp_grid)[8]);
            positions.add(possibleMoves);
        }

        //Left Knight
        if(temp_white_piece_locations.getAlive(temp_grid)[9]) {
            piece = new Knight(new KnightBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[9],
                    temp_white_piece_locations.getRows(temp_grid)[9], temp_white_piece_locations.getColumns(temp_grid)[9]);
            positions.add(possibleMoves);
        }

        //Left Bishop
        if(temp_white_piece_locations.getAlive(temp_grid)[10]) {
            piece = new Bishop(new BishopBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[10],
                    temp_white_piece_locations.getRows(temp_grid)[10], temp_white_piece_locations.getColumns(temp_grid)[10]);
            positions.add(possibleMoves);
        }

        //Queen
        if(temp_white_piece_locations.getAlive(temp_grid)[11]) {
            piece = new Queen(new QueenBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[11],
                    temp_white_piece_locations.getRows(temp_grid)[11], temp_white_piece_locations.getColumns(temp_grid)[11]);
            positions.add(possibleMoves);
        }

        //King
        if(temp_white_piece_locations.getAlive(temp_grid)[12]) {
            piece = new King(new KingBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[12],
                    temp_white_piece_locations.getRows(temp_grid)[12], temp_white_piece_locations.getColumns(temp_grid)[12]);
            positions.add(possibleMoves);
        }

        //Right Bishop
        if(temp_white_piece_locations.getAlive(temp_grid)[13]) {
            piece = new Bishop(new BishopBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[13],
                    temp_white_piece_locations.getRows(temp_grid)[13], temp_white_piece_locations.getColumns(temp_grid)[13]);
            positions.add(possibleMoves);
        }

        //Right Knight
        if(temp_white_piece_locations.getAlive(temp_grid)[14]) {
            piece = new Knight(new KnightBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[14],
                    temp_white_piece_locations.getRows(temp_grid)[14], temp_white_piece_locations.getColumns(temp_grid)[14]);
            positions.add(possibleMoves);
        }

        //Right Rook
        if(temp_white_piece_locations.getAlive(temp_grid)[15]) {
            piece = new Rook(new RookBehavior(temp_grid));
            possibleMoves = piece.getPossibilities(temp_white_piece_locations.getPiece(temp_grid)[15],
                    temp_white_piece_locations.getRows(temp_grid)[15], temp_white_piece_locations.getColumns(temp_grid)[15]);
            positions.add(possibleMoves);
        }

        return positions;
    }

    public Grid evaluateBlackPositions(){

        countBlackWhitePieceIntersections();

        BestMove best_move = getRandomMaxMove();

        grid.updateGridPiecesArr(best_move.getCurrentRow(), best_move.getCurrentCol(),
                best_move.getBestMoveRow(), best_move.getBestMoveCol());
        grid.blackPiecesLocation.upDateLocation(best_move.getCurrentRow(), best_move.getCurrentCol(),
                best_move.getBestMoveRow(), best_move.getBestMoveCol(), grid);

//        grid.blackPiecesLocation.printLocations();

        return grid;

    }

    public BestMove getRandomMaxMove(){

        int max = -1000;
        ArrayList<BestMove> best_move = new ArrayList<BestMove>();

        for(int i = 0; i < blacks.size(); i++) {//run through every black position object

//            Log.d("BesMovePiece", String.valueOf(blacks.get(i).getCurrentPiece()));
            for (int s = 0; s < blacks.get(i).getRows().size(); s++) {

                Log.d("MoveRows", String.valueOf(blacks.get(i).getRows().get(s)));
                Log.d("MoveCols", String.valueOf(blacks.get(i).getColumns().get(s)));
                Log.d("MoveEval", String.valueOf(blacks.get(i).getPositionEvalVal().get(s)));
                if(blacks.get(i).getPositionEvalVal().get(s) > max){

                    max = blacks.get(i).getPositionEvalVal().get(s);

                }

            }

        }

        for(int i = 0; i < blacks.size(); i++) {//run through every black position object

            for (int s = 0; s < blacks.get(i).getRows().size(); s++) {

                if(blacks.get(i).getPositionEvalVal().get(s) == max){

                    best_move.add(new BestMove(blacks.get(i).getCurrentRow(), blacks.get(i).getCurrentCol(),
                            blacks.get(i).getRows().get(s), blacks.get(i).getColumns().get(s),blacks.get(i).getPositionEvalVal().get(s)));

                }

            }

        }

            Log.d("MovesAmt", String.valueOf(best_move.size()));
            Random rand = new Random();
            int  index = rand.nextInt(best_move.size() - 1) + 0;

            return best_move.get(index);


    }


    public void countBlackWhitePieceIntersections(){

        blacks = blackPiecesPotentialPositions(grid,grid.blackPiecesLocation);
        whites = whitePiecesPotentialPositions(grid, whitePiecesLocation);


        for(int i = 0; i < blacks.size(); i++){//run through every black position object

            for(int s = 0; s < blacks.get(i).getRows().size(); s++){//run through every row & col element for a black position object

                for(int j = 0; j < whites.size(); j++){//run through every white position object


                    for(int a = 0; a < whites.get(j).getRows().size(); a++){//run through every row & col element for a white position object

                        if(blacks.get(i).getRows().get(s) == whites.get(j).getRows().get(a) &&
                                blacks.get(i).getColumns().get(s) == whites.get(j).getColumns().get(a)){

                            blacks.get(i).subtractOneFromPositionEvalVal(s);
                        }
                    }
                }
            }
        }



    }

}


