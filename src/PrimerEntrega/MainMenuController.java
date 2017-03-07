package PrimerEntrega;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Assigns every button from the main menu with an action, as well as showing where each button leads to.
 */

/**
 * Created by DiegoMancini on 6/3/17.
 */
public class MainMenuController {
    private MainMenu menu;
    private SettingsController settings;
    private StartGame startGame;

    public MainMenuController(){
        menu = new MainMenu(new Start(), new Setting(), new Exit());
        settings = new SettingsController(menu);
    }

    public class Start implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            startGame = new StartGame(new GoBackToMainMenu());
            menu.dispose();
        }
    }

    public class GoBackToMainMenu implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            menu.setVisible(true);
            startGame.dispose();
        }
    }

    public class Setting implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.showSettings();
        }
    }

    public class Exit implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}