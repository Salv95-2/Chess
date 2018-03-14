package com.example.salwork.chess;

/**
 * Created by SalWork on 3/8/18.
 */

public class King extends Piece{

    King(Movement movement){
        super.movement = movement;
    }

    public void setMovement(Movement movement){
        super.movement = movement;
    }
}
