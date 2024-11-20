package org.example;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import org.pieces.Piece;

public class Input extends MouseAdapter {

    Board board;

    public Input(Board board) {
        this.board = board;
    }

    @Override
    public void MousePressed(MouseEvent e) {

        int col = e.getX() / board.tileSize;
        int row = e.getY() / board.tileSize;

        Piece pieceXY = board.getPiece(col, row);

        if (pieceXY != null) {
            board.selectedPiece = pieceXY;
        }

    }

    @Override
    public void MouseReleased(MouseEvent e) {

    }

    @Override
    public void MouseDragged(MouseEvent e) {

    }

}
