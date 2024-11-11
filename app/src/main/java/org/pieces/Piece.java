package org.pieces;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.example.Board;

public class Piece {

  public int col, rows;
  public int xPos, yPos;

  public boolean isWhite;
  public String name;
  public int value;

  BufferedImage sheet;
  {
    try {
      sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("pieces.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  Board board;

  public Piece(Board board) {
    this.board = board;
  }

}
