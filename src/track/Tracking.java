package track;


import javax.swing.*;
import java.awt.event.*;

public class Tracking
{

    private JFrame frame;
    private boolean isMouse, isKey, isBoth;

    public Tracking(JFrame frame)
    {
        this.frame = frame;

        isMouse = false;
        isKey = false;
        isBoth = false;

        keyListen();
        mouseListen();
    }

    public void setKey(boolean key) {isKey = key;}
    public void setMouse(boolean mouse) {isMouse = mouse;}
    public void setBoth(boolean both) {isBoth = both;}

    public void kill()
    {
        isKey = false;
        isMouse = false;
        isBoth = false;
    }

    public void keyListen()
    {
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {}

            @Override
            public void keyPressed(KeyEvent keyEvent)
            {
                System.out.println("Key pressed: " + keyEvent.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {}
        });
    }

    public void mouseListen()
    {
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
               if (isMouse || isBoth) System.out.println("Mouse clicked at: " + mouseEvent.getX() + "," + mouseEvent.getY());
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
                if (isMouse || isBoth) System.out.println("Mouse moved to " + mouseEvent.getX() + "," + mouseEvent.getY());
            }
        });
    }

}
