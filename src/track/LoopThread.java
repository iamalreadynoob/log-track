package track;

import javax.swing.*;

public class LoopThread extends Thread
{
    private boolean isRun;
    private int situation;
    private Tracking tracking;

    public LoopThread(int situation)
    {
        this.situation = situation;
        isRun = true;
    }

    @Override
    public void start()
    {
        tracking = new Tracking(situation);
        tracking.process();

        while (isRun)
        {

            try {

                // TODO thread timer
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        isRun = true;
    }

    public void stopLoop()
    {
        tracking.stopListening();
        isRun = false;
    }
}
