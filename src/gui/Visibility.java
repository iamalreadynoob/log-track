package gui;

public class Visibility implements IScenes
{
    private boolean isVisible;
    protected Visibility(boolean isVisible)
    {
        this.isVisible = isVisible;
    }

    @Override
    public void main()
    {
        Screen.header.setVisible(isVisible);
        Screen.onlyMouse.setVisible(isVisible);
        Screen.onlyKeyboard.setVisible(isVisible);
        Screen.bothThem.setVisible(isVisible);
        Screen.startStop.setVisible(isVisible);
        Screen.goSettings.setVisible(isVisible);
    }

    @Override
    public void settings()
    {
        Screen.frequencyPrompt.setVisible(isVisible);
        Screen.receiverPrompt.setVisible(isVisible);
        Screen.maxSizePrompt.setVisible(isVisible);
        Screen.themePrompt.setVisible(isVisible);
        Screen.languagePrompt.setVisible(isVisible);
        Screen.frequencySection.setVisible(isVisible);
        Screen.receiverSection.setVisible(isVisible);
        Screen.maxSizeSection.setVisible(isVisible);
        Screen.senderMailPrompt.setVisible(isVisible);
        Screen.senderPasswordPrompt.setVisible(isVisible);
        Screen.senderMailSection.setVisible(isVisible);
        Screen.senderPasswordSection.setVisible(isVisible);
        Screen.goDefault.setVisible(isVisible);
        Screen.langSection.setVisible(isVisible);
        Screen.themeSection.setVisible(isVisible);
        Screen.saveChanges.setVisible(isVisible);
        Screen.backMain.setVisible(isVisible);
    }
}
