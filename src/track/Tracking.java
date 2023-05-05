package track;

    

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseInputListener;
import com.sun.tools.javac.Main;
import fileWriting.TextWriting;

import javax.swing.*;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Tracking implements NativeKeyListener, NativeMouseInputListener {


    private int limitSize, situation;
    private NativeKeyListener listener;

    public Tracking(int situation) {
        this.situation = situation;

        listener = new Tracking();
        //TODO: null pointer excepiton
        //limitSize = TextReading.getSize("data/info.log", 8);
    }

    public Tracking() {
    }

    @Override
    public void nativeMouseMoved(NativeMouseEvent e) {
        TextWriting txt = new TextWriting();
        String read = "Mouse moved: " + e.getX() + ", " + e.getY();
        ArrayList<String> array = new ArrayList<>();
        array.add(read);
        txt.append("./data/info.log", array);
        System.out.println(read);
    }


    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        TextWriting txt = new TextWriting();
        String read = "Pressed " + NativeKeyEvent.getKeyText(e.getKeyCode());
        ArrayList<String> array = new ArrayList<>();
        array.add(read);
        txt.append("./data/info.log", array);
        System.out.println("Pressed " + NativeKeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
    }

    protected void process() {
        switch (situation) {
            case 0:
                System.out.println("mouse is listening");
                try {
                    GlobalScreen.registerNativeHook();
                } catch (NativeHookException ex) {
                    System.err.println("Failed to register native hook");
                    System.exit(1);
                }
                GlobalScreen.addNativeMouseListener(this);
                GlobalScreen.addNativeMouseMotionListener(this);

                break;
            case 1:

                System.out.println("keyboard is listening");
                try {
                    GlobalScreen.registerNativeHook();
                } catch (NativeHookException e) {
                    e.printStackTrace();
                }
                GlobalScreen.addNativeKeyListener(listener);
                break;

            case 2:
                System.out.println("both of them are listening");
                // keyboard


                break;
        }
    }

    protected void stopListening() {
        GlobalScreen.removeNativeKeyListener(listener);
        try {
            GlobalScreen.unregisterNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("Failed to unregister native hook");
            System.exit(1);
        }
    }

}
