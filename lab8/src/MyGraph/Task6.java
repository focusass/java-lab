package MyGraph;

import java.awt.*;
import javax.swing.*;

public class Task6 extends JFrame {
    public Task6(String title) {
        super(title);
        setSize(500, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new GraphPanel());
        setVisible(true);
    }

    class GraphPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int w = getWidth(), h = getHeight();
            int x0 = w / 2, y0 = h / 2;

            g.setColor(Color.BLACK);
            g.drawLine(0, y0, w, y0);
            g.drawLine(x0, 0, x0, h);

            g.setColor(Color.LIGHT_GRAY);
            for