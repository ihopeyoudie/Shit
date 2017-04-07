package net.dzirt.routers.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Андрей on 05.04.2017.
 */
public class GraphicsPanel extends JPanel {

    private Line line;
    Graphics2D g2;

    public GraphicsPanel() {
        //line = new Line(10,10,100,100);
    }

    @Override
    public void paintComponent(Graphics g) {
        g2 = (Graphics2D)g;
        g2.drawOval(100,200,20,20);
    }

    public void drawCircle(int x, int y, int width, int height){
    }
}
