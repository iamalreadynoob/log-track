package track;

import javax.swing.*;
public class LoopThread
{
    private boolean isRun;
    private Tracking tracking;

    public LoopThread(int situation)
    {
        tracking = new Tracking(situation);
        tracking.process();
        isRun = true;
    }


    public void stopLoop()
    {
        tracking.stopListening();
        isRun = false;
    }
}
