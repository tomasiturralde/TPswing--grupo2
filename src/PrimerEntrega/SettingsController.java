package PrimerEntrega;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by DiegoMancini on 6/3/17.
 */
public class SettingsController {
    private Settings settings;
    private MainMenu menu;

    public SettingsController(MainMenu menu){
        this.menu = menu;
        settings = new Settings(new GoBackToMainMenu(), new ChangeSettings());
    }

    public void showSettings(){
        settings.setVisible(true);
        menu.dispose();
    }

    public class GoBackToMainMenu implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            settings.dispose();
            menu.setVisible(true);
        }
    }

    public class ChangeSettings implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String windowSettings = "Sound: " + settings.settingSound() +
                    "Music: " + settings.settingMusic() +
                    "Graphics:" +
                    "Shadows: " + settings.settingShadows() +
                    "Anti-aliasing: " + settings.settingAntiAliasing();

            System.out.println(windowSettings);
        }
    }
}
