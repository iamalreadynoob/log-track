package track;


import javax.swing.*;
import java.awt.event.*;

public class Tracking {


    private int limitSize, situation;
    JFrame frame;


    public Tracking(int situation, JFrame frame) {
        this.situation = situation;
        this.frame = new JFrame();

        //TODO: null pointer excepiton
        //limitSize = TextReading.getSize("data/info.log", 8);
    }

    public Tracking() {
    }



    protected void process()
    {
        switch (situation)
        {
            case 0: keyListen(); break;
            case 1: mouseListen(); break;
            case 2: keyListen(); mouseListen(); break;
        }
    }

    protected void stopListening()
    {
        System.out.println("Stop");
    }

    private void keyListen()
    {
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {

            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });
    }

    private void mouseListen()
    {
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });


        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {

            }
        });
    }
}
