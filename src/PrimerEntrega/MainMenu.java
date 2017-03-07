package PrimerEntrega;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/*
 * This class is used to create the main menu, which shows different buttons leading to other menus.
 */

/**
 * Created by DiegoMancini on 6/3/17.
 */

//Class MainMenu extends JFrame so it can use its methods
public class MainMenu extends JFrame {

    public MainMenu(ActionListener startGame, ActionListener settings, ActionListener exit) {

        //Set parameters
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600, 800);

        //Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        //Project title
        JLabel title = new JLabel("Trabajo Practico Swing");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font(title.getFont().getName(), Font.ROMAN_BASELINE, 19));

        //Authors of the project
        JLabel names = new JLabel("Tomas Iturralde y Diego Mancini - Grupo 2");
        names.setAlignmentX(Component.CENTER_ALIGNMENT);
        names.setFont(new Font(names.getFont().getName(), Font.ROMAN_BASELINE, 20));

        //Buttons
        JButton jButtonStartGame = new JButton("Start Game");
        jButtonStartGame.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonStartGame.addActionListener(startGame);

        JButton jButtonSettings = new JButton("Settings");
        jButtonSettings.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonSettings.addActionListener(settings);

        JButton jButtonExit = new JButton("Exit");
        jButtonExit.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonExit.addActionListener(exit);

        // Create area to include components
        panel.add(Box.createRigidArea(new Dimension(50, 50)));
        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(50, 50)));
        panel.add(names);
        panel.add(Box.createRigidArea(new Dimension(50, 50)));
        panel.add(jButtonStartGame);
        panel.add(jButtonSettings);
        panel.add(jButtonExit);

        add(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}