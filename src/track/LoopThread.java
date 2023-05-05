package track;

import javax.swing.*;
public class LoopThread
{
    private boolean isRun;
    private int situation;
    private Tracking tracking;
    private  JFrame frame;

    public LoopThread(int situation, JFrame frame)
    {
        this.situation = situation;
        this.frame = frame;
        isRun = true;
    }

    public void start()
    {
        tracking = new Tracking(situation, frame);
        tracking.process();
        isRun = true;
    }


    public void stopLoop()
    {
        tracking.stopListening();
        isRun = false;
    }
}
