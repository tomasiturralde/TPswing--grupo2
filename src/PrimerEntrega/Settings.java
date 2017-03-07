package PrimerEntrega;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/*
 * Displays the settings menu.
 */

/**
 * Created by DiegoMancini on 6/3/17.
 */
public class Settings extends JFrame {

    private JCheckBox shadows;
    private JCheckBox antiAliasing;
    private ButtonGroup soundGroup;
    private ButtonGroup musicGroup;

    public Settings(ActionListener goBack , ActionListener changeAnySetting) {
        setTitle("Settings");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(150 , 450);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel , BoxLayout.PAGE_AXIS));

        JPanel soundPanel = new JPanel();
        soundPanel.setLayout(new FlowLayout());

        JPanel musicPanel = new JPanel();
        musicPanel.setLayout(new FlowLayout());

        JPanel graphicsPanel = new JPanel();
        graphicsPanel.setLayout(new FlowLayout());

        JLabel title = new JLabel("Settings");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel sound = new JLabel("Sound: ");
        sound.setAlignmentX(Component.LEFT_ALIGNMENT);
        JRadioButton soundOn= new JRadioButton("ON");
        JRadioButton  soundOff= new JRadioButton("OFF");
        soundOn.setActionCommand("ON");
        soundOff.setActionCommand("OFF");
        soundGroup = new ButtonGroup();
        soundGroup.add(soundOn);
        soundGroup.add(soundOff);
        soundOn.setSelected(true);

        JLabel music = new JLabel("Music: ");
        music.setAlignmentX(Component.LEFT_ALIGNMENT);
        JRadioButton musicOn= new JRadioButton("ON");
        JRadioButton musicOff= new JRadioButton("OFF");
        musicOn.setActionCommand("OFF");
        musicOff.setActionCommand("OFF");
        musicGroup = new ButtonGroup();
        musicGroup.add(musicOn);
        musicGroup.add(musicOff);
        musicOff.setSelected(true);

        JLabel graphics = new JLabel("Graphics: ");
        graphics.setAlignmentX(Component.LEFT_ALIGNMENT);

        shadows = new JCheckBox("Shadows");
        antiAliasing = new JCheckBox("AntiAliasing");

        soundOn.addActionListener(changeAnySetting); ;
        soundOff.addActionListener(changeAnySetting);
        musicOn.addActionListener(changeAnySetting);
        musicOff.addActionListener(changeAnySetting);
        shadows.addActionListener(changeAnySetting);
        antiAliasing.addActionListener(changeAnySetting);

        JButton back = new JButton("Back");
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        back.addActionListener(goBack);

        soundPanel.add((Box.createRigidArea(new Dimension(25,10))));
        soundPanel.add(sound);
        soundPanel.add((Box.createRigidArea(new Dimension(25,10))));
        soundPanel.add(soundOn);
        soundPanel.add((Box.createRigidArea(new Dimension(25,10))));
        soundPanel.add(soundOff);

        musicPanel.add((Box.createRigidArea(new Dimension(25,10))));
        musicPanel.add(music);
        musicPanel.add((Box.createRigidArea(new Dimension(25,10))));
        musicPanel.add(musicOn);
        musicPanel.add((Box.createRigidArea(new Dimension(25,10))));
        musicPanel.add(musicOff);

        graphicsPanel.add((Box.createRigidArea(new Dimension(25,10))));
        graphicsPanel.add(graphics);
        graphicsPanel.add((Box.createRigidArea(new Dimension(25,10))));
        graphicsPanel.add(shadows);
        graphicsPanel.add((Box.createRigidArea(new Dimension(25,10))));
        graphicsPanel.add(antiAliasing);

        mainPanel.add(Box.createRigidArea(new Dimension(5,40)));
        mainPanel.add(title);
        mainPanel.add(Box.createRigidArea(new Dimension(5,40)));
        mainPanel.add(soundPanel);
        mainPanel.add(musicPanel);
        mainPanel.add(graphicsPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(5,40)));
        mainPanel.add(back);

        add(mainPanel);
    }

    public String settingSound() {
        return soundGroup.getSelection().getActionCommand();
    }

    public String settingMusic() {
        return musicGroup.getSelection().getActionCommand();
    }

    public String settingShadows() {
        if (shadows.isSelected()) {
            return "ON";
        } else return "OFF";
    }

    public String settingAntiAliasing() {
        if (antiAliasing.isSelected()) {
            return "ON";
        } else return "False";
    }

}
