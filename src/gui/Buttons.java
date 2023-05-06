package gui;

import fileReading.DataReading;
import fileReading.SavfReading;
import fileReading.TextReading;
import fileWriting.SavfWriting;
import fileWriting.TextWriting;
import track.Tracking;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Buttons implements IScenes
{
    private JFrame frame;
    private boolean isStart;
    private int selectedID;
    private Tracking tracking;

    protected Buttons(JFrame frame)
    {
        this.frame = frame;
        isStart = true;
        selectedID = 3;

        tracking = new Tracking(frame);

        main();
        settings();
    }


    @Override
    public void main()
    {
        Screen.onlyMouse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Screen.onlyKeyboard.setSelected(false);
                Screen.bothThem.setSelected(false);

                if (Screen.onlyMouse.isSelected()) selectedID = 0;
                else selectedID = 3;
            }
        });

        Screen.onlyKeyboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Screen.onlyMouse.setSelected(false);
                Screen.bothThem.setSelected(false);

                if (Screen.onlyKeyboard.isSelected()) selectedID = 1;
                else selectedID = 3;
            }
        });

        Screen.bothThem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Screen.onlyMouse.setSelected(false);
                Screen.onlyKeyboard.setSelected(false);

                if (Screen.bothThem.isSelected()) selectedID = 2;
                else selectedID = 3;
            }
        });

        Screen.startStop.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                DataReading csvR = new DataReading();
                csvR.scan("data/lang.csv");

                SavfReading savfR = new SavfReading();
                savfR.scan("data/settings.savf");

                if (isStart)
                {
                    if (Screen.onlyMouse.isSelected()) tracking.setMouse(true);
                    else if (Screen.onlyKeyboard.isSelected()) tracking.setKey(true);
                    else if (Screen.bothThem.isSelected()) tracking.setBoth(true);

                    Screen.startStop.setText(csvR.getColumn(csvR.getHeaders().get(Integer.parseInt(savfR.getValue("lang")))).get(4));
                    isStart = false;
                }

                else
                {
                    tracking.kill();
                    Screen.startStop.setText(csvR.getColumn(csvR.getHeaders().get(Integer.parseInt(savfR.getValue("lang")))).get(3));
                    isStart = true;
                }

            }
        });

        Screen.goSettings.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new Visibility(false).main();
                new Visibility(true).settings();
                Focusing.setRequiredFocus(true);
            }

        });
    }

    @Override
    public void settings()
    {
        Screen.backMain.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new Visibility(true).main();
                new Visibility(false).settings();
                Focusing.setRequiredFocus(false);
            }
        });


        Screen.saveChanges.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                SavfWriting.change("data/settings.savf", "freq", Screen.frequencySection.getText());
                SavfWriting.change("data/settings.savf", "r_mail", Screen.receiverSection.getText());
                SavfWriting.change("data/settings.savf", "max_s", Screen.maxSizeSection.getText());
                SavfWriting.change("data/settings.savf", "theme", Integer.toString(Screen.themeSection.getSelectedIndex()));
                SavfWriting.change("data/settings.savf", "lang", Integer.toString(Screen.langSection.getSelectedIndex()));
                SavfWriting.change("data/settings.savf", "s_mail", Screen.senderMailSection.getText());
                SavfWriting.change("data/settings.savf", "s_pass", Screen.senderPasswordSection.getText());

                new Theme(frame);
                new AppText();
            }

        });

        Screen.goDefault.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                ArrayList<String> lines = TextReading.read("data/default.savf");
                TextWriting.write("data/settings.savf", lines);

                new Theme(frame);
                new AppText();
            }

        });
    }
}
