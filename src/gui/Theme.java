package gui;

import fileReading.SavfReading;

import javax.swing.*;
import java.awt.*;

public class Theme implements IScenes
{
    private Color objC, txtC, bgC;

    protected Theme(JFrame frame)
    {
        SavfReading reading = new SavfReading();
        reading.scan("data/settings.savf");
        colorize(reading.getValue("theme"));

        frame.getContentPane().setBackground(bgC);
        main();
        settings();
    }

    @Override
    public void main()
    {
        Screen.header.setForeground(objC);
        Screen.header.setBackground(null);

        Screen.onlyMouse.setForeground(objC);
        Screen.onlyMouse.setBackground(null);

        Screen.onlyKeyboard.setForeground(objC);
        Screen.onlyKeyboard.setBackground(null);

        Screen.bothThem.setForeground(objC);
        Screen.bothThem.setBackground(null);

        Screen.startStop.setForeground(txtC);
        Screen.startStop.setBackground(objC);

        Screen.goSettings.setForeground(txtC);
        Screen.goSettings.setBackground(objC);
    }

    @Override
    public void settings()
    {
        Screen.frequencyPrompt.setForeground(txtC);
        Screen.frequencyPrompt.setBackground(objC);

        Screen.receiverPrompt.setForeground(txtC);
        Screen.receiverPrompt.setBackground(objC);

        Screen.maxSizePrompt.setForeground(txtC);
        Screen.maxSizePrompt.setBackground(objC);

        Screen.themePrompt.setForeground(txtC);
        Screen.themePrompt.setBackground(objC);

        Screen.languagePrompt.setForeground(txtC);
        Screen.languagePrompt.setBackground(objC);

        Screen.senderMailPrompt.setForeground(txtC);
        Screen.senderMailPrompt.setBackground(objC);

        Screen.senderPasswordPrompt.setForeground(txtC);
        Screen.senderPasswordPrompt.setBackground(objC);

        Screen.frequencySection.setForeground(txtC);
        Screen.frequencySection.setBackground(objC);

        Screen.receiverSection.setForeground(txtC);
        Screen.receiverSection.setBackground(objC);

        Screen.maxSizeSection.setForeground(txtC);
        Screen.maxSizeSection.setBackground(objC);

        Screen.themeSection.setForeground(txtC);
        Screen.themeSection.setBackground(objC);

        Screen.langSection.setForeground(txtC);
        Screen.langSection.setBackground(objC);

        Screen.senderMailSection.setForeground(txtC);
        Screen.senderMailSection.setBackground(objC);

        Screen.senderPasswordSection.setForeground(txtC);
        Screen.senderPasswordSection.setBackground(objC);

        Screen.backMain.setForeground(txtC);
        Screen.backMain.setBackground(objC);

        Screen.goDefault.setForeground(txtC);
        Screen.goDefault.setBackground(objC);

        Screen.saveChanges.setForeground(txtC);
        Screen.saveChanges.setBackground(objC);
    }

    public void colorize(String code)
    {
        if (code.equals("0"))
        {
            objC = Color.WHITE;
            txtC = Color.BLACK;
            bgC = Color.BLACK;
        }
        else if (code.equals("1"))
        {
            objC = Color.BLACK;
            txtC = Color.WHITE;
            bgC = Color.WHITE;
        }
        else if (code.equals("2"))
        {
            objC = Color.GREEN;
            txtC = Color.RED;
            bgC = Color.BLUE.darker();
        }
    }
}
