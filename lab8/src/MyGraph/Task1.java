package MyGraph;

import java.awt.*;
import javax.swing.*;

public class Task1 extends JFrame {

    public Task1(String title) {
        super(title);
        setSize(500, 500); 
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); 
        add(new GraphPanel()); 
        setVisible(true);
    }

    class GraphPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int w = getWidth();
            int h = getHeight();
            int x0 = w / 2; 
            int y0 = h / 2; 
            g.setColor(Color.BLACK);
            g.drawLine(0, y0, w, y0); 
            g.drawLine(x0, 0, x0, h);

            g.setColor(Color.LIGHT_GRAY);
            for (int i = 0; i < w; i += 20) g.drawLine(i, 0, i, h);
            for (int i = 0; i < h; i += 20) g.drawLine(0, i, w, i);

            g.setColor(Color.RED);
            double k = 0.5; 
            int scale = 40; 
            for (int i = -x0 / scale; i <= x0 / scale; i++) {
                int x = x0 + i * scale;
                int y = y0 - (int) (k * i * scale);
                g.fillOval(x, y, 3, 3); 
            }
        }
    }

    public static void main(String[] args) {
        new Task1("Task1: y = kx");
    }
}