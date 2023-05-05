package track;

import javax.swing.*;

public class LoopThread extends Thread
{
    private boolean isRun;
    private JCheckBox mouse, keyboard, both;

    public LoopThread(JCheckBox mouse, JCheckBox keyboard, JCheckBox both)
    {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.both = both;

        isRun = true;
    }

    @Override
    public void start() {

        while (isRun)
        {
            new Tracking(mouse, keyboard, both).process();

            try {

                // TODO thread timer
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        isRun = true;
    }

    public void stopLoop() {isRun = false;}
}
