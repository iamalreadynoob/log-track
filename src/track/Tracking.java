package track;

import java.io.File;
import fileReading.SavfReading;
import fileReading.TextReading;
import fileWriting.TextWriting;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Tracking
{
    public String path = "./data/info.log";

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
    public Integer checkSize() {
    // savf read
    SavfReading svf = new SavfReading();
    svf.scan("./data/settings.savf");
    Integer maxS = Integer.parseInt(svf.getValue("max_s"));
    maxS = 1024 *1024 *maxS;
    return maxS;
}

public Integer logCheck() {
    File logFile = new File(path);
    long fileSize = logFile.length();
    return Math.toIntExact(fileSize);
}

    public void keyListen()
    {
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {}

            @Override
            public void keyPressed(KeyEvent keyEvent)
            {
                if (isKey || isBoth)
                {
                    Integer maxS = checkSize();
                    String data = "Key pressed: " + keyEvent.getKeyChar();
                    ArrayList<String> array = new ArrayList<>();
                    array.add(data);
                    TextWriting.append("./data/info.log",array);
                    System.out.println(data);

                    if (logCheck() > maxS) {
                        TextWriting.delete(path,0);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

                if (isKey || isBoth)
                {
                    Integer maxS = checkSize();

                    String data = "Key released: " + keyEvent.getKeyChar();
                    ArrayList<String> array = new ArrayList<>();
                    array.add(data);
                    TextWriting.append("./data/info.log",array);
                    System.out.println(data);
                    System.out.println(maxS);

                    if (logCheck() > maxS) {
                        TextWriting.delete(path,0);
                    }
                }

            }
        });
    }

    public void mouseListen()
    {
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                Integer maxS = checkSize();

               if (isMouse || isBoth) {
                   String data = "Mouse clicked at: " + mouseEvent.getX() + "," + mouseEvent.getY();
                   ArrayList<String> array = new ArrayList<>();
                   array.add(data);
                   TextWriting.append("./data/info.log",array);
                   System.out.println(data);


                   if (logCheck() > maxS) {
                       TextWriting.delete(path,0);
                   }
               }

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

                Integer maxS = checkSize();

                if ((isMouse || isBoth)) {
                    String data = "Mouse moved to " + mouseEvent.getX() + "," + mouseEvent.getY();
                    ArrayList<String> array = new ArrayList<>();
                    array.add(data);
                    TextWriting.append(path,array);
                    System.out.println(data);


                    if (logCheck() > maxS) {
                        TextWriting.delete(path,0);
                    }
                }
            }
        });
    }

}
