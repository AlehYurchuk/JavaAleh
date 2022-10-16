package work11;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Java Basic. HomeWork #006
 *
 *@author Aleh
 *@version 12.10.2022
 *@date 16.10.2022
 */

public class HomeWork011 extends JFrame {
    final int CANVAS_WIDTH = 600;
    final int CANVAS_HEIGHT = 500;

    final int DX = 100;
    int x, y, dx;
    Color color;

    List<Ball> balls;

    final private Color[] COLORS = {Color.magenta, Color.red, Color.green, Color.blue, Color.black};
    private Random random = new Random();

    public static void main(String[] args) {
        new HomeWork011();
    }

    public HomeWork011() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        CanvalsPanel canvalsPanel = new CanvalsPanel();
        canvalsPanel.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        canvalsPanel.setBackground(Color.white);

        initBalls();

//        addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyReleased(KeyEvent e) {
//                super.keyReleased(e);
//                System.out.println(e.getKeyCode());
//                switch (e.getKeyCode()) {
//                    case 32:
//                        randomXYColor();
//                        break;
//                    case 38:
//                        y -= 5;
//                        break;
//                    case 40:
//                        y +=5;
//                        break;
//                    case 37:
//                        x -= 5;
//                        break;
//                    case 39:
//                        x += 5;
//                        break;
//                }
//                canvalsPanel.repaint();
//            }
//        });

        canvalsPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                System.out.println(e.getX() + ":" + e.getY());
                for (int i = balls.size() - 1; i > -1; i--) {
                    if(balls.get(i).isInBall(e.getX(),  + e.getY())) {
                        balls.remove(i);
                        break;
                    }
                }
                canvalsPanel.repaint();
            }
        });

        randomXYColor();

        Button repaint = new Button("Repaint");
        repaint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Repaint");
                randomXYColor();
                canvalsPanel.repaint();
            }
        });
        Button left = new Button("Left");
        left.addActionListener(e ->{
            x -= 5;
            canvalsPanel.repaint();
        });
        Button right = new Button("Right");
        right.addActionListener(e ->{
            x += 5;
            canvalsPanel.repaint();
        });
        Button exit = new Button("Exit");
        exit.addActionListener(e -> System.exit(0));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(repaint);
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.add(exit);

        add(canvalsPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void randomXYColor() {
        color= COLORS[random.nextInt(COLORS.length)];
        x = random.nextInt(CANVAS_WIDTH - DX);
        y = random.nextInt(CANVAS_WIDTH - DX);
        dx = DX;
    }

    private void initBalls() {
        balls = new ArrayList<>();
        for(int i = 0; i < 200; i++) {
            Color color = COLORS[random.nextInt(COLORS.length)];
            int d = random.nextInt(100);
            x = random.nextInt(CANVAS_WIDTH - d);
            y = random.nextInt(CANVAS_WIDTH - d);
            balls.add(new Ball(x, y, d, color));
        }
    }

    private class CanvalsPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (Ball ball : balls) {
                ball.paint(g);
            }
        }
    }
}
