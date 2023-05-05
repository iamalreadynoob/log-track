package track;


import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import com.sun.tools.javac.Main;
import fileWriting.TextWriting;

import javax.swing.*;
import java.util.ArrayList;

public class Tracking implements NativeKeyListener
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

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        TextWriting txt = new TextWriting();
        String read = "Pressed " + NativeKeyEvent.getKeyText(e.getKeyCode());
        ArrayList<String> array = new ArrayList<>();
        array.add(read);
        txt.append("./data/info.log",array);
        System.out.println("Pressed " + NativeKeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
//        System.out.println("Pressed " + NativeKeyEvent.getKeyText(e.getKeyCode()));
    }

    protected void process()
    {
        switch (situation)
        {
            case 0: System.out.println("mouse is listening");
            break;
            case 1:

                System.out.println("keyboard is listening");
                try {
                    GlobalScreen.registerNativeHook();
                } catch (NativeHookException e) {
                    e.printStackTrace();
                }
                JCheckBox mouse = new JCheckBox();
                JCheckBox keyboard = new JCheckBox();
                JCheckBox both = new JCheckBox();
                GlobalScreen.addNativeKeyListener(new Tracking(mouse,keyboard,both));
                break;

            case 2: System.out.println("both of them are listening"); break;
        }
    }

}
