package gui;

import javax.swing.*;

public class CreateNew implements IScenes
{

    protected CreateNew()
    {
        main();
        settings();
    }

    @Override
    public void main()
    {
        Screen.header = new JTextField();
        Screen.onlyMouse = new JCheckBox();
        Screen.onlyKeyboard = new JCheckBox();
        Screen.bothThem = new JCheckBox();
        Screen.startStop = new JButton();
        Screen.goSettings = new JButton();
    }

    @Override
    public void settings()
    {
        Screen.frequencyPrompt = new JTextField();
        Screen.receiverPrompt = new JTextField();
        Screen.maxSizePrompt = new JTextField();
        Screen.themePrompt = new JTextField();
        Screen.languagePrompt = new JTextField();
        Screen.frequencySection = new JTextField();
        Screen.receiverSection = new JTextField();
        Screen.maxSizeSection = new JTextField();
        Screen.themeSection = new JComboBox<>();
        Screen.langSection = new JComboBox<>();
        Screen.backMain = new JButton();
        Screen.saveChanges = new JButton();
    }
}
