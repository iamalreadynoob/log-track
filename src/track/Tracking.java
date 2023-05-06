package track;


import javax.swing.*;
import java.awt.event.*;

public class Tracking
{

    private JFrame frame;
    public Tracking(JFrame frame)
    {
        this.frame = frame;

    }

    public void keyListen()
    {
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {}

            @Override
            public void keyPressed(KeyEvent keyEvent) {System.out.println("Key pressed: " + keyEvent.getKeyChar());}

            @Override
            public void keyReleased(KeyEvent keyEvent) {}
        });
    }

}
