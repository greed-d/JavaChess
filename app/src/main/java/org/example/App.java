/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class App {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new GridBagLayout());
        frame.setMinimumSize(new Dimension(800, 800));
        frame.setLocationRelativeTo(null);

        Board board = new Board();
        frame.add(board);

        frame.setVisible(true);
    }
}
