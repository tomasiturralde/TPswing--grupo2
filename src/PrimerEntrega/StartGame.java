package PrimerEntrega;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by DiegoMancini on 6/3/17.
 */
public class StartGame extends JFrame{

    public StartGame(ActionListener goBack) {

        setTitle("Start Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(572 , 720);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel , BoxLayout.PAGE_AXIS));

        JLabel imageLabel = new JLabel(new ImageIcon("/Users/DiegoMancini/Downloads/Fifa18.png"));
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton backButton = new JButton("Back");
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        backButton.addActionListener(goBack);

        panel.add(imageLabel);
        panel.add(Box.createRigidArea(new Dimension(50 , 50)));
        panel.add(backButton);

        add(panel);
        pack();
        setVisible(true);

    }

}
