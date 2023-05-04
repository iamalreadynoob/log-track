package gui;

import javax.swing.*;
import java.awt.*;

public class Positions implements IScenes
{

    protected Positions()
    {
        main();
        settings();
    }

    @Override
    public void main()
    {
        Screen.header.setBounds(10, 10, 200, 30);
        Screen.header.setFont(new Font("Arial", Font.BOLD, 25));
        Screen.header.setBorder(null);
        Screen.header.setEditable(false);

        Screen.onlyMouse.setBounds(10, 150, 150, 30);
        Screen.onlyMouse.setFont(new Font("Arial", Font.PLAIN, 17));
        Screen.onlyMouse.setBorder(null);

        Screen.onlyKeyboard.setBounds(10, 200, 150, 30);
        Screen.onlyKeyboard.setFont(new Font("Arial", Font.PLAIN, 17));
        Screen.onlyKeyboard.setBorder(null);

        Screen.bothThem.setBounds(10, 250, 150, 30);
        Screen.bothThem.setFont(new Font("Arial", Font.PLAIN, 17));
        Screen.bothThem.setBorder(null);

        Screen.startStop.setBounds(450, 180, 150, 70);
        Screen.startStop.setBorder(null);

        Screen.goSettings.setBounds(10, 350, 150, 30);
        Screen.goSettings.setBorder(null);
    }

    @Override
    public void settings()
    {
        Screen.backMain.setBounds(10, 10, 100, 30);
        Screen.backMain.setBorder(null);

        Screen.frequencyPrompt.setBounds(10, 50, 200, 30);
        Screen.frequencyPrompt.setBorder(null);
        Screen.frequencyPrompt.setEditable(false);
        Screen.frequencyPrompt.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.frequencySection.setBounds(400, 50, 200, 30);
        Screen.frequencySection.setBorder(null);
        Screen.frequencySection.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.receiverPrompt.setBounds(10, 100, 200, 30);
        Screen.receiverPrompt.setBorder(null);
        Screen.receiverPrompt.setEditable(false);
        Screen.receiverPrompt.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.receiverSection.setBounds(400, 100, 200, 30);
        Screen.receiverSection.setBorder(null);
        Screen.receiverSection.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.maxSizePrompt.setBounds(10, 150, 200, 30);
        Screen.maxSizePrompt.setBorder(null);
        Screen.maxSizePrompt.setEditable(false);
        Screen.maxSizePrompt.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.maxSizeSection.setBounds(400, 150, 200, 30);
        Screen.maxSizeSection.setBorder(null);
        Screen.maxSizeSection.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.themePrompt.setBounds(10, 200, 200, 30);
        Screen.themePrompt.setBorder(null);
        Screen.themePrompt.setEditable(false);
        Screen.themePrompt.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.themeSection.setBounds(400, 200, 200, 30);
        Screen.themeSection.setBorder(null);

        Screen.languagePrompt.setBounds(10, 250, 200, 30);
        Screen.languagePrompt.setBorder(null);
        Screen.languagePrompt.setEditable(false);
        Screen.languagePrompt.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.langSection.setBounds(400, 250, 200, 30);
        Screen.langSection.setBorder(null);

        Screen.senderMailPrompt.setBounds(10, 300, 200, 30);
        Screen.senderMailPrompt.setBorder(null);
        Screen.senderMailPrompt.setEditable(false);
        Screen.senderMailPrompt.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.senderMailSection.setBounds(400, 300, 200, 30);
        Screen.senderMailSection.setBorder(null);
        Screen.senderMailSection.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.senderPasswordPrompt.setBounds(10, 350, 200, 30);
        Screen.senderPasswordPrompt.setBorder(null);
        Screen.senderPasswordPrompt.setEditable(false);
        Screen.senderPasswordPrompt.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.senderPasswordSection.setBounds(400, 350, 200, 30);
        Screen.senderPasswordSection.setBorder(null);
        Screen.senderPasswordSection.setHorizontalAlignment(SwingConstants.CENTER);

        Screen.goDefault.setBounds(210, 400, 100, 30);
        Screen.goDefault.setBorder(null);

        Screen.saveChanges.setBounds(550, 400, 100, 30);
        Screen.saveChanges.setBorder(null);
    }
}
