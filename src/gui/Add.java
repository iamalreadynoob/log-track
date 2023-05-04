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
    }
}
