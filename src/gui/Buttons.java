package gui;

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
    protected Buttons(JFrame frame)
    {
        this.frame = frame;

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
            }
        });

        Screen.onlyKeyboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Screen.onlyMouse.setSelected(false);
                Screen.bothThem.setSelected(false);
            }
        });

        Screen.bothThem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                Screen.onlyMouse.setSelected(false);
                Screen.onlyKeyboard.setSelected(false);
            }
        });

        Screen.startStop.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new Tracking().process(Screen.startStop);
            }
        });

        Screen.goSettings.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new Visibility(false).main();
                new Visibility(true).settings();
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
