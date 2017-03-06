package PrimerEntrega;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by DiegoMancini on 6/3/17.
 */
public class MainMenu extends JFrame {

    public MainMenu(ActionListener startGame, ActionListener settings, ActionListener exit) {

        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setResizable(false);
        setSize(572, 720);

        //Agregar imagen
        JPanel panel = new JPanel();
        panel.add(new Label("/Users/DiegoMancini/Downloads/Fifa18.png"));
        setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        //Titulo del trabajo
        JLabel title = new JLabel("Trabajo Practico Swing");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(new Font(title.getFont().getName(), Font.ROMAN_BASELINE, 19));

        //Nombre de los integrantes
        JLabel names = new JLabel("Tomas Iturralde y Diego Mancini - Grupo 2");
        names.setAlignmentX(Component.CENTER_ALIGNMENT);
        names.setFont(new Font(names.getFont().getName(), Font.ROMAN_BASELINE, 20));

        //Botones
        JButton jButtonStartGame = new JButton("Start Game");
        jButtonStartGame.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonStartGame.addActionListener(startGame);

        JButton jButtonSettings = new JButton("Settings");
        jButtonSettings.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonSettings.addActionListener(settings);

        JButton jButtonExit = new JButton("Exit");
        jButtonExit.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonExit.addActionListener(exit);

        // Creo area para meter los componentes
        panel.add(Box.createRigidArea(new Dimension(50, 50)));
        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(50, 50)));
        panel.add(names);
        panel.add(Box.createRigidArea(new Dimension(50, 50)));
        panel.add(jButtonStartGame);
        panel.add(jButtonSettings);
        panel.add(jButtonStartGame);

        add(panel);

        setVisible(true);
    }
}