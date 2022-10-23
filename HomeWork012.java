package work12;

import work12.TicTacToe;

import javax.swing.*;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * Java Basic. Homework #012
 *
 *@author Aleh
 *@version 17.10.2022
 *@date 23.10.2022
 */

public class HomeWork012 extends JFrame {
    private final int PANEL_SIZE = 500;
    private final int CELL_SIZE = PANEL_SIZE / 3;
    private boolean gameOver = false;

    public static void main(String[] args) {
        new HomeWork012();
    }

    public  HomeWork012() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        TicTacToe.init();

        PaintPanel paintPanel = new PaintPanel();
        paintPanel.setBackground(Color.lightGray);
        paintPanel.setPreferredSize(new Dimension(PANEL_SIZE, PANEL_SIZE));
        paintPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX() / CELL_SIZE ;
                int y = e.getY() / CELL_SIZE ;

                if (TicTacToe.isCellValid(x, y) && !gameOver) {
                    TicTacToe.table[y][x] = 'x';
                    if (TicTacToe.isWin('x')) {
                        System.out.println("YOU WIN");
                        gameOver = true;
                    }
                    if (TicTacToe.isTableFull()) {
                        System.out.println("Sorry, DRAW!");
                        gameOver = true;
                    }
                    if (!gameOver){
                        TicTacToe.turnAI();
                        if (TicTacToe.isWin('o')) {
                            System.out.println("AI WIN");
                            gameOver = true;
                        }
                        if (TicTacToe.isTableFull()) {
                            System.out.println("Sorry, DRAW!");
                            gameOver = true;
                        }
                    }
                    paintPanel.repaint();
                }
            }
        });


        Button restart = new Button("Restart");
        restart.addActionListener(e -> {
            TicTacToe.init();
            gameOver = false;
            paintPanel.repaint();
        });
        Button exit = new Button("Exit");
        exit.addActionListener(e -> System.exit(0));



        JPanel btnPanel = new JPanel();
        btnPanel.add(restart);
        btnPanel.add(exit);

        add(paintPanel, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

       private class PaintPanel extends JPanel {
        @Override
        public void  paint(Graphics g) {
            super.paint(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setStroke(new BasicStroke(16f));
            g2.setColor(Color.gray);
            for (int i = 1; i < 3; i++) {
                g.drawLine(0, CELL_SIZE * i, PANEL_SIZE, CELL_SIZE * i);
                g.drawLine(CELL_SIZE * i, 0, CELL_SIZE * i, PANEL_SIZE);
            }
            g2.setStroke(new BasicStroke(10f));
            for (int y = 0; y < 3; y++) {
                for (int x = 0; x < 3; x++) {
                    if (TicTacToe.table[y][x] == 'x') {
                        g2.setColor(Color.blue);
                        g2.drawLine(x * CELL_SIZE + CELL_SIZE/5,
                                y * CELL_SIZE + CELL_SIZE/5,
                                (x + 1) * CELL_SIZE - CELL_SIZE/5,
                                (y + 1) * CELL_SIZE - CELL_SIZE/5);
                        g2.drawLine((x + 1) * CELL_SIZE - CELL_SIZE/5,
                                y * CELL_SIZE + CELL_SIZE/5,
                                x * CELL_SIZE + CELL_SIZE/5,
                                (y + 1) * CELL_SIZE - CELL_SIZE/5);
                    }
                    if (TicTacToe.table[y][x] == 'o') {
                        g2.setColor(Color.red);
                        g2.drawOval(x * CELL_SIZE + CELL_SIZE/5,
                                y * CELL_SIZE + CELL_SIZE/5,
                                CELL_SIZE - CELL_SIZE/5*2,
                                CELL_SIZE - CELL_SIZE/5*2);
                    }
                }
            }
        }
    }
}
