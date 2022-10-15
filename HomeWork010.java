package work10;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Java Basic. Home work #006
 *
 *@author Aleh
 *@version 10.10.2022
 *@date 15.10.2022
 */
public class HomeWork010 extends JFrame {

    final private Color[] COLORS = {Color.magenta, Color.red, Color.green, Color.blue, Color.black};
    private Random random = new Random();

    public static void main(String[] args) {
        new HomeWork010();
    }

    public HomeWork010() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 500);

        CanvalsPanel canvalsPanel = new CanvalsPanel();
        canvalsPanel.setBackground(Color.white);

        Button button = new Button("Repaint");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Repaint");
                canvalsPanel.repaint();
            }
        });

        add(canvalsPanel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private class CanvalsPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for(int i = 0; i < 200; i++) {
                g.setColor(COLORS[random.nextInt(COLORS.length)]);
                int x = random.nextInt(500);
                int y = random.nextInt(400);
                int dx = random.nextInt(100);
                int dy = random.nextInt(100);
                if (random.nextBoolean()) {
                    g.fillRect(x, y, dx, dy);
                } else {
                    g.fillOval(x, y, dx, dy);
                }
                g.fillOval(x, y, dx, dy);

            }

        }
    }
}
