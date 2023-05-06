package gui;

import track.Tracking;

import javax.swing.*;
import java.awt.event.KeyListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Screen extends JFrame
{
    //main scene
    protected static JTextField header;
    protected static JCheckBox onlyMouse, onlyKeyboard, bothThem;
    protected static JButton startStop, goSettings;

    //settings scene
    protected static JTextField frequencyPrompt, receiverPrompt, maxSizePrompt, themePrompt, languagePrompt, frequencySection, receiverSection, maxSizeSection, senderMailPrompt, senderPasswordPrompt, senderMailSection, senderPasswordSection;
    protected static JComboBox<String> themeSection, langSection;
    protected static JButton backMain, saveChanges, goDefault;

    public Screen()
    {
        this.setTitle("LogTrack");
        this.setLayout(null);
        this.setSize(800, 500);

        new CreateNew();
        new Add(this);
        new Visibility(false).settings();
        new AppText();
        new Theme(this);
        new Positions();
        new Buttons(this);
        new Tracking(this).keyListen();

        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
