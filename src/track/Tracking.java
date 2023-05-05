package track;


import javax.swing.*;

public class Tracking
{
    private int limitSize, situation;
    public Tracking(JCheckBox mouse, JCheckBox keyboard, JCheckBox both)
    {
        if (mouse.isSelected())situation = 0;
        else if (keyboard.isSelected()) situation = 1;
        else if (both.isSelected()) situation = 2;

        //TODO: null pointer excepiton
        //limitSize = TextReading.getSize("data/info.log", 8);
    }
    protected void process()
    {
        switch (situation)
        {
            case 0: System.out.println("mouse is listening"); break;
            case 1: System.out.println("keyboard is listening"); break;
            case 2: System.out.println("both of them are listening"); break;
        }
    }

}
