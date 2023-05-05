package track;

import javax.swing.*;

public class LoopThread extends Thread
{
    private boolean isRun;
    private Tracking tracking;

    public LoopThread(int situation)
    {
        tracking = new Tracking(situation);
        isRun = true;
    }

    @Override
    public void start() {

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
