package PrimerEntrega;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/*
 * This class creates the start game menu, which displays a picture of a game.
 */

/**
 * Created by DiegoMancini on 6/3/17.
 */
public class StartGame extends JFrame{

    public StartGame(ActionListener goBack) {

        //Set parameters
        setTitle("Start Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600 , 800);
        setLocationRelativeTo(null);
        setVisible(true);

        //Create panels
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel , BoxLayout.PAGE_AXIS));

        //Add the game image
        Image image = new ImageIcon(this.getClass().getResource("image/Fifa18.png")).getImage();
        JLabel imageLabel = new JLabel(new ImageIcon(image));
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton backButton = new JButton("Back");
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        backButton.addActionListener(goBack);

        panel.add(imageLabel);
        panel.add(Box.createRigidArea(new Dimension(25 , 25)));
        panel.add(backButton);

        add(panel);

    }

}
