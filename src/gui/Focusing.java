package gui;

public class Focusing
{

    protected static void setRequiredFocus(boolean focus)
    {
        Screen.frequencySection.setFocusable(focus);
        Screen.receiverSection.setFocusable(focus);
        Screen.maxSizeSection.setFocusable(focus);
        Screen.senderMailSection.setFocusable(focus);
        Screen.senderPasswordSection.setFocusable(focus);
        Screen.themeSection.setFocusable(focus);
        Screen.langSection.setFocusable(focus);
    }

}
