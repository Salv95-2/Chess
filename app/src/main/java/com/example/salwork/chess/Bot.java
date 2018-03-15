package com.example.salwork.chess;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by SalWork on 3/10/18.
 */

public class Bot extends Player{

    Bot(Grid grid) {
        super(grid);
    }

    public ArrayList<Positions> blackPiecesPotentialPositions() {

        ArrayList<Positions> positions = new ArrayList<Positions>();
        Positions possibleMoves;

        //Left Rook
        piece = new Rook(new RookBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[0],
                blackPiecesLocation.getRows(grid)[0],blackPiecesLocation.getColumns(grid)[0]);
        positions.add(possibleMoves);

        //Left Knight
        piece = new Knight(new KnightBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[1],
                blackPiecesLocation.getRows(grid)[0],blackPiecesLocation.getColumns(grid)[1]);
        positions.add(possibleMoves);

        //Left Bishop
        piece = new Bishop(new BishopBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[2],
                blackPiecesLocation.getRows(grid)[0],blackPiecesLocation.getColumns(grid)[2]);
        positions.add(possibleMoves);

        //Queen
        piece = new Queen(new QueenBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[3],
                blackPiecesLocation.getRows(grid)[0],blackPiecesLocation.getColumns(grid)[3]);
        positions.add(possibleMoves);

        //King
        piece = new King(new KingBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[4],
                blackPiecesLocation.getRows(grid)[0],blackPiecesLocation.getColumns(grid)[4]);
        positions.add(possibleMoves);

        //Right Bishop
        piece = new Bishop(new BishopBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[5],
                blackPiecesLocation.getRows(grid)[0],blackPiecesLocation.getColumns(grid)[5]);
        positions.add(possibleMoves);

        //Right Knight
        piece = new Knight(new KnightBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[6],
                blackPiecesLocation.getRows(grid)[0],blackPiecesLocation.getColumns(grid)[6]);
        positions.add(possibleMoves);

        //Right Rook
        piece = new Rook(new RookBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[7],
                blackPiecesLocation.getRows(grid)[0],blackPiecesLocation.getColumns(grid)[7]);
        positions.add(possibleMoves);

        //Pawn 1 (from left to right)
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[8],
                blackPiecesLocation.getRows(grid)[1],blackPiecesLocation.getColumns(grid)[0]);
        positions.add(possibleMoves);

        //Pawn 2
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[9],
                blackPiecesLocation.getRows(grid)[1],blackPiecesLocation.getColumns(grid)[1]);
        positions.add(possibleMoves);

        //Pawn 3
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[10],
                blackPiecesLocation.getRows(grid)[1],blackPiecesLocation.getColumns(grid)[2]);
        positions.add(possibleMoves);

        //Pawn 4
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[11],
                blackPiecesLocation.getRows(grid)[1],blackPiecesLocation.getColumns(grid)[3]);
        positions.add(possibleMoves);

        //Pawn 5
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[12],
                blackPiecesLocation.getRows(grid)[1],blackPiecesLocation.getColumns(grid)[4]);
        positions.add(possibleMoves);

        //Pawn 6
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[13],
                blackPiecesLocation.getRows(grid)[1],blackPiecesLocation.getColumns(grid)[5]);
        positions.add(possibleMoves);

        //Pawn 7
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[14],
                blackPiecesLocation.getRows(grid)[1],blackPiecesLocation.getColumns(grid)[6]);
        positions.add(possibleMoves);

        //Pawn 8
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[15],
                blackPiecesLocation.getRows(grid)[1],blackPiecesLocation.getColumns(grid)[7]);
        positions.add(possibleMoves);

        return positions;
    }

//    row = new int[]{6,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7};
//    col = new int[]{0,1,2,3,4,5,6,7,0,1,2,3,4,5,6,7};
//    piece = new char[]{'P','P','P','P','P','P','P','P','R','H','B','Q','K','B','H','R'};
//    count = new int[]{8,2,2,2,1,1};

    public ArrayList<Positions> whitePiecesPotentialPositions() {

        ArrayList<Positions> positions = new ArrayList<Positions>();
        Positions possibleMoves;

        //Pawn 1 (from left to right)
        piece = new Pawn(new WhitePawnBehavior(grid));
        possibleMoves = piece.getPossibilities(whitePiecesLocation.getPiece(grid)[0],
                whitePiecesLocation.getRows(grid)[6],whitePiecesLocation.getColumns(grid)[0]);
        positions.add(possibleMoves);

        //Pawn 2
        piece = new Pawn(new WhitePawnBehavior(grid));
        possibleMoves = piece.getPossibilities(whitePiecesLocation.getPiece(grid)[1],
                whitePiecesLocation.getRows(grid)[6],whitePiecesLocation.getColumns(grid)[1]);
        positions.add(possibleMoves);

        //Pawn 3
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[2],
                blackPiecesLocation.getRows(grid)[6],blackPiecesLocation.getColumns(grid)[2]);
        positions.add(possibleMoves);

        //Pawn 4
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[3],
                blackPiecesLocation.getRows(grid)[6],blackPiecesLocation.getColumns(grid)[3]);
        positions.add(possibleMoves);

        //Pawn 5
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[4],
                blackPiecesLocation.getRows(grid)[6],blackPiecesLocation.getColumns(grid)[4]);
        positions.add(possibleMoves);

        //Pawn 6
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[5],
                blackPiecesLocation.getRows(grid)[6],blackPiecesLocation.getColumns(grid)[5]);
        positions.add(possibleMoves);

        //Pawn 7
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[6],
                blackPiecesLocation.getRows(grid)[6],blackPiecesLocation.getColumns(grid)[6]);
        positions.add(possibleMoves);

        //Pawn 8
        piece = new Pawn(new BlackPawnBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[7],
                blackPiecesLocation.getRows(grid)[6],blackPiecesLocation.getColumns(grid)[7]);
        positions.add(possibleMoves);

        //Left Rook
        piece = new Rook(new RookBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[8],
                blackPiecesLocation.getRows(grid)[7],blackPiecesLocation.getColumns(grid)[0]);
        positions.add(possibleMoves);

        //Left Knight
        piece = new Knight(new KnightBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[9],
                blackPiecesLocation.getRows(grid)[7],blackPiecesLocation.getColumns(grid)[1]);
        positions.add(possibleMoves);

        //Left Bishop
        piece = new Bishop(new BishopBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[10],
                blackPiecesLocation.getRows(grid)[7],blackPiecesLocation.getColumns(grid)[2]);
        positions.add(possibleMoves);

        //Queen
        piece = new Queen(new QueenBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[11],
                blackPiecesLocation.getRows(grid)[7],blackPiecesLocation.getColumns(grid)[3]);
        positions.add(possibleMoves);

        //King
        piece = new King(new KingBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[12],
                blackPiecesLocation.getRows(grid)[7],blackPiecesLocation.getColumns(grid)[4]);
        positions.add(possibleMoves);

        //Right Bishop
        piece = new Bishop(new BishopBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[13],
                blackPiecesLocation.getRows(grid)[7],blackPiecesLocation.getColumns(grid)[5]);
        positions.add(possibleMoves);

        //Right Knight
        piece = new Knight(new KnightBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[14],
                blackPiecesLocation.getRows(grid)[7],blackPiecesLocation.getColumns(grid)[6]);
        positions.add(possibleMoves);

        //Right Rook
        piece = new Rook(new RookBehavior(grid));
        possibleMoves = piece.getPossibilities(blackPiecesLocation.getPiece(grid)[15],
                blackPiecesLocation.getRows(grid)[7],blackPiecesLocation.getColumns(grid)[7]);
        positions.add(possibleMoves);

        Log.d("WhiteSize", String.valueOf(positions.size()));
        return positions;
    }

}


