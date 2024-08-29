package snakegame;

import java.awt.CardLayout;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MONSTER
 */
public class GameFrame extends JFrame {

    CardLayout cardLayout;
    StartPanel startPanel;
    GamePanel gamePanel;

    GameFrame() {
        cardLayout = new CardLayout();
        this.setLayout(cardLayout);

        startPanel = new StartPanel(this);
        this.add(startPanel, "start");

        gamePanel = new GamePanel();
        this.add(gamePanel, "game");
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        showStartPanel();

    }

    public void showGamePanel() {
        gamePanel.resetGame();
        cardLayout.show(this.getContentPane(), "game");
        gamePanel.requestFocusInWindow();

    }

    public void showStartPanel() {
        cardLayout.show(this.getContentPane(), "start");

    }

}
