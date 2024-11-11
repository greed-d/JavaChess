package org.example;

import java.awt.*;

import javax.swing.JPanel;

public class Board extends JPanel {
    public int tileSize = 100;

    int rows = 8;
    int cols = 8;

    public Board() {
        this.setPreferredSize(new Dimension(cols * tileSize, rows * tileSize));
        // this.setBackground(Color.green);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++) {
                g2d.setColor((c + r) % 2 == 0 ? Color.white : Color.black);
                g2d.fillRect(c * tileSize, r * tileSize, tileSize, tileSize);

            }
    }

}
