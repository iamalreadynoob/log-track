package gui;

import javax.swing.*;

public class Screen extends JFrame
{
    //main scene
    protected static JTextField header;
    protected static JCheckBox onlyMouse, onlyKeyboard, bothThem;
    protected static JButton startStop, goSettings;

    //settings scene
    protected static JTextField frequencyPrompt, receiverPrompt, maxSizePrompt, themePrompt, languagePrompt, frequencySection, receiverSection, maxSizeSection;
    protected static JComboBox<String> themeSection, langSection;
    protected static JButton backMain, saveChanges;

    public Screen()
    {
        this.setTitle("LogTrack");
        this.setLayout(null);
        this.setSize(600, 350);

        new CreateNew();
        new Add(this);

        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}
