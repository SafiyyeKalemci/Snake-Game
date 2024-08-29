/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakegame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static snakegame.GamePanel.SCREEN_HEIGHT;
import static snakegame.GamePanel.SCREEN_WIDTH;

/**
 *
 * @author MONSTER
 */
public class StartPanel extends JPanel {

    private GameFrame frame;

    StartPanel(GameFrame frame) {
        this.frame = frame;
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.setLayout(null);

        JLabel lblTitle = new JLabel("Snake Game", SwingConstants.CENTER);
        lblTitle.setForeground(Color.green);
        lblTitle.setFont(new Font("Ink Free", Font.BOLD, 70));
        lblTitle.setBounds(50, 200, 500, 100);
        this.add(lblTitle);

        JLabel lblMessage = new JLabel("Press any key to continue", SwingConstants.CENTER);
        lblMessage.setForeground(Color.white);
        lblMessage.setFont(new Font("Ink Free", Font.BOLD, 20));
        lblMessage.setBounds(100, 250, 400, 200);
        this.add(lblMessage);

        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                frame.showGamePanel();
            }
        });

    }

}
