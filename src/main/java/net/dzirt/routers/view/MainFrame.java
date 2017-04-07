package net.dzirt.routers.view;

import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Андрей on 05.04.2017.
 */
public class MainFrame extends JFrame {

    private JPanel panel;
    private JButton buttonTest;

    public MainFrame() throws HeadlessException {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().setLayout(null);

//        panel = new JPanel();
//        panel.setBounds(0,0,400,400);
//        //panel.bor;
//        getContentPane().add(panel);
//
//        buttonTest = new JButton("TEST");
//        buttonTest.setBounds(400,60,100,30);
//        getContentPane().add(buttonTest);

        GraphicsPanel gp = new GraphicsPanel();
        gp.setBounds(10,10,410,410);
        getContentPane().add(gp);

        //gp.drawCircle(200,200,50,50);

        setBounds(100,100,1000,600);

    }

    public void display() {
        this.setVisible(true);
    }


}
