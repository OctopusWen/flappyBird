package com.octopus.flappy;

import com.octopus.flappy.conmponent.Background;
import com.octopus.flappy.conmponent.StartMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.octopus.flappy.utils.Constant.*;

public class Game extends JFrame {
    public Game(){
        Container container = getContentPane();
        initFrame();
        setContentPane(container);
        setVisible(true);
    }
    public void paint(Graphics g){
        Background background = new Background();
        background.draw(g);
        StartMenu startMenu = new StartMenu();
        startMenu.draw(g);

    }
    private void initFrame(){
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setTitle(TITLE);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
