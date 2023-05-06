package gui;

import javax.swing.*;

public class Add implements IScenes
{
    private JFrame frame;
    protected Add(JFrame frame)
    {
        this.frame = frame;

        main();
        settings();
    }

    @Override
    public void main()
    {
        frame.add(Screen.header);
        frame.add(Screen.onlyMouse);
        frame.add(Screen.onlyKeyboard);
        frame.add(Screen.bothThem);
        frame.add(Screen.startStop);
        frame.add(Screen.goSettings);

        Screen.header.setFocusable(false);
        Screen.onlyMouse.setFocusable(false);
        Screen.onlyKeyboard.setFocusable(false);
        Screen.bothThem.setFocusable(false);
        Screen.startStop.setFocusable(false);
        Screen.goSettings.setFocusable(false);
    }

    @Override
    public void settings()
    {
        frame.add(Screen.frequencyPrompt);
        frame.add(Screen.receiverPrompt);
        frame.add(Screen.maxSizePrompt);
        frame.add(Screen.themePrompt);
        frame.add(Screen.languagePrompt);
        frame.add(Screen.frequencySection);
        frame.add(Screen.receiverSection);
        frame.add(Screen.maxSizeSection);
        frame.add(Screen.themeSection);
        frame.add(Screen.langSection);
        frame.add(Screen.backMain);
        frame.add(Screen.saveChanges);
        frame.add(Screen.senderMailPrompt);
        frame.add(Screen.senderMailSection);
        frame.add(Screen.senderPasswordPrompt);
        frame.add(Screen.senderPasswordSection);
        frame.add(Screen.goDefault);

        Screen.frequencyPrompt.setFocusable(false);
        Screen.receiverPrompt.setFocusable(false);
        Screen.maxSizePrompt.setFocusable(false);
        Screen.themePrompt.setFocusable(false);
        Screen.languagePrompt.setFocusable(false);
        Screen.frequencySection.setFocusable(false);
        Screen.receiverSection.setFocusable(false);
        Screen.maxSizeSection.setFocusable(false);
        Screen.themeSection.setFocusable(false);
        Screen.langSection.setFocusable(false);
        Screen.backMain.setFocusable(false);
        Screen.saveChanges.setFocusable(false);
        Screen.senderMailPrompt.setFocusable(false);
        Screen.senderMailSection.setFocusable(false);
        Screen.senderPasswordPrompt.setFocusable(false);
        Screen.senderPasswordSection.setFocusable(false);
    }
}
