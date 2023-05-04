package gui;

import fileReading.DataReading;
import fileReading.SavfReading;

import java.util.ArrayList;

public class AppText implements IScenes
{
    private ArrayList<String> texts;
    private SavfReading savfR;

    protected AppText()
    {
        DataReading csvR = new DataReading();
        csvR.scan("data/lang.csv");

        savfR = new SavfReading();
        savfR.scan("data/settings.savf");

        texts = csvR.getColumn(csvR.getHeaders().get(Integer.parseInt(savfR.getValue("lang"))));

        main();
        settings();
    }

    @Override
    public void main()
    {
        Screen.header.setText("LogTrack");
        Screen.onlyMouse.setText(texts.get(0));
        Screen.onlyKeyboard.setText(texts.get(1));
        Screen.bothThem.setText(texts.get(2));
        Screen.startStop.setText(texts.get(3));
        Screen.goSettings.setText(texts.get(5));
    }

    @Override
    public void settings()
    {
        clear();
        Screen.frequencyPrompt.setText(texts.get(6));
        Screen.receiverPrompt.setText(texts.get(7));
        Screen.maxSizePrompt.setText(texts.get(8));
        Screen.themePrompt.setText(texts.get(9));
        Screen.themeSection.addItem(texts.get(10));
        Screen.themeSection.addItem(texts.get(11));
        Screen.themeSection.addItem(texts.get(12));
        Screen.languagePrompt.setText(texts.get(13));
        Screen.langSection.addItem(texts.get(14));
        Screen.langSection.addItem(texts.get(15));
        Screen.senderMailPrompt.setText(texts.get(16));
        Screen.senderPasswordPrompt.setText(texts.get(17));
        Screen.backMain.setText(texts.get(18));
        Screen.saveChanges.setText(texts.get(19));
        Screen.goDefault.setText(texts.get(20));
        Screen.frequencySection.setText(savfR.getValue("freq"));
        Screen.receiverSection.setText(savfR.getValue("r_mail"));
        Screen.maxSizeSection.setText(savfR.getValue("max_s"));
        Screen.senderMailSection.setText(savfR.getValue("s_mail"));
        Screen.senderPasswordSection.setText(savfR.getValue("s_pass"));

        Screen.themeSection.setSelectedIndex(Integer.parseInt(savfR.getValue("theme")));
        Screen.langSection.setSelectedIndex(Integer.parseInt(savfR.getValue("lang")));
    }

    private void clear()
    {
        if (Screen.langSection.getItemCount() > 0) {Screen.langSection.removeAllItems();}
        if (Screen.themeSection.getItemCount() > 0){Screen.themeSection.removeAllItems();}
    }
}
