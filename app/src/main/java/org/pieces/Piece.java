package org.pieces;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.example.Board;

public class Piece {

  public int col, row;
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

  Image sprite;

  protected int sheetScale = sheet.getWidth() / 6;

  Board board;

  public Piece(Board board) {
    this.board = board;
  }

  public void paint(Graphics2D g2d) {

    g2d.drawImage(sprite, xPos, yPos, null);

  }

}
